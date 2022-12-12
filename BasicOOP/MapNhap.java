import java.util.ArrayList;

public class MapNhap<K, V> {
    private class Node{
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int size;
    private ArrayList<Node>[] buckets; //vùng chứa, nơi lưu trữ các cặp key,value
    public MapNhap(){
        size=0;
        initbuckets(1);
    }
    private void initbuckets(int n){
        buckets = new ArrayList[n];
        int len = buckets.length;
        for (int i = 0; i < len; i++){
            buckets[i] = new ArrayList<>();
        }
    }
    private int hash(K key){
        int hashCode = key.hashCode();
//        int len = ;
        return Math.abs(hashCode) % buckets.length;
    }
    private int getIndexWithinBucket(K key, int i){
        int x=0;
        for (Node node: buckets[i]){
            if (node.key.equals(key)){
                return x;
            }
            x++;
        }
        return -1;
    }
    public V get(K key){
        int i = hash(key);
        int x = getIndexWithinBucket(key, i);
        if (x!=-1){
            Node node = buckets[i].get(x);
            return node.value;
        }else {
            return null;
        }
    }
    public boolean constainsKey(K key){
        int i = hash(key);
        int x = getIndexWithinBucket(key, i);
        if (x!=-1){
            return true;
        }else {
            return false;
        }
    }
//    public void rehash(){
//        ArrayList<Node>[] oba = buckets;
//        initbuckets(oba.length*2);
//        size=0;
//        int len = oba.length;
//        for (int i =0; i < len; i++){
//            for (Node node: oba[i]){
//                put(node.key, node.value);
//            }
//        }
//    }
    public void put(K key, V value){
        int i = hash(key);
        int x = getIndexWithinBucket(key, i);
        if (x!=-1){
            Node node = buckets[i].get(x);
            node.value = value;
        }else {
            Node node = new Node(key, value);
            buckets[i].add(node);
//            size++;
        }
//        double lamdba = size*1.0/buckets.length;
//        if (lamdba>2.0){
//            rehash();
//        }
    }
    public V remove(K key){
        int i = hash(key);
        int x = getIndexWithinBucket(key, i);
        if (x!=-1){
            Node node = buckets[i].remove(x);
//            size--;
            return node.value;
        }else {
            return null;
        }
    }
    public ArrayList<K> keyset(){
        ArrayList<K> keys = new ArrayList<>();
        int len = buckets.length;
        for (int i = 0; i < len; i++){
            for (Node node: buckets[i]){
                keys.add(node.key);
            }
        }
        return keys;
    }
    public void display(){
        for (int i = 0; i< buckets.length; i++){
            System.out.println("Bucket "+i+" ");
            for (Node node: buckets[i]){
                System.out.println(node.key+":"+node.value+" ");
            }
        }
    }

    public static void main(String[] args) {
        MapNhap<Integer, String> newmap = new MapNhap();
        newmap.put(2, "djhf");
        newmap.put(1, "djhfhgjf");
        newmap.put(4, "32");
        newmap.put(3, "d4654jhf");
//        newmap.put(3, "d46");
        newmap.display();
        newmap.remove(2);
        System.out.println("**************");
        newmap.display();
        newmap.put(1, "svv");
        System.out.println("**************");
        newmap.display();
    }
}
