package example.com.android_zad2_238292;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MovieActivity extends AppCompatActivity {

    public static void start(Context context, String movieTitle, String movieCategory) {
        Intent starter = new Intent(context, MovieActivity.class);
        starter.putExtra("movieTitle", movieTitle);
        starter.putExtra("movieCategory", movieCategory);
        context.startActivity(starter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
    }
}
