public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1(){
        System.out.println("Задание номер 1");
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }
    public static void task2(){
        System.out.println("Задание номер 2");
        for (int i =10;i>0;i--){
            System.out.println(i);
        }
    }
    public static void task3(){
        System.out.println("Задание номер 3");
        for (int i=0;i<18;i=i+2){
            System.out.println(i);
        }
    }
    public static void task4(){
        System.out.println("Задание номер 4");
        for(int i = 10;i>-11;i--){
            System.out.println(i);
        }
    }
    public static void task5(){
        System.out.println("Задание номер 5");
        for (int year= 1904;year<2097;year= year+4){
            System.out.println(year+" год является високосным");
        }
    }
    public static void task6(){
        System.out.println("Задание номер 6");
        for(int i = 7;i<99;i=i+7){
            System.out.println(i);
        }
    }
    public static void task7(){
        System.out.println("Задание номер 7");
        for (int i= 2;i<513;i=i*2){
            System.out.println(i);
        }
    }
    public static void task8() {
        System.out.println("Задание номер 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + accumulation;

            System.out.println("Месяц " + i + " сумма накоплений равна "+total+" рублей");
        }
    }
    public static void task9(){
        System.out.println("Задание номер 9");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total=total+accumulation/100;

            System.out.println("Месяц " + i + " сумма накоплений равна "+total+" рублей");
        }
    }
    public static void task10(){
        System.out.println("Задание номер 10");
        for (int i= 1;i<11;i++) {
            System.out.println("2*"+i+"="+i*1);
        }
    }
}