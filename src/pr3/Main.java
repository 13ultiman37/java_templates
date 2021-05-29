package pr3;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        testList();
        testSet();
    }

    public static void testSet() {
        Set<Integer> syncSet = new SetSynchronized<>();
        Runnable task1 = () -> {
            for (int i = 1; i < 25; i++) {
                syncSet.add(i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 26; i < 51; i++) {
                syncSet.add(i);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);


        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(syncSet.toString());
    }

    public static void testList() {
        List<Integer> list = new ListSemaphore<>();
        Runnable task1 = () -> {
            for (int i = 1; i < 25; i++) {
                list.add(i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 26; i < 51; i++) {
                list.add(i);
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);


        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.toString());
    }
}

