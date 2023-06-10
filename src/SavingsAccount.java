public class SavingsAccount extends Account{
    SavingsAccount(String id) {
        super(id);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Ошибка! Оплата со сберегательного счета невозможна.");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getBalance() - amount >= 0) {
            if(amount > 0) {
                setBalance(getBalance() - amount);
                account.setBalance(account.getBalance() + amount);
                System.out.println("Указанная сумма '" + amount + "' переведена на счет " + account.getId() + ". Баланс на счету: " + getBalance());
            } else {
                System.out.println("Ошибка, сумма перевода отрицательное число.");
            }
        } else {
            System.out.println("Ошибка! Не достаточно средств.");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Счет пополнен, баланс на счету: " + getBalance());
        } else {
            System.out.println("Ошибка, сумма пополнения отрицательное число.");
        }
    }
}
