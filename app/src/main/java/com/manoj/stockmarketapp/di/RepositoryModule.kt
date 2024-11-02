package com.manoj.stockmarketapp.di

import com.manoj.stockmarketapp.csv.CSVParser
import com.manoj.stockmarketapp.csv.CompanyListingParser
import com.manoj.stockmarketapp.csv.IntradayInfoParser
import com.manoj.stockmarketapp.data.remote.StockRepositoryImpl
import com.manoj.stockmarketapp.domain.model.CompanyListing
import com.manoj.stockmarketapp.domain.model.IntradayInfo
import com.manoj.stockmarketapp.domain.repo.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>


    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}