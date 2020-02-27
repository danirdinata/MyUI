package id.drd.myui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
    }

    public void helloSAB(View v) {
        TextView tvHelloSAB = (TextView)findViewById(R.id.tvHello);
        tvHelloSAB.setText("Hello SAB");
    }

    public void helloWorld(View v) {
        TextView tvHelloWorld = (TextView)findViewById(R.id.tvHello);
        tvHelloWorld.setText("Hello World");
    }
}
