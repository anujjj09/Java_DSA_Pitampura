package Assignment1;

public class Q32 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if (j<i){
                    System.out.print(i + " * ");
                

                }
                else{
                    System.out.print (i);
                }
            }
            
            System.out.println();    
        }

        for ( int i =n-1; i>=1;i--){
            for (int j=1;j<=n;j++){
                if (j<i){
                    System.out.print(i + " * ");
                

                }
                else if (j==i){
                    System.out.print (i);
                }

            }
            System.out.println();
        }


        
    }
}