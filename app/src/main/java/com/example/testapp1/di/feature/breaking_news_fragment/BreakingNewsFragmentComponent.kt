package com.example.testapp1.di.feature.breaking_news_fragment

import com.example.testapp1.feature.breakingNewsFragment.ui.BreakingNewsFragment
import dagger.Component

@Component(modules = [BreakingNewsFragment::class])
interface BreakingNewsFragmentComponent {

    fun injectBreakingNewsFragment(breakingNewsFragment: BreakingNewsFragment)
}