package com.dantalian.todoapp.di

import android.app.Application
import androidx.room.Room
import com.dantalian.todoapp.data.TodoDatabase
import com.dantalian.todoapp.data.TodoRepository
import com.dantalian.todoapp.data.TodoRepositoryImple
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImple(db.dao)
    }
}