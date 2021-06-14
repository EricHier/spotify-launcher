package tech.erichier.spotifylauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String data = intent.getData().toString().replaceAll("spotifylauncher://", "");

        Intent spotifyIntent = new Intent(Intent.ACTION_VIEW);
        spotifyIntent.setData(Uri.parse(data));
        spotifyIntent.putExtra(Intent.EXTRA_REFERRER, Uri.parse("android-app://" + getApplicationContext().getPackageName()));
        startActivity(spotifyIntent);

        finishAndRemoveTask();
        System.exit(0);
    }
}
