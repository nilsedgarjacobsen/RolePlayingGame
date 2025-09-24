public class Main {
    public static void main(String[] args) {
        //Klasser jag vill ha:
        //GameCharacter(superklass), Hero, Enemy, Weapon, Armor
        //Healthpoints, attack(), vapen och skydd (composition)

        Hero hero1 = new Hero(100);
        Enemy enemy1 = new Enemy(50);

        Sword butterSword = new Sword("Smörsvärdet", 2);
        Axe batteredAxe = new Axe("Yxan", 2, 1);

        hero1.equipWeapon(butterSword);
        enemy1.equipWeapon(batteredAxe);

        System.out.println(hero1.getWeapon().getName());
        System.out.println(hero1.getWeapon().getBaseDamage());

        battle(hero1, enemy1);
    }

    public static void battle(Hero hero, Enemy enemy){
        System.out.println("Let the battle begin");
        System.out.println("Hero attacks first");
        enemy.setHealthPoints(hero.attack());
        System.out.println("Enemy's health after hero's attack is: " + enemy.getHealthPoints());
        hero.setHealthPoints(enemy.attack());
        System.out.println("Hero's health after enemy's attack is: " + hero.getHealthPoints());
        enemy.setHealthPoints(hero.attack());
        System.out.println("Enemy's health after hero's attack is: " + enemy.getHealthPoints());
        hero.setHealthPoints(enemy.attack());
        System.out.println("Hero's health after enemy's attack is: " + hero.getHealthPoints());

    }

}