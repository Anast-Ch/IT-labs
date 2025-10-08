package lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Headphones headphones1 = createHeadphones(scanner);
        
        System.out.println(headphones1.getInfo());
        System.out.println(headphones1.switchConnection());
        System.out.println("Громкость после увеличения: " + headphones1.changeVolume(true));

        Headphones headphones2 = new Headphones("USB", 30, false);

        System.out.println("\n Создаем второй объект Наушники");
        System.out.println(headphones2.getInfo());
        
        System.out.println("Укажите желаемую громкость:");
        int val = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Устанавливаем громкость на %d \n", val);
        headphones2.setCurVol(val);
        System.out.println("Устанавливаем двойной режим");
        headphones2.setIsDualMode(true);

        System.out.println("После всех изменений:");
        System.out.println("Текущая громкость: " + headphones2.getCurVol() + "%");
        System.out.println("Тип подключения: " + headphones2.getConnType());
        System.out.println("Поддержка двойного режима: " + headphones2.getIsDualMode());
        
        System.out.println("\n Всего создано наушников: " + Headphones.getObjectCounter());

        Keyboard keyboard1 = creatKeyboard(scanner);

        System.out.println();
        System.out.println(keyboard1.getInfo());
        System.out.println(keyboard1.switchConnection());
        System.out.println("Переключаем раскладку.");
        keyboard1.switchLayout();
        System.out.println("После всех изменений");
        System.out.println("Текущее подключение: " + keyboard1.getConnType());
        System.out.println("Поддержка двойного режима: " + keyboard1.getIsDualMode());
        System.out.println("Текущая раскладка: " + keyboard1.getLayout());
        
        
        GraphicTablet tablet1 = createGraphicTablet(scanner);
        
        scanner.close();
        
        System.out.println();
        System.out.println(tablet1.getInfo());
        System.out.println(tablet1.switchConnection());

        double SInch = tablet1.calculateActiveArea(8.0, 6.0);
        System.out.printf("При высоте 6 дюймов и ширине 8 дюймов площадь активной области (в кв.дюймах) равна: %.2f \n", SInch);
        
        double Smm = tablet1.calculateActiveArea(200, 150);
        System.out.printf("При высоте 150 мм и ширине 200 мм площадь активной области (в кв.дюймах) равна %.2f \n", Smm);

        System.out.println("Отключаем двойной режим.");
        tablet1.setIsDualMode(false);

        System.out.println("После всех изменений:");
        System.out.println("Текущее подключение: " + tablet1.getConnType());
        System.out.println("Поддержка двойного режима: " + tablet1.getIsDualMode());
        System.out.printf("Активная область (в кв.дюймах): %.2f", tablet1.getActiveAreaInch());        
    }

    private static Headphones createHeadphones(Scanner scanner) {
        

        System.out.println("Введите данные для наушников:");
        
        System.out.print("Тип подключения (USB/Bluetooth): ");
        String connType1 = scanner.nextLine();
        while (("USB".equals(connType1) || "Bluetooth".equals(connType1)) == false) {
        System.out.println("Ошибка! Допустимые типы: USB или Bluetooth. Введите заново:");
        connType1 = scanner.nextLine();
        }

        System.out.print("Громкость: ");
        int volume1 = scanner.nextInt();
        System.out.print("Двойной режим (true/false): ");
        boolean dualMode1 = scanner.nextBoolean();
        scanner.nextLine();

        return new Headphones(connType1, volume1, dualMode1);
    }

    private static Keyboard creatKeyboard(Scanner scanner) {

        System.out.println("\n Введите данные для клавиатуры:");

        System.out.print("Тип подключения (USB/Bluetooth): ");
        String keyboardConnType = scanner.nextLine();
        while (("USB".equals(keyboardConnType) || "Bluetooth".equals(keyboardConnType)) == false) {
            System.out.println("Ошибка! Допустимые типы: USB или Bluetooth. Введите заново:");
            keyboardConnType = scanner.nextLine();
        }

        System.out.print("Двойной режим (true/false): ");
        boolean keyboardDualMode = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Раскладка: ");
        String keyboardLayout = scanner.nextLine();
        scanner.nextLine();

        return new Keyboard(keyboardConnType, keyboardLayout, keyboardDualMode); 
    }

    private static GraphicTablet createGraphicTablet(Scanner scanner) {

        System.out.println("\nВведите данные для графического планшета:");
        
        System.out.print("Тип подключения (USB/Bluetooth): ");
        String connType = scanner.nextLine();
        while (("USB".equals(connType) || "Bluetooth".equals(connType)) == false) {
            System.out.println("Ошибка! Допустимые типы: USB или Bluetooth. Введите заново:");
            connType = scanner.nextLine();
        }
        
        System.out.print("Площадь активной области: ");
        double S = scanner.nextDouble();
        System.out.print("Двойной режим (true/false): ");
        boolean dualMode = scanner.nextBoolean();
        scanner.nextLine();
        
        return new GraphicTablet(connType, S, dualMode);
    }
}


