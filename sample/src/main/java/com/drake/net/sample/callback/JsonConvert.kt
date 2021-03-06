/*
 * Copyright (C) 2018, Umbrella CompanyLimited All rights reserved.
 * Project：Net
 * Author：Drake
 * Date：1/15/20 4:22 PM
 */

package com.drake.net.sample.callback

import com.drake.net.convert.DefaultConvert
import com.squareup.moshi.Moshi
import java.lang.reflect.Type

class JsonConvert : DefaultConvert(code = "code", message = "msg", success = "200") {

    override fun <S> String.parseBody(succeed: Type): S? {
        return Moshi.Builder().build().adapter<S>(succeed).fromJson(this)
    }
}