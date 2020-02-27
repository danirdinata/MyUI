package id.drd.myui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }
    public void toBlack(View v) {
        View someView = findViewById(R.id.layoutBtn);
        View root = someView.getRootView();
        root.setBackgroundColor(getResources().getColor(android.R.color.black));
    }

    public void toBlue(View v) {
        View someView = findViewById(R.id.layoutBtn);
        View root = someView.getRootView();
        root.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
    }

    public void toRed(View v) {
        View someView = findViewById(R.id.layoutBtn);
        View root = someView.getRootView();
        root.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
    }
}
