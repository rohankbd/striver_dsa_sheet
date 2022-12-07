package Patterns;

public class pat18 {
    public static void main(String[] args) {
        int n = 5;
        int k = n;
        int c = 65;
        for (int i = 0; i < n; i++) {
            k=n;
            for(int j = i;j >= 0;j--){
                System.out.print((char)(c+k-1) + " ");
                k--;
            }
            System.out.println();
        }
    }
}
/*
E 
E D 
E D C 
E D C B 
E D C B A
 */