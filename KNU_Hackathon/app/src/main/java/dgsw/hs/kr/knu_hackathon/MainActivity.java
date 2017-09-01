package dgsw.hs.kr.knu_hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView v1 = (TextView)findViewById(R.id.click);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext() , MapsActivity.class);

                double [] LatLon = {37.540705, 126.956764,
                                    -34,151};

                intent.putExtra("latlon",LatLon);
                startActivity(intent);
            }
        });
    }
}
