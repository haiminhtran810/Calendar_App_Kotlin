package home.learn.hmt.data.di.repository.remote.api.service

import com.google.gson.Gson
import okhttp3.Authenticator
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ServiceGenerator {
    companion object {
        private const val CONNECTION_TIMEOUT = 15L
        /*fun <T> generate(baseUrl: String, serviceClass: Class<T>, gson: Gson,
                         authenticator: Authenticator?, interceptors: Array<Interceptor>): T {
            val okHttpClientBuilder = OkHttpClient().newBuilder()

            for (interceptor in interceptors) {
                okHttpClientBuilder.addInterceptor(interceptor)
            }
            okHttpClientBuilder.connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            okHttpClientBuilder.readTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            if (authenticator != null) {
                okHttpClientBuilder.authenticator(authenticator)
            }
            val builder = Retrofit.Builder().baseUrl(baseUrl)
                    .addCallAdapterFactory(RxErrorHandlingCallAdapterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
            val retrofit = builder.client(okHttpClientBuilder.build())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit.create(serviceClass)
        }*/
    }
}