package example.com.android_zad2_238292;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieActivity extends FragmentActivity {

    static final String[] MOBILE_OS = new String[]{
            "Android", "iOS", "Windows", "Blackberry"};

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
        ViewPager pager = findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        ImageView posterImageView = findViewById(R.id.movie_poster_image_view);
        TextView movieTitleTextView = findViewById(R.id.movie_title_text_view);
        TextView movieCategoryTextView = findViewById(R.id.movie_category_text_view);

        movieTitleTextView.setText(getIntent().getStringExtra("movieTitle"));
        movieCategoryTextView.setText(getIntent().getStringExtra("movieCategory"));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return ActorsListFragment.newInstance("FirstFragment, Instance 1");
                case 1:
                    return ActorsPhotosFragment.newInstance("SecondFragment, Instance 1");
                default:
                    return ActorsListFragment.newInstance("FirstFragment, Instance 1");
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

/*
        FragmentManager fm = getFragmentManager();

// add
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.your_placehodler, new YourFragment());
// alternatively add it with a tag
// trx.add(R.id.your_placehodler, new YourFragment(), "detail");
        ft.commit();

// replace
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.your_placehodler, new YourFragment());
        ft.commit();

// remove
        Fragment fragment = fm.findFragmentById(R.id.your_placehodler);
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(fragment);
        ft.commit();
*/

}
