package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoMovies> toDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView) findViewById(R.id.listViewMovie);
        toDoList = new ArrayList<ToDoMovies>();

        caToDo = new CustomAdapter(this, R.layout.todomovies_row, toDoList);
        lvToDo.setAdapter(caToDo);


        Calendar d1 = Calendar.getInstance();
        d1.set(15, 11, 2014);
        Calendar d2 = Calendar.getInstance();
        d2.set(15, 5, 2015);

        ToDoMovies item1 = new ToDoMovies("The Avengers", "2012 - ", "pg13", "Action | Sci-Fi", d1, "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        toDoList.add(item1);
        ToDoMovies item2 = new ToDoMovies("Planes", "2013 - ", "pg", "Animation | Comedy", d2, "Cathay - AMK Hub", "Description\tNick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.\tA crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        toDoList.add(item2);

     lvToDo.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){


                Intent intent = new Intent(getBaseContext(), MovieDetailActivity.class);
                ToDoMovies movieTime = toDoList.get(position);


                intent.putExtra("title", movieTime.getTitle());
                intent.putExtra("year", movieTime.getYear());
                intent.putExtra("genre", movieTime.getGenre());
                intent.putExtra("desc", movieTime.getDetails());
                intent.putExtra("theatre", movieTime.getTheatre());
                intent.putExtra("watched", movieTime.getWatchedOn());
                intent.putExtra("rated", movieTime.getType());
                intent.putExtra("position", position);
                startActivity(intent);
        }


        });


    }
}
