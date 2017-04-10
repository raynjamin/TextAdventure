package com.theironyard.charlotte;

public class Character {
    String name;
    int health;
    int damage;

    public void battle(Character enemy) {
        System.out.printf("%s appears!\n", enemy.name);

        while (health > 0 && enemy.health > 0) {
            health -= enemy.damage;
            enemy.health -= damage * 100;
            System.out.printf("%s's health: %d\n", name, health);
            System.out.printf("%s's health: %d\n", enemy.name, enemy.health);
        }

        String message = "%s has died.\n";

        if (health <= 0) {
            System.out.printf(message, name);
        }

        if (enemy.health <= 0) {
            System.out.printf(message, enemy.name);
        }
    }
}
