public class SavingsAccount extends Account{

    @Override
    public void pay(int amount) {
        System.out.println("Ошибка! Оплата со сберегательного счета невозможна.");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance - amount >= 0) {
            if(amount > 0) {
                if (account.addMoney(amount)) {
                    balance -= amount;
                    System.out.println("Указанная сумма '" + amount + "' переведена успешно. Баланс на счету: " + balance);
                }
            } else {
                System.out.println("Ошибка, сумма перевода отрицательное число.");
            }
        } else {
            System.out.println("Ошибка! Не достаточно средств.");
        }
    }

    @Override
    public boolean addMoney(int amount) {
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
