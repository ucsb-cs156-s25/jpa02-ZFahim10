package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Fahim Z.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "ZFahim10";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-04");
        team.addMember("Fahim Z.");
        team.addMember("Renbo Z.");
        team.addMember("Montgomery F.");
        team.addMember("Joe L.");
        team.addMember("Jeremiah W.");
        team.addMember("Ethan S.");
        return team;
    }
}
