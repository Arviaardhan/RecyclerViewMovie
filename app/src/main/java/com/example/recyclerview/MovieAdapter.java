package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private Context context;
    private List<MovieModel> movieList;
    private MovieAdapterListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvname, tvrilis, tvgenre, tvduration;
        public ImageView imgView;

        public MyViewHolder(View view) {
            super(view);
            tvname = view.findViewById(R.id.tvname);
            tvrilis = view.findViewById(R.id.tvrilis);
            tvgenre = view.findViewById(R.id.tvgenre);
            tvduration = view.findViewById(R.id.tvduration);
            imgView = view.findViewById(R.id.imgView);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // send selected contact in callback
                    listener.onContactSelected(movieList.get(getAdapterPosition()));
                }
            });
        }
    }

    public MovieAdapter(Context context, List<MovieModel> movieList, MovieAdapterListener listener) {
        this.context = context;
        this.movieList = movieList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
        final MovieModel contact = this.movieList.get(position);
        holder.tvname.setText(contact.getName());
        holder.tvrilis.setText(contact.getRilis());
        holder.tvgenre.setText(contact.getGenre());
        holder.tvduration.setText(contact.getDuration());
        holder.imgView.setImageResource(contact.getImage());
    }

    @Override
    public int getItemCount() {
        return this.movieList.size();
    }

    public interface MovieAdapterListener {
        void onContactSelected(MovieModel contact);
    }

}
