public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Создаю потоки...\n");
        ThreadGroup group1 = new ThreadGroup("main group1");

        for (int i = 1; i < 5; i++) {
            String name = "Поток " + i;
            final MyThread thread = new MyThread(group1, name);
            thread.setName(name);
            thread.start();
            Thread.sleep(15000);

        }
        System.out.println("Завершаю все потоки");
        group1.interrupt();
    }
}