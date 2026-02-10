public class ObservingObject implements WeatherObserver {
    private final String text;

    public ObservingObject(String text) {
        this.text = text;
    }

    @Override
    public void update(int temperature) {
        System.out.println(text + ": Temperature is " + temperature);
    }
}
