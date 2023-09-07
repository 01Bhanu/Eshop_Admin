package com.bhanu01.eshopadmin.model

data class AddProductModel(
    val productName: String? = "",
    val productDescription: String? = "",
    val productImg: String? = "",
    val productCategory: String? = "",
    val productId: String? = "",
    val productMrp: String? = "",
    val productSp: String? = "",
    val productImages: ArrayList<String>,



)