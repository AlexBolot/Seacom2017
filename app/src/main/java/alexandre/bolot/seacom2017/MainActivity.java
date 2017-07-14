package alexandre.bolot.seacom2017;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*................................................................................................................................
 . Copyright (c)
 .
 . The MainActivity	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 14/07/17 03:30
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class MainActivity extends AppCompatActivity
{
    HashMap<String, List<String>> days;
    List<String>                  events;
    ExpandableListView            listView;
    EventsAdapter                 adapter;
    Resources                     res;
    
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);
        
        listView = (ExpandableListView) findViewById(R.id.expandListView);
        days = DataProvider.getExtendedListViewData();
        events = new ArrayList<>(days.keySet());
        adapter = new EventsAdapter(this, days, events);
        listView.setAdapter(adapter);
        
        res = getApplicationContext().getResources();
        
        final EditText editText = (EditText) findViewById(R.id.editText);
        
        final String[] eventCodes = res.getStringArray(R.array.eventCodes);
        final String[] eventHeaders = res.getStringArray(R.array.eventHeaders);
        final String[] eventContent = res.getStringArray(R.array.eventContents);
        
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                String header = "";
                String content = "";
                String hcodeValue = editText.getText().toString().trim();
                if(hcodeValue.isEmpty()) return;
                
                for (int i = 0; i < eventCodes.length; i++)
                {
                    if(hcodeValue.equalsIgnoreCase(eventCodes[i]))
                    {
                        header = eventHeaders[i];
                        content = eventContent[i];
                    }
                }
                
                Intent intent = new Intent(MainActivity.this, SpecificActivity.class);
                intent.putExtra("Header", header);
                intent.putExtra("Content", content);
                
                startActivity(intent);
            }
        });
    }
}
