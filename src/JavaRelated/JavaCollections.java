package JavaRelated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayList();
		hashMap();
	}
	//A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. 
	//Elements can be inserted or accessed by their position in the list, using a zero-based index.
	//arraylist implements list interface 
	//ArrayList is a resizable-array implementation of the List interface
	
	public static void arrayList() {
		// array - fixed-size sequential collection of elements of the same type
		// they are of fixed length so cannot store more data and
		// if there are number of elements gets removed from
		// it the memory consumption would be the same as it doesn’t shrink
		String[] arrabc = new String[2];
		arrabc[0] = "sd";
		arrabc[1] = "fds";

		for (int i = 0; i < arrabc.length; i++) {
			System.out.println(arrabc[i]);
		}

		// arraylist -
		// ArrayList can dynamically grow and shrink after addition and removal
		// of elements
		// predefined methods makes coding easy

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("A");
		arr.add("B");
		arr.add("C");

		System.out.println(arr);
		// through for loop
		for (String obj : arr) {
			System.out.println(obj);
		}
		System.out.println("========");

		// through iterator
		Iterator itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		arr.add(0, "D");
		arr.add(1, "E");
		System.out.println(arr);
		//remove
		arr.remove(2);
		System.out.println(arr);

		arr.remove("E");
		System.out.println(arr);

		arr.set(0, "Z");
		System.out.println(arr);

		System.out.println(arr.indexOf("Z"));
		System.out.println(arr.get(2));
		System.out.println(arr.size());
		System.out.println(arr.contains("A"));
		System.out.println(arr.contains("Z"));
		arr.clear();
		System.out.println(arr);

		// Initialization using Arrays.asList
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		System.out.println("the elements are: " + obj);

		// Anonymous inner class method to initialize ArrayList
		ArrayList<String> cities = new ArrayList<String>() {
			{
				add("Delhi");
				add("Agra");
				add("Chennai");
			}
		};
		System.out.println("Content of Array list cities:" + cities);

		// Use Collections.ncopies
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.println("ArrayList items: " + intlist);

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		// Advanced For Loop*/
		System.out.println("Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.println(num);
		}

		/* While Loop for iterating ArrayList */
		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		/* Looping Array List using Iterator */
		System.out.println("Iterator");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Aus");
		countries.add("SA");

		System.out.println(countries);
		// sort
		Collections.sort(countries);
		System.out.println(countries);
		// sort descending
		Collections.sort(countries, Collections.reverseOrder());
		System.out.println(countries);

		// addall
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("hello");
		al.add("String");
		al.add("Test");
		System.out.println("ArrayList1 before addAll:" + al);

		// ArrayList2 of String Type
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Text1");
		al2.add("Text2");
		al2.add("Text3");
		al2.add("Text4");

		// Adding ArrayList2 into ArrayList1
		al.addAll(al2);
		System.out.println("ArrayList1 after addAll:" + al);

		// Adding ArrayList2 into ArrayList1 at index
		al.addAll(2, al2);
	       System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+al);      
	}
	
	//A Map is an object that maps keys to values. A map cannot contain duplicate keys. 
	//There are three main implementations of Map interfaces: HashMap, TreeMap, and LinkedHashMap.
	//HashMap is a Map based collection class that is used for storing Key & value pairs, 
	//it is denoted as HashMap<Key, Value> or HashMap<K, V>. 
	//This class makes no guarantees as to the order of the map. 
	//It is similar to the Hashtable class except that it is unsynchronized and permits nulls(null values and null key).
	//It is not an ordered collection
	//You must need to import java.util.HashMap
	
	public static void hashMap() {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//can store multiple values with different keys
		hmap.put(1, "Gaurav");
		hmap.put(2, "Shar");
		hmap.put(3, "Gaurav");
		hmap.put(4, "tar");
		
		System.out.println(hmap);
		//null if accessing non existed key
		System.out.println(hmap.get(11));
		hmap.remove(1);
		System.out.println(hmap);
		
		//hmap.clear();
		System.out.println(hmap);
		
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		
		//can store multiple values with different keys
		hmap1.put(1, "A");
		hmap1.put(2, "B");
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		
		//can store multiple values with different keys
		hmap2.put(3, "C");
		hmap2.put(4, "D");
		
		System.out.println(hmap1.containsKey(2));
		System.out.println(hmap1.containsValue("Gaurav"));
		
		System.out.println(hmap1.isEmpty());
		
		System.out.println(hmap1.keySet());
		System.out.println(hmap1.values());
		
		System.out.println(hmap1.size());
		
		System.out.println(hmap2);
		hmap2.putAll(hmap1);
		System.out.println(hmap2);

		//FOR LOOP
        System.out.println("For Loop:");
        for (Map.Entry me : hmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 
		
		
	}
	
	
	

}
