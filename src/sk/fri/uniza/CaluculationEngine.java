package sk.fri.uniza;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CaluculationEngine {
    private static ArrayList<String> zoznamZapasov = new ArrayList<>();

    public static String stareCalucalationEngine() throws IOException {

        File directoryPath = new File("C:/Users/richa/OneDrive/Počítač/stavky/stare/a.txt");
        String stareData = new String(Files.readAllBytes(Paths.get(String.valueOf(directoryPath))));
        BufferedReader reader = new BufferedReader(new StringReader(stareData));
        String line = "";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < countLines(stareData); i++){
            line = reader.readLine();
             if (!line.isEmpty()) {
                 builder.append(line+"\n");
             }else {
                 zoznamZapasov.add(builder.toString());
                 builder = new StringBuilder();
             }
        }

        zoznamZapasov.add(builder.toString());

        return stareData;

    }
    public static void print(){
//        for (String s : zoznamZapasov) {
//            System.out.print(s);
//        }
       // System.out.println(zoznamZapasov.get(1));
    }
    public static void parser(){
        for (String s : zoznamZapasov) {

        }

    }

    public static void main(String[] args) throws IOException {
//        String riadok = "41. 19 Sep 2021, 12:30";
//        String[] arr = riadok.split(" ");
//
//        for (int i = 1 ; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

      //  System.out.println(stareCalucalationEngine());
      //  System.out.println(countLines(stareCalucalationEngine()));
        stareCalucalationEngine();
        print();


    }
    public static void noveCalucalationEngine(){
        File directoryPath = new File("C:/Users/richa/OneDrive/Počítač/stavky/nove");
    }
    private static int countLines(String str){
        String[] lines = str.split("\r\n|\r|\n");
        return  lines.length;
    }
}
