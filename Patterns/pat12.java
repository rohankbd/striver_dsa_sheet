package Patterns;

public class pat12 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i <= n; i++){
            int k = 1;
            for (int j = 1; j <= i ; j++) {
                System.out.print(k + " ");
                k++;
            }
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for(int j = i; j < n; j++){
                System.out.print("  ");
            }
            k=1;
            for (int j = 1; j <= i; j++) {
                System.out.print((i-k+1)+" ");
                k++;
            }
            System.out.println("");
        }
    }
}
/*
1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1
 */