public class CheckingAccount extends Account{
    CheckingAccount(String id) {
        super(id);
    }

    @Override
    public void pay(int amount) {
        if(getBalance() >= amount) {
            if(amount > 0) {
                setBalance(getBalance() - amount);
                System.out.println("Указанная сумма '" + amount + "' успешно оплачено! Баланс на счету: " + getBalance());
            } else {
                System.out.println("Ошибка, сумма к оплате отрицательное число.");
            }
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if(getBalance() >= amount) {
            if(amount > 0) {
                setBalance(getBalance() - amount);
                account.setBalance(account.getBalance() + amount);
                System.out.println("Указанная сумма '" + amount + "' переведена на счет " + account.getId() + ". Баланс на счету: " + getBalance());
            } else {
                System.out.println("Ошибка, сумма перевода отрицательное число.");
            }
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
        }
    }

    public void addMoney(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Счет пополнен, баланс на счету: " + getBalance());
        } else {
            System.out.println("Ошибка, сумма пополнения отрицательное число.");
        }
    }
}
