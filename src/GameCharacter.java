public abstract class GameCharacter {

    private int healthPoints;
    private int attackValue = 10;


    public GameCharacter(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int attack(){
        return this.attackValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
