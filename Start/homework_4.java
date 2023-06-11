package new_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class homework_4 {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("people.txt");
		FileReader fr1 = new FileReader(f1);
		Scanner in = new Scanner(fr1);
		StringBuilder sbdata = new StringBuilder();
		while (in.hasNextLine()) {
			sbdata.append(in.nextLine() + " \n");
		}
		
		// Определяем число строк
		int lines = 0;
		var reader1 = new BufferedReader(new FileReader(f1));
		while (reader1.readLine() != null) {
			lines++;
		}
		in.close();
		reader1.close();
		
		// Вывод текста из StringBuilder
		System.out.println(sbdata);
		
		// Создание массива, где каждое слово или число это элемент
		String[] dataArray = sbdata.toString().split(" ");
		dataArray = sbdata.toString().split(" ");
		
		// Вывод dataArray
		// System.out.println(Arrays.toString(dataArray));
		
		// Фамилии
		StringBuilder fam = new StringBuilder();
		for (int i = 0; i < lines * 5; i+= 5) {
			fam.append(dataArray[i] + " ");
		}
		String[] famArray = fam.toString().split(" \n");
		ArrayList<String> famArrayList = new ArrayList<>();
		for (int i = 0; i < famArray.length; i++) {
			famArrayList.add(famArray[i]);
		}
		
		// Имена
		StringBuilder names = new StringBuilder();
		for (int i = 1; i < lines * 5; i+= 5) {
			names.append(dataArray[i] + " ");
		}
		String[] namesArray = names.toString().split(" ");
		ArrayList<String> namesArrayList = new ArrayList<>();
		for (int i = 0; i < namesArray.length; i++) {
			namesArrayList.add(namesArray[i]);
		}
		
		// Отчества
		StringBuilder altNames = new StringBuilder();
		for (int i = 2; i < lines * 5; i+= 5) {
			altNames.append(dataArray[i] + " ");
		}
		String[] altNamesArray = altNames.toString().split(" ");
		ArrayList<String> altNamesArrayList = new ArrayList<>();
		for (int i = 0; i < altNamesArray.length; i++) {
			altNamesArrayList.add(altNamesArray[i]);
		}
		
		// Возрасты
		StringBuilder ages = new StringBuilder();
		for (int i = 3; i < lines * 5; i+= 5) {
			ages.append(dataArray[i] + " ");
		}
		String[] agesArray = ages.toString().split(" ");
		ArrayList<String> agesArrayList = new ArrayList<>();
		for (int i = 0; i < agesArray.length; i++) {
			agesArrayList.add(agesArray[i]);
		}
		
		// Пол
		StringBuilder genders = new StringBuilder();
		for (int i = 4; i < lines * 5; i+= 5) {
			genders.append(dataArray[i] + " ");
		}
		String[] gendersArray = genders.toString().split(" ");
		ArrayList<String> gendersArrayList = new ArrayList<>();
		for (int i = 0; i < gendersArray.length; i++) {
			gendersArrayList.add(gendersArray[i]);
		}
		
		// Дополнительные индексы
		StringBuilder ind = new StringBuilder();
		for (int i = 1; i <= lines; i++) {
			ind.append(i + " ");
		}
		String[] indArray = ind.toString().split(" ");
		ArrayList<String> indArrayList = new ArrayList<>();
		for (int i = 0; i < indArray.length; i++) {
			indArrayList.add(indArray[i]);
		}
		
		// Отсортированный список с возрастами
		ArrayList<Integer> sortedAges = new ArrayList<>();
		for (int i = 0; i < lines; i++) {
			sortedAges.add(Integer.parseInt(agesArray[i]));
		}
		// Применение компаратора сортировки
		// Компаратор в данном блоке кода влияет на всю выводимую
		// Информацию в итоге
		sortedAges.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
		    }
		});
		
		ArrayList<String> sortedAgesArrayList = new ArrayList<>();
		for (int i = 0; i < sortedAges.size(); i++) {
			sortedAgesArrayList.add(sortedAges.get(i).toString());
		}
		
		StringBuilder sortedPeople = new StringBuilder();
		//System.out.println(dataLined[0].getClass());
		
		for (int i = 0; i < lines; i++) {
			System.out.println(famArrayList.get(i) + " "
					+ namesArray[i].charAt(0) + "."
					+ altNamesArray[i].charAt(0) + ". "
					+ agesArray[i] + " " + gendersArray[i]);
		}
		
		for (int i = 0; i < lines; i++) {
			sortedPeople.append(indArrayList.get(i) + ". " 
					+ famArrayList.get(agesArrayList.indexOf
							(sortedAgesArrayList.get(i))) + " "
					+ namesArrayList.get(agesArrayList.indexOf
							(sortedAgesArrayList.get(i))) + " "
					+ altNamesArrayList.get(agesArrayList.indexOf
							(sortedAgesArrayList.get(i))) + " "
					+ sortedAgesArrayList.get(i) + " "
					+ gendersArrayList.get(agesArrayList.indexOf
							(sortedAgesArrayList.get(i))) + ";\n");
			
		}
		System.out.println(sortedPeople);
	}
	
}
