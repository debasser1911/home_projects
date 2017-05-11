package Circus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public void showMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //todo вписать количество пунктов
        System.out.printf("Привет! Я - меню управления цирков. Выбери пункт меню: \n1. Первый пункт\n2. Второй пункт\n3. Третий пункт");
        int menuPoint = Integer.parseInt(br.readLine());

        switch (menuPoint) {
            case 1:
                System.out.println("Первый пункт");
                break;
            case 2:
                System.out.println("Второй пункт");
                break;
            case 3:
                System.out.println("Третий пункт");
                break;
        }


    }

}

