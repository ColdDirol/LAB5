package collection;

import collection.flat.Flat;
import collection.flat.Furnish;
import collection.flat.Transport;
import collection.flat.View;

import java.util.Scanner;

public class ElementConstructor {
    Scanner scanner;

    Flat flat;

    String name;
    Float x;
    Float y;
    float area;
    long numberOfRooms;
    int furnishNum;
    int viewNum;
    int transportNum;
    String houseName;
    int year;
    Integer numberOfLifts;

    public Flat elementConstruct() {
        flat = construct();

        flat.creationDateGenerator();
        flat.idGenerator();

        return flat;
    }
    public Flat elementConstruct(int saveId) {
        flat = construct();

        flat.creationDateGenerator();
        flat.setId(saveId);

        return flat;
    }

    private Flat construct() {
        scanner = new Scanner(System.in);

        flat = new Flat();

        System.out.print("Введите название квартиры: ");
        name = scanner.nextLine();
        flat.setName(name);

        System.out.print("Введите координату X: ");
        x = scanner.nextFloat();
        flat.setCoordinatesX(x);

        System.out.print("Введите координату Y: ");
        y = scanner.nextFloat();
        flat.setCoordinatesY(y);

        System.out.print("Введите площадь квартиры: ");
        area = scanner.nextFloat();
        flat.setArea(area);

        System.out.print("Введите количество комнат: ");
        numberOfRooms = scanner.nextInt();
        flat.setNumberOfRooms(numberOfRooms);

        System.out.println("Введите номер обстановки мебели в квартире: ");
        System.out.println("1 - DESIGNER, 2 - NONE, 3 - FINE, 4 - BAD, 5 - LITTLE");
        furnishNum = scanner.nextInt();
        while(furnishNum < 1 | furnishNum > 5) {
            System.out.print("Введите номер корректного варианта: ");
            furnishNum = scanner.nextInt();
        }
        if(furnishNum == 1)  flat.setFurnish(Furnish.DESIGNER);
        if(furnishNum == 2)  flat.setFurnish(Furnish.NONE);
        if(furnishNum == 3)  flat.setFurnish(Furnish.FINE);
        if(furnishNum == 4)  flat.setFurnish(Furnish.BAD);
        if(furnishNum == 5)  flat.setFurnish(Furnish.LITTLE);

        System.out.println("Введите номер вида из квартиры: ");
        System.out.println("1 - YARD, 2 - PARK, 3 - BAD, 4 - GOOD");
        viewNum = scanner.nextInt();
        while(viewNum < 1 | viewNum > 4) {
            System.out.print("Введите номер корректного варианта: ");
            viewNum = scanner.nextInt();
        }
        if(viewNum == 1)  flat.setView(View.YARD);
        if(viewNum == 2)  flat.setView(View.PARK);
        if(viewNum == 3)  flat.setView(View.BAD);
        if(viewNum == 4)  flat.setView(View.GOOD);

        System.out.println("Введите номер доступности транспорта: ");
        System.out.println("1 - FEW, 2 - NONE, 3 - ENOUGH");
        transportNum = scanner.nextInt();
        while(transportNum < 1 | transportNum > 3) {
            System.out.print("Введите номер корректного варианта: ");
            transportNum = scanner.nextInt();
        }
        if(transportNum == 1)  flat.setTransport(Transport.FEW);
        if(transportNum == 2)  flat.setTransport(Transport.NONE);
        if(transportNum == 3)  flat.setTransport(Transport.ENOUGH);

        System.out.print("Введите название дома: ");
        houseName = scanner.nextLine();
        flat.setHouseName(scanner.nextLine());

        System.out.print("Введите возраст дома: ");
        year = scanner.nextInt();
        flat.setHouseYear(year);

        System.out.print("Введите количество лифтов в доме (> 0): ");
        numberOfLifts = scanner.nextInt();
        while(numberOfLifts < 1) {
            System.out.print("Введите количество лифтов корректно: ");
            transportNum = scanner.nextInt();
        }
        flat.setHouseNumberOfLifts(numberOfLifts);

        return flat;
    }
}
