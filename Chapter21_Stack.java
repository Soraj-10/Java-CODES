// Chapter21_Stack.java
class Stack {
    private int[] data = new int[10];
    private int top = -1;

    public void push(int value) {
        data[++top] = value;
    }

    public int pop() {
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Chapter21_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop()); // 30
        System.out.println(s.pop()); // 20
    }
}