package codePTIT.ThucHanh;

public class Pair<K, V> {
    private K key;
    private V value;

    public void add(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public String toString(){
        return "(" + key + "," + value + ")";
    }
}
