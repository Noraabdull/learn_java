import java.lang.instrument.IllegalClassFormatException;
    
public class WeatherNetworks {
    public static void main(String[] args) {

        int temp = 6;  

        String forecast;

        if ( temp >= -15 && temp <= -1 ){
            forecast = "The forcast is FREEZING! Stay home!";
        } else if ( temp >= 0 && temp <= 10 ) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. go outside!";
        }
        System.out.println(forecast);
    }
}

