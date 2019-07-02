import java.util.HashMap;
public class MapIntroduction1 {
    public static void main(String[] args) {
        integerStringHashMap();
    }

    public static void integerStringHashMap () {
//    Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, String> hashMap1 = new HashMap<>();
//
//    Print out whether the map is empty or not
        System.out.println(hashMap1.isEmpty());

//    Add the following key-value pairs to the map
        hashMap1.put(97, "a");
        hashMap1.put(98, "b");
        hashMap1.put(99, "c");
        hashMap1.put(65, "A");
        hashMap1.put(66, "B");
        hashMap1.put(67, "C");
//
//    Key	Value
//      97	a
//      98	b
//      99	c
//      65	A
//      66	B
//      67	C
//    Print all the keys
        System.out.println(hashMap1.keySet());
//
//    Print all the values
        System.out.println(hashMap1.values());
//
//    Add value D with the key 68
        hashMap1.put(68, "D");
//
//    Print how many key-value pairs are in the map
        System.out.println(hashMap1.size());
//
//    Print the value that is associated with key 99
        System.out.println(hashMap1.get(99));
//
//    Remove the key-value pair where with key 97
        hashMap1.remove(97);
        System.out.println(hashMap1.keySet());
//
//    Print whether there is an associated value with key 100 or not
        System.out.println(hashMap1.get(100));

//
//    Remove all the key-value pairs
        hashMap1.clear();
        System.out.println(hashMap1.isEmpty());
    }
}

