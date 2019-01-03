package home.learn.hmt.calendar_app_kotlin.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideAppContext(app: Application): Context = app
}