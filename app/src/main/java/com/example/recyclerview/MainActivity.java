package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MovieAdapter.MovieAdapterListener {
    RecyclerView rvMovieName;
    ArrayList<MovieModel> listDataMovie;
    private MovieAdapter adapterListMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDataMovie = new ArrayList<>();
        rvMovieName = findViewById(R.id.rvMovieName);

        MovieModel movieOne = new MovieModel();
        movieOne.setName("Warkop DKI Reborn: Jangkrik Boss!");
        movieOne.setRilis("Release : 8 September 2016");
        movieOne.setGenre("Genre : Comedy");
        movieOne.setDuration("Duration : 1h 50m");
        movieOne.setImage(R.mipmap.warkopdki);
        listDataMovie.add(movieOne);

        MovieModel movieTwo = new MovieModel();
        movieTwo.setName("Kung Fu Hustle");
        movieTwo.setRilis("Release : 23 December 2004");
        movieTwo.setGenre("Genre : Comedy, Crime, Action");
        movieTwo.setDuration("Duration : 1h 39m");
        movieTwo.setImage(R.mipmap.kungfuhustle);
        listDataMovie.add(movieTwo);

        MovieModel movieThree = new MovieModel();
        movieThree.setName("Harry Potter and the Philosopher's Stone");
        movieThree.setRilis("Release : December 19, 2001");
        movieThree.setGenre("Genre : Fantasy, Adventure");
        movieThree.setDuration("Duration : 2h 32m");
        movieThree.setImage(R.mipmap.harrypotter1);
        listDataMovie.add(movieThree);

        MovieModel movieFour = new MovieModel();
        movieFour.setName("Harry Potter and the Chamber of Secrets");
        movieFour.setRilis("Release : November 3, 2002");
        movieFour.setGenre("Genre : Fantasy, Adventure");
        movieFour.setDuration("Duration : 2h 41m");
        movieFour.setImage(R.mipmap.harrypotter2);
        listDataMovie.add(movieFour);

        MovieModel movieFive = new MovieModel();
        movieFive.setName("Harry Potter and the Prisoner of Azkaban");
        movieFive.setRilis("Release : June 16, 2004");
        movieFive.setGenre("Genre : Fantasy, Adventure");
        movieFive.setDuration("Duration : 2h 22m");
        movieFive.setImage(R.mipmap.harrypotter3);
        listDataMovie.add(movieFive);

        MovieModel moviesix = new MovieModel();
        moviesix.setName("Harry Potter and the Goblet of Fire");
        moviesix.setRilis("Release : November 18, 2005");
        moviesix.setGenre("Genre : Fantasy, Adventure");
        moviesix.setDuration("Duration : 2h 37m");
        moviesix.setImage(R.mipmap.harrypotter4);
        listDataMovie.add(moviesix);

        MovieModel movieSeven = new MovieModel();
        movieSeven.setName("Harry Potter and the Order of the Phoenix");
        movieSeven.setRilis("Release : July 11, 2007");
        movieSeven.setGenre("Genre : Fantasy, Adventure");
        movieSeven.setDuration("Duration : 2h 18m");
        movieSeven.setImage(R.mipmap.harrypotter5);
        listDataMovie.add(movieSeven);

        MovieModel movieEight = new MovieModel();
        movieEight.setName("Harry Potter and the Half-Blood Prince");
        movieEight.setRilis("Release : July 15, 2009");
        movieEight.setGenre("Genre : Fantasy, Adventure");
        movieEight.setDuration("Duration : 2h 33m");
        movieEight.setImage(R.mipmap.harrypotter6);
        listDataMovie.add(movieEight);

        MovieModel movieNine = new MovieModel();
        movieNine.setName("Harry Potter and the Deathly Hallows – Part 1");
        movieNine.setRilis("Release : November 19, 2010");
        movieNine.setGenre("Genre : Fantasy, Adventure");
        movieNine.setDuration("Duration : 2h 26m");
        movieNine.setImage(R.mipmap.harrypotter7);
        listDataMovie.add(movieNine);

        MovieModel movieTen = new MovieModel();
        movieTen.setName("Harry Potter and the Deathly Hallows: Part 2");
        movieTen.setRilis("Release : July 15, 2011");
        movieTen.setGenre("Genre : Fantasy, Adventure");
        movieTen.setDuration("Duration : 2h 10m");
        movieTen.setImage(R.mipmap.harrypotter8);
        listDataMovie.add(movieTen);

        adapterListMovie = new MovieAdapter(this, listDataMovie,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvMovieName.setHasFixedSize(true);
        rvMovieName.setLayoutManager(mLayoutManager);
        rvMovieName.setAdapter(adapterListMovie);
    }

    @Override
    public void onContactSelected(MovieModel contact) {
        Toast.makeText(this, "selected name "+contact.getName(), Toast.LENGTH_SHORT).show();
    }
}