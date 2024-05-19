import java.util.Random;
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
                System.out.println("You choose gladiator 'Gall'. You have " + (gall.getBasicHP() + gall.getConstitution() * 5) + "hp and max attack " + (gall.getBasicAttack() + gall.getStrength() * 3));
                while (true){
                    System.out.println("Would do like to do: \n" +
                            "1. Travel \n" +
                            "2. Save and exit");
                    int chose1 = scanner.nextInt();
                    switch (chose1){

                    }
                }
            }

            case 2 -> {
                Dimacher dimacher = new Dimacher(2, 2,0,5,0,8,20,2,2, false);
                System.out.println("You choose gladiator 'Dimacher'. You have " + (dimacher.getBasicHP() + dimacher.getConstitution() * 5) + "hp and max attack " + (dimacher.getBasicAttack() + dimacher.getStrength() * 3));
                while (true){
                    //
                }
            }

            case 3 -> {
                Secutor secutor = new Secutor(2, 5,0,2,0, 14,15,1,1, true);
                System.out.println("You choose gladiator 'Secutor'. You have " + (secutor.getBasicHP() + secutor.getConstitution() * 5) + "hp and max attack " + (secutor.getBasicAttack() + secutor.getStrength() * 3));
                while (true){
                    //
                }
            }
        }
    }


    public static int randNumber(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}