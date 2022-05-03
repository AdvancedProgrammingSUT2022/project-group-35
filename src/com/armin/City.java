package com.armin;

public class City {

    private String name, warmode, construction;
    private int health, stability, attackpoint, upgrades, populations;

    private City(String city_name, int city_stability, String city_warmode, String city_construction, int city_health, int city_attackpoint, int city_upgrades, int city_populations){
        name = city_name;
        stability = city_stability;
        warmode = city_warmode;
        construction = city_construction;
        health = city_health;
        attackpoint = city_attackpoint;
        upgrades = city_upgrades;
        populations = city_populations;
    }

    public String getName() {return name;}
    public void setName(String city_name) {name = city_name;}

    public int getStability() {return stability;}
    public void setStability(int city_stability) {stability = city_stability;}

    public String getWarmode() {return warmode;}
    public void setWarmode(String city_warmode) {warmode = city_warmode;}

    public String getConstruction() {return construction;}
    public void setConstruction(String city_construction) {construction = city_construction;}

    public int getHealth() {return health;}
    public void setHealth(int city_health) {health = city_health;}

    public int getAttackpoint() {return attackpoint;}
    public void setAttackpoint(int city_attackpoint) {attackpoint = city_attackpoint;}

    public int getUpgrades() {return upgrades;}
    public void setUpgrades(int city_upgrades) {upgrades = city_upgrades;}

    public int getPopulations() {return populations;}
    public void setPopulations(int city_populations) {populations = city_populations;}



}
