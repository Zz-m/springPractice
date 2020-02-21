package cn.denghanxi.s5

/**
 * Created by 邓晗熙 on 2020/2/20
 */

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

val sum = {
    x: Int, y: Int ->
    println("calculate $x + $y = ")
    x + y
}

fun main() {
    val people = listOf(Person("Alice", 23), Person("Bob", 32))
    println(people.maxBy() { it.age })
    println(people.maxBy(Person::age))
    println(people.maxBy { s -> s.age })
    println(sum(12, 23))
}