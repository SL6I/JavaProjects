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
        System.out.println(CONG.CON  + " And Your Score is"+ Score.score);
        break;
    }
    else if(replay > RandomNO && Math.abs(replay - RandomNO) < 15 ){
        System.out.println("Your Number is Higher than Guess Number And Your Score now "+Score.Score(10) +"\n\n");
    }
    else if(replay > RandomNO && Math.abs(replay - RandomNO) < 30 ){
        System.out.println("Your Number is Higher than Guess Number And Your Score now "+Score.Score(20) +"\n\n");
    }
    else if(replay > RandomNO && Math.abs(replay - RandomNO) < 45 ){
        System.out.println("Your Number is Higher than Guess Number And Your Score now "+Score.Score(30) +"\n\n");
    }
    else if(replay > RandomNO && Math.abs(replay - RandomNO) > 44 ){
        System.out.println("Your Number is Higher than Guess Number And Your Score now "+Score.Score(35) +"\n\n");
    }
    else if(replay < RandomNO && Math.abs(replay - RandomNO) < 15 ){
        System.out.println("Your Number is Lower than Guess Number And Your Score now "+Score.Score(10) +"\n\n");
    }
    else if(replay < RandomNO && Math.abs(replay - RandomNO) < 30 ){
        System.out.println("Your Number is Lower than Guess Number And Your Score now "+Score.Score(20) +"\n\n");
    }
    else if(replay < RandomNO && Math.abs(replay - RandomNO) < 45 ){
        System.out.println("Your Number is Lower than Guess Number And Your Score now "+Score.Score(30) +"\n\n");
    }
    else if(replay < RandomNO && Math.abs(replay - RandomNO) > 44 ){
        System.out.println("Your Number is Lower than Guess Number And Your Score now "+Score.Score(35) +"\n\n");
    }
    }
    if(Score.score<=0){
        System.out.println("OOPs You lose Because Your Score is: "+Score.score);
    }
    scnr.close();
}
}