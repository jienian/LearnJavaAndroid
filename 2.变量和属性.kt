//2.在kt中，都是对象。
//2.1基本数据类型 ，重点讲和java区别不同
@·数字类型中不会自动转型
val i: Int = 7
val d: Double = i.toDouble() //一个明确的类型转换，众多函数之一
@·字符不能作为一个数字处理,可以转换整数字
val c: Char = 'c'
val i: Int = c.toInt()
@·位运算，Java经常在flags中使用“｜/&”（等于/或者），在kt用and和or
// Java ｜/ &
int bitwiseOr = FLAG1 | FLAG2;
int bitwiseAnd = FLAG1 & FLAG2;
// Kotlin and/or
val bitwiseOr = FLAG1 or FLAG2
val bitwiseAnd = FLAG1 and FLAG2
@·字面可以写明具体的类型。
val i = 12 //A Int
val l = 3://A Long
val iHex = 0x0F //A Int
val d = 3.5 //A Double
cval f = 3.5f //A Float
@·一个String可以像数组访问
val s = "Hello"
val c = s[2] //这是一个字符‘l’
//迭代String
val s = "Hello"
for(c in s) {
    print(c) //Hello
}

//2.2变量 和Java使用的final很相似
@可变量(var)
@不可变量(val) 不可变量说明是线程很安全

//2.3属性 和java中的字符是相同，但是很强大。
//在java中的例子：
public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }
}
...
Person person = new Person();
person.setName("name");
String name = person.getName();
//在kt中，只需要一个属性
public class Person {
    val name: String = ""
}
...
val person = Person()
person.name = "name"
val name = person.name

//2.4没有任何指定，默认使用getter和setter，在自定义中可以修改。
public class Person {
    val name: String = ""
    get() = filed.toUpperCase()
    set(value) [
        filed = "Name: $value"
    ]
}
