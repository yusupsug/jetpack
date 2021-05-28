package com.dicoding.yusup.movieku.ui.content

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.yusup.movieku.Entity.DataEntity
import com.dicoding.yusup.movieku.R
import com.dicoding.yusup.movieku.databinding.ItemsTvshowBinding
import com.dicoding.yusup.movieku.ui.detail.DetailTsActivity

class TsAdapter(private val callback: TsFragmentCallback) : RecyclerView.Adapter<TsAdapter.TvShowViewHolder>() {
    private val DaftarTs = ArrayList<DataEntity>()

    fun setTvShow(tvShows: List<DataEntity>) {
        if (tvShows == null) return
        this.DaftarTs.clear()
        this.DaftarTs.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvshowBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvshowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = DaftarTs[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = DaftarTs.size

    inner class TvShowViewHolder(private val binding: ItemsTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: DataEntity) {
            with(binding) {
                tvTitle.text = tvShow.title
                tvGenre.text = tvShow.gen
                tvCreator.text = tvShow.dircre
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTsActivity::class.java)
                    intent.putExtra(DetailTsActivity.EXTRA_TVSHOW, tvShow.Id)
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener { callback.onShareClick(tvShow) }
                Glide.with(itemView.context)
                    .load(tvShow.imgPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error((R.drawable.ic_error))
                    .into(imagePoster)
            }
        }
    }
}
