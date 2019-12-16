package in.co.codewithmike.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import in.co.codewithmike.R;

public class Moviesadapter extends RecyclerView.Adapter<Moviesadapter.MyViewHolder> {
    private List<Movies> moviesList;
    private CityAdapterEvents cityAdapterEvents;

    public Moviesadapter(CityAdapterEvents cityAdapterEvents, List<Movies> moviesList) {
        this.cityAdapterEvents = cityAdapterEvents;
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list, parent, false);

        return new MyViewHolder(itemView, cityAdapterEvents);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movies movie = moviesList.get(position);
        holder.img.setImageResource(movie.getImg());


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public interface CityAdapterEvents {
        void OnCityClicked(int pos);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView img;
        public CityAdapterEvents cityAdapterEvents;


        public MyViewHolder(View itemView, CityAdapterEvents cityAdapterEvents) {
            super(itemView);
            img = itemView.findViewById(R.id.female);

            this.cityAdapterEvents = cityAdapterEvents;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            cityAdapterEvents.OnCityClicked(getAdapterPosition());

        }
    }

}
