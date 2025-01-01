import java.util.Scanner;

class UnitConverter 
{
    static double convertLength(double value, String fromUnit, String toUnit) 
	{
        if (fromUnit.equalsIgnoreCase("meter")) {
        } 
		else if (fromUnit.equalsIgnoreCase("kilometer")) 
		{
            value*=1000;
        } 
		else if (fromUnit.equalsIgnoreCase("centimeter")) 
		{
            value/=100;
        }  
		else 
		{
            System.out.println("Unsupported length unit: " + fromUnit);
            return -1;
        }
        if (toUnit.equalsIgnoreCase("meter")) 
		{
            return value;
        } 
		else if (toUnit.equalsIgnoreCase("kilometer")) 
		{
            return value/1000;
        } 
		else if (toUnit.equalsIgnoreCase("centimeter")) 
		{
            return value*100;
        } 
		else 
		{
            System.out.println("Unsupported length unit: " + toUnit);
            return -1;
        }
    }
    static double convertWeight(double value, String fromUnit, String toUnit) 
	{
        if (fromUnit.equalsIgnoreCase("kilogram")) 
		{
        } 
		else if (fromUnit.equalsIgnoreCase("gram")) 
		{
            value/=1000;
        } 
		else 
		{
            System.out.println("Unsupported weight unit: " + fromUnit);
            return -1;
        }
        if (toUnit.equalsIgnoreCase("kilogram")) 
		{
            return value;
        } 
		else if (toUnit.equalsIgnoreCase("gram")) 
		{
            return value*1000;
        } 
		else 
		{
            System.out.println("Unsupported weight unit: " + toUnit);
            return -1;
        }
    }
    static double convertTemperature(double value, String fromUnit, String toUnit) 
	{
        if (fromUnit.equalsIgnoreCase("celsius")) 
		{
            if (toUnit.equalsIgnoreCase("fahrenheit")) 
			{
                return (value*9/5)+32;
            } 
        } 
		else if (fromUnit.equalsIgnoreCase("fahrenheit")) 
		{
            if (toUnit.equalsIgnoreCase("celsius")) 
			{
                return (value-32)*5/9;
            } 
        } 
        if (fromUnit.equalsIgnoreCase(toUnit)) 
		{
            return value;
        }
        System.out.println("Unsupported temperature conversion from " + fromUnit + " to " + toUnit);
        return -1;
    }
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("enter conversion type: ");
        String type = s.nextLine().toLowerCase();
        System.out.print("enter value: ");
        double value = s.nextDouble();
        s.nextLine();
        System.out.print("enter from unit: ");
        String fromUnit = s.nextLine().toLowerCase();
        System.out.print("enter to unit: ");
        String toUnit = s.nextLine().toLowerCase();
        double result = 0;
        if (type.equals("length")) 
		{
            result = convertLength(value, fromUnit, toUnit);
        } 
		else if (type.equals("weight")) 
		{
            result = convertWeight(value, fromUnit, toUnit);
        } 
		else if (type.equals("temperature")) 
		{
            result = convertTemperature(value, fromUnit, toUnit);
        } 
		else 
		{
            System.out.println("Unsupported conversion type: " + type);
            s.close();
            return;
        }
        if (result != -1) 
		{
            System.out.printf("Converted value: %.2f %s\n", result, toUnit);
        }
        s.close();
    }
}