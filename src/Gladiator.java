public class Gladiator {
    public int constitution;
    public int strength;
    public int xp;
    public int dexterity;
    public int level;
    public int basicAttack;
    public int basicHP;
    public int critChance;
    public int charisma;
    public boolean haveShield;


    public Gladiator(int constitution, int strength, int xp, int dexterity, int level, int basicAttack, int basicHP, int critChance, int charisma, boolean haveShield) {
        this.constitution = constitution;
        this.strength = strength;
        this.xp = xp;
        this.dexterity = dexterity;
        this.level = level;
        this.basicAttack = basicAttack;
        this.basicHP = basicHP;
        this.critChance = critChance;
        this.charisma = charisma;
        this.haveShield = haveShield;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getBasicHP() {
        return basicHP;
    }

    public boolean getHaveShield() {
        return haveShield;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
