/*package example.com.android_zad2_238292;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class NewPersonActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText surnameInput;
    private EditText birthDateInput;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
*//*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_person);

        nameInput = findViewById(R.id.name_new_person_editText);
        surnameInput = findViewById(R.id.surname_new_person_editText);
        birthDateInput = findViewById(R.id.birthDate_new_person_editText);

        birthDateInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        NewPersonActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = month + "/" + day + "/" + year;
                birthDateInput.setText(date);
            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_new_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.addNewPerson_settings) {
            if (saveData()) {
                setResult(Activity.RESULT_OK,new Intent());
                finish();
                return true;
            } else {
                setResult(Activity.RESULT_CANCELED,new Intent());
                finish();
                return false;
            }
        }setResult(Activity.RESULT_CANCELED,new Intent());

        return false;
    }



    @Override
    public void onBackPressed() {
        setResult(Activity.RESULT_CANCELED,new Intent());
finish();

    }

    private boolean saveData() {
        String name = String.valueOf(nameInput.getText());
        String surname = String.valueOf(surnameInput.getText());
        String date = String.valueOf(birthDateInput.getText());
        if(!(name.isEmpty() || surname.isEmpty() || date.isEmpty())) {
            PersonKeeper.getInstance().getPersonList().add(new Person(name, surname, date));
            return true;
        }
        return false;
    }
}
*/