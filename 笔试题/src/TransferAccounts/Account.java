package TransferAccounts;

public class Account {
    private String name = "";
    private int money = 10000;

    public Account(String name) {
        this.name = name;
    }

    public void saveMoney(int money) {
        this.money += money;
    }

    public void drawMoney(int money) {
        this.money -= money;
    }

    public int getMoney() {
        return money;
    }

    public String toString() {
        return String.valueOf(money);
    }
}
