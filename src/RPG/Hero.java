package RPG;

public class Hero implements Cloneable{// 一こでも抽象メソッドがあるとクラスにもabstractをつけねばならないju
    int hp;
    String name;

    public Hero clone() {
        Hero result = new Hero();
        result .name = this.name;
        result.hp = this.hp;
        return result;
    }


}
