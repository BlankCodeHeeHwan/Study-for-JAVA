package Study_Java_01_05;

public class ByTimesWhile {
	public static void main(String[] args) {
		int i = 2;
		int j;
		
		while(i < 10) {
			j = 1;
			while(j < 10) {
				System.out.println(i + " x " + j + " = " + (i * j));
				j++;
			}
			i++;
		}
	}

}
