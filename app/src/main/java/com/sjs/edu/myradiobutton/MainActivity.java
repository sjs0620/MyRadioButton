package com.sjs.edu.myradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickwidget(View view){
        int id = view.getId();
        String idStrHex = Integer.toHexString(id);
        String text;

        switch(id){
            case R.id.radioButton01:
            case R.id.radioButton02:
                text = ((RadioButton)view).getText().toString();
                text = text + " - " + ((RadioButton)view).isChecked(); break;
            case R.id.CheckBox01:
            case R.id.checkBox02:
                text = ((CheckBox)view).getText().toString();
                text = text + " - " + ((CheckBox)view).isChecked(); break;

            default:
                text = "Nothing";
        }
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
    }
}
