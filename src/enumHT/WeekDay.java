package enumHT;

public enum WeekDay {
   MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

   private int dayIndex;

    WeekDay(int dayIndex) {
        this.dayIndex = dayIndex;
    }
    public static WeekDay getDay(int dayIndex){
        for (WeekDay day : WeekDay.values()) {
            if(day.dayIndex == dayIndex) return day;
        }
            throw new IllegalArgumentException("You entered wrong day! ");
    }
}
