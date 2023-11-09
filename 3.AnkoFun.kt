/**
 * 3.AnkoFun是什么？
 * AnkoFun是Anko的扩展函数，它可以在Kotlin中使用Anko的功能。
 * 简单来说，它也是一个强大的库，主要的目的是用来替代以前XML的方式来使用代码生成UI布局。
 */

 //3.1使用Anko
 //在MainActivity:onCreate,Anko扩展函数可以用来简化获取一个RecyclerView：
 val forecast_list: RectyclerView = findViewById(R.id.forecast_list)

 //3.2扩展函数
 //可以理解指在一个类上增加一种新的行为。
 fun context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
 }

 //这个方法可以在Activity内部直接调用：
 toast("Hi!")
 ·toast("Hi", Toast.LENGTH_LONG)
 ·longToast(R.id.hi)

 //3.3扩展函数可以是一个属性，由于互动操作性提供了属性。
 public var TextView.text: CharSequence
    get() = getText()
    set(v) = setText(v)
//tips：扩展函数不是真正修改原来的类，它是以静态导入的方式来实现的。