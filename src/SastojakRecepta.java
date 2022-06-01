public class SastojakRecepta extends Sastojak{

    private double kolicinaSastojka;

    public SastojakRecepta(String nazivSastojka, double cenaSastojka, double kolicinaSastojka) {
        super(nazivSastojka, cenaSastojka);
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public SastojakRecepta(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }

    @Override
    public String toString() {
        return "naziv sastojka : " + getNazivSastojka() + "\n"
                + "cena sastojka : " + getCenaSastojka() + "\n"
                + "kolicina sastojka :" + kolicinaSastojka
                ;
    }

    public double ukupnaCena(){
        return kolicinaSastojka * getCenaSastojka();

    }
}
