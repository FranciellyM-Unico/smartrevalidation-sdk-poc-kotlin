package com.example.smartrevalidation

import android.app.Application
import com.acesso.acessobio_android.onboarding.UnicoSDK
import com.acesso.acessobio_android.onboarding.models.Environment
import com.acesso.acessobio_android.onboarding.models.UnicoSDKConfig

class SmartRevalidationApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val config = UnicoConfig()
        UnicoSDK.initializeSDK(
            this,
            UnicoSDKConfig(
                sdkKey = config.getHostKey(),
                bundleId = config.getBundleIdentifier(),
                environment = Environment.UAT
            )
        )
    }
}
