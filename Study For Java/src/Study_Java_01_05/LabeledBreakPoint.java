package Study_Java_01_05;

public class LabeledBreakPoint {
	public static void main(String[] args) {
		outer: for(int i = 1; i< 10; i++) {	//바깥쪽 for문에 outer명시!
			for(int j = 1; j < 10; j++) {
				if((i * j) == 72) {
					System.out.println(i+ " x " + j + " = " + i*j);
					break outer;	// outer로 명시된 반복문까지 빠져 나간다.
				}
			}
		}
	}

}
