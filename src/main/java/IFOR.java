import java.util.Scanner;
public class IFOR {
    public static void main(String[] args) {

        /*
        Scanner A = new Scanner(System.in);
        String name = "김성현";
        System.out.print("이름을 입력해주세요 : ");
        String B = A.nextLine();
        if (name.equals(B)) {
            System.out.print("구구단 몇 단? : ");
            int F = A.nextInt();
            int S = 0;
            System.out.println(F + " 단 ");
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
            System.out.println(F + " * " + ++S + " = " + F * S);
        } else {
            System.out.println(" 로그인 실패 "); }   */

        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력해주세요 : ");
        int a = in.nextInt();
        int age = a;
        if (age > 19) {
            System.out.print(" 성인인데");
        }
        if (age < 23) {
            System.out.print(" 아직 어려");
        } else if (age < 30) { //바로 위에가 성공해서 안 함
            System.out.print(" 계란 한판은 아니네요");
        } else{
            System.out.print(" 계란 한판도 넘겼다니");
    }
        System.out.print(" ~ ");
    }}