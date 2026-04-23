package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) {
        TimerTask timerA = new TimerTask("Temporizador A", 8);
        TimerTask timerB = new TimerTask("Temporizador B", 5);
        TimerTask timerC = new TimerTask("Temporizador C", 3);

        // Lambda: implementa Runnable en línea
        new Thread(() -> timerA.run(), "Hilo-A").start();
        new Thread(() -> timerB.run(), "Hilo-B").start();
        new Thread(() -> timerC.run(), "Hilo-C").start();

        // Ejercicio adicional con referencia de método (equivalente):
        // new Thread(timerA::run, "Hilo-A").start();
    }
}