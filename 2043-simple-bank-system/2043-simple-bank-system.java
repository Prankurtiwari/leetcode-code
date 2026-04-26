class Bank {

    long[] account;
    int n;
    public Bank(long[] balance) {
        this.account = balance;
        this.n = balance.length;
    }
    
    public boolean transfer(int from, int to, long money) {
        if (!isValid(from)) return false;

        if (!isValid(to)) return false;

        if (account[from-1] < money )
        return false;

        account[from-1] -= money;
        account[to-1] += money;
        return true;
    }
    
    public boolean deposit(int acc, long money) {
        if (!isValid(acc)) {
            return false;
        }

        account[acc -1] += money;
        return true;
    }
    
    public boolean withdraw(int acc, long money) {
        if (!isValid(acc))
        return false;

        if (account[acc-1]<money) {
            return false;
        }

        account[acc-1] -= money;
        return true;
    }

    private boolean isValid(int acc) {
        return acc>0 && acc <=n;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */