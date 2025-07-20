import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
//        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
//            // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
//            System.out.println("i = " + i);
//        }
//

////        문제 1. 두 수의 합 출력하기
//        int a=5, b=10;
//
//        System.out.println(a+b);
//
////        문제 2. 수의 홀짝 파악하기
//        int number = 7;
//
//        if (number % 2 == 0) {
//            System.out.println("짝수입니다.");
//        } else {
//            System.out.println("홀수입니다.");
//        }
//
////        문제 3. 1~10의 합 구하기
//        int sum = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//
////        문제 4. 배열 값 모두 출력하기
//        int[] numbers = {1, 3, 5, 7, 9};
//        for (int num : numbers) {
//            System.out.println(num);
//        }
//
////        문제 5. 더하기 메소드
//        Scanner sc = new Scanner(System.in);
//        System.out.println("두 숫자를 입력하세요");
//        int[] inputNum = new int[2];
//        for (int i = 0; i < inputNum.length; i++) {
//            inputNum[i] = sc.nextInt();
//
//        }
//        System.out.println("두 수는 " + inputNum[0] + ", " + inputNum[1] + "입니다.");
//        int sumNum = inputNum[0] + inputNum[1];
//        System.out.println("두 수 의 합은" + sumNum + "입니다.");
//
////        문제 5. 메소드를 안 만들어서 다시
//        Scanner sc5 = new Scanner(System.in);
//        System.out.println("두 숫자를 입력하세요.");
//
//        int add = add(sc5.nextInt(), sc5.nextInt());
//
//        System.out.println("두 수 의 합은 " + add + "입니다.");
//
////        문제 6. 두 수 중 큰 값 리턴하는 메소드
//        Scanner sc6 = new Scanner(System.in);
//
//        System.out.println("비교할 두 수를 입력하세요.");
//
//        int maxNum = max(sc6.nextInt(), sc6.nextInt());
//
//        System.out.println("더 큰 수는 " + maxNum + "입니다.");
//
//
////        문제 7. 두 수의 곱 리턴하는 메소드
//        int a = 5, b = 7;
//        System.out.println(duplicate(a,b));
//
////        문제 8. 평균 구하는 메소드
//        float a = 11, b = 22;
//        System.out.println(average(a, b));
//        문제 9. 메소드 계산 클래스로 분리
        float result = Calculator.average(1,3);
        System.out.println(result);

    }
    public static float average(float a, float b) {
        return (a + b) / 2;
    }

    public static int duplicate(int a, int b) {
        return a * b;
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int max (int a, int b) {
        return a > b ? a : b;
    }
}