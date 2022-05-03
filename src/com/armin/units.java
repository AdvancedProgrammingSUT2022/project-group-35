package com.armin;

import java.util.ArrayList;

public class units {

    private ArrayList<attacker_Units> military_units = new ArrayList<attacker_Units>();

    public void addAttackerUnits(attacker_Units military_unit){
        military_units.add(military_unit);
    }

    public attacker_Units getMilitaryUnits(String attacker_code){

        for(int i = 0; i < military_units.size(); i++) {
            if(military_units.get(i).getAttackerCode() == attacker_code){
                return military_units.get(i);
            }
        }
        return null;
    }

}
