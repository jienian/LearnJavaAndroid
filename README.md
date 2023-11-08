# Learn Kotlin

Kotlin风格

```kotlin
class Greeter(val name: String){
  fun greet(){
    println("hello, $name")
  }
}
fun main(args: Array<String>){
  Greeter("World!").greet();
}
```

Ktlin基础语法

Ktlin文件以.kt为后

函数定义

```kotlin
fun sum(a: Int , b: Int): Int {
  return a + b
}
//表示式作为函数体，返回类型自动推断
fun sum(a: Int, b: Int) = a + b
public fun sum(a: Int, b: Int): Int = a + b 
//无返回值的函数
fun printSum(a: Int, b: Int){
   print(a+b)
}
//可变长参数函数
fun vars(vararg v: Int){
  for(vt in v){
    print(vt)
  }
}
fun main(ars: Array<String>){
  vars(1, 2, 3, 4, 5)
}
//lambda
fun main(arsg: Array<String>){
  val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
  println(sumLambda(1, 2))//3
}

```

定义常量与变量

可变变量定义：var 关键字

```kotlin
val a: Int = 1
val b = 1
val c : Int
c = 1
val x = 5
x += 1

```

字符串模版

```kotlin
//$表示一个变量名或者变量值
//$varName表示变量值
//${valName.fun()}表示变量的方法返回值
var a = 1
val s1 = "a is $a"
a = 2
val s2 = "${s1.replace("is", "was")}, but now is $a"
var age: String? = "23"
val ages = age!!.toInt()
val ages1 = age?.toInt()
val ages2 = ages?.toInt() ?: -1

fun parseInt(str: String): Int?{
  return str.toInOrNull()
}
fun printProduct(arg1: String, arg2: String){
  val x = parseInt(arg1)
  val y = parseInt(arg2)
}
if(x != null && y != null){
  println(x * y)
}
else{
  println("'$arg1' or '$arg2' is not a number")
}
}
fun main(){
  printProduct("7", "6")
  //..
}





