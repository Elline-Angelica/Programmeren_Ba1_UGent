package Oefeningen;

public class Torenwachter {

    private int[] horizontaal;
    private int[] verticaal;

    public Torenwachter() {
        horizontaal = new int[8];
        verticaal = new int[8];
    }

    public void plaatsToren(int r, int k){
        horizontaal[r]++;
        verticaal[k]++;
    }

    public boolean isGeldig(){
        int i = 0;
        while(i < 8 && horizontaal[i] <= 1 && verticaal[i] <= 1){
            i++;
        }
        return i == 8;
    }


}
