package lesson.arrays;

import java.util.Arrays;

public class ArrayUppgifter {

	public static void main(String[] args) {
		
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		String[] my_array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };
		
		Arrays.sort(my_array1);
		Arrays.sort(my_array2);
		
		System.out.println("Uppgift 1");
		System.out.println(Arrays.toString(my_array1));
		System.out.println(Arrays.toString(my_array2));

		System.out.println("Uppgift 2");
		int sumOfArray1 = 0;
		for (int i = 0; i < my_array1.length; i++) {
			sumOfArray1 = sumOfArray1 + my_array1[i];
		}
		System.out.println(sumOfArray1);
		
		System.out.println("Uppgift 3");
		int size = 10;
		String[][] array = new String[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = "-";
			}
		}
		
		for (String[] a : array) {
			for (String s : a) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		System.out.println("Uppgift 4");
		System.out.println(Arrays.stream(my_array1).sum()/my_array1.length);
		
		int sum = 0;
		for (int i = 0; i < my_array1.length; i++) {
			sum += my_array1[i];
		}
		System.out.println(sum/my_array1.length);
		
		System.out.println("Uppgift 5/6");
		
		int specificValue = 1456;
		for (int i = 0; i < my_array1.length; i++) {
			if (specificValue == my_array1[i]) {
				System.out.println("Found value at index: " + i);
				break;
			}
		}
		
		System.out.println("Uppgift 7");
		int specificValue2 = 2013;
		int indexOfSpecificElement = 0;
		for (int i = 0; i < my_array1.length; i++) {
			if (specificValue2 == my_array1[i]) {
				indexOfSpecificElement = i;
			}
		}
		int[] newMyArray1 = new int[my_array1.length - 1];
		for (int i = 0; i < indexOfSpecificElement; i++) {
			newMyArray1[i] = my_array1[i];
		}
		for (int i = indexOfSpecificElement; i < my_array1.length - 1; i++) {
			newMyArray1[i] = my_array1[i+1];
		}
		System.out.println(Arrays.toString(my_array1));
		System.out.println(Arrays.toString(newMyArray1));
		
		System.out.println("Uppgift 10");
		int min = my_array1[0];
		int max = my_array1[0];
		
		for (int i = 1; i < my_array1.length; i++) {
			if (min > my_array1[i]) {
				min = my_array1[i];
			}
			if (max < my_array1[i]) {
				max = my_array1[i];
			}
		}
		System.out.println("Min: " + min + ", Max: " + max);
		
		Arrays.sort(my_array1);
		min = my_array1[0];
		max = my_array1[my_array1.length - 1];
		
		System.out.println("Min: " + min + ", Max: " + max);
		
		System.out.println("Uppgift 12");
		int[] my_array3 = { 189, 2035, 189, 156, 2013, 1458, 245, 254, 172, 265, 156, 265, 457, 256 };
		
		for (int i = 0; i < my_array1.length; i++) {
			for (int j = 0; j < my_array3.length; j++) {
				if (my_array1[i] == my_array3[j]) {
					System.out.println(my_array1[i] + " == " + my_array3[j]);
				}
			}
		}
		
		
		
	}

}
