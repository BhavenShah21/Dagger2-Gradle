package me.amitshekhar.newsapp.di.component

import android.content.Context
import dagger.Component
import me.amitshekhar.newsapp.NewsApplication
import me.amitshekhar.newsapp.data.api.NetworkService
import me.amitshekhar.newsapp.data.repository.TopHeadlineRepository
import me.amitshekhar.newsapp.di.ApplicationContext
import me.amitshekhar.newsapp.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}