public abstract class GameCharacter {

    private int healthPoints;
    private int attackValue = 10;
    private Weapon weaponSlot;

    public GameCharacter(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int attack(){
        return this.attackValue + weaponSlot.getBaseDamage() + weaponSlot.getBonusDamage();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints -= healthPoints;
    }

    public void equipWeapon(Weapon weapon){
        this.weaponSlot = weapon;
    }

    public Weapon getWeapon(){
        return this.weaponSlot;
    }
}
