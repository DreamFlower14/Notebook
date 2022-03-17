import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        int deaip = 2;
        /* deaip += 4;
        System.out.printf("더함 = %d\n", deaip);
        deaip -= 4;
        System.out.printf("뺌 = %d\n", deaip);
        deaip *= 8;
        System.out.printf("곱함 = %d\n", deaip);
        deaip /= 4;
        System.out.printf("나눔 = %d\n", deaip);

        deaip %= 3;
        System.out.printf("나머지 = %d\n", deaip);  // 왜 2?

        System.out.println(2%3);

        int num = 1;
        // 선 참조 후 연산
        System.out.println(num++);
        // 선 연산 후 참조
        System.out.println(++num);

        int a = 1, b = 2, c = 0;

        System.out.println( a + " 단 " );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );
        System.out.println( a * ++c );

        c = 0;

        System.out.println( b + " 단 " );
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));
        System.out.println( b*(++c));

        int a = 3, b = 4, c = 0;
        System.out.println( a + " 3 ");
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c );
        System.out.println( a + " * " + (++c) + " = " + a * c ); */

        Scanner in = new Scanner(System.in); // 선언, 초기화
        System.out.print(" 이름 입력 : ");    // scanner로 이름 입력
        String name = "김성현";               // 분기문에서 기준 이름
        String inputName = in.nextLine();    // 선언, 초기화
        if(name.equals(inputName)) {         // 분기문(같은 이름 치기)
            System.out.print("몇 단 : ");     // 분기문을 통과했을 때 나오는 입력창
            int a = in.nextInt();             // 구구단 함수
            int b = 0;
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b);
            System.out.println(a + " * " + (++b) + " = " + a * b); }
        else {
                System.out.println(" 로그인 실패 ");  // if 분기문에서 실패햇을때 나오는 화면
            }













    }
}
