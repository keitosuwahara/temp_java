package RPG;

public class Hero {
    String name;
    int hp;
    Sword sword;


void Sleep() {
    this.hp = 100;
    System.out.println(this.name+"は眠って回復した");
}
void Sit(int sec) {
    this.hp += sec;
    System.out.println(this.name+"は"+sec+"秒座った");
    System.out.println("HPが"+sec+"ポイント回復した");
}
Hero(String name) {
    this.name = name;
}
}