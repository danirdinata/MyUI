package id.drd.myui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lsView;
    final String[] listOptionStart = {"1. TextView", "2. ImageView", "3. Button", "4. Spinner", "5. Progress Bar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        lsView = (ListView) findViewById(R.id.listView);
        lsView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOptionStart));
        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, TextViewActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ImageViewActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, ProgressBarActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
        super.onStart();
    }
}
