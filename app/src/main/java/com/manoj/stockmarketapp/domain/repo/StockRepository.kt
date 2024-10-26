package com.manoj.stockmarketapp.domain.repo

import com.manoj.stockmarketapp.domain.model.CompanyListing
import com.manoj.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}