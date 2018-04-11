package example.com.android_zad2_238292;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class ActorsPhotosFragment extends Fragment {

    GridView gridView;

    static final String[] PICTURES = new String[]{
            "p1", "p2", "p3", "p4", "p5", "p6"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.actors_photos_fragment, container, false);

        gridView = v.findViewById(R.id.gridView);

        gridView.setAdapter(new PhotoAdapter(container.getContext(), PICTURES));

        return v;
    }

    public static ActorsPhotosFragment newInstance() {
        return new ActorsPhotosFragment();
    }
}
