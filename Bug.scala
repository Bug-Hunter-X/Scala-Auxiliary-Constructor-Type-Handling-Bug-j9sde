```scala
class MyClass(val value: Int) {
  def this(str: String) = this(str.toInt)
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")

println(obj1.value) // Output: 10
println(obj2.value) // Output: 20

class AnotherClass(val value: String) {
  def this(num: Int) = this(num.toString)
}

val obj3 = new AnotherClass("30")
val obj4 = new AnotherClass(40)

println(obj3.value) //Output: 30
println(obj4.value) //Output: 40
```