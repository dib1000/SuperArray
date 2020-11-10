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
      test.get(5);
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      System.out.println(test.get(4));
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
      test.set(5, "no");
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      System.out.println(test.set(4,"no"));
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
    try {
      test.add(5, "no"); //should not give error
      System.out.println(test);
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      test.remove(-1);
    }
    catch(IndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    try {
      test.remove(6);
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      test.remove(5);
      System.out.println(test);
    }
    catch(IndexOutOfBoundsException e){
      e.printStackTrace();
    }
  }
}
