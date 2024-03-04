package kg.geeks.game.players;

public class Witcher extends Hero{
    boolean resurrected;

    public Witcher(int health, int damage,  String name) {
        super(health, damage, SuperAbility.RESURRECTED, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (getHealth() > 0){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() == 0 && heroes[i].getName() != getName()){
                    heroes[i].setHealth(getHealth());
                    setHealth(0);
                    System.out.println("Ведьмак отдал свою жизнь " + heroes[i].getName());
                    break;
                }

            }
        }
    }
}
