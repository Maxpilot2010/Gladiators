public class Monster {
    public int name;
    public int attack;
    public int hp;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public Monster(int name, int attack, int hp) {
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }
}