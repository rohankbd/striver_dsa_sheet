package Patterns;

public class pat9 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print("* ");
            }
            // for(int j = i+1;j >= 3;j--){
            //     System.out.print("*");
            // }
            System.out.println();
        }
        if(n!=1)
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            // for(int l=1;l<=i-1;l++){
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
}
