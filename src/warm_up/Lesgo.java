package warm_up;

import Examen_Programmeren.Inhoud;

public class Lesgo {

    public static void main(String[] args) {

        Inhoud inhoud = new Inhoud("25/01","De inhoud komt grotendeels overeen met de inhoud van het leerboek, hoofdstukken 1-4, 6-8, 10-11, 12.1-12.6 en 14.4-14.6 (uitgezonderd §6.17, §7.5.1, §7.7, §8.13, §11.8, §12.6.2 en §12.6.7) samen met de bijkomende lesnota's die op Ufora zijn terug te vinden (behalve de Greenfoot-spiekbrief). Niet elk hoofdstuk is even letterlijk in de les behandeld, maar ongeveer alles wat er te lezen staat, is onder één of ander vorm in de lessen (of de oefeningen) aan bod gekomen. Wat betreft namen en parameters van standaardmethoden (bijv. van de klasse String of ArrayList) hoef je enkel 'van buiten' te kennen wat er in de Java spiekbrief staat + de methoden die verband houden met iteratoren en maps (§4.12, §6.6).\n" +
                "Ook wat er in de leerpaden staat, ook als is dit misschien niet letterlijk gegeven in de hoorcolleges zelf, behoort tot de te kennen inhoud, inclusief de zelfstudie-opdrachten.\n" +
                "Er werd in de les aan bepaalde onderwerpen heel wat meer aandacht besteed dan in het boek. Dit zal ook op het examen zo zijn. (Bijvoorbeeld: for vs. while, vernestelde lussen en while met dubbele conditie, ...) Weet ook dat het feit dat een programma doet wat het verondersteld wordt te doen, niet altijd voldoende is, we verwachten ook dat je bij het programmeren zoveel mogelijk de gangbare conventies toepast.\n" +
                "Je moet voldoende goed in Java kunnen programmeren om de oefeningen die tijdens de loop van het semester werden opgegeven, zonder hulp op te lossen.");

        String datumExamen = inhoud.getDatum();
        String leerstofExamen = inhoud.getLeerstof();

        System.out.println("De datum van examen programmeren is " + datumExamen + ".\n" + "-> " + leerstofExamen );
    }
}
