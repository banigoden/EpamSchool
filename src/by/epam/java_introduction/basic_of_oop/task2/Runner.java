package by.epam.java_introduction.basic_of_oop.task2;

    /*
    Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
    нескольких товаров.
     */

public class Runner {

    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Product tshort = payment. new Product("t-short","nike",12.21,131);
        Payment.Product shorts = payment. new Product("shorts","nike",14,101);
        Payment.Product snickers = payment. new Product("snickers","nike",35.55,120);

        payment.addProduct(tshort,2);
        payment.addProduct(snickers,1);
        payment.totalAmount();

        payment.printReceipt();
    }

}
