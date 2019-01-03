object Versions {
    val gradleAndroidPlugin = "3.0.1"

    val compileSdk = 27
    val targetSdk = 27
    val minSdkVersion = 21
    val releaseVersionCode = 1
    val releaseVersionName = "1.0"

    val supportLibrary = "27.1.1"
    val kotlin = "1.3.0"

    val retrofit = "2.4.0"
    val contrain_layout = "1.1.3"
    val ktlint = "0.20.0"

    val junit = "4.12"
    val androidTestRunner = "1.0.2"
    val espresso = "3.0.2"

    val rxAndroid = "2.1.0"
    val rxJava = "2.2.5"
    val dagger = "2.20"
    val javaxInject = "1"
}

object ProjectModules {
    val data = ":data"
    val domain = ":domain"
}

object PluginDependencies {
    val android = "com.android.tools.build:gradle:${Versions.gradleAndroidPlugin}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object ProjectDependencies {
    val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val contrain_layout = "com.android.support.constraint:constraint-layout:${Versions.contrain_layout}"
    val supportAppCompat = "com.android.support:appcompat-v7:${Versions.supportLibrary}"
    val junit = "junit:junit:${Versions.junit}"
    val androidTestRunner = "com.android.support.test:runner:${Versions.androidTestRunner}"
    val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"

    // dagger
    val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
    val dagger_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val dagger_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"

    //rxjava
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    val javaInject = "javax.inject:javax.inject:${Versions.javaxInject}"
}