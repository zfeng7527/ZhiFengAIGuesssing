package ZhiFeng;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner menu =  new Scanner(System.in);
        while(true){
            System.out.println("Hello, would you like to guess(guess) my number or me guess your number(aiguess)?");
            String menu2 = menu.nextLine();
            if (menu2.equals("aiguess")) {
                ZFengLib.AI("leave blank");
            }
            else if (menu2.equals("guess")) {
                int guessnum =(int) (Math.random()*21);
                ZFengLib.num(guessnum);
            }
            else if (!(menu2.equals("guess")) || !(menu2.equals("aiguess"))) {
                System.out.println("Invalid option, Try again.");
            }
        }
    }
}
