import java.util.Random;

public class Bot {
    int start;
    int end;
    Bot(int start,int end){
        this.start = start;
        this.end = end;
    }
    public static void guessingNumber(int start, int end,int random){
        int s100;
        Random randomBot = new Random();
        System.out.println("Hello there I AM SAAD bot I will win :)");
        int bot = randomBot.nextInt(end-start+1)+start;
        if(bot != random){
        while(true){
            if(bot > random){
                System.out.println("I guessed "+bot+" But it was greater than the Random Number and My Score is "+Score.Score(0.9,random,bot));
                s100 = Math.abs(100 - Score.Score(0.9,random,bot));
                bot -= s100;
            }
            else if(bot < random){
                System.out.println("I guessed "+bot+" But it was lower than the Random Number and My Score is "+Score.Score(0.9,random,bot));
                s100 = Math.abs(100 - Score.Score(0.9,random,bot));
                bot += s100;
            }
            if(bot == random){
                System.out.println("YYYYYEEEESSSS I DID IT The Number was "+bot+" And My Score is "+Score.score);
                
            }
        }
    }
}
}