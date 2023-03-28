fun main(args: Array<String>) {
   /* var a =100
    var b : String = "Hello"
    var c :Int = 200
    val d = 300
    //b = 400
    val PI =3.14
    var f = 1.234F
    var i = f.toInt()
    var r = """ sdfsd
            """.trimIndent()
    var num1 = 100
    var num2 = 200
    var str ="num1 : ${num1} num2 : ${num2*2}"
    println(str)

    var anyValue : Any
    anyValue = 100
    anyValue ="Hello"

    var n : Int? = 100
    n = null
    var sss :String? = "Hello"
    sss = null*/

   /* var s = "Hello"
    println(s.length)
    println(s.startsWith("He"))

    var s2 : String? = "Hello"
    println(s2?.length)     //!! null 인 것을 null 아닌 것으로 바꾸는 것
    println(s2?.substring(0,3)?.lowercase()?.length)
    //?. 안전한 호출 연산자를 이용하여 null값에 대해 안전하게 변수를 지정하고 불러 올 수 있습니다.
    //?  널값을 허용하지 않는 변수에 널 값이 들어 갔을때 널 값을 변환할 수 있는 함수의 결과를 만들어 줍니다.

    var i :Int? = 100
    var ii : Int = i!!*/

  /* var s2 : String? = null
    if(s2 != null){
        println(s2.length)
    }

    var one = null ?: 1
    var c: String? = null
   // var len = if(c?.length == null ) 0 else c.length
    var len = c?.length ?: 0


    var s3 = "Hello"
    //var i4 = s3.toInt()
    var i4 = s3.toIntOrNull()
    //String b = "Hello";

    //in 연산자
    //1.배열과 같은 여러 값ㅇ 있는 곳에 특정 값이 있는지 검사
    //2.for내부에서 배열, 리스트, 범위 객체등을 순회하는데 사용
    var list = listOf(1,2,3)
    println(1 in list)
    println(4 in list)
    var words = listOf("happy","sad","mirim")
    println("happy" in words)
    println("good" in words)

    //2.
    for(num in 1..10){
        println(num)
    }
    for(w in words){
            println(w)
    }
   
    
    var score =100
    var grade: String
    if(score>=90){
        println("신난다")
        var ccc =100
        "A".lowercase()
    }else if(score >=80){
        "B"+"+"
    }else{
        grade="C"
    }
    println(grade)
    */
   /* var num =1
    when(num){
        1-> {
            println("두 줄")
            println("one")
        }
        (1.inc()) -> println("two")
        (1*3) -> println("three")
        else ->println("no match")
        
    }*/

    var a =10
    var b = 20
    var op ="+"
    var result = when(op){
        "+" -> a+b
        "-" -> a-b
        else ->null
    }
}