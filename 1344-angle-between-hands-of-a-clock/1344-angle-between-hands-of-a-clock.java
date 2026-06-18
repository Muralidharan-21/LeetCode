class Solution {
    public double angleClock(int hour, int minutes) {

        if (hour == 12){
            hour = 0;
        }

        double min = 6 * minutes;
        double h =  hour * 30 + minutes * 0.5;

        double angle = Math.abs(min - h);

        return Math.min(angle,360-angle);
        
    }
}