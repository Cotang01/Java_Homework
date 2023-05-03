package new_package;

import java.util.HashMap;

public class homework_5 {
	
	public static void main(String[] args) {
		
		// Создать множество, ключь и значение строки. 
		// Добавить шесть элементов. Вывести в консоль значения.
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Один", "One");
		map1.put("Два", "Two");
		map1.put("Три", "Three");
		map1.put("Четыре", "Four");
		map1.put("Пять", "Five");
		map1.put("Шесть", "Six");
		System.out.println(map1);
		
		// Добавить ко всем значениям символ "!".
		map1.replaceAll((k, v) -> v = v+"!");
		System.out.println(map1);
		
		// Создать второе множество с таким же обобщением. 
		// Ключи второго множества частично совпадают с ключеми первого. 
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("Один", "One");
		map2.put("Двадцать", "Twenty");
		map2.put("Три", "Three");
		map2.put("Сорок", "Forty");
		map2.put("Пять", "Five");
		map2.put("Шестнадцать", "Sixteen");
		System.out.println(map2);
		
		// Объеденить значания во втором множестве и первом если ключи 
		// совподают. Вывести результат в консоль.
		map1.forEach((k, v) -> map2.merge(k, v, String::concat));
		System.out.println(map2);

	}

}
