package Class;

public class C0511 {
    public static void main(String[] args) {
        // 버블 정렬
        int[] aa = {0,8,9,4,5,1,3,2,1,4,5};

        for (int i = 0; i < aa.length-1; i++) {
            for (int j = 0; j < aa.length-1-i; j++) {
                if(aa[j] > aa[j+1]){
                    int t = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = t;
                }
            }
            System.out.println((i+1)+"회 반복한 결과");
            for (int k = 0; k < aa.length; k++) {
                System.out.print(aa[k]+" ");
            }
            System.out.println();
        }
    }
}
