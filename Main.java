public class Main
{
    public static void main(String[] arg)
    {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for (int i = 10; i < 15; i++) schedule[1][i] = true;
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        for(int i = 50; i < 60; i++) schedule[1][i] = true;
        a.printPeriod(2);

        System.out.println(a.findFreeBlock(2,15));
        System.out.println(a.findFreeBlock(2,9));
        System.out.println(a.findFreeBlock(2,20));

        schedule = new boolean[8][60];
        AppointmentBook b = new AppointmentBook(schedule);
        a.printPeriod(2);
    }
}