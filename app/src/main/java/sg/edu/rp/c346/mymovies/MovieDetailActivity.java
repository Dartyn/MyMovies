package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 16022667 on 24/7/2017.
 */

public class MovieDetailActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvYear;
    TextView tvGenre;
    TextView tvDesc;
    TextView tvWatched;
    TextView tvTheatre;
    ImageView ivRated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);

        tvTitle = (TextView) findViewById(R.id.textViewTitle);
        tvYear = (TextView) findViewById(R.id.textViewYear);
        tvGenre = (TextView) findViewById(R.id.textViewGenre);
        tvDesc = (TextView) findViewById(R.id.textViewDetails);
        tvWatched = (TextView) findViewById(R.id.textViewWatchedOn);
        tvTheatre = (TextView) findViewById(R.id.textViewTheatre);
        ivRated = (ImageView) findViewById(R.id.imageViewrate);


        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String year = intent.getStringExtra("year");
        String genre = intent.getStringExtra("genre");
        String details = intent.getStringExtra("desc");
        String theatre = intent.getStringExtra("theatre");
        String watch =  intent.getStringExtra("watched");
        String rate =  intent.getStringExtra("rated");
        tvTitle.setText(title);
        tvYear.setText(year);
        tvGenre.setText(genre);;
        tvDesc.setText(details);
        tvWatched.setText(watch);
        tvTheatre.setText(theatre);

        //startActivity(intent);


    }
}