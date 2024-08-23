package me.amitshekhar.dagger2.di.component

import android.content.Context
import dagger.Component
import me.amitshekhar.dagger2.NewsApplication
import me.amitshekhar.dagger2.data.api.NetworkService
import me.amitshekhar.dagger2.data.repository.TopHeadlineRepository
import me.amitshekhar.dagger2.di.ApplicationContext
import me.amitshekhar.dagger2.di.module.ApplicationModule
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