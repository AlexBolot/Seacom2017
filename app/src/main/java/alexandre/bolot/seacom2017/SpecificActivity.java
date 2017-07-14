package alexandre.bolot.seacom2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/*................................................................................................................................
 . Copyright (c)
 .
 . The SpecificActivity	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 14/07/17 02:49
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class SpecificActivity extends AppCompatActivity
{
    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specific_view);
        
        Bundle extras = getIntent().getExtras();
        
        TextView txtHeader = (TextView) findViewById(R.id.txtHeader);
        txtHeader.setText((String) extras.get("Header"));
        
        TextView txtContent = (TextView) findViewById(R.id.txtContent);
        txtContent.setText((String) extras.get("Content"));
        txtContent.setMovementMethod(new ScrollingMovementMethod());
        
    }
}
