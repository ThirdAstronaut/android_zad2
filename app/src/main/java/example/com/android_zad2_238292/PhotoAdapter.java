package example.com.android_zad2_238292;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class PhotoAdapter extends BaseAdapter {
    private Context context;
    private final String[] movieActors;

    PhotoAdapter(Context context, String[] movieActors) {
        this.context = context;
        this.movieActors = movieActors;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = inflater.inflate(R.layout.actors_photos_fragment_details, null);

            ImageView imageView = gridView.findViewById(R.id.grid_item_image);

            String actor = movieActors[position];

            switch (actor) {
                case "p1":
                    imageView.setImageResource(R.drawable.movie1);
                    break;
                case "p2":
                    imageView.setImageResource(R.drawable.movie2);
                    break;
                case "p3":
                    imageView.setImageResource(R.drawable.movie3);
                    break;
                case "p4":
                    imageView.setImageResource(R.drawable.movie4);
                    break;
                case "p5":
                    imageView.setImageResource(R.drawable.movie5);
                    break;
                default:
                    imageView.setImageResource(R.drawable.movie6);
                    break;
            }

        } else {
            gridView = convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return movieActors.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}