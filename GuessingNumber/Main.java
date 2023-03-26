import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{ 
    static Scanner scnr = new Scanner(System.in);
    public static void startAndEnd(int start , int end ){
        System.out.print("Let's begin and guess the number between "+start+" - "+end+" : \n\n");
    }
    static String name;
public static void main(String[] args) {
   
    // RandomN rndmn = new RandomN();
    // CONG cong = new CONG();
    int replay;
    int counter = 1;
    System.out.println("\nWelcome in Guessing Number Game\n");
    System.out.println("You Should use setRange n1 n2 to control on the Range For example \nsetRange 10 50");
    int RandomNO = RandomN.SetRange();
    while(true && Score.score > 0){
    if(counter == 1){
        startAndEnd(RandomN.min , RandomN.max);
        replay = scnr.nextInt();
        counter++;
    }
    else{
        System.out.println("Try again : \n\n");
        replay = scnr.nextInt();
        // continue;

    }
    if(replay == RandomNO){
        System.out.println(CONG.CON  + " And Your Score is "+ Score.score+"\nNow Write Your Name down here to put You in the Winners List");
        name = scnr.nextLine();
        fille(name);
        break;
    }
    else if(replay > RandomNO){
        System.out.println("Your Number is Higher than Guess Number And Your Score now "+Score.Score(0.9,RandomNO,replay) +"\n\n");
    }
    else if(replay < RandomNO){
        System.out.println("Your Number is Lower than Guess Number And Your Score now "+Score.Score(0.9,RandomNO,replay) +"\n\n");
    }
    }
    if(Score.score<=0){
        System.out.println("OOPs You lose Because Your Score is: "+Score.score);
    }
    scnr.close();
}
   public static void fille(String s ){
        try {
            FileWriter writer = new FileWriter("The latest.txt");
            writer.append(s);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    
  
}
