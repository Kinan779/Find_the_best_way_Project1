/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class threeA {
    
    public static void AstarSearch_c(M source, M goal,person p) {

        
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
//            node++;

            //end if path is found
            if (current.value.equals(goal.value)) {
                found = true;

            }

            for (Road e : current.next_states) {
                M child = e.target_m;
                double cost = e.min_cost( p,e.w);

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
//        System.out.println("visited nodes: " + node);
        System.out.println("cost: " + goal.heuristic);
    }

     public static void AstarSearch_M(M source, M goal,person p) {

        
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
//            node++;

            //end if path is found
            if (current.value.equals(goal.value)) {
                found = true;

            }

            for (Road e : current.next_states) {
                M child = e.target_m;
                double cost = e.max_Energy(p, e.w);

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
//        System.out.println("visited nodes: " + node);
        System.out.println("cost: " + goal.heuristic);
    }

      public static void AstarSearch_n(M source, M goal,person p) {

        
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
//            node++;

            //end if path is found
            if (current.value.equals(goal.value)) {
                found = true;

            }

            for (Road e : current.next_states) {
                M child = e.target_m;
                double cost = e.max_min_cost(p, e.w);

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
//        System.out.println("visited nodes: " + node);
        System.out.println("cost: " + goal.heuristic);
    }

}
