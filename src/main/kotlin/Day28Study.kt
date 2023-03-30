import java.lang.Exception

class Outer(var x:Int){
    fun outerMethod(){}

    class Inner(var y :Int){
        fun innerMethod(){
            println("${y}")

        }
    }
    interface MyInterface{
        fun abstractMethod();
    }
}

interface Hello{
    interface World{

    }
}

class Outer2(var x :Int){
    fun outerMethod(){}
    inner class Inner2 (var y :Int){
        fun innerMethod(){
            println(x)
            println(y)
            outerMethod()
        }
    }
}

class MyClass(var x:Int){
    fun myMethod(){}
    companion object{
        var classVar = 100
        val CONSTANT = 200
        fun classMethod(){}
    }
}

object SingletonClass{
    var x = 100
    fun increaseX(){
        x++
    }
    fun printX(){
        println(x)
    }
}

fun main(args:Array<String>){
    var inner = Outer.Inner(100);

    var outer2 = Outer2(100);
    var inner21 = outer2.Inner2(200)
    var inner22 = outer2.Inner2(300)

    println(MyClass.classVar)
    println(MyClass.CONSTANT);
    MyClass.classMethod()

    println(SingletonClass.x)
    SingletonClass.increaseX()
    SingletonClass.printX()

    //var toInt = "Hello".toInt()
    var count =0
    while(true) {
        try {
            print("(잘못한 욋수 ${count}숫자입력 : ")
            var input = readLine()
            var toNum = input?.toInt()
            println(toNum)
        } catch (e: Exception) {
            println("오류가 났습니다" + e.message)
            count++
        }
        //var inputStream = File("nonono.txt").inputStream()




    }
}

