package algorithms_project;

//import static algorithms_project.Astar.AstarSearch;
import static algorithms_project.Astar.printPath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms_project {

    //Road r;
    // public double h1=heuristic(m0);
    public static List<M> graph = new ArrayList<M>();
    public static M m0 = new M("m0",618);
    public static M m1 = new M("m1",611);
    public static M m2 = new M("m2",231);
    public static M m3 = new M("m3",862);
    public static M m4 = new M("m4",874);
    public static M m5 = new M("m5",803);

    public static final String w1[] = {"bus", "Taxi", "walk"};

    
    public static long start = System.currentTimeMillis();
    
    public static void graph_e(){
    graph.add(m0);
    m0.heuristic=heuristic(m0);
    graph.add(m1);
    m1.heuristic=heuristic(m1);
    graph.add(m2);
    m2.heuristic=heuristic(m2);
    graph.add(m3);
    m3.heuristic=heuristic(m3);
    graph.add(m4);
    m4.heuristic=heuristic(m4);
    graph.add(m5);
    m5.heuristic=heuristic(m5);

    }
    public static double heuristic(M n) {
        double min = 100000.0;
        for (Road r : n.next_states) {
            if (r.cost(r.w) < min) {
                min = r.cost(r.w);
                System.out.println("cost: " + r.cost(r.w)+" "+min);
            }

        }
        return min;
    }

    //void set_heuristics(){
    //  m0.set_h()=heuristic(M m0);
    // }
    void Current_state(M m) {

        System.out.println(m + ": " + m.value + " " + m.isVisited);
    }

    void next_states(M m) {
        System.out.println(Arrays.toString(m.next_states));

    }

    public static void BuildGraph() {

        m0.next_states = new Road[]{
           // new Road(0.0, m0, m0, true, 54, 24, w1[0], 15, 0),
            new Road(15.0, m0, m1, true, 54, 24, w1[2], 15, 0),
            new Road(10, m0, m3, true, 54, 24, w1[2], 0, 20),
            new Road(10.0, m0, m2, true, 54, 24, w1[1], 30, 0)
        };

        m1.next_states = new Road[]{
//            new Road(5.0, m1, m0, true, 54, 24, w1[0], 15, 0),
            new Road(13, m1, m2, true, 54, 24, w1[1], 0, 20),
            new Road(24, m1, m3, true, 54, 24, w1[0], 15, 0)
        };

        m2.next_states = new Road[]{
//            new Road(10.0, m2, m0, true, 54, 24, w1[0], 30, 0),
//            new Road(13, m2, m1, true, 54, 24, w1[1], 0, 20),
            new Road(7, m2, m3, true, 54, 24, w1[1], 10, 0),
            new Road(4, m2, m5, true, 54, 24, w1[1], 0, 10),
            new Road(30, m2, m4, true, 54, 24, w1[0], 25, 0)
        };

        m3.next_states = new Road[]{
//            new Road(24, m3, m1, true, 54, 24, w1[0], 15, 0),
//            new Road(7, m3, m2, true, 54, 24, w1[2], 0, 0),
            new Road(5, m3, m4, true, 54, 24, w1[0], 20, 0),
            new Road(2, m3, m5, true, 54, 24, w1[0], 30, 0)
        };
        m4.next_states = new Road[]{
//            new Road(2, m4, m0, true, 54, 24, w1[2], 0, 0),
//            new Road(30, m4, m2, true, 54, 24, w1[0], 25, 0),
//            new Road(30, m4, m1, true, 54, 24, w1[0], 25, 0),
            new Road(5, m4, m3, true, 54, 24, w1[0], 20, 0),
            new Road(2, m4, m5, true, 54, 24, w1[0], 10, 0)
        };
        m5.next_states = new Road[]{
            
        };

    }

    String start_state() {

        return m0.value;
    }

    String end_state() {

        return m5.value;
    }

    public boolean isFinalState(M m, M m4) {
        return m4.equals(m.value);
    }

    public static void main(String[] args) {

        BuildGraph();
//        graph_e();
//        System.out.println("m1: " + m3.heuristic);
        Astar a = new Astar();
        int node =0;
        a.AstarSearch(m2, m5,node);
        List<M> path = printPath(m5);

        System.out.println("Path: " + path);
       // System.out.println("Path: " + path);
         long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("take time= " + elapsedTime + " ms");
        System.out.println("****************************");
        
        threeA ab=new threeA();
        person p =new person();
        ab.AstarSearch_c(m0, m5,p);
        List<M> path1 = printPath(m5);

        System.out.println("Path: " + path1);
       // System.out.println("Path: " + path);
         long end1 = System.currentTimeMillis();
        long elapsedTime1 = end1 - start;
        System.out.println("take time= " + elapsedTime1 + " ms");
        System.out.println("****************************");
        
        ab.AstarSearch_M(m0, m5,p);
        List<M> path2 = printPath(m5);

        System.out.println("Path: " + path2);
       // System.out.println("Path: " + path);
         long end2 = System.currentTimeMillis();
        long elapsedTime2 = end2 - start;
        System.out.println("take time= " + elapsedTime2 + " ms");
        System.out.println("****************************");
        
        
        ab.AstarSearch_n(m0, m5,p);
        List<M> path3 = printPath(m5);

        System.out.println("Path: " + path3);
       // System.out.println("Path: " + path);
         long end3 = System.currentTimeMillis();
        long elapsedTime3 = end3 - start;
        System.out.println("take time= " + elapsedTime1 + " ms");
        System.out.println("****************************");
    }

}
