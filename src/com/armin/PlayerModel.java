package com.company;

public class PlayerModel {
    private int player_score;
    private String player_username;
    private String player_password;
    private String player_nickname;
    private String menu_location = "login";

    public String getMenu_location() {
        return menu_location;
    }

    public void setMenu_location(String menu_location) {
        this.menu_location = menu_location;
    }

    public int getPlayer_score() {
        return player_score;
    }

    public void setPlayer_score(int player_score) {
        this.player_score = player_score;
    }

    public String getPlayer_username() {
        return player_username;
    }

    public void setPlayer_username(String player_username) {
        this.player_username = player_username;
    }

    public String getPlayer_password() {
        return player_password;
    }

    public void setPlayer_password(String player_password) {
        this.player_password = player_password;
    }

    public String getPlayer_nickname() {
        return player_nickname;
    }

    public void setPlayer_nickname(String player_nickname) {
        this.player_nickname = player_nickname;
    }
}
