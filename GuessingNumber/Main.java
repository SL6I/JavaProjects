import java.util.Scanner;

public class Main{ 
    public static void startAndEnd(int start , int end ){
        System.out.print("Let's begin and guess the number between "+start+" - "+end+" : \n\n");
    }
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    // RandomN rndmn = new RandomN();
    // CONG cong = new CONG();
    int replay;
    int counter = 1;
    System.out.println("Welcome in Guessing Number Game\n\n");
    while(true){
    if(counter == 1){
        startAndEnd(0 , 50);
        replay = scnr.nextInt();
        counter++;
    }
    else{
        System.out.println("Try again : \n\n");
        replay = scnr.nextInt();

    }
    if(replay == RandomN.NumberToGuess){
        System.out.println(CONG.CON);
        break;
    }
    else if(replay > RandomN.NumberToGuess ){
        System.out.println("Ur Number is Higher than Guess Number \n\n");
    }
    else if(replay < RandomN.NumberToGuess ){
        System.out.println("Ur Number is Lower than Guess Number \n\n");
    }
    }
    scnr.close();
}
}