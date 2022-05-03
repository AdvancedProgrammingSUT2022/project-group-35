package com.company;

import java.util.regex.Pattern;

public class PlayerController {
    PlayerModel playerModel = new PlayerModel();
    PlayerView playerView = new PlayerView();
    public void process_controller(){
        while (true){
        String txt = playerView.get();
        make_player(txt);
        login_player(txt);
        logout();
        show_current_menu();
        other_players(txt);
        chang_password(txt);
        change_nickname(txt);
        menu_enter(txt);
        menu_exit();
        cheatCode();}
    }
    public void start(){
        playerView.print("please login first");
        process_controller();
    }
    public void make_player(String txt){
        process_controller();
    }
    public void login_player(String txt){
        if (playerModel.getMenu_location() == "login"){
            playerView.print("user logged in successfully!");
        }
        process_controller();
    }
    public void logout(){
        if (playerModel.getMenu_location() == "main"){
            playerView.print("user logged out successfully!");
            playerModel.setMenu_location("login");
        }
        process_controller();
    }
    public void show_current_menu(){
        playerView.print(playerModel.getMenu_location());
        process_controller();
    }
    public void cheatCode(){
        process_controller();
    }
    public void other_players(String txt){
        process_controller();
    }
    public void chang_password(String txt){
        process_controller();
    }
    public void change_nickname(String txt){
        process_controller();
    }
    public void menu_exit (){
        switch (playerModel.getMenu_location()){
            case "profile":
                playerModel.setMenu_location("main");
                break;
            case "playgame":
                playerModel.setMenu_location("main");
                break;
            case "main":
                playerModel.setMenu_location("login");
                break;
            case "login":
                playerView.print("error");
                break;
        }
        process_controller();
    }
    public void menu_enter(String txt){
        process_controller();
    }
}
