package TransferAccounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<Account>();
        Map<Account, ReentrantLock>accLock = new HashMap<Account, ReentrantLock>();

        //20个账户;
        Account acc = null;
        for (int i = 0; i < 20; i++) {
            acc = new Account(String.valueOf(i+1));
            accountList.add(acc);
            accLock.put(acc, new ReentrantLock());
        }

        //10个线程;
        List<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            threadList.add(new AccountThread(accountList, accLock));
        }

        for (int i = 0; i < 10; i++) {
            threadList.get(i).start();
        }

        //等待10个线程运行结束;
        for (int i = 0; i < 10; i++) {
            try {
                threadList.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int total = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("第" + (i+1) + "个账户" + accountList.get(i));
            total += accountList.get(i).getMoney();
        }
        System.out.println("总金额："+total);
    }

}
