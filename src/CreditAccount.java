public class CreditAccount extends Account{

    @Override
    public void pay(int amount) {
        if(amount > 0) {
            balance -= amount;
            System.out.println("Указанная сумма '" + amount + "' успешно оплачено! Баланс на счету: " + balance);
        } else {
            System.out.println("Ошибка, сумма к оплате отрицательное число.");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if(amount > 0) {
            if(account.addMoney(amount)){
                balance -= amount;
                System.out.println("Указанная сумма '" + amount + "' переведена успешно. Баланс на счету: " + balance);
            }
        } else {
            System.out.println("Ошибка, сумма перевода отрицательное число.");
        }
    }

    @Override
    public boolean addMoney(int amount) {
        if(balance + amount <= 0) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Счет пополнен, баланс на счету: " + balance);
                return true;
            } else {
                System.out.println("Ошибка, сумма пополнения отрицательное число.");
                return false;
            }
        } else {
            System.out.println("Ошибка пополнения. Кредитный счет не может иметь положительный баланс.");
            return false;
        }
    }

}
