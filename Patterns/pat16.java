package Patterns;

public class pat16 {
    public static void main(String[] args) {
        int n = 5;
        char c = 65;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(c);
            }
            c++;
            System.out.println("");
        }
    }
}
/*
A
BB
CCC
DDDD
EEEEE
 */