package Lekcja2OOP.Zadania.OOPPracownicy;

import java.util.Scanner;

public class MainPracownicy {
    public static boolean włącznik = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpEmployee impEmployee = new ImpEmployee();


        System.out.println("***** System Zarządzania Personelem*****");

        while (włącznik){
            System.out.println("1. Dodaj pracownika.");
            System.out.println("2. Wyświetl pracownika.");
            System.out.println("3. Usuń pracownika.");
            System.out.println("4. Wyświetl wszystkich pracowników.");
            System.out.println("5. Zakończ program.");
            int input = scanner.nextInt();

            switch (input){
                case 1:
                    impEmployee.addEmployee();
                    break;
                case 2:
                    impEmployee.viewEmp();
                    break;
                case 3:
                    impEmployee.deleteEmployee();
                    break;
                case 4:
                    impEmployee.viewAllEmps();
                    break;
                case 5:
                    włącznik =false;
            }
        }
    }
}
