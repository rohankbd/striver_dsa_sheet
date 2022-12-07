package Patterns;

public class pat22 {
    public static void main(String[] args) {
        int n = 4;
        for(int i =1-n; i<n;i++){

            for(int j = 1-n; j<n;j++){

                //the abs value of i>j

                String s = Math.abs(j)>Math.abs(i) ? ((Math.abs(j)+1)+"  "):((Math.abs(i)+1)+"  ");

                System.out.print(s);

            }

            System.out.println();
        }
    }
}
/*
4  4  4  4  4  4  4  
4  3  3  3  3  3  4  
4  3  2  2  2  3  4  
4  3  2  1  2  3  4  
4  3  2  2  2  3  4  
4  3  3  3  3  3  4  
4  4  4  4  4  4  4 
 */