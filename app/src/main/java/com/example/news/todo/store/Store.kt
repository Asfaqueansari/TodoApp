package com.example.news.todo.store

import androidx.arch.core.util.Function
import com.example.news.todo.model.Action

interface Store<T>{
    fun dispatch(action: Action)

    fun subscribe(renderer:Renderer<T>,func: Function<T,T> = Function{it})
}