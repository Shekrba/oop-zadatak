package app;

import model.*;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        System.out.println("-------------------KREIRANJE STOLOVA-------------------");
        Sto sto1 = new Sto();
        sto1.setRedniBroj(1);

        Sto sto2 = new Sto();
        sto2.setRedniBroj(2);

        Sto sto3 = new Sto();
        sto3.setRedniBroj(3);

        Sto sto4 = new Sto();
        sto4.setRedniBroj(4);

        System.out.println("-------------------KREIRANJE PIZZA-------------------");
        Hrana pica1 = new Hrana("Capricciosa", TipHrane.PIZZA);
        Hrana pica2 = new Hrana("Siciliana", TipHrane.PIZZA);
        Hrana pica3 = new Hrana("Madjarica", TipHrane.PIZZA);
        Hrana pica4 = new Hrana("Vege", TipHrane.PIZZA);

        System.out.println("-------------------KREIRANJE PASTI-------------------");
        Hrana pasta1 = new Hrana("Italiana", TipHrane.PASTA);
        Hrana pasta2 = new Hrana("Carbonara", TipHrane.PASTA);
        Hrana pasta3 = new Hrana("Bolonjeze", TipHrane.PASTA);
        Hrana pasta4 = new Hrana("Pesto pasta", TipHrane.PASTA);
        Hrana pasta5 = new Hrana("Shroom pasta", TipHrane.PASTA);

        System.out.println("-------------------KREIRANJE PIĆA-------------------");
        Pice pice1 = new Pice("Coca cola", 0.25, TipPica.GAZIRANI_SOK);
        Pice pice2 = new Pice("Rosa voda", 0.33, TipPica.VODA);
        Pice pice3 = new Pice("Cedjena narandza", 0.4, TipPica.NEGAZIRANI_SOK);

        System.out.println("-------------------KREIRANJE PRILOGA-------------------");
        Prilog prilog1 = new Prilog("Kecap");
        Prilog prilog2 = new Prilog("Origano");
        Prilog prilog3 = new Prilog("Extra cheese");
        Prilog prilog4 = new Prilog("Majonez");
        Prilog prilog5 = new Prilog("Bosiljak");

        System.out.println("-------------------KREIRANJE PORUDZBINA-------------------");

        ArrayList<Porudzbina> svePorudzbine = new ArrayList<>();

        System.out.println("> KREIRANJE PRVE PORUDZBINE <");
        Porudzbina porudzbina1 = sto1.napraviPorudzbinu();

        if(porudzbina1!=null){
            //PRVA STAVKA
            StavkaPorudzbine sp11 = new StavkaPorudzbine();
            sp11.setKolicina(1);
            sp11.setStavka(pica1);

            PrilogPorudzbine pp1 = new PrilogPorudzbine();
            pp1.setKolicina(1);
            pp1.setPrilog(prilog1);
            sp11.getPrilozi().add(pp1);

            PrilogPorudzbine pp2 = new PrilogPorudzbine();
            pp2.setKolicina(1);
            pp2.setPrilog(prilog2);
            sp11.getPrilozi().add(pp2);

            porudzbina1.getStavkePorudzbine().add(sp11);

            //DRUGA STAVKA
            StavkaPorudzbine sp12 = new StavkaPorudzbine();
            sp12.setKolicina(1);
            sp12.setStavka(pasta1);

            PrilogPorudzbine pp3 = new PrilogPorudzbine();
            pp3.setKolicina(1);
            pp3.setPrilog(prilog3);
            sp12.getPrilozi().add(pp3);

            porudzbina1.getStavkePorudzbine().add(sp12);

            //TRECA STAVKA
            StavkaPorudzbine sp13 = new StavkaPorudzbine();
            sp13.setKolicina(2);
            sp13.setStavka(pice1);

            porudzbina1.getStavkePorudzbine().add(sp13);

            svePorudzbine.add(porudzbina1);

            System.out.println("> PRVA PORUDZBINA JE KREIRANA <");
        }else{
            System.out.println("> PRVA PORUDZBINA NIJE KREIRANA <");
        }

        System.out.println("> KREIRANJE DRUGE PORUDZBINE <");
        Porudzbina porudzbina2 = sto2.napraviPorudzbinu();

        if(porudzbina2!=null){
            //PRVA STAVKA
            StavkaPorudzbine sp21 = new StavkaPorudzbine();
            sp21.setKolicina(1);
            sp21.setStavka(pica2);

            porudzbina2.getStavkePorudzbine().add(sp21);

            //DRUGA STAVKA
            StavkaPorudzbine sp22 = new StavkaPorudzbine();
            sp22.setKolicina(1);
            sp22.setStavka(pasta2);

            porudzbina2.getStavkePorudzbine().add(sp22);

            //TRECA STAVKA
            StavkaPorudzbine sp23 = new StavkaPorudzbine();
            sp23.setKolicina(1);
            sp23.setStavka(pice3);

            porudzbina2.getStavkePorudzbine().add(sp23);

            svePorudzbine.add(porudzbina2);

            System.out.println("> DRUGA PORUDZBINA JE KREIRANA <");
        }else{
            System.out.println("> DRUGA PORUDZBINA NIJE KREIRANA <");
        }



        System.out.println("> KREIRANJE TRECE PORUDZBINE <");
        Porudzbina porudzbina3 = sto3.napraviPorudzbinu();

        if(porudzbina3 != null){
            //PRVA STAVKA
            StavkaPorudzbine sp31 = new StavkaPorudzbine();
            sp31.setKolicina(3);
            sp31.setStavka(pica1);

            PrilogPorudzbine pp4 = new PrilogPorudzbine();
            pp4.setPrilog(prilog1);
            pp4.setKolicina(2);
            sp31.getPrilozi().add(pp4);

            porudzbina3.getStavkePorudzbine().add(sp31);

            //DRUGA STAVKA
            StavkaPorudzbine sp32 = new StavkaPorudzbine();
            sp32.setKolicina(1);
            sp32.setStavka(pice1);

            porudzbina3.getStavkePorudzbine().add(sp32);

            //TRECA STAVKA
            StavkaPorudzbine sp33 = new StavkaPorudzbine();
            sp33.setKolicina(1);
            sp33.setStavka(pice3);

            porudzbina3.getStavkePorudzbine().add(sp33);

            //CETVRTA STAVKA
            StavkaPorudzbine sp34 = new StavkaPorudzbine();
            sp34.setKolicina(1);
            sp34.setStavka(pice2);

            porudzbina3.getStavkePorudzbine().add(sp34);

            svePorudzbine.add(porudzbina3);

            System.out.println("> TRECA PORUDZBINA JE KREIRANA <");
        }else{
            System.out.println("> TRECA PORUDZBINA NIJE KREIRANA <");
        }

        System.out.println("-------------------NAPLATA PRVE PORUDZBINE-------------------");
        porudzbina1.naplata();

        System.out.println("-------------------NAPLATA TRECE PORUDZBINE-------------------");
        porudzbina3.naplata();

        System.out.println("-------------------KREIRANJE PORUDZBINA-------------------");
        System.out.println("> KREIRANJE CETVRTE PORUDZBINE <");
        Porudzbina porudzbina4 = sto2.napraviPorudzbinu();

        if(porudzbina4 != null){
            //PRVA STAVKA
            StavkaPorudzbine sp41 = new StavkaPorudzbine();
            sp41.setStavka(pica1);
            sp41.setKolicina(1);

            porudzbina4.getStavkePorudzbine().add(sp41);

            svePorudzbine.add(porudzbina4);

            System.out.println("> CETVRTA PORUDZBINA JE KREIRANA <");
        }else{
            System.out.println("> CETVRTA PORUDZBINA NIJE KREIRANA <");
        }

        System.out.println("-------------------NAPLATA DRUGE PORUDZBINE-------------------");
        porudzbina2.naplata();

        System.out.println("-------------------KREIRANJE PORUDZBINA-------------------");
        System.out.println("> KREIRANJE PETE PORUDZBINE <");
        Porudzbina porudzbina5 = sto2.napraviPorudzbinu();

        if(porudzbina5 != null){
            //PRVA STAVKA
            StavkaPorudzbine sp51 = new StavkaPorudzbine();
            sp51.setStavka(pica1);
            sp51.setKolicina(1);

            svePorudzbine.add(porudzbina5);

            System.out.println("> PETA PORUDZBINA JE KREIRANA <");
        }else{
            System.out.println("> PETA PORUDZBINA NIJE KREIRANA <");
        }
    }
}
