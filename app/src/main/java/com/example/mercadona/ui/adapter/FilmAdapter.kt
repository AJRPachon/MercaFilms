package com.example.mercadona.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mercadona.R
import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.databinding.FilmsFragmentFilmsRowBinding

class FilmAdapter(val listener: FilmCallBack.OnFilmClickListener) : ListAdapter<FilmBo, FilmAdapter.FilmViewHolder>(FilmCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder =
        FilmViewHolder(FilmsFragmentFilmsRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false))


    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FilmViewHolder(private val binding: FilmsFragmentFilmsRowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(filmBo: FilmBo){

            Glide.with(itemView.context)
                .load(filmBo.image)
                .error(R.drawable.ic_launcher_background)
                .into(binding.filmRowImgFilmPicture)

            binding.filmRowLblFilmDirectorValue.text = filmBo.director ?: ""
            binding.filmRowLblFilmRtScoreValue.text = filmBo.rtScore ?: ""
            binding.filmRowLblFilmTitleValue.text = filmBo.title ?: ""


            binding.filmRowImgDeleteButton.setOnClickListener {
                filmBo.id?.let { id -> listener.onDeleteClicked(id) }
            }
            binding.filmRowContainer.setOnClickListener {
                filmBo.id?.let { id -> listener.onFilmClicked(id) }
            }

        }
    }

}

class FilmCallBack : DiffUtil.ItemCallback<FilmBo>() {
    override fun areItemsTheSame(oldItem: FilmBo, newItem: FilmBo): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: FilmBo, newItem: FilmBo): Boolean {
        return oldItem == newItem
    }

    interface OnFilmClickListener {
        fun onFilmClicked(filmId : String)
        fun onDeleteClicked(filmId : String)
    }

}