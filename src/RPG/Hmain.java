package RPG;

public class Hmain {
    public static void main(String[] args) {
        //Hero生成
        Hero yamada = new Hero(new java.util.Scanner(System.in).nextLine());
        Hero tanaka = new Hero("田中");
        //名前を決める
        System.out.print("名前を決めてください=>");

        yamada.hp = 100;
        Sword s = new Sword();
        yamada.sword = s;
        System.out.println(yamada.name+"参上");
        //Heroのメソッド
        yamada.Sit(5);

        //Zonbie生成
        Zonbie zon = new Zonbie();
        int rand = new java.util.Random().nextInt(101);
        zon.attack = rand;

        zon.Bite();

        Wiz wiz = new Wiz();
        wiz.Heal(yamada);

        
        System.out.println("現在の武器は"+yamada.sword.name+"攻撃力は"+yamada.sword.damage);
        System.out.println(yamada.name+""+tanaka.name);


    }
}
