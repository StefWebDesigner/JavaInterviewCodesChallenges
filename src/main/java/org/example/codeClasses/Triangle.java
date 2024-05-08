package org.example.codeClasses;

public class Triangle {

    public void pascualTriangle(int n){

        System.out.println();

        for(int lines = 1; lines <= n; lines++){
            for(int i = 0; i <= n - lines; i++){
                System.out.print(" ");
            }
            int numbers = 1;
            for(int j = 1; j <=lines; j++){
                //ALWAYS PRINTING 1 FIRST;
                System.out.print(numbers + " ");
                numbers = numbers * (lines - j) / j;
            }
            System.out.println();
        }
    }

    public void leftPascualTriangle(int n){
        System.out.println();
        //outerloop to handle number of rows
        //n in this case
        for(int i = 0; i < n; i++){
            // inner loop to nandle number of columbns
            // n in this case
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            //ending line after each row
            System.out.println();
        }
    }

    public void rightPascualTriangle(int n){
        System.out.println();
        //outerloop to handle number of rows
        //n in this case
        for(int i = 0; i < n; i++){
            // inner loop to nandle number of columbns
            // n in this case
            for(int j = n-1; j >= i; j--){
                System.out.print("* ");
            }
            //ending line after each row
            System.out.println();
        }
    }

    public void printingReverseTriangleWithNumbers(int n){
        for (int i = 0; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = i; j <=n; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

}
