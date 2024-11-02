package com.manoj.stockmarketapp.presentation.company.info

import com.manoj.stockmarketapp.domain.model.CompanyInfo
import com.manoj.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfo: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
