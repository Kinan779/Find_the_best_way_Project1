
package algorithms_project;


public class person {
  
    public  double myEnergy = 100;
    public  double myMoney = 2000;
    public  double myTime = 0;
    int currentM = 0;
    person(){}
     public person move(Road r) {
        person p = new person(this);
        p.myEnergy -= r.Effort(r.w);
        p.myMoney -= r.Money(r.w);
        p.myTime += r.Time(r.w);
        return p;
    }
     
     
    person(person p){
        myEnergy = p.myEnergy;
        myTime = p.myTime;
        myMoney = p.myMoney;
    }
     
    public double p_cost(){
          return myTime+ myMoney + myEnergy;
     }
     @Override
    public String toString() {
        return "Person{" +
                "\n myEnergy=" + myEnergy +
                "\n, myMoney=" + myMoney +
                "\n, myTime=" + myTime +
                "\n, currentStation=" + currentM +
                "\n}";
    }
    
    
}
