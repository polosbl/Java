public class break1 {
    public static void main(String[] args) {
//      Объявите переменную m типа int. Выясните, есть ли в записи этого числа хотя бы одна тройка.

        int m = 143;

        while (m > 0) {
            if (m % 10 == 3){
                System.out.println("Есть тройка");
                break;
            }
            m = m / 10;

        }
    }
}
