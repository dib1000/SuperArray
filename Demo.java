public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i<s.size(); i++) {
      int j = i+1;
      while(j<s.size()) {
        if(s.get(j).equals(s.get(i))) {
          s.remove(j);
        }
        else {
          j+=1;
        }
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray();
    for(int i = 0; i<a.size(); i++) {
      for(int j = 0; j<b.size(); j++) {
        if(a.get(i).equals(b.get(j))) {
          overlap.add(a.get(i));
        }
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    int small = 0;
    SuperArray longer = new SuperArray();
    if(a.size()<=b.size()) {
      small = a.size();
      longer = b;
    }
    else {
      small = b.size();
      longer = a;
    }
    SuperArray zipped = new SuperArray();
    for(int i = 0; i<small; i++) {
      zipped.add(a.get(i));
      zipped.add(b.get(i));
    }
    for(int j = small; j<longer.size(); j++) {
      zipped.add(longer.get(j));
    }
    return zipped;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("kani");    words.add("kani");    words.add("uni");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");    words.add("toro");    words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    System.out.println();
    SuperArray nums = new SuperArray();
    SuperArray numz = new SuperArray();
    nums.add("9"); nums.add("1"); nums.add("2"); nums.add("2"); nums.add("3"); nums.add("4");
    numz.add("0"); numz.add("4"); numz.add("2"); numz.add("2"); numz.add("9");
    System.out.println(findOverlap(nums,numz));

    System.out.println();
    SuperArray letters = new SuperArray();
    SuperArray numbers = new SuperArray();
    letters.add("a"); letters.add("b"); letters.add("c"); letters.add("d"); letters.add("e"); letters.add("f");
    numbers.add("0"); numbers.add("1"); numbers.add("2"); numbers.add("3");
    System.out.println(zip(letters,numbers));
    letters.remove(5); letters.remove(4); letters.remove(3);
    numbers.add("4");
    System.out.println(zip(letters,numbers));
  }
}
