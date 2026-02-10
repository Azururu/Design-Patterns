public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver firstObserver = new ObservingObject("First Observer");
        WeatherObserver secondObserver = new ObservingObject("Second Observer");
        WeatherObserver thirdObserver = new ObservingObject("Third Observer");

        weatherStation.addObserver(firstObserver);
        weatherStation.addObserver(secondObserver);
        weatherStation.addObserver(thirdObserver);

        Thread weatherThread = new Thread(weatherStation);
        weatherThread.start();

        Thread.sleep(10000);

        weatherStation.removeObserver(secondObserver);
        System.out.println("\nRemoved second observer.");
    }
}
