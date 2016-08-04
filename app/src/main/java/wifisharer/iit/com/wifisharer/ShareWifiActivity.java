package wifisharer.iit.com.wifisharer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wifisharer.iit.com.wifisharer.util.WifiAPController;

public class ShareWifiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_wifi);

        Context context = getApplicationContext();
        WifiManager wifiManager = (WifiManager) context .getSystemService(Context.WIFI_SERVICE);

        WifiAPController wifiAPController  = new WifiAPController();
        wifiAPController.wifiToggle("mHotspot", "12345678", wifiManager, context);
    }
}
