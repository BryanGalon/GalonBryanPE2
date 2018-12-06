package bryan.galon.com.galonbryanpe2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GalonBryanPE2 extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    TextView name;
    TextView age;
    TextView gender;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Age = "ageKey";
    public static final String Gender = "genderKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galon_bryan_pe2);
        name = (TextView) findViewById(R.id.etName);
        age = (TextView) findViewById(R.id.etAge);
        gender = (TextView) findViewById(R.id.etGender);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Age)) {
            age.setText(sharedpreferences.getString(Age, ""));

        }
        if (sharedpreferences.contains(String.valueOf(Gender))) {
            gender.setText(sharedpreferences.getString(Gender, ""));

        }
    }

    public void Save(View view) {
        String n = name.getText().toString();
        String e = age.getText().toString();
        String g = gender.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(Age, e);
        editor.putString(Gender, g);
        editor.commit();
    }



    public void Get(View view) {
        name = (TextView) findViewById(R.id.etName);
        age = (TextView) findViewById(R.id.etAge);
        gender = (TextView) findViewById(R.id.etGender);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Age)) {
            age.setText(sharedpreferences.getString(Age, ""));

        }if (sharedpreferences.contains(Gender)) {
            gender.setText(sharedpreferences.getString(Age, ""));

        }
    }




}
