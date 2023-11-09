//4.执行一个请求
//我们的请求很简单接收一个url，然后读取结果在logcat上打印json
public class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.e(javaClass.simpleName, forecastJsonStr)
    }
}
//为了可以执行请求(APP必须要有Intent权限)，记得添加一行AndroidManifest.xml
<uses-permission android:name="android.permission.INTERNET" />

//4.1在主线程之外执行请求
//为啥那样做呢？因为如你所知，HTTP请求不被允许在主线程中执行，否则会抛出异常。通用做法是使用AsyncTask类，但是很危险，比如到postExecute时，如果activty已经销毁了，就会崩溃。
//所以Anko提供了非常简单的DSL处理异步任务，可以满足大部分的需求。可以选择通过调用uiThread的方式回到主线程。
asyns() {
    Request(url).run()
    uiThread{longToast("执行请求")}
}

//UIThread是很不错的一点就是可以依赖于调用者。如果它是被一个Activity调用的，如果activity.isFinishing()返回true，否则uiThread不会执行，这样就不会在Activity销毁的时候遇到崩溃的情况。