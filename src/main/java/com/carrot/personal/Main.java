package com.carrot.personal;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        PerformDrama drama = new PerformDrama();
        Map<String, String> user = drama.fetchUser();
        System.out.println(user.get("firstName"));
    }

}
