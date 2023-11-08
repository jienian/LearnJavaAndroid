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

//第四步，The Recycler Adapter
//RecyclerView中使用到的布局只需要一个TextView，简单创建文本列表，添加一个包名叫ForecastListAdapter.kt，代码如下
class ForecastListAdapter(val items: List<String>) :
    RectyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
        //函数创建ViewHolder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
           // val view = LayoutInflater.from(parent.context).inflate(R.layout.forecast_list_item, parent, false)
            return ViewHolder(TextView(parent.context))
        }
        //函数绑定数据
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = items[position]
        }
        //函数返回数据列表的大小
        override fun getItemCount(): Int {
            return items.size
        }

    //内部类ViewHolder
    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}

//第五步，回到MainActivity，创建String放入List中，然后使用创建分配Adapter如下。
private val items = listOf(
    "Today - Sunny - 88/63",
    "Tomorrow - Foggy - 70/46",
    "Weds - Cloudy - 72/63",
    "Thurs - Rainy - 64/51",
    "Fri - Foggy - 70/46",
    "Sat - Cloudy - 72/63",
)
//第六步，在onCreate方法中使用Adapter
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val forecastList = findViewById(R.id.forecast_list) as RecyclerView
    forecastList.layoutManager = LinearLayoutManager(this)
    forecastList.adapter = ForecastListAdapter(items)
}