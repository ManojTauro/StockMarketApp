package com.manoj.stockmarketapp.data.mapper

import com.manoj.stockmarketapp.domain.model.CompanyListing
import com.manoj.stockmarketapp.data.local.CompanyListingEntity
import com.manoj.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.manoj.stockmarketapp.domain.model.CompanyInfo

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

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}