package ro.fortech.junit.domain;

public class Coach {

    private String name;
    private int age;
    private String reputation;

    Coach(){}

    public Coach(String name, int age, String reputation) {
        this.name = name;
        this.age = age;
        this.reputation = reputation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    int obtainCoachProfile(int age, String reputation){

        int feature = 100 - age;
        switch (reputation){

            case "GREAT": return 100 * feature;
            case "VERY GOOD": return 75 * feature;
            case "GOOD": return 50 * feature;
            case "WEAK": return 25 * feature;
            default: return 0;
        }
    }

    @Override
    public String toString(){

        return "Coach " + name + " has a " + reputation + " reputation at the age of " + age;
    }
}
