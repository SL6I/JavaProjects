import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{ 
    
    public static void startAndEnd(int start , int end ){
        System.out.print("Let's begin and guess the number between "+start+" - "+end+" : \nDo You want a SAAD bot be a player?\nType(y/n)");
        
    }
public static void main(String[] args) {
   
    // RandomN rndmn = new RandomN();
    // CONG cong = new CONG();
    int replay;
    int counter = 1;
    System.out.println("\nWelcome in Guessing Number Game\n");
    System.out.println("You Should use setRange n1 n2 to control on the Range For example \nsetRange 10 50");
    int RandomNO = RandomN.SetRange();
    Scanner scnr = new Scanner(System.in);
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
        // scnr.close();
    }
    if(replay == RandomNO){
        Scanner input = new Scanner(System.in);
        System.out.println(CONG.CON  + " And Your Score is "+ Score.score+"\nNow Write Your Name down here to put You in the Winners List");
        String name = input.nextLine();
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
    // scnr.close();
}
public static void fille(String s) {
    try {
        FileWriter writer = new FileWriter("The latest.txt", true);
        writer.write(s + System.lineSeparator());
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}



    
  
}
