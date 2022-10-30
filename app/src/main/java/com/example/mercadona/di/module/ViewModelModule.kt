package com.example.mercadona.di.module

import com.example.mercadona.domain.GetFilmsUseCase
import com.example.mercadona.ui.viewmodel.FilmViewModel
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {

    @Provides
    fun filmViewModel(getFilmsUseCase: GetFilmsUseCase) =
        FilmViewModel(getFilmsUseCase)

}