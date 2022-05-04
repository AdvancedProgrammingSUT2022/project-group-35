package com.armin;

import java.util.HashMap;
import java.util.Map;

public class HMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//CREATING A MAP

        map.put("Germany", "Berlin");//ADDING AN ITEM TO A MAP<Key, Value> - esme tamadon haro bayad az database begirim inaro static gozashtam felan
        map.put("Spain", "Madrid");
        map.put("Greece", "Athens");
        map.put("Turkey", "Ankara");

        System.out.println(map);

        String capital = map.get("Germany");//GETTING THE Value OF THE Key: Germany
        System.out.println("The capital of Germany is: " + capital);

        map.remove("Spain");//REMOVING A Key+Value

        System.out.println(map);
    }
}
