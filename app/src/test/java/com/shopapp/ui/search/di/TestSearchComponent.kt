package com.shopapp.ui.search.di

import com.shopapp.ui.search.CategoryListFragment
import com.shopapp.ui.search.SearchFragment
import dagger.Subcomponent

@Subcomponent(modules = [TestSearchModule::class])
interface TestSearchComponent : SearchComponent {

    override fun inject(activity: SearchFragment)

    override fun inject(activity: CategoryListFragment)
}