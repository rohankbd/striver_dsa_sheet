package Patterns;

public class pat10 {
    public static void main(String[] args) {
        int n = 5;
        int st=1;
        for(int i=1; i<=n*2-1; i++){
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n) st++;
            else st--;
        }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // } 
    }
}
