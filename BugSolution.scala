```scala
class MyClass(val value: Int) {
  def this(str: String) = {
    try {
      this(str.toInt)
    } catch {
      case e: NumberFormatException => 
        println("Error: Invalid input for MyClass. Using default value 0.")
        this(0)
    }
  }
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
val obj3 = new MyClass("abc") // Handles invalid input

println(obj1.value) // Output: 10
println(obj2.value) // Output: 20
println(obj3.value) // Output: 0

class AnotherClass(val value: String) {
  def this(num: Int) = this(num.toString)
}

val obj4 = new AnotherClass("30")
val obj5 = new AnotherClass(40)

println(obj4.value) //Output: 30
println(obj5.value) //Output: 40
```