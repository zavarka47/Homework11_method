import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1");
        int year = YearMonth.now().getYear();
        boolean yearIsLeap = checkYear(year);
        printResultCheckYear(yearIsLeap, year);
        System.out.println();

        System.out.println("Exercise 2");
        int deviseRelease = 2022;
        int clientOS = 1;
        installTheApp(deviseRelease, clientOS);
        System.out.println();

        System.out.println("Exercise 3");
        int deliveryDistance = 105;
        calculateDeliveryTime(deliveryDistance);
    }


    // methods for Exercise 1 ↓
    private static boolean checkYear (int year) {

        return year % 4 == 0 || year % 400 == 0 && year % 100 != 0;
    }
    private static void printResultCheckYear (boolean checkYear, int year) {
        if (checkYear) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println(year + " не год является високосным");
        }
    }


    // methods for Exercise 2 ↓
    private static String checkDeviceRelease(int year) {
        String versionOS = null;
        if (year <= 2015) {
            versionOS = "облегченную";
        } else {
            versionOS = "";
        }
        return versionOS;
    }
    private static String checkDeviceOS(int os) {
        String OS;
        if (os == 0) {
            OS = "IOS";
        } else {
            OS = "Android";
        }
        return OS;
    }
    private static void installTheApp(int year, int os){
        String version = checkDeviceRelease(year);
        String OS = checkDeviceOS(os);
        System.out.println("Установите " + version + " версию приложения для " + OS + " по ссылке");
    }


    // method for Exercise 3 ↓
    private static void calculateDeliveryTime (int deliveryDistance) {
        if (0 < deliveryDistance && deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            System.out.println("Доставка займет 2 день");
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 день");
        } else {
            System.out.println("К сожалению Вы находитесь за пределами доставки :(");
        }
    }
}