package dynamicArrays;

public class dArray {
    int[] array;
    int arraySize;
    int filledCellCount;

    public dArray() {
        array = new int[2];
        arraySize = 2;
        filledCellCount = 0;
    }

    public static void main(String[] args) {
        dArray array=new dArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.printArray();
    }

    public void add(int num) {
        if (filledCellCount == arraySize) {
            int temp[] = new int[arraySize*2];
            for (int i = 0; i < arraySize; i++) {
                temp[i] = array[i];
            }
            array = temp;
            arraySize = arraySize *2;
            temp = null;
        }
        array[filledCellCount] = num;
        filledCellCount++;
    }

    public void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Array's Size: "+ arraySize);
    }}