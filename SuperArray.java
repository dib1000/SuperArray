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
    else {
      resize();
      data[data.length-1] = element;
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
  private void resize() {
    String[] newArray = new String[data.length+10];
    for(int i = 0; i<size; i++) {
      newArray[i] = data[i];
    }
    data = newArray;
  }
  public boolean isEmpty() {
    return size==0;
  }
  public String toString() {
    String strArray = "["+data[0];
    for(int i = 1; i<size; i++) {
      strArray = strArray + ", " + data[i];
    }
    return strArray + "]";
  }
}
