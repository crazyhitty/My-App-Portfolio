package com.crazyhitty.chdev.ks.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind butterknife to this activity
        ButterKnife.bind(this);

        //set toolbar
        setSupportActionBar(toolbar);
    }

    @OnClick(R.id.button_spotify_streamer)
    public void onSpotifyStreamerClick() {
        showToast("Spotify streamer");
    }

    @OnClick(R.id.button_scores_app)
    public void onScoresAppClick() {
        showToast("Scores");
    }

    @OnClick(R.id.button_library_app)
    public void onLibraryAppClick() {
        showToast("Library");
    }

    @OnClick(R.id.button_build_it_bigger)
    public void onBuildItBiggerClick() {
        showToast("Build it bigger");
    }

    @OnClick(R.id.button_xyz_reader)
    public void onXYZReaderClick() {
        showToast("XYZ Reader");
    }

    @OnClick(R.id.button_capstone)
    public void onCapstoneClick() {
        showToast("Capstone");
    }

    private void showToast(String appName) {
        String toastMsg = "This button will launch my " + appName + " app!";
        Toast.makeText(MainActivity.this, toastMsg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "Not yet implemented :(", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
