public class Eight {
    public static void main(String[] args){
        //auto-boxing
        System.out.println("------------AUTO BOXING-------------------");
        Integer intNum = 10;
        Float floatNum = 2.5f;
        String stringName = "Dhruva Raj Joshi";
        Double doubleNum = 45d;
        Boolean bool = true;
        Byte byteNum = 127;   //stores upto 127 (-128 to 127) => 7^2 = 127
        Long longNum = 3242L;

        //auto-unboxing
        System.out.println("------------AUTO UNBOXING-------------------");
        System.out.println(intNum);
        System.out.println(floatNum);
        System.out.println(stringName);
        System.out.println(doubleNum);
        System.out.println(bool);
        System.out.println(byteNum);
        System.out.println(longNum);

        //boxing   // there methods are deprecated
        System.out.println("-----------------BOXING-------------------");
        Integer intNumBoxing = new Integer(10);
        Float floatNumBoxing = new Float(2.5f);
        String stringNameBoxing = new String("Dhruva Raj Joshi");
        Double doubleNumBoxing = new Double(45d);
        Boolean boolBoxing = new Boolean(true);
//        Byte byteNumBoxing = new Byte(127);  //not correct
        Long longNumBoxing = new Long(3242L);

        //unboxing
        System.out.println("----------------UNBOXING-------------------");
        System.out.println(intNumBoxing.intValue());
        System.out.println(floatNumBoxing.floatValue());
        System.out.println(stringNameBoxing);
        System.out.println(doubleNumBoxing.doubleValue());
        System.out.println(boolBoxing.booleanValue());
//        System.out.println(byteNumBoxing.byteValue()); //not correct
        System.out.println(longNumBoxing.longValue());

        //other
        String number = "15";
        System.out.println(Integer.parseInt(number));
    }
}
