import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
  SuperArray a = new SuperArray();
  System.out.println(a);
  System.out.println(a.size());
  System.out.println(a.isEmpty());
  System.out.println();
  for(int i = 0; i<=15; i++) {
    if(i==15) {
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
  System.out.println(a.isEmpty());
  System.out.println(a.contains("replaced"));
  System.out.println();
  for(int i = 0; i<=15; i++) {
    System.out.println(a.get(i));
  }
  System.out.println();
  System.out.println(a.set(4,"replaced"));
  System.out.println(a.get(4));
  System.out.println(a.contains("replaced"));
  System.out.println(a);
  a.clear();
  System.out.println(a.isEmpty());

  System.out.println();
  SuperArray b = new SuperArray(1000);
  for(int i = 0; i<4; i++) {
    b.add("hi");
    }
  b.add(2,"wow");
  System.out.println(b);
  System.out.println(b.size());
  System.out.println(b.indexOf("hi"));
  System.out.println(b.indexOf("wow"));
  System.out.println(b.indexOf("bye"));
  System.out.println(b.remove(2));
  System.out.println(b);
  System.out.println(b.size());
  for(int i = b.size()-1; i >= 0; i--){
    b.remove(i);
}
  System.out.println(b);

  System.out.println();
  String[] c = b.toArray();
  System.out.println(Arrays.toString(c));
  }
}
