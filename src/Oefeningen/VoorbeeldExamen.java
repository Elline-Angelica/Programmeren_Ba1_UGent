package Oefeningen;


import java.util.ArrayList;
import java.util.List;

public class VoorbeeldExamen {

    public static void main(String[] args) {
//        double[] examplearr = {1.2,25.5,2.3,4.87,66};
//        System.out.println(maxIndex(examplearr));
//        getPi();

        String str = "Dit is een zin";
        String str2 = "67jo97hn378dgeh28e";
        String str3 = "lala4889dkw";
        System.out.println(woordenantw(str3));
    }

    public static int maxIndex(double[] tabel){
        int index = 0;
        for(int i = 1; i<tabel.length; i++){
            if(tabel[i]>tabel[index]){
                index = i;
            }
        } return index;
    }

    public static void getPi(){
        double product = 1.0;
        double wortel = 0;
        for(int i = 0; i < 10; i++){
            wortel = Math.sqrt(2.0 + wortel);
            product = product * wortel / 2.0;
        }
        double pi = 2.0/product;
        System.out.println(pi);
    }

    //mijn antwoord
    public static List<String> woorden(String lijn){
        String newstr = lijn.replaceAll("[^A-Za-z]+", " ");
        List<String> apart = List.of(newstr.split("\\W+"));
        return apart;
    }

    //juist antwoord
    public static List<String> woordenantw(String lijn){
        List<String> result = new ArrayList<>();
        boolean inWoord = false;
        int pos = 0;
        for (int i = 0; i < lijn.length(); i++) {
            if(inWoord && !Character.isLetter(lijn.charAt(i))){
                result.add(lijn.substring(pos,i));
                inWoord = false;
            } else if(!inWoord && Character.isLetter(lijn.charAt(i))){
                pos = i;
                inWoord = true;
            }
        }
        if(inWoord){
            result.add(lijn.substring(pos));
        }
        return result;
    }



}
