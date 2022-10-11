package by.epam.java_introduction.programming_with_classes.task14;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
   Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
   Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
   имеющим положительный и отрицательный балансы отдельно.
  */
public class Bank {

    private String name;
    private ArrayList<Client> clients;

    public Bank() {
      clients = new ArrayList<>();
    }


    public void addClient(Client client){
      clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient(String id){
       return clients.stream().filter(client -> client.getPasportID().contains(id)).findFirst().get();
    }

    @Override
    public String toString() {
        return "Bank" +
                " clients=" + clients;
    }
}
