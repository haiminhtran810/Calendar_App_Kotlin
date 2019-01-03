package home.learn.hmt.data.di.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import home.learn.hmt.data.di.scheduler.AppSchedulerProvider
import home.learn.hmt.domain.scheduler.SchedulerProvider
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun providerGSon(): Gson = Gson()

    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulerProvider {
        return AppSchedulerProvider()
    }
}