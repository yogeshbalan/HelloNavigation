package in.ac.dtu.hellonavigation;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Window;

import in.ac.dtu.hellonavigation.tools.Config;


public class GoogleMapActivity extends FragmentActivity {

    public static boolean backgroundServiceShallBeOnAgain = false;
    public static Handler listHandler;
    public static Handler changeSuggestionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature((int) Window.FEATURE_ACTION_BAR_OVERLAY);
        super.onCreate(savedInstanceState);
        Config.usingGoogleMaps = true;
        setContentView(R.layout.googlemap_layout);
    }


}