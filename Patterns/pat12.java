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
