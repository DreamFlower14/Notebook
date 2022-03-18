import java.util.Scanner;
public class IFOR {
    public static void main(String[] args){

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
            System.out.println(" 로그인 실패 ");
        }




    }
}

