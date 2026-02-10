import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherStation implements Runnable{
    private final List<WeatherObserver> weatherObservers = new CopyOnWriteArrayList<>();
    private final Random random = new Random();

    private int temperature;

    private static final int MIN_TEMPERATURE = -30;
    private static final int MAX_TEMPERATURE = 50;

    public WeatherStation() {
        this.temperature = random.nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1) + MIN_TEMPERATURE;
    }

    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    private void notifyObservers() {
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update(temperature);
        }
    }

    private void updateTemperature() {
        int change = random.nextBoolean() ? 1 : -1;
        temperature += change;

        if (temperature < MIN_TEMPERATURE) temperature = MIN_TEMPERATURE;
        if (temperature > MAX_TEMPERATURE) temperature = MAX_TEMPERATURE;

        notifyObservers();
    }

    @Override
    public void run() {
        while (true) {
            try {
                int sleepTime = 1000 + random.nextInt(4000);
                Thread.sleep(sleepTime);

                updateTemperature();
            } catch (InterruptedException e) {
                System.out.println( "WeatherStation interrupted.");
                return;
            }
        }
    }
}
