package limitless.materialcolor;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import androidx.viewbinding.BuildConfig;

public class ApplicationLoader extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG){
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("1959AA4068493046177228B46CB92270")).build();
            MobileAds.setRequestConfiguration(configuration);
        }
        MobileAds.initialize(getApplicationContext());
    }
}

