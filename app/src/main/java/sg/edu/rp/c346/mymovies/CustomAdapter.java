package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16022667 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<ToDoMovies> toDoMovies;

    public CustomAdapter(Context context, int resource,
                         ArrayList<ToDoMovies> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoMovies = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = (TextView) rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = (TextView) rowView.findViewById(R.id.textViewGenre);
        ImageView ivImpt = (ImageView) rowView.findViewById(R.id.imageView2);

        // Obtain the to-do item based on the 'position'.
        ToDoMovies currentItem = toDoMovies.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());

        if (currentItem.getType().equalsIgnoreCase("pg13")){
            ivImpt.setImageResource(R.drawable.rating_pg13);
        }else if(currentItem.getType().equalsIgnoreCase("pg")){
            ivImpt.setImageResource(R.drawable.rating_pg);
        }else if(currentItem.getType().equalsIgnoreCase("pgm18")){
            ivImpt.setImageResource(R.drawable.rating_m18);
        }else if(currentItem.getType().equalsIgnoreCase("nc16")){
            ivImpt.setImageResource(R.drawable.rating_nc16);
        }else if(currentItem.getType().equalsIgnoreCase("r21")) {
            ivImpt.setImageResource(R.drawable.rating_r21);
        }else if (currentItem.getType().equalsIgnoreCase("g")){
            ivImpt.setImageResource(R.drawable.rating_g);
        }


        return rowView;
    }
}
