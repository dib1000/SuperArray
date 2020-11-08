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
  }
}
