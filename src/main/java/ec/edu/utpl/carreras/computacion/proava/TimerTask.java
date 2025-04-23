package ec.edu.utpl.carreras.computacion.proava;

public class TimerTask implements Runnable {
    private final String name;
    private int seconds;

    public TimerTask(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        while(seconds > 0) {
            System.out.printf("%s: %d segundos restantes%n", name, seconds);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.printf("%s ha sido interrumpido%n", name);
            }
            seconds --;
        }
    }
}