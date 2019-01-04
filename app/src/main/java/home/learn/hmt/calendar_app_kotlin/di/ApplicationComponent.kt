package home.learn.hmt.calendar_app_kotlin.di

import dagger.Component
import home.learn.hmt.calendar_app_kotlin.CalendarApp
import home.learn.hmt.data.di.NetworkModule
import home.learn.hmt.data.di.RepositoryModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetworkModule::class,
    RepositoryModule::class,
    InteractorsModule::class,
    MappersModule::class])
interface ApplicationComponent {
    fun inject(app: CalendarApp)
}