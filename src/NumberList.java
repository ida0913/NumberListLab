import java.util.ArrayList;
import java.util.Arrays;
public class NumberList {

    // the "backing" array that will store the list's Integer objects
    private Integer[] list;
    // a NumberList also needs to remember the list's size
    private int size;

    public NumberList() {

        list = new Integer[2];
        size = this.getSize();
    }

    public int getSize() {
        size = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null)
                size++;
        }

        return size;

    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public String toString() {
        size = this.getSize();
        String string = "[";

        for (int i = 0; i < size; i++) {
            if (string.length() == 1) {
                string += "" + list[i] + "";
            } else {
                string += ", " + list[i] + "";
            }
        }
        return string + "]";
    }

    private void doubleCapacity(){

        Integer[] newList = new Integer[2*list.length];

        for(int i = 0; i<this.getSize(); i++){
            newList[i] = list[i];
        }
        
        list = newList;
        size = this.getSize();
    }

    public void add(int index, Integer val){

        if(index < 0 && index>size) throw new IndexOutOfBoundsException();

        if(size == list.length) doubleCapacity();

        for(int i = size-1; i>index; i++){
            list[i+1] = list[i];
        }
        list[index] = val;
        
        size = this.getSize();

    }

    public boolean add(Integer val){
        this.add(size, val);
        return true;
    }
}