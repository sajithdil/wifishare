package wifisharer.iit.com.wifisharer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import wifisharer.iit.com.wifisharer.util.WifiAPController;
import wifisharer.iit.com.wifisharer.util.WifiConnectorClass;

public class ShareWifiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_wifi);



        Button btnShare = (Button) findViewById(R.id.btnShare);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                WifiManager wifiManager = (WifiManager) context .getSystemService(Context.WIFI_SERVICE);

                WifiAPController wifiAPController  = new WifiAPController();
                wifiAPController.wifiToggle("mHotspot", "12345678", wifiManager, context);
            }
        });

        Button btnConnect = (Button) findViewById(R.id.btnConnect);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiConnectorClass c = new WifiConnectorClass();
                c.connect(getApplicationContext());
            }
        });
    }
}
