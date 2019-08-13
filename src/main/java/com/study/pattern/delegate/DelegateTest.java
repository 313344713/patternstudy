package com.study.pattern.delegate;

public class DelegateTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command(leader, "login");
        boss.command(leader, "register");
        boss.command(leader, "play");
    }
}
