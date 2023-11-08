//1.怎么定义一个类
//1.1定义一个类，只需要使用class关键字。
class MainActivity {
}

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

//第三种写法，易懂
open class Animal (name: String) 
class Person(name: String, surname: String): Animal(name)





