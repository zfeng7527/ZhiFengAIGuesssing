package ZhiFeng;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min = 1, max = 100, guess = (min+max)/2;
        Scanner reply = new Scanner(System.in);
        System.out.println("Hello I am a geinuscreated by the greatest scientists in the world and I am here to guess your number from 1 - 100, tell me if it's higher or lower(Lowercase Only)");
        System.out.println("Is your number "+ guess);
        while(!(reply.nextLine().equals("yes"))){
            if(reply.equals("higher")){
                min = guess;
            }
            else{
                if (reply.nextLine().equals("lower")) {
                    max = guess;
                }
                else{
                    System.out.println("Invalid answer. higher or lower?");
                }
            }
            guess = (min + max)/2;
            System.out.println("Is your number: "+ guess);
        }
        System.out.println("Yay I got the answer.");
    }
}
