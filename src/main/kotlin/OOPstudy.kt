
class Car (var speed: Int, var isMoving:Boolean=false) {
    fun accelerate() {
        speed += 10
    }

    fun decelerate() {
        speed -= 10
        if (speed < 0) speed = 0
    }

    fun move() {
        isMoving = true
    }
}

open class Person(var name:String, var age:Int) {
    open fun sayName() {
        println("My name is ${name}")
    }
    fun sleep (hour:Int): Int{
        println("${hour} 시간동안 ${name}이가 잠을 잡니다")
        return hour
    }
}
class Employee(name:String, age:Int, varcompany:String):Person(name,age)
{
    fun work(){
        println("일 합니다")
        super.sleep(8)
    }
    override fun sayName(){
        println("일꾼이 이름을 말합니다")
    }
}
fun main(args:Array<String>){
    var c = Car(10,true)
    c.accelerate()
    c.decelerate()
    c.move()

    var e = Employee("John", 20, "Samsung")
    e.work()
    e.sayName()

    println(e is Employee)
    //println(e is Car)
    println(e is Person)
    println(e is Any)

    //업 캐스팅
    var p: Person = e

    //다운캐스팅
    var ee : Employee = p as Employee

    //스마트 캐스트
    var str:Any ="Hello"
    if(str is String){
        str.trim()
    }
    // 데이터 클래스
    data class PointData(var x: Int, var y: Int)
    class PointNoData(var x: Int, var y: Int)
}





