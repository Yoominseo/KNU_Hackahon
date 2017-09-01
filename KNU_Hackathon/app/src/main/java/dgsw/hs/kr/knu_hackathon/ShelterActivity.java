package dgsw.hs.kr.knu_hackathon;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ShelterActivity extends AppCompatActivity {

    String shelterstr = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        shelterstr = loadJSONFromAsset();
        Log.e(this.getClass().getName(),shelterstr);
        TextView tv = (TextView) findViewById(R.id.shelter_text);
        tv.setText(shelterstr);
    }

    public String loadJSONFromAsset() {
        String json = null;
        AssetManager assetManager = getResources().getAssets();

        try {
            InputStream is= assetManager.open("전국민방위대피시설표준데이터.json");

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
