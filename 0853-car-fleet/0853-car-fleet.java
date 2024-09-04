// Link: https://leetcode.com/problems/car-fleet/discuss/5360448/Simple-Greedy-Solution-in-Java-oror-Beats-75
// youtube:  https://www.youtube.com/watch?v=Pr6T-3yB9RM

class Car implements Comparable<Car>{
    public int pos;
    public int speed; 
    
    Car(int pos, int speed) {
        this.pos = pos;
        this.speed = speed;
    }
    
     public int compareTo(Car b)
    {
 
        return b.pos - this.pos;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<Car> cars = new ArrayList<>();
        for(int i =0; i<position.length; i++) {
            cars.add(new Car(position[i], speed[i]));
        }
        Collections.sort(cars);
        
        Stack<Double> stack = new Stack<>();
        for(Car car: cars) {
            double timeToReach = (double)(target - car.pos) / car.speed;
            if (!stack.isEmpty() && timeToReach <= stack.peek()) {
                continue;
            }
            stack.push(timeToReach);
        }
        
        return stack.size();
        
    }
}