package exercitiul2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainApp2 {

    public static List<PerecheNumere> citire()
    {
        try{
            ObjectMapper mapper= new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            File file= new File("src/main/resources/nr.json");
            List<PerecheNumere> numere;
            numere = mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {});
            return numere;
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void scriere(List<PerecheNumere> lista){
        try{
            ObjectMapper mapper= new ObjectMapper();
            File file= new File("src/main/resources/nr.json");
            mapper.writeValue(file,lista);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        List<PerecheNumere> numere;
        numere=citire();


        for(PerecheNumere n:numere)
        {
            System.out.println(n);
            System.out.println("Au acelasi nr. de nr. pare: " + n.pare_egale());
            System.out.println("Au suma numereleor egale: " + n.suma_numere());
            System.out.println("Cmmdc: " + n.cmmmc());
            System.out.println("Sunt consecutive in sirul lui Fibonaci: " + n.fib()+"\n");

        }

    }


}
