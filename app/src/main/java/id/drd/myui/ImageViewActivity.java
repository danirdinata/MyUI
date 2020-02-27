package id.drd.myui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
    }

    public void loadGithub(View v) {
        String url = "@drawable/github";
        int imageResource = getResources().getIdentifier(url,null, getPackageName());
        ImageView imageView = (ImageView)findViewById(R.id.iV);
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);
    }

    public void loadCodepen(View v) {
        String url = "@drawable/codepen";
        int imageResource = getResources().getIdentifier(url, null, getPackageName());
        ImageView imageView = (ImageView)findViewById(R.id.iV);
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);
    }
}
