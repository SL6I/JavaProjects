public class Score {
    static int score = 100;
    static int Score(double x,int R,int r){
        score =(int)(score - Math.abs(r - R) * x);
        return score;
    }

}
