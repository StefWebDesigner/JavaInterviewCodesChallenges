package org.example.practiceDemos;

public class OutputReviewChallenges {


    public String guessName(int age){

        if(age >= 100){
            String result = "Your old";
            System.out.println(result);
            return result;
        } else if (age >= 75){
            String result = "Your geeting old";
            System.out.println(result);
            return result;
        } else if (age >= 25){
            String result = "Your younger";
            System.out.println(result);
            return result;
        } else {
            String result = "young";
            System.out.println(result);
            return result;
        }


    }

    public void guessAgeMessage(int age){


        // 3

        for (int i = age; i < 5; i++){
            if(i >= 10){
                String result = "Prompt 1";
                System.out.println(result);
            } else if (i >= 5){
                String result = "Promt 2";
                System.out.println(result);
            } else if (i < 3 && i == 2) {
                String result = "Promp && ";
                System.out.println(result);
            } else if( i >= 2 || i == 2 ){
                String result = "Promp Or ";
                System.out.println(result);
            }  else if (i ==2 || i == 1){
                String result = "Promp Two Equals ";
                System.out.println(result);

            }else if (i == 1) {
                String result = "prompt 4";
                System.out.println(result);
            } else {
                String result = "promt 5";
                System.out.println(result);
            }


        }

    }


    public void whileOneYeeeHAaa(int num) {
        // initialization expression

        System.out.println("While Example");

        int i = num;

        // test expression
        while (i < 5) {
            if(i >= 10){
                String result = "Prompt 1";
                System.out.println(result);
            } else if (i >= 5){
                String result = "Promt 2";
                System.out.println(result);
            } else if (i < 3 && i == 2) {
                String result = "Promp && ";
                System.out.println(result);
            } else if( i >= 2 || i == 2 ) {
                String result = "Promp Or ";
                System.out.println(result);
            }  else if (i ==2 || i == 1){
                String result = "Promp Two Equals ";
                System.out.println(result);
            }else if (i == 1) {
                String result = "prompt 4";
                System.out.println(result);
            } else {
                String result = "promt 5";
                System.out.println(result);
            }

            // update expression
            i++;
        }

    }



    public boolean anotherJoinAndOrExample(){

        int result = 4;

        if((result > 1 && result > 2) && (result > 3 || result > 4) ){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }









    public static void main(String[] args) {

        OutputReviewChallenges outputReviewChallenges = new OutputReviewChallenges();

//        System.out.println( outputReviewChallenges.guessName(10));

//        outputReviewChallenges.guessAgeMessage(1);
//
//        outputReviewChallenges.whileOneYeeeHAaa(3);

        outputReviewChallenges.anotherJoinAndOrExample();

    }


}

