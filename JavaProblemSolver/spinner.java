public class spinner{
    private Letter current;
    
    public spinner() {
        current = new Letter("a");
    }
    
    public double getTime(String input) {
        double time = 0.0;
        String temp;
        
        for(int i = 0; i < input.length(); i++) {
            temp = String.valueOf(input.charAt(i));
            if(current.getLetter().equals(temp)){
                //System.out.println("TEST: success at same char");
                time += 2.5;
            } else {
                time += getShortestPath(current, temp);
                //this.current = null;
                //System.out.println("TEMP: "+temp);
                this.current = new Letter(temp);
            }
        }
        
        return time;
    }
    
    private double getShortestPath(Letter current, String goal) {
        //System.out.println("TEST: goal is: " + goal);
        //System.out.println("TEST: " + getNextPath(current,goal));
        if(getNextPath(current, goal) <= getPrevPath(current, goal)){
            return getNextPath(current, goal);
        } else {
            return getPrevPath(current, goal);
        }
    }
    
    private double getNextPath(Letter current, String goal) {
        Letter temp = current;
        double time = 0.0;
        while(!temp.getLetter().equals(goal)) {
            time += 5.0;
            temp = temp.getNext();
        }
        return time;
    }
    
    private double getPrevPath(Letter current, String goal) {
        Letter temp = current;
        double time = 0.0;
        while(!temp.getLetter().equals(goal)) {
            time += 5.0;
            temp = temp.getPrev();
        }
        return time;
    }
}