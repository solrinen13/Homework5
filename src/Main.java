public class Main
{

    public static void main(String[] args) {
        {
            System.out.println("Home work 5!");
        }
        {
            System.out.println("Task №1");
        }
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        {
            System.out.println("Task №2");
        }
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else
            if(clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else
            if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else
            if(clientOS == 0 && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }


        {
            System.out.println("Task №3");
        }
        int year = 2021;
            if( year % 4 == 0 && year % 100 != 0 && year % 400 ==0){
                System.out.println("Это високосный год");
            }
            else {
                System.out.println("Это не високосный год");
            }

        {
            System.out.println("Task №4");
        }
        {
            int deliveryDistance = 95;

            if (deliveryDistance < 20) {
                int dayToDelivery = 1;
                System.out.println("Потребуется дней: " + dayToDelivery);
            } else if (deliveryDistance >= 20 && deliveryDistance <= 60 ) {
                int dayToDelivery = 2;
                System.out.println("Потребуется дней: " + dayToDelivery);
            } else if (deliveryDistance > 60 || deliveryDistance < 100  ) {
                int dayToDelivery = 3;
                System.out.println("Потребуется дней: " + dayToDelivery);
            }



        }

        {
            System.out.println("Task №5");
        }
            int month = 8;
            if (month > 12){
                System. exit(0);
            }
                switch (month) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("осень");
                        break;


                }
            }
    }
