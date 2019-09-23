package com.example.news.todo.store

import androidx.lifecycle.LiveData

interface Renderer<T> {
    fun render(model:LiveData<T>)
}