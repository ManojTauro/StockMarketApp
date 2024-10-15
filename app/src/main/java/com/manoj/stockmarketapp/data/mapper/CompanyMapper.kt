package com.manoj.stockmarketapp.data.mapper

import com.manoj.stockmarketapp.data.domain.model.CompanyListing
import com.manoj.stockmarketapp.data.local.CompanyListingEntity

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}