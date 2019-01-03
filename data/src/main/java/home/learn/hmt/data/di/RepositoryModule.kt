package home.learn.hmt.data.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun providerGSon(): Gson = Gson()
}