package Mobilier;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainApp3 {

    public static List<Mobilier> citire()
    {
        try{
            File file= new File("src/main/resources/mobilier.json");
            ObjectMapper mapper= new ObjectMapper();
            List<Mobilier> mobilier = mapper.readValue(file, new TypeReference<List<Mobilier>>() {});
            return mobilier;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws InterruptedException {
        List<Mobilier> mobilier=citire();

        Scanner s=new Scanner(System.in);
        int opt=-1;
        while(opt!=0)
        {
            System.out.println("----------------------------------MENIU----------------------------------");
            System.out.println("1.Afiseaza date citite");
            System.out.println("2.Afiseaza piese de mobilier si placile componente");
            System.out.println("3.Afiseaza caracteristicile placilor care compun o piesa de mobilier");
            System.out.println("4.De cate coli de pal este nevoie pentru a construi o piesa de mobilier");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\tDati optiunea:");
             opt=s.nextInt();
             switch (opt)
             {
                 case 0:
                     System.out.print("\nE ");
                     Thread.sleep(400);
                     System.out.print("X ");
                     Thread.sleep(400);
                     System.out.print("I ");
                     Thread.sleep(400);
                     System.out.print("T ");
                     Thread.sleep(400);
                     System.out.print("I ");
                     Thread.sleep(400);
                     System.out.print("N ");
                     Thread.sleep(400);
                     System.out.print("G ");

                     break;

                 case 1:
                     for(Mobilier m:mobilier) { //a
                         m.afisareMobilier();
                         System.out.println();
                     }
                     Thread.sleep(3000);
                     break;
                 case 2:
                     for (Mobilier m:mobilier) //b
                     {
                         System.out.print(m.getNume()+": ");
                         for(Placa p: m.getPlaci())
                             System.out.print(p.getDescriere()+", ");
                         System.out.println();
                     }
                     Thread.sleep(3000);
                     break;
                 case 3:
                     for (Mobilier m:mobilier)//c
                     {
                         System.out.println(m.getNume());
                     }
                     System.out.println("Dati piesa de mobilier a carei placi componete doriti sa le vedeti:");
                     Scanner sc=new Scanner(System.in);
                     String mob=sc.nextLine();
                     for(Mobilier m:mobilier)
                     {
                         if(mob.equals(m.getNume())){
                             for(Placa p:m.getPlaci())
                                 System.out.println(p.toString());}

                     }
                        Thread.sleep(3000);
                     break;

                 case 4:
                     for (Mobilier m:mobilier)
                         System.out.println(m.getNume());
                     Scanner scn= new Scanner(System.in);
                     System.out.println("Alegeti o piesa de mobilier");
                     String pm=scn.nextLine();
                     int S=0;
                     for(Mobilier m:mobilier)
                     {
                         if(pm.equals(m.getNume()))
                         {
                             for(Placa p:m.getPlaci())
                             {
                                 S=S+p.getLungime()*p.getLatime()*p.getNr_bucati();
                             }
                         }
                     }
                     System.out.println("In conditiile in care o o coala de pal are dimeniunea 2800 X 2070");
                     System.out.println("Pentru a realiza aceste piese de mobila este nevoide de "+((S/1352657)+1)+" coli de pal.");
                     Thread.sleep(3000);
                     break;
                 default:
                     System.out.println("Optiune gresita!");
                     break;
             }
        }



    }

}
