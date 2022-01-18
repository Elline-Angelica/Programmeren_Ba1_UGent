package Examen_Programmeren;

public class Leerstof {

    private static String datum;
    private static String leerstof;

    public Leerstof(String datum,String leerstof) {
        setDatum(datum);
        setLeerstof(leerstof);
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getLeerstof() {
        return leerstof;
    }

    public void setLeerstof(String leerstof) {
        this.leerstof = leerstof;
    }
}
