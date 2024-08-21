public class SpeedConverter {
    public static void main(String [] args){
             System.out.println(toMilersPerHour(1.5));
             System.out.println(toMilersPerHour(10.25));
             System.out.println(toMilersPerHour(-5.6));
             System.out.println(toMilersPerHour(25.42));
             System.out.println(toMilersPerHour(75.114));

    public static long toMilesPerHour(double kilometersPerhour) {
        if(kilometersPerhour < 0){
            return -1
        } else {
            double mph = kilometersPerhour / 1.609;
            return Math.round(mph);
        }
    }
    }
