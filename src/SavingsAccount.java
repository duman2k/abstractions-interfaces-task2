public class SavingsAccount extends Account{
    SavingsAccount(String id) {
        super(id);
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Ошибка! Оплата со сберегательного счета невозможна.");
        return false;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (getBalance() - amount >= 0) {
            return super.transfer(account, amount);
        } else {
            System.out.println("Ошибка! Не достаточно средств.");
            return false;
        }
    }


}
