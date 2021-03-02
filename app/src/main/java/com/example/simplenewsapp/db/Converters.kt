package com.example.simplenewsapp.db

import androidx.room.TypeConverter
import com.example.simplenewsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSourceToString(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun fromStringToSource(name: String): Source {
        return Source(name, name)
    }
}