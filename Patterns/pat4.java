package Patterns;

public class pat4 {
    public static void main(String[] args) {
        int k = 1, n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(k + " ");
            }
            k++;
            System.out.println("");
        }
    }
}
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
 */