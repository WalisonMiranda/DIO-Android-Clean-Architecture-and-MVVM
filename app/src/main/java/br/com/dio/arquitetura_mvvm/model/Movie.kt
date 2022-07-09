package br.com.dio.arquitetura_mvvm.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val id: Int,
    val title: String,
    val image: String?,
    val genre: String?,
    val description: String?,
    @SerializedName("data_lancamento")
    val releaseYear: String?
): Parcelable
