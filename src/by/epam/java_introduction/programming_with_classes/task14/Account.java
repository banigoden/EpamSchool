package by.epam.java_introduction.programming_with_classes.task14;

    /*
     Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
     Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
     имеющим положительный и отрицательный балансы отдельно.
     */

public class Account implements AccountBaseAction{
    private long id;
    private double balance;
    private boolean isBlocked = true;

    public Account( double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean openAccount() {
        return true;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking(){
        isBlocked = false;
    }

    @Override
    public void unBlocking(){
        isBlocked = true;
    }

    public String getStatus(){
        return isBlocked ? "Unlocked" : "Blocked";
    }
}
