package com.madiyar.countries.presentation.ui_common

import com.madiyar.domain.model.ArgumentCountryDetails

interface RecyclerViewItemClickCallback {
    fun onRecyclerViewItemClick(argumentCountryDetails: ArgumentCountryDetails)
}