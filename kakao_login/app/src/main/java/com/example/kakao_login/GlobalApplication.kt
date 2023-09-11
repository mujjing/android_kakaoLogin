package com.example.kakao_login

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "1aa6c022a8e1f5951f9715a63d83c416")
    }
}