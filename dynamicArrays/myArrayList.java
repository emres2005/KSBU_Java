package dynamicArrays;

public class myArrayList {
    int[] array;
    int arraySize;
    int filledCellCount;

    public myArrayList() {
        filledCellCount = 0;
        arraySize = 10;
        array = new int[arraySize];
    }

    public static void main(String[] args) {
        myArrayList array0 = new myArrayList();
        array0.add(1);
        array0.add(2);
        array0.add(3);
        array0.add(4);
        array0.add(5);
        array0.remove(2);
        array0.printArray();
        System.out.println("This Array's lenght: "+array0.lenght());
        System.out.println(array0.first());
        System.out.println(array0.last());
        System.out.println(array0.isEmpty());
    }

    public void add(int num) {
        if (filledCellCount == arraySize) {
            int[] temp = new int[arraySize*2];
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

    public void add(int index, int num) {
        if (filledCellCount != arraySize) {
            for (int i = (filledCellCount-index); i < filledCellCount; i++) {
                array[filledCellCount+2] = array[filledCellCount+1];
            }
            array[index] = num;
            filledCellCount++;
        }
    }

    public void remove(int index) {
        if (filledCellCount != 0) {
            for (int i = index; i < filledCellCount; i++) {
                array[i] = array[i+1];
            }
            filledCellCount--;
        }
    }

    public void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Array's Size: "+ arraySize);
    }

    public int lenght(){
        return filledCellCount;
    }
    public int first(){
        return array[0];
    }
    public int last(){
        return array[filledCellCount-1];
    }
    public boolean isEmpty(){
        return filledCellCount == 0;
    }
}