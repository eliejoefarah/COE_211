public class AdvancedWeek {
    // Initializing variables
    private String day_1 = "Monday";
    private int i = 1;
    private String day_2 = "Tuesday";
    private String day_3 = "Wednesday";
    private String day_4 = "Thursday";
    private String day_5 = "Friday";
    private String day_6 = "Saturday";
    private String day_7 = "Sunday";
   

    // printing out the days
    public void printDays() {
        System.out.println( "The advanced days of the week are: \n"+
        i++ + ": "+day_1+", \n"+
        i++ + ": "+day_2+", \n"+
        i++ + ": "+day_3+", \n"+
        i++ + ": "+day_4+", \n"+
        i++ + ": "+day_5+", \n"+
        i++ + ": "+day_6+", \n"+
        i++ + ": "+day_7+". \n");
    }
}