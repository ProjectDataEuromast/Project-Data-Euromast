
package driver;

import java.sql.*;
import java.io.IOException;
import java.net.MalformedURLException;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

import org.json.JSONException;

public class Driver {
    

    public static void main(String[] args) {
        weatherAPICurrent w = new weatherAPICurrent();
        w.run();
    
    }
    }
