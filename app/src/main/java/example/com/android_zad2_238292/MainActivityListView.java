/*package example.com.android_zad2_238292;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity {

    private PersonAdapter customAdapter;
*/
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);

        ListView listPerson = findViewById(R.id.main_list_view);
        customAdapter = new PersonAdapter(this, R.layout.listitem, PersonKeeper.getInstance().getPersonList());
        listPerson.setAdapter(customAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0)
            if(resultCode == Activity.RESULT_OK)
                customAdapter.add(PersonKeeper.getInstance().getPersonList().get(PersonKeeper.getInstance().getPersonList().size()-1));
    }
}

class PersonAdapter extends ArrayAdapter<Person> {

    PersonAdapter(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater;
            layoutInflater = LayoutInflater.from(getContext());
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
}*/