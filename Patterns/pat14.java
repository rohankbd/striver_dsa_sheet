package Patterns;

public class pat14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char c = 65;
            for(int j = 0; j <= i; j++){
                System.out.print(c);
                c++;
            }
            System.out.println("");
        }
    }
}
/*
A
AB
ABC
ABCD
ABCDE
 */