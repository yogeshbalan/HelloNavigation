package in.ac.dtu.hellonavigation.tools;

import android.app.SearchManager;
import android.provider.BaseColumns;

public class Config {

    //Things to do before building the app:
    // - insert valid GoogleMapsAPI-Key in AndroidManifest.xml
    // - set debugMode = false in Config.java

    //app-Rate Dialog
    public final static String APP_PNAME = "com.ilm.sandwich";
    public final static int DAYS_UNTIL_PROMPT = 2; // 2
    public final static int LAUNCHES_UNTIL_PROMPT = 3; // 3
    // places and mapquest api
    public static final String PLACES_API_URL = "https://maps.googleapis.com/maps/api/place";
    public static final String PLACES_API_KEY = "AIzaSyBCaNujZMAS8hD3H62PxhFhJIUrF-UYBsg";
    public static final String[] COLUMNS = {BaseColumns._ID, SearchManager.SUGGEST_COLUMN_TEXT_1,};
    public static final String MAPQUEST_API_KEY = "LmDKYpSaJgAAGod38NCI4UL4ZJEe8E3h";
    // statistics
    public static final String API_URL = "http://5.39.91.189:3000/users";
    //debug
    public static boolean debugMode = false;
    //google or OSM
    public static boolean usingGoogleMaps;
    public static int PLACES_API_FALLBACK = 0;
    public static float meanAclFreq = 0;
    public static float meanMagnFreq = 0;
    public static boolean backgroundServiceUsed = false;
    public static long startTime = 0;

    //other
    public static boolean backgroundServiceActive = false;


}
