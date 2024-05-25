import java.util.Random;
import java.util.Scanner;

public class Main {
    int expToNextLvl = 100;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Gladiator gladiator = null;
        String[] monsName = {"Wizard", "Alien", "Bear", "Wolf", "Werewolf"};
        System.out.println("1. Gall \n" +
                "2. Dimacher \n" +
                "3. Secutor");
        System.out.print("Select type: ");
        int chose = scanner.nextInt();
        switch (chose) {
            case 1 -> {
                gladiator = new Gall(5, 2, 0, 1, 1, 10, 30, 3, 3, true);
                System.out.println("You choose gladiator 'Gall'. You have " + (gladiator.getBasicHP() + gladiator.getConstitution() * 5) + "hp and max attack " + (gladiator.getBasicAttack() + gladiator.getStrength() * 3));
                while (true) {
                    System.out.println("Would do you like to do: \n" +
                            "1. Travel \n" +
                            "2. Save and exit \n" +
                            "3. Show attributes");
                    System.out.print("Chose: ");
                    int chose1 = scanner.nextInt();
                    if (chose1 == 1) {
                        gladiator.setBasicHP(gladiator.getBasicHP() + gladiator.getConstitution() * 5);
                        System.out.println("You travel");
                        Monster monster = new Monster(
                                monsName[randNumber(0, monsName.length)],
                                randNumber(40, 100 * gladiator.getLevel()),
                                randNumber(5, 30 + gladiator.getLevel())
                        );
                        System.out.printf("You meet a %s, it has %d HP and %d attack\n", monster.getName(), monster.getHp(), monster.getAttack());
                        System.out.println("Would do you like to do: \n" +
                                "1. fight \n" +
                                "2. appease/arrange \n" +
                                "3. run away");
                        System.out.print("Chose: ");
                        int choseTravel = scanner.nextInt();
                        if (choseTravel == 1) {
                            fight(monster, gladiator);
                        } else if (choseTravel == 2) {
                            int number = randNumber(0, 100);
                            int number1 = randNumber(0, 50) + gladiator.getCharisma();
                            if (number1 >= number) {
                                System.out.println("You win. You get 10xp");
                                gladiator.setXp(gladiator.getXp() + 10);
                            } else {
                                System.out.println("NOOOO. FIGHT!");
                                fight(monster, gladiator);
                            }
                        } else if (choseTravel == 3) {
                            System.out.println("You ran away");
                        }
                    } else if (chose1 == 3) {
                        showAttributes(gladiator);
                    }
                }
            }

            case 2 -> {
                gladiator = new Dimacher(2, 2, 0, 5, 1, 8, 20, 2, 2, false);
                System.out.println("You choose gladiator 'Dimacher'. You have " + (gladiator.getBasicHP() + gladiator.getConstitution() * 5) + "hp and max attack " + (gladiator.getBasicAttack() + gladiator.getStrength() * 3));
                while (true) {
                    System.out.println("Would do you like to do: \n" +
                            "1. Travel \n" +
                            "2. Save and exit \n" +
                            "3. Show attributes");
                    System.out.print("Chose: ");
                    int chose1 = scanner.nextInt();
                    if (chose1 == 1) {
                        gladiator.setBasicHP(gladiator.getBasicHP() + gladiator.getConstitution() * 5);
                        System.out.println("You travel");
                        Monster monster = new Monster(
                                monsName[randNumber(0, monsName.length)],
                                randNumber(40, 100 * gladiator.getLevel()),
                                randNumber(5, 30 + gladiator.getLevel())
                        );
                        System.out.printf("You meet a %s, it has %d HP and %d attack\n", monster.getName(), monster.getHp(), monster.getAttack());
                        System.out.println("Would do you like to do: \n" +
                                "1. fight \n" +
                                "2. appease/arrange \n" +
                                "3. run away");
                        System.out.print("Chose: ");
                        int choseTravel = scanner.nextInt();
                        if (choseTravel == 1) {
                            fight(monster, gladiator);
                        } else if (choseTravel == 2) {
                            int number = randNumber(0, 100);
                            int number1 = randNumber(0, 50) + gladiator.getCharisma();
                            if (number1 >= number) {
                                System.out.println("You win. You get 10xp");
                                gladiator.setXp(gladiator.getXp() + 10);
                            } else {
                                System.out.println("NOOOO. FIGHT!");
                                fight(monster, gladiator);
                            }
                        } else if (choseTravel == 3) {
                            System.out.println("You ran away");
                        }
                    } else if (chose1 == 3) {
                        showAttributes(gladiator);
                    }
                }
            }

            case 3 -> {
                gladiator = new Secutor(2, 5, 0, 2, 1, 14, 15, 1, 1, true);
                System.out.println("You choose gladiator 'Secutor'. You have " + (gladiator.getBasicHP() + gladiator.getConstitution() * 5) + "hp and max attack " + (gladiator.getBasicAttack() + gladiator.getStrength() * 3));
                while (true) {
                    System.out.println("Would do you like to do: \n" +
                            "1. Travel \n" +
                            "2. Save and exit \n" +
                            "3. Show attributes");
                    System.out.print("Chose: ");
                    int chose1 = scanner.nextInt();
                    if (chose1 == 1) {
                        gladiator.setBasicHP(gladiator.getBasicHP() + gladiator.getConstitution() * 5);
                        System.out.println("You travel");
                        Monster monster = new Monster(
                                monsName[randNumber(0, monsName.length)],
                                randNumber(40, 100 * gladiator.getLevel()),
                                randNumber(5, 30 + gladiator.getLevel())
                        );
                        System.out.printf("You meet a %s, it has %d HP and %d attack\n", monster.getName(), monster.getHp(), monster.getAttack());
                        System.out.println("Would do you like to do: \n" +
                                "1. fight \n" +
                                "2. appease/arrange \n" +
                                "3. run away");
                        System.out.print("Chose: ");
                        int choseTravel = scanner.nextInt();
                        if (choseTravel == 1) {
                            fight(monster, gladiator);
                        } else if (choseTravel == 2) {
                            int number = randNumber(0, 100);
                            int number1 = randNumber(0, 50) + gladiator.getCharisma();
                            if (number1 >= number) {
                                System.out.println("You win. You get 10xp");
                                gladiator.setXp(gladiator.getXp() + 10);
                            } else {
                                System.out.println("NOOOO. FIGHT!");
                                fight(monster, gladiator);
                            }
                        } else if (choseTravel == 3) {
                            System.out.println("You ran away");
                        }
                    } else if (chose1 == 3) {
                        showAttributes(gladiator);
                    }
                }
            }
        }
    }


    public static int randNumber(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    public static void fight(Monster monster, Gladiator gladiator) {
        int gladHp = gladiator.getBasicHP() + gladiator.getConstitution() * 5;
        int combatEffect = (int) Math.sqrt(
                monster.getAttack() * monster.getHp()
        );
        int giveXP = combatEffect / 5;
        while (monster.getHp() > 0 && gladHp > 0) {
            System.out.println("Chose: \n" +
                    "1. Attack \n" +
                    "2. Block");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1 -> {
                    randNumber(gladiator.getBasicAttack(), gladiator.getBasicAttack() + gladiator.getStrength());
                    if (random.nextInt(50) < gladiator.getDexterity() && random.nextInt(60) < gladHp) {
                        monster.attack *= 2;
                        System.out.println("Critical hit!");
                    }
                    monster.setHp((monster.getHp() - gladiator.basicAttack * random.nextInt(2)));

                    int choiceEnemy = random.nextInt(0, 2);
                    if (choiceEnemy == 1) {
                        int damage = randNumber(monster.getAttack() / 2, monster.getAttack());

                        if (gladiator.getHaveShield()) {
                            damage /= 2;
                        }
                        gladHp -= damage;
                        gladiator.setBasicHP(gladHp);
                    } else if (choiceEnemy == 2) {
                        int damage = randNumber(monster.getAttack() / 2, monster.getAttack());
                        gladHp -= damage;
                        gladiator.setBasicHP(gladHp);
                    }

                    if (gladiator.getBasicHP() >= 0) {
                        System.out.println("Your HP: " + gladiator.getBasicHP());
                    } else {
                        gladiator.setBasicHP(0);
                        System.out.println("Your HP: " + gladiator.getBasicHP());
                    }
                    if (monster.getHp() >= 0) {
                        System.out.println("Enemy HP: " + monster.getHp());
                    } else {
                        monster.setHp(0);
                        System.out.println("Enemy HP " + monster.getHp());
                    }
                }
                case 2 -> {
                    if (gladiator.isHaveShield()) {
                        int damage = randNumber(monster.getAttack() / 2, monster.getAttack());
                        gladHp -= damage / 2;
                        gladiator.setBasicHP(gladHp);
                        System.out.println("You blocked! damage: " + damage);
                        System.out.println("Your HP: " + gladiator.getBasicHP());
                    } else {
                        System.out.println("You don't have shield");
                    }
                }
            }
            if (monster.getHp() <= 0) {
                monster.setHp(0);
                System.out.println("You win!!!" + giveXP + " XP.");
                gladiator.setXp(gladiator.getXp() + giveXP);
                levelUp(gladiator);
                return;
            } else if (gladiator.getBasicHP() <= 0) {
                gladiator.setBasicHP(0);
                System.out.println("You lose!!! -" + gladiator.getXp() + " XP.");
                gladiator.setXp(gladiator.getXp() - giveXP);
            }
        }
    }

    public static void levelUp(Gladiator gladiator) {
        if (gladiator.getXp() >= 100) {
            gladiator.level = gladiator.level + 1;
            System.out.println("Level up! Your lvl: " + gladiator.getLevel());
        } else {
            System.out.println("Xp to low");
        }
    }

    private static void showAttributes(Gladiator gladiator) {
        System.out.printf(
                """
                        1. Constitution (%d)
                        2. Strength (%d)
                        3. Dexterity (%d)
                        4. Charisma (%d)
                        5. Crit Chance (%d)""",
                gladiator.getConstitution(),
                gladiator.getStrength(),
                gladiator.getDexterity(),
                gladiator.getCharisma(),
                gladiator.getCritChance()
        );
        System.out.println();
    }
}