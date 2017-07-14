package alexandre.bolot.seacom2017;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/*................................................................................................................................
 . Copyright (c)
 .
 . The EventsAdapter	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 14/07/17 02:49
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class EventsAdapter extends BaseExpandableListAdapter
{
    private Context                       context;
    private HashMap<String, List<String>> days;
    private List<String>                  events;
    
    public EventsAdapter (Context context, HashMap<String, List<String>> days, List<String> events)
    {
        this.context = context;
        this.days = days;
        this.events = events;
    }
    
    @Override
    public int getGroupCount ()
    {
        return events.size();
    }
    
    @Override
    public int getChildrenCount (int groupPosition)
    {
        return days.get(events.get(groupPosition)).size();
    }
    
    @Override
    public Object getGroup (int groupPosition)
    {
        return events.get(groupPosition);
    }
    
    @Override
    public Object getChild (int groupPosition, int childPosition)
    {
        return days.get(events.get(groupPosition)).get(childPosition);
    }
    
    @Override
    public long getGroupId (int groupPosition)
    {
        return groupPosition;
    }
    
    @Override
    public long getChildId (int groupPosition, int childPosition)
    {
        return childPosition;
    }
    
    @Override
    public boolean hasStableIds ()
    {
        return false;
    }
    
    @Override
    public View getGroupView (int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
    {
        String groupTitle = (String) getGroup(groupPosition);
        
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_layout, parent, false);
        }
        
        TextView txtParent = (TextView) convertView.findViewById(R.id.txtParent);
        txtParent.setTypeface(null, Typeface.BOLD);
        txtParent.setText(groupTitle);
        
        return convertView;
    }
    
    @Override
    public View getChildView (int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
    {
        String childTitle = (String) getChild(groupPosition, childPosition);
        
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_layout, parent, false);
        }
        
        TextView txtChild = (TextView) convertView.findViewById(R.id.txtChild);
        txtChild.setText(childTitle);
        
        return convertView;
    }
    
    @Override
    public boolean isChildSelectable (int groupPosition, int childPosition)
    {
        return false;
    }
}
