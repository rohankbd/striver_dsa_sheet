package Patterns;

public class pat15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char c = 65;
            for(int j = i; j < n; j++){
                System.out.print(c);
                c++;
            }
            System.out.println("");
        }
    }
}
