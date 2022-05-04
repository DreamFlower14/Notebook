import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hyegyeong0504 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // List에 추가하기
        list.add("이협건");
        list.add("임꺽정");
        list.add("홍길동");
        list.add("고길동");
        list.add("둘리");
        list.add("희동이");

        int listsize = list.size();

        System.out.println("기본적인 for문으로 list 객체에 저장된 데이터 출력");
        for(int i = 0; i <listsize; i++){
            System.out.println("이름 : "+ list.get(i));
        }
        System.out.println("for Each문을 사용해 list 객체에 저장된 데이터 출력");
        for(String name : list){
            System.out.println("이름 : "+ name);
        }
        System.out.println("람다식");
        list.forEach(name -> System.out.println("이름 : "+name));

        System.out.println("iterator");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : "+ name);
        }
    }
}
