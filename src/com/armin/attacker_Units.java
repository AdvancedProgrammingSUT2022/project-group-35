package com.armin;

public class attacker_Units extends basics_for_units {

    private String attacker_code;

    public attacker_Units(String unit_attacker_name,String unit_attacker_code1, int unit_attacker_cost, int unit_attacker_range, int unit_attacker_movement_speed, int unit_attacker_health, String unit_attacker_ability)
    {
        this.setName(unit_attacker_name);
        attacker_code = unit_attacker_code1;
        this.setCost(unit_attacker_cost);
        this.setAttackerRange(unit_attacker_range);
        this.setMovementSpeed(unit_attacker_movement_speed);
        this.setAttackerHealth(unit_attacker_health);
        this.setAttackerAbility(unit_attacker_ability);
    }

    public String getAttackerCode() {return attacker_code;}
    public void setAttackerCode(String unit_attacker_code1) {attacker_code = unit_attacker_code1;}
}
