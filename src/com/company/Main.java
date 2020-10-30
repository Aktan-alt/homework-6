package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setName("Baldur");
	boss.setHealth(1000);
	boss.setDamage(100);
	boss.setAttackType("Magic");
	boss.setDeffenceType("Shield");
	boss.setBattleCry("BLA BLA BLA");

	Weapon BossWeapon = new Weapon("Magic Sword",80);

        System.out.println(boss.getInfo() + " Boss Weapon Type: " + BossWeapon.weaponType +
				" Boss Weapon Damage: " + BossWeapon.weaponDamage);



    }
}
