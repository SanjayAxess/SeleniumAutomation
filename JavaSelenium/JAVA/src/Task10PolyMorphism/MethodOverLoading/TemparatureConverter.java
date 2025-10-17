package Task10PolyMorphism.MethodOverLoading;

public class TemparatureConverter {
    //Celcius to Fahrenheit
    public double convertTemparature(double celcius){
        return  (celcius*9/5)+32;
    }

    //Faherenheit to Celcius
    public double convertTemparature(double fahrenheit,boolean isFahrenheit){
        if(isFahrenheit){
            return (fahrenheit-32)*5/9;
        }else{
            return fahrenheit;
        }
    }

    public double convertTemparature(double celcius,char scale){
        if (scale == 'K') {
            return celcius+273.15;
        }else{
            return celcius;
        }
    }

    public static void main(String[] args) {
        TemparatureConverter temp=new TemparatureConverter();
        System.out.println("38.5\u00B0C in Fahrenheit "+temp.convertTemparature(38.5));
        System.out.println("98.5\u00B0F in Celcius "+temp.convertTemparature(98.5,true));
        System.out.println("45.8\u00B0C in Kelvin "+temp.convertTemparature(45.8,'K'));
    }
}
