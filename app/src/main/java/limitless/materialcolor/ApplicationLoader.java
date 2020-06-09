package limitless.materialcolor;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

import java.util.Arrays;
import java.util.List;

public class ApplicationLoader extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG){
            List<String> testDeviceIds = Arrays.asList("848A1F9D7BA440BD4EB8D4B832E01D61");
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }
        MobileAds.initialize(getApplicationContext());
    }
}

