public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();
  System.out.println(a);
  System.out.println(a.size());
  for(int i = 0; i<=10; i++) {
    if(i==10) {
      a.add("wow");
      System.out.println(a.size());
    }
    else if(i%2==0) {
      a.add("hi");
      System.out.println(a.size());
    }
    else {
      a.add("bye");
      System.out.println(a.size());
    }
  }
  System.out.println();
  for(int i = 0; i<=10; i++) {
    System.out.println(a.get(i));
  }
  System.out.println();
  System.out.println(a.set(4,"replaced"));
  System.out.println(a.get(4));
  }
}
