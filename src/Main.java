import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] monsName = {"Wizard, Alien, Bear, Wolf, Werewolf"};
        System.out.println("1. Gall \n" +
                "2. Dimacher \n" +
                "3. Secutor");
        System.out.print("Select type: ");
        int chose = scanner.nextInt();
        switch (chose) {
            case 1 -> {
                Gall gall = new Gall(5, 2, 0, 1, 0, 10, 30, 3, 3, true);
                System.out.println("You chose gall your constitution: " + gall.getConstitution() + ", strength: " + gall.getStrength() + ", xp: " + gall.getXp() + ", dexterity: " + gall.getDexterity() + ", level: " + gall.getLevel() + ", basic attack: " + gall.getBasicAttack() + ", basic hp: " + gall.getBasicHP() + ", crit chance: " + gall.getCritChance() + ", charisma: " + gall.getCharisma());
                while (true){
                    //
                }
            }

            case 2 -> {
                Dimacher dimacher = new Dimacher(2, 2,0,5,0,8,20,2,2, false);
                System.out.println("You chose dimacher your constitution: " + dimacher.getConstitution() + ", strength: " + dimacher.getStrength() + ", xp: " + dimacher.getXp() + ", dexterity: " + dimacher.getDexterity() + ", level: " + dimacher.getLevel() + ", basic attack: " + dimacher.getBasicAttack() + ", basic hp: " + dimacher.getBasicHP() + ", crit chance: " + dimacher.getCritChance() + ", charisma: " + dimacher.getCharisma());
                while (true){
                    //
                }
            }

            case 3 -> {
                Secutor secutor = new Secutor(2, 5,0,2,0, 14,15,1,1, true);
                System.out.println("You chose dimacher your constitution: " + secutor.getConstitution() + ", strength: " + secutor.getStrength() + ", xp: " + secutor.getXp() + ", dexterity: " + secutor.getDexterity() + ", level: " + secutor.getLevel() + ", basic attack: " + secutor.getBasicAttack() + ", basic hp: " + secutor.getBasicHP() + ", crit chance: " + secutor.getCritChance() + ", charisma: " + secutor.getCharisma());
                while (true){
                    //
                }
            }
        }
    }
}