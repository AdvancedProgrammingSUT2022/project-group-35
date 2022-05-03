package com.armin;

public class basics_for_units {

    private String name, attackerAbility;
    private int cost, attackerRange, movmentSpeed, attackerHealth;

    public basics_for_units(String bfu_name, int bfu_cost, int bfu_attackerRange, int bfu_movementSpeed, int bfu_attackerHealth, String bfu_attackerAbility)
    {
        name = bfu_name;
        cost = bfu_cost;
        attackerRange = bfu_attackerRange;
        movmentSpeed = bfu_movementSpeed;
        attackerHealth = bfu_attackerHealth;
        attackerAbility = bfu_attackerAbility;
    }

    public basics_for_units() {
    }

    public String getName() {return name;}
    public void setName(String bfu_name) {name = bfu_name;}

    public int getCost() {return cost;}
    public void setCost(int bfu_cost) {cost = bfu_cost;}

    public int getAttackerRange() {return attackerRange;}
    public void setAttackerRange(int bfu_attackerRange) {attackerRange = bfu_attackerRange;}

    public int getMovementSpeed() {return movmentSpeed;}
    public void setMovementSpeed(int bfu_movementSpeed) {movmentSpeed = bfu_movementSpeed;}

    public int getAttackerHealth() {return attackerHealth;}
    public void setAttackerHealth(int bfu_attackerHealth) {attackerHealth = bfu_attackerHealth;}

    public String getAttackerAbility() {return attackerAbility;}
    public void setAttackerAbility(String bfu_attackerAbility) {attackerAbility = bfu_attackerAbility;}

}
