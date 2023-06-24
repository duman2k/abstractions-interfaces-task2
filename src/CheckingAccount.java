public class CheckingAccount extends Account{

    @Override
    public void pay(int amount) {
        if(balance >= amount) {
            if(amount > 0) {
                balance -= amount;
                System.out.println("Указанная сумма '" + amount + "' успешно оплачено! Баланс на счету: " + balance);
            } else {
                System.out.println("Ошибка, сумма к оплате отрицательное число.");
            }
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if(balance >= amount) {
            if(amount > 0) {
                balance -= amount;
                account.addMoney(amount);
                System.out.println("Указанная сумма '" + amount + "' переведена успешно. Баланс на счету: " + balance);
            } else {
                System.out.println("Ошибка, сумма перевода отрицательное число.");
            }
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
        }
    }

    public void addMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен, баланс на счету: " + balance);
        } else {
            System.out.println("Ошибка, сумма пополнения отрицательное число.");
        }
    }
}
