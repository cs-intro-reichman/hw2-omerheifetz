public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code worked great
        String timeIn = args [0];
        String hourIn = "" + timeIn.charAt(0) + timeIn.charAt(1);
        String minuteIn = "" + timeIn.charAt(3) + timeIn.charAt(4);
        int hoursIn = Integer.parseInt(hourIn);
        int minutesIn = Integer.parseInt(minuteIn);
        int minutesToAdd = Integer.parseInt(args [1]);
        int totalMinutes = (hoursIn*60) + minutesIn + minutesToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes - (totalHours*60);
        String minutes2show = "";
        String hours2show = "";
        if (newMinutes<10) {
            minutes2show = "0" + newMinutes;
        }
        else {
            minutes2show = minutes2show + newMinutes;
        }
        if (newHours<10) {
            hours2show = "0" + newHours;
        }
        else {
            hours2show = hours2show + newHours;
        }
        System.out.println(hours2show + ":" + minutes2show);
    }
}
