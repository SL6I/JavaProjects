import java.util.*;

public class RandomN {
    static Scanner scnr = new Scanner(System.in);
    static Random rndm = new Random();
    static int min;
    static int max;
    static int NumberToGuess;


    static int SetRange(){
    checking();
    final int NumberToGuess = rndm.nextInt(max-min+1)+min;
    return NumberToGuess;
    }


    static int NumberToGuess1 = NumberToGuess;
    

    static boolean flag = true;
    static int counter0 = 0;


    static void checking(){
        while(flag){
        try {
            System.out.println("Write it Down here:\n");
    String setRange = scnr.next();
    min = scnr.nextInt();
    max = scnr.nextInt();

    if(!setRange.equalsIgnoreCase("setRange")){
        System.out.println("Write \"setRange\" LIKE THIS!\n");
    }
    if(min>= max){
        System.out.println("How could that be possible MAX should be GREATER than MIN\n");
    }
    else{
        flag = false; //to exit
    }
        } catch (Exception e) {
            System.out.println("OOPs You Made Something wrong Try again please\n");
        }
    }


    
}
static int MIN = min;
static int Max = max;
}
