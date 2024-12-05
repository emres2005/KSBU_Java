package stackler;

public class MyStack {
    int topIndex;
    int[] stackData;
    int size;

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.pop();
        myStack.printStack();
        System.out.println("\nDolu hücre sayısı: "+ myStack.size() +"\nStack boyutu sayısı: "+ myStack.size);
        System.out.println(myStack.peek()+" "+myStack.isEmpty());
    }

    public MyStack() {
        topIndex = -1;
        size = 2;
        stackData = new int[size];
    }
    public void push(int data) {
        if (this.size() == size) {
            int[] temp = new int[size*2];
            for (int i = 0; i < size; i++) {
                temp[i] = stackData[i];
            }
            stackData = temp;
            size = size *2;
        }
        stackData[++topIndex] = data;
    }
    public void pop() {

        stackData[topIndex--] = 0;
    }
    public int peek() {
        return stackData[topIndex];
    }
    public boolean isEmpty() {
        return topIndex == -1;
    }
    public int size() {
        return topIndex + 1;
    }
    public void printStack() {
        for (int i = 0; i <= topIndex; i++) {
            System.out.print(stackData[i] + " ");
        }
    }
}