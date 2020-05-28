//Создать класс Animal
class Animal {(name: String, species: String, food: String)
  //Добавьте следующие метод в Animals, который проверяет ест ли животное определенную пищу
  def eats(food: String): Boolean = Animal.animals(name)(1) == food
}
//Создайте объект-компаньон для класса Animal
object Animal {
  val animals = Map("cat" -> Array[String]("mammal", "meat"),
    "parrot" -> Array[String]("bird", "vegetables"),
    "goldfish" -> Array[String]("fish", "plants"))
}
//Переопределите ваш класс Animal как трейт и создайте объекты класса-образца для Mammals, Birds и Fishs.
trait Animal {
  case object mammal extends Animal
  case object bird extends Animal
  case object fish extends Animal
}
object Animal {
 // Добавьте следующие функции в объект-компаньон Animal:def knownAnimal, true если это имя одного из трех животных из (b)
  def knownAnimal(name: String): Boolean = {
    name match {
      case "cat" => true
      case "parrot" => true
      case "goldfish" => true
      case _ => false
    }
  }
  //def apply(name: String): Option[Animal]
  // возвращает одно из трех животных в соответствии с именем (Some) или ничего (None)
  def apply(name: String): Option[Animal] = Some.apply(Animal.this)
}
class Animal(name: String, food: String) {
  //Создайте трейт Food
  trait Food {
    case class Meat
    case class Vegetables
    case class Plants
  }
  object Food {
   //Так же добавьте объект-компаньон с методом apply():
    def apply(food: String): Option[Food] = Some.apply(Food.this)
  }
}