public class Main{
    public static void main(String[] args) {
        // int age = 12;
        int min = Integer.MIN_VALUE;

        int max = Integer.MAX_VALUE;

        System.out.println("Minimum Interger Value: "+min);
        System.out.println("Maximum Interger Value: "+max);
        
        System.out.println("Underflow: "+(min - 1));
        System.out.println("Overflow: "+(max + 1));

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value: "+minByte);
        System.out.println("Maximum Byte Value: "+maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println("Minimum Short Value: "+minShort);
        System.out.println("Maximum Short Value: "+maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("Minimum Long Value: "+minLong);
        System.out.println("Maximum Long Value: "+maxLong);

        // Casting
        // byte byteNum = 124;
        // byte newNum = (byte)(byteNum / 2);

        // short shortNum = 468;
        // short newShort = (short)(shortNum / 2);

        byte num01 = 12;
        short num02 = 123;
        int num03 = 1234;
        long num04 = 50000L + 10L + (num01 + num02 + num03);

        System.out.println("Sum and multiplication: "+ num04);

        short num05 = (short)(50000 + 10+ (num01 + num02 + num03));

        short testshort = Short.MAX_VALUE;

        System.out.println("Value after casting"+ num05);
        System.out.println("Maximum value of short: "+testshort);

    }
}
