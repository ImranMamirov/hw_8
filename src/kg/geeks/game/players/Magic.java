package kg.geeks.game.players;

import kg.geeks.game.logic.RpgGame;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            int random = RpgGame.random.nextInt(5);
            if (getHealth() > 0) {
                if (heroes[i].getDamage() != 0) {
                    heroes[i].setDamage(heroes[i].getDamage() + random);
                }
            }

        }
        System.out.println("Magic boosted team");
    }
}
