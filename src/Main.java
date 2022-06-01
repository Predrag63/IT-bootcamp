import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Sastojak brasno = new Sastojak("brasno",100);
        SastojakRecepta s1 = new SastojakRecepta("brasno", 150, 1.2);
        SastojakRecepta s2 = new SastojakRecepta("mleko", 1000, 0.1);
        SastojakRecepta s3 = new SastojakRecepta("jaja", 10, 15.2);

        System.out.println(brasno);
        System.out.println(s1);
        System.out.println("----------------------------------------------");
        System.out.println(s1.ukupnaCena());
        System.out.println("----------------------------------------------");

        ArrayList<SastojakRecepta> sviRecepti = new ArrayList<>();
        sviRecepti.add(s1);
        sviRecepti.add(s2);
        sviRecepti.add(s3);

        Recept r = new Recept("spagete u sosu", 3, sviRecepti);
        System.out.println(r);
        SastojakRecepta s4 = new SastojakRecepta("ulje", 0.1, 500);
        r.dodajSastojak(s4);
        System.out.println(r);

        r.ukloniSastojak(s2);
        System.out.println("-----------------------------------------");
        System.out.println(r);

    }
}
