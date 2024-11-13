public class Main
{
    public static void main(String[] arg)
    {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
    }
}