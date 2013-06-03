package com.tsi11.appcamera;

import android.os.Bundle;
import android.widget.LinearLayout; 
import com.google.ads.*;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {
	private static final String AdMob_Ad_Unit = "a1519ed83da2e3d"; 
	private AdView adView; 

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty ("loadUrlTimeoutValue", 70000);
        super.loadUrl("file:///android_asset/www/index.html");
        super.setIntegerProperty ("loadUrlTimeoutValue", 60000);

        adView = new AdView(this, AdSize.BANNER, AdMob_Ad_Unit); 
        LinearLayout layout = super.root;
        layout.addView(adView); 
        AdRequest request = new AdRequest();
        adView.loadAd(request); 
    }
}
