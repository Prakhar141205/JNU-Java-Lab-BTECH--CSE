
interface StackOperations {
    void push(int val);
    int pop();
}


class Stack implements StackOperations {
    static final int SIZE = 5;  
    int arr[] = new int[SIZE];
    int top = -1 ;

    public void push(int val) {
        if(top >= SIZE - 1) {
            System.out.println("Stack is full...");
        }else {
            top++;
            arr[top] = val;
            System.out.println(val + " is pushed.");
        }
    }


    public int pop() {
        int temp;
        if(top == -1) {
            System.out.println("Stack is Underflow...");
            return -1;
        }else {
            temp = arr[top];
            top--;
            System.out.println(temp + " is popped.");

        }
        return temp;
    }

}
    public class StackImplementation {

        public static void main(String[] args) {
            Stack st = new Stack();

            
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);

            st.pop();
            st.pop();
        }
    }
