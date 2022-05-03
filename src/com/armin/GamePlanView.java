package com.company;

import java.util.Scanner;

public class GamePlanView {
    Scanner scan_plan_view = new Scanner(System.in);
    public String get(){
        String get_txt = scan_plan_view.next();
        return get_txt;
    }
    public void print(String txt){
        System.out.println(txt);
    }
}
