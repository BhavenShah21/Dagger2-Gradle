package me.amitshekhar.dagger2.di.component

import dagger.Component
import me.amitshekhar.dagger2.di.ActivityScope
import me.amitshekhar.dagger2.di.module.ActivityModule
import me.amitshekhar.dagger2.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}