package com.dicoding.yusup.movieku.ui.content

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.R
import com.dicoding.yusup.movieku.databinding.ItemsMovieBinding
import com.dicoding.yusup.movieku.ui.detail.DetailMoActivity

class MoAdapter : RecyclerView.Adapter<MoAdapter.MovieViewHolder>() {

    private var DaftarMovies = ArrayList<DataEntity>()

    fun setMovies(movies: List<DataEntity>) {
        if (movies == null) return
        this.DaftarMovies.clear()
        this.DaftarMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = DaftarMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = DaftarMovies.size

    class MovieViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: DataEntity) {
            with(binding) {
                tvTitle.text = movie.title
                tvGenre.text = movie.gen
                tvDirector.text = movie.dircre
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoActivity::class.java)
                    intent.putExtra(DetailMoActivity.EXTRA_MO, movie.Id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movie.imgPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imagePoster)


            }
        }
    }
}