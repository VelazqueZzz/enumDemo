enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT;
//    private int speed;
//    Transport(int s){
//        speed=s;
//    }
//    int getSpeed(){
//        return speed;
//    }
//}
}
public class Main {
    public static void main(String[] args) {
        Transport tp,tp2,tp3;
//        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed()+ " miles per hour.\n");
//
//        System.out.println("All transports speed: ");
//       for(Transport t : Transport.values())
//
//        System.out.println(t + " typical speed is "+ t.getSpeed() + " miles per hour");

//------------------------------------------------------------------------------
        for(Transport t : Transport.values())
            // Получение порядковых значений констант.
            System.out.println(t + " " + t.ordinal());

       tp=Transport.AIRPLANE;
       tp2=Transport.TRAIN;
       tp3=Transport.AIRPLANE;
       if(tp.compareTo(tp2)<2)
           System.out.println(tp+" comes before " + tp2);

       if(tp.compareTo(tp2)>0)
           System.out.println(tp2+" comes before " + tp);
       if(tp.compareTo(tp3)==0)
           System.out.println(tp+ " equals " + tp3);



    }
}