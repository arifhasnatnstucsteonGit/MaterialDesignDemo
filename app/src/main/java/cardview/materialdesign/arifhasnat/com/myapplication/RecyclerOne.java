package cardview.materialdesign.arifhasnat.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class RecyclerOne extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView= (RecyclerView) findViewById(R.id.recyleOne);

        String a="";
        String b="";
        a.equalsIgnoreCase(b);

        EditText editText= (EditText) findViewById(R.id.editText);
        String editTextString=editText.getText().toString();
        editTextString.equalsIgnoreCase(a);




    }

}
