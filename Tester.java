public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();
  System.out.println(a);
  System.out.println(a.size());
  for(int i = 0; i<=10; i++) {
    if(i%2==0) {
      a.add("hi");
      System.out.println(a.size());
    }
    else {
      a.add("bye");
      System.out.println(a.size());
    }
    }
    for(int i = 0; i<10; i++) {
      System.out.println(a.get(i));
    }
  }
}
