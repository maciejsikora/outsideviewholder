package maciejsikora.com.outsideviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

/**
 * This example app show usage outside ViewHolder in RecyclerView.Adapter
 */
public class MainActivity extends AppCompatActivity {

    private Adapter adapter;
    private RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> data=new ArrayList<>();

        //fill item list for example
        for (int i=0; i<100; i++)
        data.add((i+1)+" list text");

        //usage adapter
        adapter=new Adapter(data);
        list=( RecyclerView)findViewById(R.id.list);
        list.setAdapter(adapter);

        LinearLayoutManager linear=new LinearLayoutManager(this);
        list.setLayoutManager(linear);

    }
}
