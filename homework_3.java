package new_package;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class homework_3 {
	
	public static void main(String[] args) {
		
		// 1. Реализовать алгоритм обратной сортировки списков компаратором.
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list1.add(i);
		}
		System.out.println(list1);
		list1.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
		    }
		});
		System.out.println(list1);
		
		// 2. Пусть дан произвольный список целых чисел, 
		// удалить из него чётные числа
		Iterator<Integer> iter = list1.iterator();
		while (iter.hasNext()) {
			int n = iter.next();
			if (n%2 == 0) {
				iter.remove();
			}
		}
		System.out.println(list1);
		
		
		// 3. Задан целочисленный список ArrayList. Найти минимальное, 
		// максимальное и среднее из этого списка.
		ArrayList<Integer> list2 = new ArrayList<>(20);
		for (int i = 0; i < 20; i++) {
			list2.add(new Random().nextInt(25));
		}
		System.out.println(list2);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int avg = 0;
		for (int i = 0; i < list2.size(); i++) {
			if (min > list2.get(i)) {
				min = list2.get(i);
			}
			if (max < list2.get(i)) {
				max = list2.get(i);
			}
			avg = (min+max)/2;
		}
		System.out.println("Минимальное значение: " + min);
		System.out.println("Максимальное значение: " + max);
		System.out.println("Среднее значение: " + avg);
		
		// 4. Дано два целочисленных списка, объеденить их не допуская 
		// элементы второго списка уже встречающиеся в первом.
		ArrayList<Integer> list3 = new ArrayList<>(list1);
		System.out.println(list2);
		System.out.println(list3);
		list2.removeAll(list3);
		list3.addAll(list2);
		System.out.println(list3);
		
		// 5. Создать ArrayList<Integer> и добавить нулевым 
		// эллементом ноль 10000 раз.
		long start1 = System.currentTimeMillis();
		ArrayList<Integer> list4 = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			list4.add(0, 0);
		}
		System.out.println(list4);
		long finish1 = System.currentTimeMillis();
		
		// 6. Повторить пятый пункт но с LinkedList.
		long start2 = System.currentTimeMillis();
		LinkedList<Integer> list5 = new LinkedList<>();
		for (int i = 0; i < 10000; i++) {
			list5.add(0, 0);
		}
		System.out.println(list5);
		long finish2 = System.currentTimeMillis();
		
		// 7. Сравнить время работы пятого и шестого пунктов.
		System.out.println("Время работы 5 пункта: " + (finish1 - start1)
				+ " миллисекунд");
		System.out.println("Время работы 6 пункта: " + (finish2 - start2)
				+ " миллисекунд");
	}

}
