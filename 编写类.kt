//写一个MainAcitivity类，在onCreate方法中调用类的例子：天气预报
//第一步：在build.gradle中添加新依赖，因此简单不讲忽略。
dependencies {
    implementation 'xxxx'
}
//添加列表依赖
implementation 'com.android.support:appcompat-v7:28.0.0'
implementation 'com.android.support:recyclerview-v7:28.0.0'

//第二步：在activity.xml编写如下
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
        <android.support.v7.widget.RecyclerView
            android:id="@+id/forecast_list"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
</FrameLayout>

//第三步，在Mainactivity.kt,使用旧的findViewByid()的方式：
val forecastList = findViewById(R.id.forecast_list) as RecyclerView
forecast_list.layoutManager = LinearLayoutManager(this)