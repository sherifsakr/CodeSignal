package Arcade.Intro._09_EruptionOfLight;

public class FindEmailDomain {

    String findEmailDomain(String address) {
        int atIndex = address.lastIndexOf("@");

        return address.substring(atIndex + 1);
    }

}
