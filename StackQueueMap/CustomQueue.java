public class CustomQueue<T> {

    private class Node{
        T data;
        Node next;

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

        public Node() {
        }

//        @Override
        public String toString() {
            return  data +", "+next;
        }
    }
    private Node head;

    public CustomQueue() {
//        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
//    @Override
    public String toString() {
        return head + "";
//        String s = "";
//        for (head x = node; x != null; x = x.next) {
//            if (s.isEmpty()) s = x.toString();
//            else s = String.join(", ", x.toString(), s);
//            if (x.next == null) break;
//        }
//        s = "{" + s + "}";
//        return s;
    }

    public void add(T element){
        Node newNode = new Node();
        if (isEmpty()) {
            head = newNode;
            newNode.setData(element);
        }else {
            Node currentNode = head;
            while (currentNode.getNext()!=null){
                currentNode = currentNode.getNext();
            }
                currentNode.setNext(newNode);
                newNode.setData(element);
        }
    }
    public Node remove(){
        Node node;
        if(isEmpty()){
            return null;
        }else {
            node=head;
            head = node.getNext();
            return node;
        }
    }

//    public void show(){
//        if (isEmpty()){
//            System.out.println("Queue's empty");
//        }else {
//            Node node = head;
//            System.out.print(head.getData());
//            while (node.getNext() != null) {
//                node = node.getNext();
//                System.out.println(", " + node.getData());
//            }
//        }
//    }
//    T remove(){
//        T x;
////        x = front.getData();
//        if (isEmpty()) {
//            return null;
//        }else{
//            if (front == rear){
//                return null;
//            }
//            x = front.getData();
//            front = front.getNext();
//            return x;
//        }
//    }
    public T getHead() {
        if (isEmpty()){
            return null;
        }
        return head.getData();
    }
//    public T getLast() {
//        if (isEmpty()){
//            return null;
//        }
//        return rear.data;
//    }
    //    private ArrayList<T> queue = new ArrayList<>();
//    public boolean isEmpty(){
//        if(queue.size() == 0){
//            return true;
//        }
//        return false;
//    }
//
//    public String toString() {
//        return "queue=" + queue;
//    }
//
//    public void add(T element) {
//        queue.add(element);
//    }
//
//    public T remove() {
//        T x;
//        x = queue.get(0);
//        if (isEmpty()) {
//            return null;
//        }else{
//            queue.remove(0);
//            return x;
//        }
//    }
//
//    public T getFirst() {
//        if (isEmpty()){
//            return null;
//        }
//        return queue.get(0);
//    }
//
//    public T getLast() {
//        if (isEmpty()){
//            return null;
//        }
//        return queue.get(queue.size()-1);
//    }

    public static void main(String[] args) {
        CustomQueue<Integer> q2 = new CustomQueue<>();
//        q2.enqueue(1);
//        q2.enqueue(2);
//        q2.enqueue(4);
//        System.out.println(q2);
//        System.out.println(q2.front.data);
//        System.out.println(q2.rear.data);
        q2.add(7);
        q2.add(8);
        q2.add(9);
        q2.add(10);
        q2.remove();
        System.out.println(q2);
//        q2.show();
        System.out.println(q2.getHead());
//        System.out.println("reg"+q2.rear.data);
//        CustomQueue<String> q1 = new CustomQueue<>();
//        q1.enqueue("hi");
//        q1.enqueue("hi2");
//        q1.enqueue("hi3");
//        System.out.println(q1.front.data);
//        System.out.println(q1.rear.data);
//        q1.dequeue();
//        System.out.println(q1.front.data);
//        System.out.println(q1.rear.data);
//        q2.remove();
//        System.out.println(q2);
//        System.out.println(q2.getFirst());
//        System.out.println(q2.getLast());
    }
}