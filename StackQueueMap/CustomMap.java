package StackQueueMap;

public class CustomMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;

        @Override
        public String toString() {
            return "\"" + key +
                    "\": " + value + (prev != null ? (", " + prev) : "");
        }

        public Node(K key, V value, Node<K, V> prev) {
            this.key = key;
            this.value = value;
            this.prev = prev;
        }
    }

    private Node<K, V> node = null;

    public CustomMap() {
    }

    public boolean containsKey(K key){
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (key.equals(currentNode.key)) {
                return true;
            }
        }
        return false;
    }

    public void add(K key, V value) {
        if (containsKey(key)){
            System.out.println("Key already existed. Key must be unique.");
        }else {
            Node<K, V> newNode = new Node<>(key, value, node);
            node = newNode;
        }
    }

    public V get(K key) {
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (key.equals(currentNode.key)) {
                System.out.println(currentNode.value);
                return (V) currentNode.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        for (Node<K, V> currentNode = node; currentNode != null; currentNode = currentNode.prev) {
            if (currentNode.prev != null && currentNode.prev.key == key){
                Node<K, V> remove = currentNode.prev;
                currentNode.prev = currentNode.prev.prev;
                return remove.value;
            }
            if (currentNode.prev != null && currentNode.key == key){
                node = currentNode.prev;
                return currentNode.value;
            }
        }
        System.out.println("ko ton tai");
        return null;
    }

    @Override
    public String toString() {
        return "{" + node + "}";
    }

    public static void main(String[] args) {
        CustomMap map = new CustomMap<>();
        map.add(1, "sf");
//        map.add(1, "sfừ");
        map.add(2, "1f");
        map.add(3, "lf");
//        map.add(4, "l5f");
//        map.get(1);
//        System.out.println(map);
//        map.remove(5);
//        System.out.println(map);
        map.remove(3);
        System.out.println(map);
//        map.remove(3);
//        System.out.println(map);
//        map.remove(4);
//        System.out.println(map);
    }
}