package arrayManipulation;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        if (count == 0) {
            System.out.println("The array is empty.");
            return;
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);
            if (i < count - 1) System.out.print(", "); // Format output
        }
        System.out.println();
    }

    // Method to insert an item into the array
    public void insert(int item) {
        if (items.length == count) {
            int[] newItem = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItem[i] = items[i];
            
            items = newItem;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return count;
    }

    public void clear() {
        count = 0;
    }
}
