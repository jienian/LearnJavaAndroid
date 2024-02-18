# 集成 Kotlin
```
apply plugin: 'kotlin-android'
android {
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

buildscript {
    dependencies {
        // Kotlin 插件：https://plugins.jetbrains.com/plugin/6954-kotlin
        // noinspection GradleDependency
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31'
    }
}
```
# 1.关键字：new，this, class, extends, volatile, synchronized,  
## java写法
```java
Intent intent = new Intent();
MainActivity.this;
NaubAcrtivity.class;
public class MainActivity extends AppCompatActivity {   }
volatile ThreadPoolManager instance
```

## kt写法
```kotlin
var intent = Intent()
this@MainActivity
MainActivity::class.java
class MainActivity : AppCompatActivity() { }
@Volatile
var instance: ThreadPoolManager
```
# 
