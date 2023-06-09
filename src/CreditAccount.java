public class CreditAccount extends Account{
    CreditAccount(String id) {
        super(id);
    }

    @Override
    boolean addMoney(int amount) {
        if(getBalance() + amount <= 0) {
            return super.addMoney(amount);
        } else {
            System.out.println("Ошибка пополнения. Кредитный счет не может иметь положительный баланс.");
            return false;
        }
    }
}
