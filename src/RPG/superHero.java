package RPG;

public class superHero extends Hero {
    public boolean fly = false;

    public void fly() {
        if(this.fly == true) {
            System.out.println(this.getName()+"can fly");
        }else {
            super.sleep(10);
        }
    }
    


}
