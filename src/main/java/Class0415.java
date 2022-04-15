public class Class0415 {
    public static void main(String[] args) {
//     배열 주의사항 : 한 변수에 무조건 같은 타입만 받을 수 있다ㅏ.
//     기본형 변수 : 실제 값을 저장
//     참조형 변수 : 주소값을 저장 new를 써서 메모리에 올리고 그 주소를 가져옴
//     배열의 선언 방법 : 타입[] 변수이름
//        int[] score; // int 타입 배열을 다루기 위함 참조변수 선언
//        String[] name;

//        int [] arr = new int
//        변수 : 값을 저장하는 공간이고 변한다
//        상수 : 값을 저장하지만 변하진 않는다

        /* int[] score = new int[3]; // [3] 이면 인덱스 3개를 만들었다.

        score[0] = 100;  // []를 인덱스라고 한다
        score[1] = 200;
        score[2] = 300;

        System.out.println(score);  // @ 앞에는 변수타입, 뒤에는 16진수로 된 주소
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length); // 변수의 길이

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int[] copy = new int[arr.length*2];
        System.out.println(copy.length);

        for (int i = 0; i < arr.length; i++){   // 배열에서 빈공간은 0이다
            copy[i] = arr[i];

            System.out.println(copy[i]);
        }
        System.out.println();
        arr = copy;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i<a; i++){
            arr[i] = sc.nextInt();

            sum +=arr[i];
        }
        average =  sum / a;
        System.out.println("총점은? : "+ sum);
        System.out.println("평균점수는? : "+ average);*/

        int[] score = {26, 20, 44, 54, 30, 40, 98, 37};

        int min = score[0];
        int max = score[0];

        for(int i = 0; i < score.length; i++){
            if(score[i] > max){
                max = score[i];
            }else if(score[i] < min){
                min = score[i];
            }
        }
        System.out.println("최대값은 : "+ max);
        System.out.println("최소값은 : "+ min);
    }
}
