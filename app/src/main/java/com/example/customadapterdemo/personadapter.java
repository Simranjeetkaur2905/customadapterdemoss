package com.example.customadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class personadapter extends ArrayAdapter {


    private List<Person> persons;

    private final LayoutInflater layoutInflater;
    private final int layoutresources;


    public personadapter(@NonNull Context context, int resource, List<Person> persons) {
        super(context, resource);
        this.persons = persons;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutresources = resource;


    }

    @Override
    public int getCount() {
        return persons.size();
    }
//for inheriting the array adapter theses two func used


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null)
            v = layoutInflater.inflate(layoutresources, parent ,false);

        TextView nametext = v.findViewById(R.id.name);
        TextView idtext = v.findViewById((R.id.id));
        TextView emailtext = v.findViewById(R.id.email);

        nametext.setText(persons.get(position).name);
        idtext.setText(String.valueOf(persons.get(position).id));
       emailtext.setText(persons.get(position).email);
       return v;
    }
}

