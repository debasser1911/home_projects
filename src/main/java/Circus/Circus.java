package Circus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DeBasser on 11.05.2017.
 */
public class Circus {
    private List<Artist> artists;
    private static final double RATE_PER_ONE_PERFORMANCE = 100;

    public Circus() {
        artists = new ArrayList<>();

    }

    public int getSize() {
        return artists.size();
    }

    public String showArtists() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < artists.size(); i++) {
            if (artists.get(i) != null) {
                tmp.append(artists.get(i).toString()).append("\n");
            }
        }
        return tmp.toString();
    }

    public boolean hireArtist(Artist o) {
        if (o == null || artists.contains(o)) return false;
        artists.add(o);
        return true;
    }

    public Artist findArtist(Artist o) {
        if (o == null) return null;
        else {
            for (int i = 0; i < artists.size(); i++) {
                if (o.equals(artists.get(i))) {
                    return artists.get(i);
                }
            }
        }
        return null;
    }

    public String performanceReport() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < artists.size(); i++) {
            tmp.append(artists.get(i).getName() + ": " + artists.get(i).getNumOfPerformances()).append(" performances\n");
        }
        return tmp.toString();
    }

    public void paySalary() {
        for (int i = 0; i < artists.size(); i++) {
            artists.get(i).setEarnedMoney(artists.get(i).getEarnedMoney() + (RATE_PER_ONE_PERFORMANCE * artists.get(i).getNumOfPerformances() * artists.get(i).extraBonusForRisk));
        }
    }

    public void showMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //todo вписать количество пунктов
        System.out.printf("Привет! Я - меню управления цирком. Выбери пункт меню: \n1. Посмотреть список артистов\n2. Второй пункт\n3. Третий пункт");
        int menuPoint = Integer.parseInt(br.readLine());

        switch (menuPoint) {
            case 1:
                System.out.println("Посмотреть список артистов");
                showArtists();
                break;
            case 2:
                System.out.println("Второй пункт");
                break;
            case 3:
                System.out.println("Третий пункт");
                break;
        }

    }

    public void fillArtist() {
        Circus circus = new Circus();
        Acrobat a1 = new Acrobat("Acrobat_1_name", "Acrobat_1_surName");
        circus.hireArtist(a1);
        Acrobat a2 = new Acrobat("Acrobat_2_name", "Acrobat_2_surName");
        circus.hireArtist(a2);
        RopeWalker r1 = new RopeWalker("RopeWalker_1_name", "RopeWalker_1_surName");
        circus.hireArtist(r1);
        RopeWalker r2 = new RopeWalker("RopeWalker_2_name", "RopeWalker_2_surName");
        circus.hireArtist(r2);
        Acrobat a3 = new Acrobat("Acrobat_3_name", "Acrobat_3_surName");
        circus.hireArtist(a3);
        RopeWalker r3 = new RopeWalker("RopeWalker_3_name", "RopeWalker_3_surName");
        circus.hireArtist(r3);
    }

    public int calc(){
        return 10;
    }
}
