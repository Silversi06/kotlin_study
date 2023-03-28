fun printHello(){
    println("Hello")
}

fun add2(a: Int, b: Int=20) = a+b
fun add3(a: Int, b: String) = a.toString()+b
fun getBigger(a: Int, b:Int) = if(a>b) a else b
/*fun getBigger(a: Int, b:Int) = Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}*/

fun main(args: Array<String>){
    printHello()
    add2(10)
}
/*var myImpl = object : MyFunctionalInterface {
    override fun method(i: Int?): String {
        TODO("Not yet implemented")
    }
}
var myImpl4 = MyFunctionalInterface { "Hello " + it }

var myImpl2 = MyFunctionalInterface { i: Int ->
    println("say something")
    "Hello " + i
}

var myImpl3 = MyFunctionalInterface { i ->
    "Hello " + i
}*/




// 데이터 클래스
/*data class PointData(var x: Int, var y: Int)
class PointNoData(var x: Int, var y: Int)

data class PointData(var x: Int, var y: Int)
class PointNoData(var x: Int, var y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PointNoData

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    override fun toString(): String {
        return "PointNoData(x=$x, y=$y)"
    }
}*/

