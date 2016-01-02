package cardview.materialdesign.arifhasnat.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

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

    public static void getData(){

        List<Items> data=new ArrayList<>();
        int[] icons={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery,R.drawable.ic_menu_manage,R.drawable.ic_menu_send};
        String[] title={"arif "," hasnat ","loves ", "you "};
        for (int i = 0; i < title.length && i< icons.length; i++) {
            Items items=new Items();
            items.iconId=icons[i];
            items.title=title[i];
            data.add(items);

        }



    }

}
