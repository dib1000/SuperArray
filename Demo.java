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
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("kani");    words.add("kani");    words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");    words.add("toro");    words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
