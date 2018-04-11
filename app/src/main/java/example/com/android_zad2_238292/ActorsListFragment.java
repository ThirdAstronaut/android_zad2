package example.com.android_zad2_238292;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import example.com.android_zad2_238292.model.Person;
import example.com.android_zad2_238292.model.PersonKeeper;

public class ActorsListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.actors_list_view, container, false);

        ListView listPerson = v.findViewById(R.id.main_list_view);
        PersonAdapter customAdapter = new PersonAdapter(container.getContext(), R.layout.actors_list_view_item, PersonKeeper.getInstance().getPersonList());
        listPerson.setAdapter(customAdapter);
        return v;
    }

    public static ActorsListFragment newInstance() {
        return new ActorsListFragment();
    }
}

class PersonAdapter extends ArrayAdapter<Person> {

    private Context context;
    private List<Person> objects;

    PersonAdapter(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater;
            layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.actors_list_view_item, null);
        }


        Person p = getItem(position);

        if (p != null) {
            TextView tt1 = view.findViewById(R.id.name_row_textView);
            TextView tt2 = view.findViewById(R.id.birthDate_row_textView);

            if (tt1 != null) {
                String name = p.getName()+" "+p.getSurname();
                tt1.setText(name);
            }

            if (tt2 != null) {
                tt2.setText(p.getBirthDate());
            }
        }
        return view;
    }
}
