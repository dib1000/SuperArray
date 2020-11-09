public class ErrorTest {
  public static void main(String[] args) {
    try{
      SuperArray n = new SuperArray(-1);
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
  }
}
