package algorithms_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Astar {

    public void AstarSearch(M source, M goal, int node) {

        source.heuristic = 0;
        PriorityQueue<M> queue = new PriorityQueue<M>(20, (M i, M j) -> {
            if (i.heuristic > j.heuristic) {
                return 1;
            } else if (i.heuristic < j.heuristic) {
                return -1;
            } else {
                return 0;
            }
        }
        );

        queue.add(source);
        Set<M> explored = new HashSet<M>();
        boolean found = false;

        do {

            M current = queue.poll();

            explored.add(current);
            node++;

            //end if path is found
            if (current.value.equals(goal.value)) {
                found = true;

            }

            for (Road e : current.next_states) {
                M child = e.target_m;
                double cost = e.cost(e.w);

                //add node to queue if node has not been explored
                if (!explored.contains(child) && !queue.contains(child)) {
                    child.heuristic = current.heuristic + cost;
                    child.parent = current;
                    queue.add(child);
                    //node++;

                } //current path is shorter than previous path found
                else if ((queue.contains(child)) && (child.heuristic > (current.heuristic + cost))) {
                    child.parent = current;
                    child.heuristic = current.heuristic + cost;
                    queue.remove(child);
                    queue.add(child);
                    //node++;

                }

            }

        } while (!queue.isEmpty() && (found == false));
        System.out.println("visited nodes: " + node);
        System.out.println("cost: " + goal.heuristic);
    }

    public static List<M> printPath(M target) {
        List<M> path = new ArrayList<M>();
        double dist, time, effort, money;
        String way;
        for (M node = target; node != null; node = node.parent) {
            path.add(node);
            for (Road r : node.next_states) {
//                    Road[] r = node.next_states;
//            M child = r.node;
//                if (r.target_m == node.parent || r.target_m==node ) {
                dist = r.dis;
                time = r.Time(r.w);
                effort = r.Effort(r.w);
                money = r.Money(r.w);
                way = r.w;

                System.out.println("dis: " + dist + "\n" + "time: " + time + "\n" + "Effort: " + effort + "\n" + "Money: " + money + "\n" + "way:by " + way);
//                }
            }
        }

        Collections.reverse(path);
        return path;

    }

}
