package text2;
/**
 * @author xyj
 * @create 2021-11-12 13:51
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        out(arr1,arr2);
    }
    public static void out(int[] arr1, int[] arr2){
        final Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock){
                for(int num : arr1){
                    System.out.print(num + " ");
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock){
                for(int num : arr2){
                    System.out.print(num + " ");
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
            }
        });
        t1.start();
        t2.start();
    }
}


