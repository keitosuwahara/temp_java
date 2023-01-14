package RPG;

public class Zonbie {
    int hp;
    String name;
    int attack;

void Bite() {
    System.out.println(this.name+"は"+this.attack+"のダメージを与えた");
}
//コンストラクタの記述
Zonbie() {
    this.hp = 100;
    this.name = "ゾンビマン";
    
}
}
