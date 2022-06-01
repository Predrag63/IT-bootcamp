import java.util.ArrayList;

public class Recept {
    private String nazivrecepta;
    private int tezinaRecepta;
    ArrayList <SastojakRecepta> lista;
    Sastojak s;


    public Recept(String nazivrecepta, int tezinaRecepta, ArrayList lista) {
        this.nazivrecepta = nazivrecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.lista = lista;
    }

    public Recept() {

        ArrayList lista= new ArrayList<SastojakRecepta>();
    }

    @Override
    public String toString() {
        String neki = "naziv recepta : "+ nazivrecepta +"\n";
        neki += "tezina : ";
                switch (tezinaRecepta) {
                    case 1:
                        neki += "Pocetni";
                    break;
                    case 2:
                        neki += "Lak";
                        break;
                    case 3:
                        neki += "Srednji";
                        break;
                    case 4:
                        neki += "Tezak";
                        break;
                    case 5:
                        neki += "Mastorski";
                        break;


                }

        neki +="\n";
        neki +="sastojci : ";

        for (SastojakRecepta s: lista) {
            neki += s.getNazivSastojka() + ",";
        }

            return neki;
            }

    public void dodajSastojak(SastojakRecepta s){

            lista.add(s);


        }

    public void ukloniSastojak(SastojakRecepta s){
        lista.remove(s);


        }



    }




