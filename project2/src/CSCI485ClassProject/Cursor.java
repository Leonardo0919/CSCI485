package CSCI485ClassProject;

public class Cursor {
  public enum Mode {
    READ,
    READ_WRITE
  }

  // your code here
  Mode curr_mode;

  public void setMode(Mode mode){
    curr_mode = mode;
  }

  public Mode getCurr(){
    return curr_mode;
  }


}
