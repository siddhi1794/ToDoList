package com.example.siddhipatil.to_do1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by siddhipatil on 9/29/17.
 */

public class CustomAdapter extends ArrayAdapter<toDo> {
    Context context;

    public CustomAdapter(Context context, ArrayList<toDo> names) {
        super(context, R.layout.check_list, names);
        this.context=context;
    }


    public void remove(int position) {
        remove(getItem(position));
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view1 = layoutInflater.inflate(R.layout.check_list, parent, false);

        toDo itemPos = getItem(position);

        TextView viewTitle = (TextView) view1.findViewById(R.id.idTaskTitle);
        TextView viewDesc = (TextView) view1.findViewById(R.id.idTaskDesc);
        final CheckBox checkBox = (CheckBox) view1.findViewById(R.id.idCheckBox);

        viewTitle.setText(itemPos.getTaskTitle());
        viewDesc.setText(itemPos.getTaskDesc());

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    remove(position);

                }

            }
        });

        return view1;




    }
}
