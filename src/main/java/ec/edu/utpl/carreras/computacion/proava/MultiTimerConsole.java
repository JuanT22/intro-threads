package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) {
        TimerTask timerA = new TimerTask("Temporizador A", 30);
        Thread thA = new Thread(timerA);
        thA.start();
        System.out.println();

        TimerTask timerB = new TimerTask("Temporizador B", 5);
        Thread thB = new Thread(timerB);
        thB.start();
        System.out.println();

        TimerTask timerC = new TimerTask("Temporizador C", 6);
        Thread thC = new Thread(timerC);
        thC.start();
        System.out.println();
    }
}
