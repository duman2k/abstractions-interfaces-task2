public class Test {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        System.out.println("Сберегательный счет: ");
        savingsAccount.pay(10);
        savingsAccount.transfer(checkingAccount,5);
        savingsAccount.addMoney(10);
        savingsAccount.transfer(checkingAccount,5);

        System.out.println();
        System.out.println("Кредитный счет: ");
        creditAccount.pay(10);
        creditAccount.transfer(savingsAccount,5);
        creditAccount.addMoney(16);
        creditAccount.addMoney(15);
        creditAccount.transfer(savingsAccount,5);

        System.out.println();
        System.out.println("Расчетный счет: ");
        System.out.println("Баланс: " + checkingAccount.getBalance());
        checkingAccount.pay(10);
        checkingAccount.transfer(savingsAccount,5);
        checkingAccount.addMoney(10);

        System.out.println();
        System.out.println("Сберегательный счет, баланс: " + savingsAccount.getBalance());
        System.out.println("Кредитный счет, баланс: " + creditAccount.getBalance());
        System.out.println("Расчетный счет, баланс: " + checkingAccount.getBalance());


    }
}



