package tech.erichier.spotifylauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null) {
            String data = uri.toString().replaceAll("spotifylauncher://", "");

            Intent spotifyIntent = new Intent(Intent.ACTION_VIEW);
            spotifyIntent.setData(Uri.parse(data));
            spotifyIntent.putExtra(Intent.EXTRA_REFERRER, Uri.parse("android-app://" + getApplicationContext().getPackageName()));
            startActivity(spotifyIntent);

            finishAndRemoveTask();
            System.exit(0);
        }

    }
}
