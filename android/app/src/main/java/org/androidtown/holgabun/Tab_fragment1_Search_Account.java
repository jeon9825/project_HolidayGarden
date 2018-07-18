package org.androidtown.holgabun;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class Tab_fragment1_Search_Account extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_fragment1_search_account);
    }


    public void onClickedFindId(View v){

        DbOpenHelper h=new DbOpenHelper(Tab_fragment1_Search_Account.this);
        h.open();

        if(h.returnId().equals("not")) {
            Toast.makeText(Tab_fragment1_Search_Account.this, "not", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(Tab_fragment1_Search_Account.this, "ok", Toast.LENGTH_LONG).show();
        }
    }

}
