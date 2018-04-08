package example.com.android_zad2_238292;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import example.com.android_zad2_238292.model.Movie;
import example.com.android_zad2_238292.model.MoviesKeeper;

/**
 * Created by Rafał on 2018-03-24.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private Context ctx;

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitleTextView;
        private TextView mCategoryTextView;
        private ImageView mPosterImageView;

        ViewHolder(View v) {
            super(v);
            mTitleTextView = v.findViewById(R.id.title_text_view);
            mCategoryTextView = v.findViewById(R.id.category_text_view);
            mPosterImageView = v.findViewById(R.id.movie_poster_thumbnail_image_view);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ctx = parent.getContext();
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        Movie movie = MoviesKeeper.getInstance().getMoviesList().get(position);
        holder.mTitleTextView.setText(movie.getTitle());
        holder.mCategoryTextView.setText(movie.getCategory());
        Resources resources = ctx.getResources();
        holder.mPosterImageView.setImageResource(resources.getIdentifier(movie.getImage(), "drawable", ctx.getPackageName()));
    }

    public Movie getItemAtPosition(int position) {
        return MoviesKeeper.getInstance().getMoviesList().get(position);
    }

    @Override
    public int getItemCount() {
        return MoviesKeeper.getInstance().getMoviesList().size();
    }

    public void removeItem(int id) {
        MoviesKeeper.getInstance().getMoviesList().remove(id);
        this.notifyItemRemoved(id);
    }
}
