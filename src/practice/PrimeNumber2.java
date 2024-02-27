package practice;

import java.util.Scanner;

public class PrimeNumber2 {
	
	public static void main(String[] args) {

		// 1. 사용자에게 최대 범위를 입력하도록 요청한다. 
		Scanner scanner = new Scanner(System.in);
        System.out.print("최대 범위를 입력하세요: "); 
        int n = scanner.nextInt();
        scanner.close();
        
        // 2. 각 인덱스의 값이 소수인지 여부를 저장하는 배열을 생성한다.
        // 배열이 0부터 시작하므로 배열의 길이를 최대범위 + 1로 설정한다. (시작이 0부터라고 가정)
        boolean[] isPrime = new boolean[n + 1]; 

        // 초기화: 모든 수를 소수로 가정한다.
        // 0과 1은 소수가 아니므로 2부터 초기화한다.
        for (int i = 2; i <= n; i++) { // 2부터 n까지의 모든 수에 대해 반복한다.
            isPrime[i] = true; // 초기에는 모든 수를 소수로 가정하여 true로 설정한다.
        }

        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= n; i++) { // 2부터 i*i가 n 이하일 때까지 반복한다.
            // 현재 수가 소수인 경우
            if (isPrime[i]) { // i가 소수인 경우
                // 현재 소수의 배수들을 모두 소수가 아닌 것으로 표시한다.
                for (int j = i * i; j <= n; j += i) { // i의 배수에 대해 반복한다.
                    isPrime[j] = false; // i의 배수들을 소수가 아닌 것으로 표시하여 false로 설정한다.
                }
            }
        }

        // 소수 출력
        System.out.println("소수 리스트:");
        for (int i = 2; i <= n; i++) { // 2부터 n까지의 모든 수에 대해 반복한다.
            if (isPrime[i]) { // 해당 수가 소수인 경우
                System.out.print(i + " "); // 해당 수를 출력한다.
            }
        }
		
	}
	
}
