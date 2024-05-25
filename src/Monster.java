public class Monster {
    public String name;
    public int attack;
    public int hp;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public Monster(String name, int attack, int hp) {
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }
}