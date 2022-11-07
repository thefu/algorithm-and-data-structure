package TransferAccounts;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountThread extends Thread {

    //存储20个账户;
    private ArrayList<Account> accList = null;

    //每个账户对应一个锁，使得一个线程仅锁当前要操作的两个账户对应的锁;
    Map<Account, ReentrantLock> accLock = null;
    Random random = new Random();
    int acc1 = 0;
    int acc2 = 0;
    int money = 0;

    public AccountThread(List<Account> account, Map<Account, ReentrantLock>accLock) {
        this.accList = (ArrayList<Account>)account;
        this.accLock = accLock;
    }

    private void acquireLocks(Lock lockA,Lock lockB) throws InterruptedException{
        while(true){
            boolean bLockA=false;
            boolean bLockB=false;
            try {
                bLockA=lockA.tryLock();
                bLockB=lockB.tryLock();
            }finally {
                if(bLockA&&bLockB)
                    return;
                else if (bLockA)
                    lockA.unlock();
                else if (bLockB)
                    lockB.unlock();
            }
            Thread.sleep(1);
        }
    }

    public void run() {

        for(int i = 0; i < 100; i++) {
            acc1= random.nextInt(20);
            acc2 = random.nextInt(20);
            //禁止相同账户相互转账;
            while(acc1 == acc2) {
                acc2 = random.nextInt(20);
            }
            money = random.nextInt(100);

            try {
                acquireLocks(accLock.get(accList.get(acc1)), accLock.get(accList.get(acc2)));
                if(accList.get(acc1).getMoney() > money) {
                    accList.get(acc1).drawMoney(money);
                    accList.get(acc2).saveMoney(money);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                accLock.get(accList.get(acc1)).unlock();
                accLock.get(accList.get(acc2)).unlock();
            }
        }
    }
}
