public class CustomStack<T> {
    //    private int top;
//    private int size;
//    private ArrayList<T> stack;
    private class Node {
        T data;
        Node next;

        public String toString() {
            return data +", "+ next;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node top;

    public CustomStack() {
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T element) {
        Node newNode = new Node(element, top);
        top = newNode;
    }

    public T pop() {
        T elementTop;
        if (isEmpty()) {
            return null;
        } else {
            elementTop = top.getData();
            top = top.getNext();
            return elementTop;
        }
    }

    public T peek() {
        T elementTop;
        if (isEmpty()) {
            return null;
        } else {
            elementTop = top.getData();
            return elementTop;
        }
    }
//    public int size(){
//        return size;
//    }

//    @Override
//    public String toString() {

//        return "top=" + String.valueOf(top);
//    }
//    public CustomStack(int size){
//        this.size = size;
//        stack = new ArrayList<>(size);
//        top = -1;
//    }
//    //đưa phần tử vào đầu ngăn xếp
//    public void push(T element){
//        if(top + 1 == size){
//            System.out.println("Is Full");
//        }else {
//            top++;
//            stack.add(element);
//        }
//    }
//    //xóa ptu đầu ngăn xếp
//    public T pop(){
//        T x;
//        if (isEmpty()){
//            return null;
//        }else {
//            x = stack.get(top);
//            stack.remove(x);
//            top--;
//            return x;
//        }
//    }
//    //lấy ra ptu đầu ngăn xếp nhưng không xóa
//    public T peek(){
//        if(isEmpty()){
//            return null;
//        }else {
//            return stack.get(top);
//        }
//    }
//    public boolean isEmpty() {
//        return (top==-1);
//    }
    //trả về biểu diễn đối tượng dạng chuỗi
//    public String toString()
//    {
//        String chuoi = "";
//        for (int i = 0; i < size; i++) {
//            chuoi += String.valueOf(size.get(i)) + ", ";
//        }
//        chuoi += String.valueOf(size.get(top));
//        return chuoi;
//    }

    public String toString() {
        return "" + top ;
    }

    public static void main(String[] args) {
        CustomStack<Integer> S = new CustomStack<>();
//        S.push(0);
//        S.push(25);
//        S.push(21);
//        S.push(24);
//        System.out.println("Delete " + S.pop());
//        System.out.println("Head's " + S.peek());

        CustomStack<String> S1 = new CustomStack<>();
        S1.push("0");
        S1.push("ha");
        S1.push("hai");
//        S1.push(null);
        System.out.println(S1);
        System.out.println("Head's " + S1.peek());
        System.out.println("Delete " + S1.pop());
        System.out.println("Head's " + S1.peek());
    }

}
