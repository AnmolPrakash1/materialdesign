package in.co.codewithmike.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.co.codewithmike.R;

public class MaterialDesignMain extends AppCompatActivity implements Moviesadapter.CityAdapterEvents {
    private List<Movies> movieList = new ArrayList<Movies>();
    private RecyclerView recyclerView;
    private Moviesadapter mAdapter;
    private ArrayList<Movies> movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_main);
        initToolbar(); // initialize Toolbar
        recyclerView = findViewById(R.id.recView);

        mAdapter = new Moviesadapter(this, movieList);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

    }

    private void initToolbar() {
        ImageView backArrow = findViewById(R.id.buttonBackArrow);
        TextView toolbarHeading = findViewById(R.id.toolbarHeading);
        toolbarHeading.setText("Material Design");
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void prepareMovieData() {
        movie = new ArrayList<>();

        movieList.add(new Movies(R.drawable.photo_female_1));

        movieList.add(new Movies(R.drawable.photo_singer_female));
        movieList.add(new Movies(R.drawable.photo_female_8));
        movieList.add(new Movies(R.drawable.photo_male_1));
        movieList.add(new Movies(R.drawable.photo_male_2));

        movieList.add(new Movies(R.drawable.photo_male_3));

        movieList.add(new Movies(R.drawable.photo_male_4));
        movieList.add(new Movies(R.drawable.photo_male_5));
        movieList.add(new Movies(R.drawable.photo_male_6));
        movieList.add(new Movies(R.drawable.photo_male_7));
        movieList.add(new Movies(R.drawable.photo_male_8));
        movieList.add(new Movies(R.drawable.photo_singer_male));

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void OnCityClicked(int pos) {
        Toast.makeText(this, "hyyyyyyy" + pos, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MaterialDesignMain.this, Fullimageview.class);
        startActivity(i);

    }
}
