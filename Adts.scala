import scala.util.{Try, Failure, Success}
/** Реализуйте следующие функции.
  * 
  * List(1, 2) match {
  *   case head :: tail => ???
  *   case Nil          => ???
  *   case l            => ???
  * }
  * 
  * Option(1) match {
  *   case Some(a) => ???
  *   case None    => ???
  * }
  * 
  * Either.cond(true, 1, "right") match {
  *   case Left(i)  => ???
  *   case Right(s) => ???
  * }
  * 
  * Try(impureExpression()) match {
  *   case Success(a)     => ???
  *   case Failure(error) => ???
  * }
  * 
  * Try(impureExpression()).toEither
  * 
  */
object Adts {
  // a) Дан List[Int], верните элемент с индексом n
  def ReturnItem(list: List[Int],n: Int):Option[Int] = {
    List(1,2) match {
      case head :: tail => Some(list(n))
      case Nil=>null
      case l=>Option(l(n))
    }
  }
  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testReturnItem(list: List[Int], n: Int): Option[Int] = ReturnItem(list, n)
  // b) Напишите функцию, увеличивающую число в два раза.
  def kvadrat(n: Option[Int]): Option[Int] = {
    Option(1) match {
      case Some(a) => Option(a*2)
      case None => null
    }
  }
  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testkvadrat(n: Option[Int]): Option[Int] = kvadrat(n)
  // c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").
  def EvenNumber(n: Int): Either[String, Int] = Either.cond(n%2==0, n, "Нечетное число") match
  {
    case Left(i)=>Left(i)
    case Right(s)=>Right(s)
  }
  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testEvenNumber(n: Int): Either[String, Int] = EvenNumber(n)
  // d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").
  def NumberDivision(a: Int, b: Int): Either[String, Int] = Try(a/b) match
  {
    case Success(a) => Right(a)
    case Failure(error) => Left("Нельзя делить на 0")
  }
  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру
  def testNumberDivision(a: Int, b: Int): Either[String, Int] = NumberDivision(a, b)
  // e) Обработайте исключения функции с побочным эффектом вернув 0.
  def DivisionByZero(impure: String => Int, str: String): Try[Int] =
    Try(impure(str)).toEither match
    {
      case Right(k)=>Success(k)
      case Left(l)=>Success(0)
    }
  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testDivisionByZero(impure: String => Int, str: String): Try[Int] = DivisionByZero(impure, str)
}
