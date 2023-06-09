public class CheckingAccount extends Account{
    CheckingAccount(String id) {
        super(id);
    }

    @Override
    public boolean pay(int amount) {
        if(getBalance() >= amount) {
            return super.pay(amount);
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if(getBalance() >= amount) {
            return super.transfer(account, amount);
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
            return false;
        }
    }
}
