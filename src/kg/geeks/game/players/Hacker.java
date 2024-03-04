package kg.geeks.game.players;

import kg.geeks.game.logic.RpgGame;

import java.util.Random;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.STEEL_HEALTH, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int bossHealthRandom = random.nextInt(10) + 1;
        int randomHeroIndex = random.nextInt(heroes.length);
        int newBossHealth = boss.getHealth() - bossHealthRandom;
        boss.setHealth(newBossHealth);
        int heroHealthIncrement = bossHealthRandom;
        if (newBossHealth < 0) {
            heroHealthIncrement += newBossHealth;
        }
        heroes[randomHeroIndex].setHealth(heroes[randomHeroIndex].getHealth() + heroHealthIncrement);

        System.out.println("Hacker использовал Супер Способность " + "на " + heroes[randomHeroIndex].getName());
    }
}
