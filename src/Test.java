public class Test {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount("1111");
        Account creditAccount = new CreditAccount("2222");
        Account checkingAccount = new CheckingAccount("3333");

        System.out.println("Сберегательный счет, id: " + savingsAccount.getId());
        savingsAccount.pay(10);
        savingsAccount.transfer(checkingAccount,5);
        savingsAccount.addMoney(10);
        savingsAccount.transfer(checkingAccount,5);

        System.out.println();
        System.out.println("Кредитный счет, id: " + creditAccount.getId());
        creditAccount.pay(10);
        creditAccount.transfer(savingsAccount,5);
        creditAccount.addMoney(16);
        creditAccount.addMoney(15);
        creditAccount.transfer(savingsAccount,5);

        System.out.println();
        System.out.println("Расчетный счет, id: " + checkingAccount.getId());
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



