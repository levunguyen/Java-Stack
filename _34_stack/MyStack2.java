package _34_stack;

public class MyStack2<E> {
    private static final int INITIAL_SIZE = 16;
    private E[] elements;
    private int count = 0;

    public MyStack2() {
        elements = (E[]) new Object[INITIAL_SIZE];
    }

    public void push(E e) {
        ensureCapacity();

        elements[count++] = e;
    }

    private void ensureCapacity() {
        if (count >= elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements = newElements;
        }
    }


    public E peek() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }

        E e = elements[count - 1];
        return e;
    }

    public E pop() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }

        E e = elements[count - 1];
        elements[count - 1] = null;
        count--;
        return e;
    }

    public int search(E e) {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }

        for (int i = 0; i < count; i++) {
            if (elements[i].equals(e)) {
                return count - i;
            }

        }
        return -1;
    }

    public boolean remove(E e){
        if (count == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }

        int index = -1;
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(e)) {
                index = i;
                break;
            }
        }

        if (index == -1){
            return false;
        } else {
            for (int j = index; j < count - 1; j++){
                elements[j] = elements[j+1];
            }
            elements[count-1] = null;
            count--;
            return true;
        }
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.print(elements[i] + "\t");
        }
    }
    public static void main(String[] args) {
        MyStack2<Integer> myStack2 = new MyStack2<>();
        myStack2.push(1);
        myStack2.push(2);
        myStack2.push(3);
        myStack2.push(4);
        System.out.println(myStack2.remove(554));
        myStack2.push(554);
        myStack2.print();
    }

}
