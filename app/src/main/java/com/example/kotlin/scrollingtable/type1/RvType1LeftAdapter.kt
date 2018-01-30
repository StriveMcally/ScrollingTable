package com.example.kotlin.scrollingtable.type1

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.kotlin.scrollingtable.R
import com.example.kotlin.scrollingtable.type1.model.Type1ProductModel

/**
 * 每一行的股票信息，第一条是股票名称，之后的是价格信息
 * Created by kotlin on 18-1-29.
 */
class RvType1LeftAdapter : BaseQuickAdapter<Type1ProductModel, BaseViewHolder>(R.layout.item_layout_main) {
    private var TAG = RvType1LeftAdapter::class.java.name

    var rvMainRightAdapter: RvType1RightAdapter? = null


    override fun convert(helper: BaseViewHolder, item: Type1ProductModel) {
        //当前的条目位置信息
        val productPosition = helper.adapterPosition

        helper.setText(R.id.tv_data, item.productName)

    }
}
