package Patterns;

public class pat8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
*********
 *******
  *****
   ***
    *
 */