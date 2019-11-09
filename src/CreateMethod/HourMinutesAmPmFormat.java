package CreateMethod;

public class HourMinutesAmPmFormat {
    public static void main(String[] args) {
      hourAmorPm(2,5,true);
    }
    public static void hourAmorPm(int hour,int minutes,boolean check){
        if(hour>0 && hour<=12){
        }
        if(minutes>0 &&  minutes < 60){
            String date = hour + " : " + minutes;
            if(check){
                date+=" AM";
            }else{
                date+=" PM";
            }
            System.out.println(date);
        }else{
            System.out.println("Invalid data");
        }
    }
}

