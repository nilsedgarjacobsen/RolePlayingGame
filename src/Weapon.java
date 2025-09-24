public abstract class Weapon {

    private String name;
    private int baseDamage;
    private int bonusDamage = 0;

    public Weapon(String name, int baseDamage, int bonusDamage) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.bonusDamage = bonusDamage;
    }

    public Weapon(String name, int baseDamage) {
        this.name = name;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }

    public void setBonusDamage(int bonusDamage) {
        this.bonusDamage = bonusDamage;
    }
}
