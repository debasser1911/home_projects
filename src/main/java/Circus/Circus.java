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
        int index = 1;
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

    public void performAllArtists() {
        for (int i = 0; i < artists.size(); i++) {
            artists.get(i).perform();
        }
        System.out.println("Все артисты выступили");
    }

    public void showMenu(Circus circus) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //todo вписать количество пунктов
        System.out.printf("Привет! Я - меню управления блядским цирком. Выбери пункт меню: \n1. Посмотреть список артистов\n2. Отчёт о выступлениях\n3. Начать выступление\n4. Выплатить зар. плату\n5. Выход\n");
        System.out.print("Введите пункт меню: ");
        int menuPoint = Integer.parseInt(br.readLine());
        String separator = "================================";

        switch (menuPoint) {
            case 1:
                System.out.println("Посмотреть список артистов");
                System.out.println(circus.showArtists());
                System.out.println(separator);
                System.out.println();
                showMenu(circus);
                break;
            case 2:
                System.out.println("Отчёт о выступлениях");
                System.out.println(circus.performanceReport());
                System.out.println();
                showMenu(circus);
                break;
            case 3:
                System.out.println("Начать выступление");
                circus.performAllArtists();
                System.out.println();
                showMenu(circus);
                break;
            case 4:
                System.out.println("Выплатить зар. плату");
                circus.paySalary();
                System.out.println();
                showMenu(circus);
            case 5:
                System.out.println("Выход");
                break;
        }


    }


}
