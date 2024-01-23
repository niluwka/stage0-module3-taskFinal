package lang.print.gaps.finalModuleTask;

public class DivisionByZero {
    public static void main(String[] args) {

        try {
            divisionByZero(3);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    static void divisionByZero (int number)
    {
        int z = number/0;
        System.out.println(z);


    }
}
