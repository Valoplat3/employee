public class Employee {

    private String name;
    private String vorname;
    private String geburtsdatum;
    private String geschlecht;
    private int alter;
    private double gewicht;
    private String abteilung;
    private double gehalt;
    private int dienstjahre;
    private String besonderheiten;

    public Employee(String name, String vorname,int alter){
        this.dienstjahre = 0;
        this.gehalt = 1500;
        this .abteilung = "A38";

    }

    public String getVorname() {
        return vorname;
    }

    public String getName() {
        return name;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public int getAlter() {
        return alter;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public double getGehalt() {
        return gehalt;
    }

    public int getDienstjahre() {
        return dienstjahre;
    }

    public String getBesonderheiten() {
        return besonderheiten;
    }
}
