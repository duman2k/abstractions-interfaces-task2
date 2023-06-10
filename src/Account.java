public abstract class Account {
    private String id;
    private int balance;

    Account(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
