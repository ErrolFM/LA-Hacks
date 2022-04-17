public class MainTimer{
  int seconds = 0;
  Countdown countdown = new Countdown();
  CountdownTask task = new CountdownTask{
    public void increment(){
      seconds++;
      System.out.println("Time Passed: " + seconds);
    }
  };
  public void begin(){
    myTimer.scheduleAtFixedRate(task, 1000, 1000);
  }
}
