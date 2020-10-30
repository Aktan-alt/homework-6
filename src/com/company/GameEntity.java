package com.company;

public class GameEntity {
    private String Name;
    private int health;
    private int damage;
    private String attackType;
    private String deffenceType;
    private String battleCry;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String getDeffenceType() {
        return deffenceType;
    }

    public void setDeffenceType(String deffenceType) {
        this.deffenceType = deffenceType;
    }

    public String getBattleCry() {
        return battleCry;
    }

    public void setBattleCry(String battleCry) {
        this.battleCry = battleCry;
    }
    public String getInfo(){
        return "Name: " + getName() + " Health:" + getHealth() + " Boss damage:" + getDamage() +
                " Boss attack type:" + getAttackType() +
                " Deffence Type" + getDeffenceType() + " Battle cry:" + getBattleCry();

    }
}
