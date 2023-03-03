package algorithms_project;

 class M {

    public final String value;
    public boolean isVisited;
    public M parent;
    public Road[] next_states;
    public double heuristic;

    public M(String val,double heuristic1) {

        value = val;
        heuristic=heuristic1;

    }

    @Override
    public String toString() {
        return value;
    }

    double set_h(){
        return heuristic;
    }
   
    public void isVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    void equal() {

    }

   

}
