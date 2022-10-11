package by.epam.java_introduction.programming_with_classes.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomerStorage {

    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void sortCustomer(){
         customers.sort(Comparator.comparing(Customer::getName)
                 .thenComparing(Customer::getSurname)
                 .thenComparing(Customer::getPatronymic));
    }

    public List<Customer> printCreditCardInterval(int start, int end){

        return customers.stream()
                .filter(s -> s.getNumberOfCreditCard() >= start  && s.getNumberOfCreditCard() <= end).collect(Collectors.toList());

    }
}
