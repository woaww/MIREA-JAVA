package pr3.ShellClasses;

public class Main {
    public static void main(String[] args){
        //Задание 1
        Double doubleObj1 = Double.valueOf(135.27584);
        Double doubleObj2 = Double.valueOf(3.14);
        Double doubleObj3 = Double.valueOf(15.0);

        //Задание 2
        String strNum = "162.254";
        double doubleNum = Double.parseDouble(strNum);

        //Задание 3
        double primitiveDouble = doubleObj2.doubleValue();
        float primitiveFloat = doubleObj2.floatValue();
        int primtiveInt = doubleObj2.intValue();
        long primitiveLong = doubleObj2.longValue();
        short primitiveShort = doubleObj2.shortValue();
        byte primitiveByte = doubleObj2.byteValue();

        //Задание 4
        System.out.println(doubleObj1);

        //Задание 5
        double pi = 3.14;
        String strPi = Double.toString(pi);
    }
}
