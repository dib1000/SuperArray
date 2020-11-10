public class ErrorTest {
  public static void main(String[] args) {
    try{
      SuperArray n = new SuperArray(-1);
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }

    SuperArray test = new SuperArray();
    for(int i = 0; i<5; i++) {
      test.add("hi");
    }
    try {
      test.get(-1);
    }
    catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      test.get(10);
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      test.set(-1, "no");
    }
    catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      test.set(10, "no");
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      test.add(-1, "no");
    }
    catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      test.add(10, "no");
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
  }
}
