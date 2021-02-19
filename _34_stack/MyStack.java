package _34_stack;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
//      push(): thêm phần tử ở đầu Stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(3);
        myStack.push(4);
//      peek(): trả về phần tử ở đầu Stack
//        System.out.println(myStack.peek());
//      pop(): lấy phần tử ở đầu Stack đồng thời xóa nó khỏi Stack
//        System.out.println(myStack.pop());
//      search(): trả về vị trí của phần tử cần tìm - tính tử đỉnh Stack
        System.out.println(myStack.search(4));
////      size(): trả về kích thước của Stack
//        System.out.println("size: "+myStack.size());
////      duyệt qua các phần tử của Stack
//        Iterator<Integer> iterator = myStack.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + "\t");
//        }
//        myStack.remove(new Integer(3));

        Iterator<Integer> iterator = myStack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
