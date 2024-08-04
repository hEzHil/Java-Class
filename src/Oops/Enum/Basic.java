package Oops.Enum;

public class Basic {

    enum Week{
        Monday ,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;
        // Here these are enum constant
        // these are public static final
        // since its final you can create child enum
        // Type is Week

        Week(){
            System.out.println("Constructor called  "+ this);
        }
        // this is not  public or protected , only private or default
        // why ? we don't want to create object new objects
        // this is not the enum concept , thats why
    }


    public static void main(String[] args) {
        // iterate through the enum Week and print the days
//        for( Week day : Week.values()){
//            System.out.println(day);
//        }
//        Week week;
//        week = Week.Thursday;
//        System.out.println(week);

        // ordinal is in which position enum declaration
//        System.out.println(week.ordinal());

        Week week = Week.Monday;
    }
}
