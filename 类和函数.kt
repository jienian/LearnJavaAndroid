//1.怎么定义一个类
//1.1定义一个类，只需要使用class关键字。
class MainActivity {}

//1.2默认唯一的构造器
class Person(name: String, surname: String)
//构造函数体，写在"init"块中
class Person(name: String, surname: String) {
    init {
        //....
    }
}

//2.类继承
//2.1默认任何类都是基础继承自Any（与java中的Object类相似），也可以继承其它类。所有的类默认都不可继承的（final），只能继承声明open或者abstract修饰的类：
//第一种写法
open class Person {
    //属性
    var name: String = ""
    var surname: String = ""
    //构造函数
    constructor(name: String, surname: String) {
        this.name = name
        this.surname = surname
    }
    //方法
    fun greet() {
        println("Hello, $name $surname")
    }
}
//第二种写法
class Student : Person {
    //构造函数
    constructor(name: String, surname: String) : super(name, surname) {
    }
    //方法
    fun study() {
        println("I'm studying")
    }
}

//推荐使用第三种写法，易懂、易用
open class Animal (name: String) 
class Person(name: String, surname: String): Animal(name)

//3.函数：可以使用fun关键字定义
fun onCreate(saveInstanceState: Bundle?) {}
//3.1如果没有指定返回值，就会返回Unit，与java中的void类似，Unit是一个真正的对象。
//第一种写法：使用分号
fun add(x: Int, y: Int): Int {
    return x + y
}
//第二种写法：分号代替等号，被称为表达式计算
fun add(x: Int, y: Int): Int =  x + y

//4.构造方法和函数参数
//给参数指定一个默认值使得它们变得可选，在Activity中创建了一个函数toast一段信息：
fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
} 
//想象还复杂，看例子
fun niceToast(message: String,
    tag: String = javaClass<MainActivity>().getSimpleName(),
    length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$className] $message", length).show() }

//可以通过在值前写明参数明来传入你想要的参数：
toast(message = "Hello", length = Toast.LENGTH_SHORT)

