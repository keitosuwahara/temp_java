package RPG;

public class Wiz {
    String name;
    int hp;

    void Heal(Hero h) {
        h.hp += 10;
        System.out.println(h.name+"のhpを10回復した");
    }
}
