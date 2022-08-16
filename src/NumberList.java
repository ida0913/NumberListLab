public class NumberList {

    // the "backing" array that will store the list's Integer objects
    private Integer[] list;

    // a NumberList also needs to remember the list's size
    private int size;

    public NumberList() {

        list = new Integer[2];
    }

    public int getSize() {

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
        String string = "[";

        for (int i = 0; i < this.getSize(); i++) {
            if (string.length() == 1) {
                string += "" + list[i] + "";
            } else {
                string += ", " + list[i] + "";
            }
        }
        return string;
    }
}