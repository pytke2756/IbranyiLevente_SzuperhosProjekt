package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Kepregeny {
    private static List<Szuperhos> hosok = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static FileReader fr;
    public static BufferedReader bf;

    public static void szereplok(String eleresiUt){
        try {
            fr = new FileReader(eleresiUt);
            bf = new BufferedReader(fr);
            String sor = bf.readLine();
            while (sor != null){
                String[] adatok = sor.split(" ");
                if (adatok[0].equals("Vasember")){
                    Vasember obj = new Vasember();

                    int hanyszorKeszit = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszit; i++) {
                        obj.kutyuKeszit();
                    }
                    hosok.add(obj);
                }
                else{
                    Batman obj = new Batman();

                    int hanyszorKeszit = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszit; i++) {
                        obj.kutyuKeszit();
                    }
                    hosok.add(obj);
                }
                sor = bf.readLine();
            }
            bf.close();
            fr.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void kiir(){
        for (Szuperhos item : hosok) {
            System.out.println(item);
        }
    }
}
