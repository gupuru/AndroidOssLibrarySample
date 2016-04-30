package gupuru.osslibraysample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import gupuru.scaleanimation.ScaleAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.text_view);
        new ScaleAnimation().start(view);

    }
}
