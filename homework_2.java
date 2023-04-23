package new_package;

public class homework_2 {
	
	public static void main(String[] args) {
		
		// 1.
		// Написать метод принимающий строку, ищущий в ней основание и степень 
		// После этого расчитывающий результат и выводящий в консоль в консоль 
		// строку параметра + ответ. Пример строки: "Основание -12б степень 7, 
		// результат". Попробовать с разными входящими строками.
		
		//
		
		String task = "Основание 5, степень 5, результат";
		
		
		String[] dgs = task.replace(",", "").split(" ");
		System.out.println(task);
		StringBuilder digits = new StringBuilder();
		
		int i;
		for (i = 0; i < dgs.length; i++) {
			if (dgs[i].matches("[0-9]+") || dgs[i].contains("-")) {
				digits.append(dgs[i] + ", ");
			}
			
		} 
		String[] chisla = digits.toString().split(", ");
		StringBuilder base = new StringBuilder();
		StringBuilder degree = new StringBuilder();
		
		for (i = 0; i < chisla.length; i += 2) {
			base.append(chisla[i] + " ");
		}
		
		String[] bases = base.toString().split(" ");
		
		for (i = 1; i < chisla.length; i += 2) {
			degree.append(chisla[i] + " ");
		}
		
		String[] degrees = degree.toString().split(" ");
		
		for (i = 0; i < chisla.length; i++) {
			
		}
		
		for (i = 0; i < bases.length; i++) {
			System.out.println("Основание " + bases[i] + ", степень "
					+ degrees[i] + ", результат " +
					Math.pow(Double.parseDouble(bases[i]), 
							Double.parseDouble(degrees[i])));
		}
		
		// 2.
		// Сравнить скорость работы реплейса классов String и StringBuilder.
		
		long start1 = System.currentTimeMillis();
		
		String dataS = """
				В моем аккорде три струны,
				Но всех больней звучит вторая
				Тоской нездешней стороны.
				В моем аккорде три струны.
				В них – детства розовые сны,
				В них – вздох потерянного рая.
				В моем аккорде три струны,
				Но всех больней звучит вторая.""";
		
		String changeword = "струны";
		String newword = "ноты";
		System.out.println(dataS.replace(changeword, newword));
		
		long finish1 = System.currentTimeMillis();
		System.out.println("На выполнение кода ушло: " + (finish1 - start1) + 
				" миллисекунд");
		
		
		
        long start2 = System.currentTimeMillis();
        
		StringBuilder dataSB = new StringBuilder(dataS);
		while (dataSB.indexOf(changeword) > 0) {
			dataSB.replace(dataSB.indexOf(changeword), 
					dataSB.indexOf(changeword) + changeword.length(), 
					newword);
		}
		System.out.println(dataSB.toString());

		
		long finish2 = System.currentTimeMillis();
		System.out.println("На выполнение кода ушло: " + (finish2 - start2) + 
				" миллисекунд");
		// ^ На данном примере разницу не ощутить ^
		
		long start3 = System.currentTimeMillis();
		
		String test1 = "Hi";
		for (int j = 0; i < 100000; i++) {
			test1 += "+";
		}
		
		long finish3 = System.currentTimeMillis();
		System.out.println();
		System.out.println("На цикл с test1 потрачено: " + 
		(finish3 - start3) + " миллисекунд");
		
		long start4 = System.currentTimeMillis();
		
		StringBuilder test2 = new StringBuilder("Hello");
		for (int k = 0; k < 100000; k++) {
			test2.append("-");
		}
		
		long finish4 = System.currentTimeMillis();
		System.out.println();
		System.out.println("На цикл с test2 потрачено: " + 
		(finish4 - start4) + " миллисекунд");
		

	}
}
