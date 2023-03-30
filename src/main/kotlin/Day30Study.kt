class Box<T>(var content:T){
    fun set(content:T){
        this.content= content
    }
    fun get() :T{
        return content
    }
}
class MyPair<K,V>(var key:K, var value:V)
fun<T> myPrint(prefix: String, target: T) {
    println("${prefix} : ${target}")
}

fun main(args: Array<String>) {
    var inBox = Box<Int>(100)
    var stringBox = Box("Hello")
    var stringIntPair1 = Pair<String, Int>("key1",1234)
    var stringIntPair2 = Pair("key2",5678)
    myPrint<Int>("myprfix",1234)
    myPrint("myprfix",1234)

    var list1 = mutableListOf<String>()
    list1.add("aaa")
    list1.add("bbb")
    list1.remove("aaa")
    list1.removeAt(0)
    println(list1)
    list1.add("a"); list1.add("b"); list1.add("c")
    var a = list1.get(0)
    var b = list1[1]
    println(list1.contains("c"))
    println(list1.size)
    var sum = list1 + listOf("e","f")
    for(item in list1){
        println(item)
    }


    //var list2 = mutableListOf("hello","world")
}