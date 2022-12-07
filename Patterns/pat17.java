package Patterns;

public class pat17 {
    public static void main(String[] args) {
        int n = 4;
        char c = 65;
        for (int i = 0; i < n; i++) {
            for(int j = 1;j < n-i;j++){
                System.out.print(" ");
            }
            c = 65;
            for(int j = 0;j <= i;j++){
                System.out.print(c);
                c++;
            }
            c = 65;
            for(int j = i-1;j >= 0;j--){
                System.out.print((char)(c+j));
            }
            System.out.println("");
        }
    }
}
