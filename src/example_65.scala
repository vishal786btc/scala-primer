
case class Person(firstName:String, lastName:String)

trait DormResident { self: Person =>
  val livesOnCampus = true 
}

class Student(f:String, l:String) DormResident;

class Student(f:String, l:String) extends Person(f,l) with DormResident;

val person1 = new Student("Vitthal","Srinivasan") 

val person2 = new Person("Vitthal","S") with DormResident

