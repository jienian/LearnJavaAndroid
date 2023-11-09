//5.数据类是一种非常强大的类，可以避免创建java中的用于保存状态但又操作非常简单的POJO的模版代码。
data class Forecast(val data: Date, val temperature: Float, val details: String) 