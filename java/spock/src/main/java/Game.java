public class Game {
    Integer totalScore = 0;
    public void roll(Integer pinsKnockedDown) {
        totalScore =  totalScore + pinsKnockedDown;
    }

    public Integer score() {
        return totalScore;
    }
}
