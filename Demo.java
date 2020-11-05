public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i<s.size(); i++) {
      for(int j = i+1; j<s.size(); j++ ) {
        String comparison = s.get(i);
        String compare = s.get(j);
        if(compare.equals(comparison)) {
          s.remove(j);
        }
      }
    }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
