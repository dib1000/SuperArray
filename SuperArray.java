public class SuperArray {
  private String [] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public int size() {
    return size;
  }
  public boolean add(String element) {
    if(size+1<=data.length) {
      data[size] = element;
      size +=1;
    }
    return true;
  }
  public String get(int index) {
    return data[index];
  }
  public String set(int index, String element) {
    String old = data[index];
    data[index] = element;
    return old;
  }
}
