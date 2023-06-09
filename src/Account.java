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

    public boolean pay(int amount) {
        if(amount > 0) {
            balance -= amount;
            System.out.println("Указанная сумма '" + amount + "' успешно оплачено! Баланс на счету: " + balance);
            return true;
        } else {
            System.out.println("Ошибка, сумма к оплате отрицательное число.");
            return false;
        }

    }

    boolean transfer(Account account, int amount){
        if(amount > 0) {
            balance -= amount;
            account.balance += amount;
            System.out.println("Указанная сумма '" + amount + "' переведена на счет " + account.id + ". Баланс на счету: " + balance);
            return true;
        } else {
            System.out.println("Ошибка, сумма перевода отрицательное число.");
            return false;
        }
    }

    boolean addMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен, баланс на счету: " + balance);
            return true;
        } else {
            System.out.println("Ошибка, сумма пополнения отрицательное число.");
            return false;
        }
    }
}
