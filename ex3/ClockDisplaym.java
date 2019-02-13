class ClockDisplay{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String currTimeString;

    public ClockDisplay(){
        hours =new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTimeString();
    }
    private void setTimeString(){
        currTimeString = hour.getDisplayValue()+ ":" + minutes.getDisplayValue();
    }
    public void setTime(int hour,int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        setTimeString();
    }
    public String getTime(){
        return currTimeString;
    }
    public void minIncrement(){
        minutes.minIncrement();
        if(minutes.getValue()==0)
        hours.minIncrement();
        setTimeString();
    }
}
public class ClockDisplaym{
    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(14,10);
        while(true){
            clock.minIncrement();
            System.out.println(" tick...");
            System.out.println("Current time: "+clock.getTime());

            wait(100);
        }
    }
    private static void wait(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        }
        catch(Exception e){}
    }
}