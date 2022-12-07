package Patterns;

public class pat21 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int j = 0; j < n-2; j++) {
                System.out.print("*");
                for(int z=0;z<n-2;z++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println("");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
        }
    }
}

// for(int i = 1 ; i <= n ; i++){
//     for(int j = n ; j > 0 ; j--){
//         if(i == 1 || i == n){
//             System.out.print("*");
//         } else {
//             if(j == 1 || j == n){
//                 System.out.print("*");
//             } else {
//                 System.out.print(" ");
//             }
//         }
//     }
//     System.out.println();
// }

/*
*****
*   *
*   *
*   *
*****
 */