public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter(java.util.Calendar.getInstance());
        adapter.setDay(10);
        adapter.setMonth(3);
        adapter.setYear(2077);

        System.out.println("Day: " + adapter.getDay());
        System.out.println("Month: " + adapter.getMonth());
        System.out.println("Year: " + adapter.getYear());

        adapter.advanceDays(10);
        System.out.println();

        System.out.println("Day: " + adapter.getDay());
        System.out.println("Month: " + adapter.getMonth());
        System.out.println("Year: " + adapter.getYear());
    }
}
