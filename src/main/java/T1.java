public class T1 {
    public static void main(String[] args) {
        int inc = 3; int dec = 3;

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= inc; j++){
                if(j<dec){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i<3){
                inc++;
                dec--;
            }else{
                inc--;
                dec++;
                }
        }
    }
}
