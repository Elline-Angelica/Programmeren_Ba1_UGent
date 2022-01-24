package Oefeningen;

public class TorenwachterApp {

    public static void main(String[] args) {
        Torenwachter torenwachter = new Torenwachter();
        torenwachter.plaatsToren(3,5);
        torenwachter.plaatsToren(1,4);
        torenwachter.plaatsToren(0,7);
        System.out.println(torenwachter.isGeldig());
    }

}
