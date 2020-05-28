package exercise1
/** Напишите отдельные функции, решающие поставленную задачу. 
  * 
  * Синтаксис:
  *   // метод
  *   def myFunction(param0: Int, param1: String): Double = // тело
  * 
  *   // значение
  *   val myFunction: (Int, String) => Double (param0, param1) => // тело
  */
object Functions {
  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */
  def sOkr(val r: Double): Double = r * r * Math.PI
  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = sOkr(r)
  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */
  def sKvdrt(a: Double)(b: Double): Double = a * b
  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = sKvdrt(a)(b)
  // c) Напишите не карированную функцию для расчета площади прямоугольника.
  def sPrmgl(a: Double, b: Double): Double = a * b
  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = sPrmgl(a, b)
}
