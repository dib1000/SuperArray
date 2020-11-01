public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();
  System.out.println(a);
  System.out.println(a.size());
  for(int i = 0; i<=10; i++) {
    a.add("hi");
    System.out.println(a.size());
  }
  }
}
