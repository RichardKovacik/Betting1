package sk.fri.uniza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Testovanie {
    public static void main(String[] args) throws IOException {
        String test = "53. 19 Sep 2021, 15:00\n" +
                "70.__2.švédska-liga__superettan\n" +
                "Falkenbergs - Osters\n" +
                "Kurz BTTS-Yes: 1.86 -> HODNOTA STAVKY: 106.020004%\n";

        BufferedReader reader = new BufferedReader(new StringReader(test));
        String line = "";
        for (int i = 0; i < countLines(test); i++){
            line = reader.readLine();
            if (i == 0) {
                line = zapasovyFilter(line);
            }
            System.out.println(line);

        }

    }
    private static int countLines(String str){
        String[] lines = str.split("\r\n|\r|\n");
        return  lines.length;
    }
    public static String zapasovyFilter(String s) {
        String pattern = "^(.*?). ";
        return s.split(pattern)[1];
    }

}
