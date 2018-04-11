package example.com.android_zad2_238292;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieActivity extends FragmentActivity {

    public static void start(Context context, String movieTitle, String movieCategory, String moviePoster) {
        Intent starter = new Intent(context, MovieActivity.class);
        starter.putExtra("movieTitle", movieTitle);
        starter.putExtra("movieCategory", movieCategory);
        starter.putExtra("moviePoster", moviePoster);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ViewPager pager = findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        ImageView posterImageView = findViewById(R.id.movie_poster_image_view);
        TextView movieTitleTextView = findViewById(R.id.movie_title_text_view);
        TextView movieCategoryTextView = findViewById(R.id.movie_category_text_view);

        movieTitleTextView.setText(getIntent().getStringExtra("movieTitle"));
        movieCategoryTextView.setText(getIntent().getStringExtra("movieCategory"));
        Resources resources = getApplicationContext().getResources();
        posterImageView.setImageResource(resources.getIdentifier(getIntent().getStringExtra("moviePoster"), "drawable", getApplicationContext().getPackageName()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return ActorsListFragment.newInstance();
                case 1:
                    return ActorsPhotosFragment.newInstance();
                default:
                    return ActorsListFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
