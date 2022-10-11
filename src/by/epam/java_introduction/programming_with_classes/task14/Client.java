package by.epam.java_introduction.programming_with_classes.task14;

    /*
     Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
     Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
     имеющим положительный и отрицательный балансы отдельно.
     */
import java.util.ArrayList;
import java.util.Comparator;

public class Client implements AccountClientFunction{
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;
    private String pasportID;


    public Client(String firstName, String lastName, String pasportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
        this.pasportID = pasportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String getPasportID() {
        return pasportID;
    }

    public void setPasportID(String pasportID) {
        this.pasportID = pasportID;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public Account getClient(long id){
        return accounts.stream().filter( i -> i.getId() == id).findFirst().get();
    }


    @Override
    public void sortByBalance(){
        accounts.stream().sorted(Comparator.comparing(Account::getBalance));
    }

    @Override
    public void sumOfAccountPos(){
        double sum =  accounts.stream().filter(i -> i.getBalance() > 0)
                .mapToDouble(balance -> balance.getBalance()).sum();
        System.out.println(sum);
    }

    @Override
    public void sumOfAccountNeg(){
        double sum =  accounts.stream().filter(i -> i.getBalance() < 0)
                .mapToDouble(Account::getBalance).sum();
        System.out.println(sum);
    }

    @Override
    public void sumOfAccount(){
        double sum =  accounts.stream()
                .mapToDouble(balance -> balance.getBalance()).sum();
        System.out.println(sum);
    }

    @Override
    public void printInfo(){
        accounts.stream().forEach(account -> System.out.println(account.getBalance()));
    }

}
