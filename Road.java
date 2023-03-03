package algorithms_project;

//import static algorithms_project.M.w;
public class Road {

    public double dis;
    public boolean is_bus_path;
    public double bus_speed;
    public double Taxi_speed;
    public final M start_m;
    public final M target_m;
    public String w; // move state
    public double Etfb; //Expected time for bus
    public double Etft; //Expected time for Taxi
    public static double myspeed = 5.5;

    public Road(double dis1, M startM, M targetM, boolean is_bus_path1, double bus_speed1,
            double Taxi_speed1, String w1, double Etfb1, double Etft1) {

        dis = dis1;
        start_m = startM;
        target_m = targetM;
        is_bus_path = is_bus_path1;
        bus_speed = bus_speed1;
        Taxi_speed = Taxi_speed1;
        w = w1;
        Etfb = Etfb1;
        Etft = Etft1;

    }

    public String bus_line() {
        return start_m.value + "_" + target_m.value;
    }

    public double Time(String w) {
        double Expected_time;
        double Passed_time;

        if ("bus".equals(w)) {
            Expected_time = Etfb;
            Passed_time = dis / bus_speed;
        } else if ("Taxi".equals(w)) {
            Expected_time = Etft;
            Passed_time = dis / Taxi_speed;
        } else {
            Expected_time = 0;
            Passed_time = dis / myspeed;
        }
        return Expected_time + Passed_time;
    }

    public double Money(String w) {
        if ("bus".equals(w)) {
            return 400;
        } else if ("Taxi".equals(w)) {
            return 1000 * dis;
        } else {
            return 0;
        }
    }

    public double Effort(String w) {
        if ("bus".equals(w)) {
            return (5 * dis);
        } else if ("Taxi".equals(w)) {
            return (5 * dis);
        } else {
            return (10 * dis);
        }
    }

    public double cost(String w) {
        return Time(w) + Money(w) + Effort(w);
    }

   
    public double min_cost(person p,String w) {
        double min_c = 100000;
//        while (p.myMoney != 0) {
            if (min_c < Time(w) + Money(w) + Effort(w)) {
                min_c = Time(w) + Money(w) + Effort(w);
            }
            p.myMoney-=Money(w);
//        }
        return min_c;
    }
     
    public double max_Energy(person p,String w) {
        double max_e = 0.0;
        if (Time(w) + Money(w) + Effort(w)> 0) {
            if (max_e < p.myEnergy) {
                max_e = p.myEnergy;
            }
               //p.p_cost()- =(Time(w) + Money(w) + Effort(w));
            
        }
        return max_e;
    }
     public double max_min_cost(person p,String w) {
        double max_e = 0.0;
        if (p.myEnergy > 0&& p.myTime>0 && cost(w)<0) {
            if (max_e < Time(w)) {
                max_e = Time(w);
            }
                p.myEnergy-=Effort(w);
                p.myTime+=Time(w);
                p.myMoney-=Money(w);
            
        }
        return max_e;
    }
     
}
