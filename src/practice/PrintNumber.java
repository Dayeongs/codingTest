package practice;

import java.util.Scanner;

public class PrintNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 1. 한 라인에 출력 할 숫자개수 입력
		System.out.print("한라인에 출력할 숫자 갯수: ");
		int cols = scanner.nextInt();
		// 2. 최종 숫자 입력
		System.out.print("최종 숫자: ");
		int finalNum = scanner.nextInt();
		scanner.close();
		
		// 3. 배열의 크기 정하기
		int rows = 0;
		if (finalNum%cols == 0) {
			rows = finalNum/cols;			
		} else {
			rows = (int) (finalNum/cols) + 1;			
		}
		int[][] numList = new int[rows][cols];
		
		// 4. 배열에 값 저장하기
		int count = 1;
		for (int i = 0; i < rows; i++) {
			if (i%2 == 0) {
				for (int j = 0; j < cols; j++) {
					if (count <= finalNum) {
						numList[i][j] = count++;
					} else {
						break;
					}
				}
			} else {
				for (int j = cols-1; j >= 0; j--) {
					if (count <= finalNum) {
						numList[i][j] = count++;
					} else {
						break;
					}
					
				}
			}
		}
		
		// 5. 2차원 배열 출력하기
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (numList[i][j] != 0) {
					System.out.print(numList[i][j] + "\t");                                                                                                                                                                                                     
				} else {
					System.out.print("\t");                                                                                                                                                                                                     
				}
			}
			System.out.println();
		}
		
	}

}
