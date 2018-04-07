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
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ActorsListFragment extends Fragment {

    private PersonAdapter customAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main_list_view, container, false);

        ListView listPerson = v.findViewById(R.id.main_list_view);
        customAdapter = new PersonAdapter(container.getContext(), R.layout.listitem, PersonKeeper.getInstance().getPersonList());
        listPerson.setAdapter(customAdapter);
        return v;
    }

    public static ActorsListFragment newInstance(String text) {

        ActorsListFragment f = new ActorsListFragment();
        return f;
    }
}

class PersonAdapter extends ArrayAdapter<Person> {

    private Context context;
    List<Person> objects;
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
            view = layoutInflater.inflate(R.layout.listitem, null);
        }

        Button deleteButton = view.findViewById(R.id.row_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remove(getItem(position));
                notifyDataSetChanged();
            }
        });

        Person p = getItem(position);

        if (p != null) {
            TextView tt1 = view.findViewById(R.id.name_row_textView);
            TextView tt2 = view.findViewById(R.id.surname_row_textView);
            TextView tt3 = view.findViewById(R.id.birthDate_row_textView);

            if (tt1 != null) {
                tt1.setText(p.getName());
            }

            if (tt2 != null) {
                tt2.setText(p.getSurname());
            }

            if (tt3 != null) {
                tt3.setText(p.getBirthDate());
            }
        }
        return view;
    }
}
