public class SuperArray {
  private String [] data;
  private int size;
  public SuperArray() {
    size = 0;
    data = new String[10];
  }
  public SuperArray(int InitialCapacity) {
    size = 0;
    data = new String[InitialCapacity];
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
      int oldLength = data.length;
      resize();
      data[oldLength] = element;
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
    int x = data.length;
    String[] newArray = new String[x*2];
    for(int i = 0; i<size; i++) {
      newArray[i] = data[i];
    }
    data = newArray;
  }
  public boolean isEmpty() {
    return size==0;
  }
  public String toString() {
    if (size==0) {
      return "[]";
    }
    String strArray = "["+data[0];
    for(int i = 1; i<size; i++) {
      strArray = strArray + ", " + data[i];
    }
    return strArray + "]";
  }
  public boolean contains(String s) {
    for(int i = 0; i<size; i++) {
      if(data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }
  public void clear() {
    data = new String[data.length];
    size = 0;
  }
  public void add(int index, String element) {
    size +=1;
    for(int i = size-2; i>=index; i--) {
      data[i+1] = data[i];
    }
    data[index] = element;
  }
  public String remove(int index) {
    String storage = data[index];
    size -= 1;
    for(int i = index+1; i<=size; i++) {
      data[i-1] = data[i];
    }
    data[size] = null;
    return storage;
  }
  public int indexOf(String s) {
    for(int i = 0; i<size; i++) {
      if(data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }
  public String[] toArray() {
    String[] regular = new String[size];
    for(int i = 0; i<size; i++) {
      regular[i] = data[i];
    }
    return regular;
  }
  public int lastIndexOf(String value){
    for(int i = size-1; i>=0; i--) {
      if(data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }
  public boolean equals(SuperArray other) {
    if (size!=other.size) {
      return false;
    }
    for(int i = 0; i<size; i++) {
      if(!(data[i].equals(other.data[i]))) {
        return false;
      }
    }
    return true;
  }
}
