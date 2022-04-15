public class SecondFor {
    public static void main(String[] args){
        int inc = 3, dec = 3;
        for( int i = 1; i <= 3; i++){
            for( int j = 1; j <= inc; j++){    //   1. 3 2. 4 3. 5
                if(j < dec){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            inc++;
            dec--;
        }
 }
}



