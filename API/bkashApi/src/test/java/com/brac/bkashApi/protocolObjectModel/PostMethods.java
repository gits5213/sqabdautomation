package com.brac.bkashApi.protocolObjectModel;

import java.util.Random;

public class PostMethods {

    public static String raGivennames[] = {"abcde", "fghij", "klmno", "pqrst", "uvwxyx"};
    public static String randomGivenUserName =  raGivennames[ new Random().nextInt(raGivennames.length)];

    public static String createRandomUser(String username){
        String creatUsers =
                "{\n" +
                "    \"name\": "+username+",\n" +
                "    \"job\": \"QA Engineer\"\n" +
                "}";

        return creatUsers;
    }

}
