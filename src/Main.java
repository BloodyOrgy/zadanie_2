public class Main {
    public static void main(String[] args) {


        int initialAccount = 100;

        int addend = 1100;

             int bonus = addend > 1000 ? addend / 100 : 0;

        int finalBalance = initialAccount + addend + bonus;
        System.out.println("Бонус: "+ bonus);
        System.out.println("Итоговый счет:" + finalBalance);



    }
}