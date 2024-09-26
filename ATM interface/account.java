public class account {
    private int accountNumber;
    private int pin;
    private double checkingBalance;
    private double savingBalance;
// declaring the public class 

    public account(int accountNumber, int pin, double checkingBalance, double savingBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }


    //deposit fuction
    public void depositToChecking(double amount) {
        checkingBalance += amount;
    }


    public void depositToSaving(double amount) {
        savingBalance += amount;
    }

//function for insufficient balance 

    public void getCheckingWithdrawInput(double amount) throws InsufficientBalance {
        if (checkingBalance < amount) {
            throw new InsufficientBalance("Insufficient balance in Checking Account.");
        }
        checkingBalance -= amount;
    }



    public void transferToSaving(double amount) {
        if (checkingBalance >= amount) {
            checkingBalance -= amount;
            savingBalance += amount;
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }


    public void transferToChecking(double amount) {
        if (savingBalance >= amount) {
            savingBalance -= amount;
            checkingBalance += amount;
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }
}