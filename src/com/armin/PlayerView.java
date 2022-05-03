package com.company;

import java.util.Scanner;

public class PlayerView {
    Scanner scan_player_view = new Scanner(System.in);
    public String get(){
        String get_txt = scan_player_view.next();
        return get_txt;
    }
    public void print(String txt){
        System.out.println(txt);
    }
}
