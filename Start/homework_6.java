package new_package;
	
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.TreeMap;

public class homework_6 {

	public static void main(String[] args) {
		myFakeSet set_1 = new myFakeSet();
		for (int i = 0; i < 10; i++) {
			set_1.add(new Random().nextInt(20), set_1);
		}
		System.out.println(set_1.contains(5));
		System.out.println(Arrays.toString(set_1.getAll()));
		
		Iterator<Integer> iter = set_1.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		
		System.out.println("\n" + set_1.getItem(3));
		
		myFakeTreeSet tset_1 = new myFakeTreeSet();
		
		for (int i = 0; i < 10; i++) {
			tset_1.add(new Random().nextInt(20), set_1);
		}
		System.out.println(tset_1.contains(5));
		System.out.println(Arrays.toString(tset_1.getAll()));
		
		Iterator<Integer> iter2 = tset_1.iterator();
		
		while (iter2.hasNext()) {
			System.out.print(iter2.next() + ", ");
		}
		
		System.out.println("\n" + tset_1.getItem(3));
		
		new Comparator<Integer>() {
			public int compare (Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		
	}
}


class myFakeSet {
	
	private LinkedHashMap<Integer, Object> map_1 = new LinkedHashMap<>();
	
	static final Object OBJ = new Object();
	
	public boolean add(int number, Object OBJ) {
		return map_1.put(number, OBJ) == null;
	}
	
	public boolean contains(int number) {
		return map_1.containsKey(number);
	}
	
	public Object[] getAll() {
		return map_1.keySet().toArray();
	}
	
	public Iterator<Integer> iterator() {
		return map_1.keySet().iterator();
	}
	
	public Integer getItem(int index) {
		return (Integer) getAll()[index];
	}
	
}

class myFakeTreeSet {
	
	public myFakeTreeSet() {
		 new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
	}
	

	
	private TreeMap<Integer, Object> tmap_1 = new TreeMap<>();
	
	static final Object OBJ = new Object();
	
	public boolean add(int number, Object OBJ) {
		return tmap_1.put(number, OBJ) == null;
	}
	
	public boolean contains(int number) {
		return tmap_1.containsKey(number);
	}
	
	public Object[] getAll() {
		return tmap_1.keySet().toArray();
	}
	
	public Iterator<Integer> iterator() {
		return tmap_1.keySet().iterator();
	}
	
	public Integer getItem(int index) {
		return (Integer) getAll()[index];
	}
	
}