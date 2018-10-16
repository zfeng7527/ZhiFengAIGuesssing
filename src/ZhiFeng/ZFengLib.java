package ZhiFeng;

import java.util.Scanner;

public class ZFengLib {
    public static String AI(String AItalk){
        int min = 1, max = 100, guess;
        Scanner reply = new Scanner(System.in);
        System.out.println("Think of a number and i will try to guess it. Tell me if it is higher or lower.");
        String replyS = "";
        while(!(replyS.equals("yes"))){
            guess = (min + max)/2;
            System.out.println("Is your number: "+ guess);
            replyS = reply.nextLine();
            if(replyS.equals("higher")){
                min = guess;
            }
            else{
                if (replyS.equals("lower")) {
                    max = guess;
                }
                else{
                    if(!(replyS.equals("yes"))){
                        System.out.println("Invalid response. higher or lower?");
                    }
                }
            }
        }
        System.out.println("Yay I got the answer.");
        return AItalk;
    }

    public static int num(int numb){
        System.out.println("Hello, I am thinking of a nmber from 1 - 20, can you guess it?");
        Scanner numguess = new Scanner(System.in);
        int guess = 1;
        while(numguess.nextInt() != numb){
            System.out.println("Wrong Guess, Try again.");
            guess++;
        }
        System.out.println("You got it, the number was: " + numb);
        System.out.println("It only took you " + guess + " guesses");
        return numb;
    }
}
