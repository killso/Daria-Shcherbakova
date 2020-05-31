/** Напишите вашу реализацию в тестовые функции.
  * 
  * https://docs.scala-lang.org/overviews/collections/maps.html
  */
object Maps {
  case class User(name: String, age: Int)
  /* a) В данной Seq[User] сгруппируйте пользователей по имени (`groupBy`) и вычислите средний возраст: `name -> averageAge`
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testGroupUsers(users: Seq[User]): Map[String, Int] = {
    var map: Map[String, Int]=Map()
    var name = users.groupBy(_.name)
    for (с<-name) {
      var average = с._2.toBuffer.foldLeft[Int](0)((a, next)=>a+next.age) /
        с._2.toBuffer.size
      map+=(с._1 -> average)
    }
    map
  }
  /* b) Дана `Map[String, User]` состоящая из имен пользователей `User`, сколько имен пользователей, содержащихся в Map, содержат подстроку "Adam"?
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testNumberFrodos(map: Map[String, User]): Int = {
    var c: Int = 0
    for (num<-map)
    {
      if (num._2.name.indexOf("Adam")!=(-1))
        c+=1
    }
    c
  }
  /* c) Удалите всех пользователей возраст которых менее 35 лет.
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.
   */
  def testUnderaged(map: Map[String, User]): Map[String, User] = {
    map.filter(k=>k._2.age>34)
  }
}

