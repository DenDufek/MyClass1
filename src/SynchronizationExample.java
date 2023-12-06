class MyClass1 {

    synchronized void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 1 - Iteration: " + i);
            try {
                Thread.sleep(500);  // Щоб видно ефект синхронізації
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 2 - Iteration: " + i);
            try {
                Thread.sleep(500);  // Щоб видно ефект синхронізації
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyClass2 {

    synchronized void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 1 - Iteration: " + i);
            try {
                Thread.sleep(500);  // Щоб видно ефект синхронізації
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Method 2 - Iteration: " + i);
            try {
                Thread.sleep(500);  // Щоб видно ефект синхронізації
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {

    public static void main(String[] args) {
        final MyClass1 obj1 = new MyClass1();
        final MyClass2 obj2 = new MyClass2();

        Thread thread1 = new Thread(() -> obj1.method1());
        Thread thread2 = new Thread(() -> obj2.method2());

        thread1.start();
        thread2.start();
    }
}
