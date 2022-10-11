package by.epam.java_introduction.programming_with_classes.task8;

      /*
       Создать класс Customer, спецификация которого приведена ниже. Определить
       конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
       агрегирующий массив типа Customer, с подходящими конструкторами и методами.
       Задать критерии выбора данных и вывести эти данные на консоль.

       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
       номер банковского счета.
            Найти и вывести:
            a) список покупателей в алфавитном порядке;
            b) список покупателей, у которых номер кредитной карточки находится
            в заданном интервале.
        */
public class Runner {
    public static void main(String[] args) {

        Customer denis = new Customer(1,"Denis","Bandurin","Igorevich","Saint P",3333333,123123123);
        Customer ivan = new Customer(2,"Ivan","Kulikov","Aleksandrovich","Volgograd",77777777,656565656);
        Customer ekaterina = new Customer(3,"Ekaterina","Bandurina","Vladimirovna","Saint P",2222222,424424);
        Customer lev = new Customer(4,"Anat","Iko","Dan","Moskow",5555555,757575775);

        CustomerStorage clients = new CustomerStorage();
        clients.addCustomer(denis);
        clients.addCustomer(ekaterina);
        clients.addCustomer(ivan);
        clients.addCustomer(lev);

        clients.sortCustomer();
        clients.getCustomers().stream().forEach(System.out::println);
        System.out.println("Beetwen interval " + clients.printCreditCardInterval(2222222, 5555555));

    }
}
