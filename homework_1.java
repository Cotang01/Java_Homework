package new_package;

import java.util.Arrays;
import java.util.Random;

public class homework_1 {
	
	public static void main(String[] args) {
		// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 
		// и сохранить в i
	    int i = new Random().nextInt(2000);
	    System.out.println(i);
	    
	    // 2. Посчитать и сохранить в n номер старшего значащего 
	    // бита выпавшего числа
	    Integer n = Integer.highestOneBit(i);
	    System.out.println(n);
	    
	    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE
	    // сохранить в массив m1
	    int[] m1 = new int[Short.MAX_VALUE];
	    int x = 0;
	    short s = Short.MAX_VALUE;
	    
	    for (int i1 = i; i1 < s; i1++) {
	    	if (i1 % n == 0) {
	    		m1[x] = i1;
	    		x++;
	    	}

	    } // Сохранить-то сохранил, но много лишних нулей в конце массива чаще 
	      // всего появляются, пока не знаю как ограничить размер массива, до
	      // нужного значения кроме как задавание большого размера изначально
	    System.out.println(Arrays.toString(m1));
	    
	    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i 
	    // и сохранить в массив m2
	    int[] m2 = new int[40000];
	    int x1 = 0;
	    short s1 = Short.MIN_VALUE;
	    
	    for (int i2 = i; s1 < i2; s1++) {
	    	if (s1 % n != 0) {
	    		m2[x1] = s1;
	    		x1++;
	    	}
	    }  // Значений в массиве m2 так много, что при выводе затираются старые
	       // принты, !так что нижний комментарий стоит убирать только после
	       // проверки других заданий!
	       // + остаётся такая же загвоздка, как и в 3 задании
	       // Но по сути задания выполнены
	    // System.out.println(Arrays.toString(m2));
	}

}
