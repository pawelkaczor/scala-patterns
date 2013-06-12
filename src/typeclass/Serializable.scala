package typeclass

object Serializable {

  def serialize[T](t: T)(implicit s: Serializable[T]) = {
    s.ser(t)
  }

  /**
   * Implicit view.
   *
   * Serialize method will be "added" to any serializable.
   *
   * In fact this method return object of anonymous class that provides method serialize.
   * Thus serialize method will not be called on serializable, but on newly created object
   * returned by this method.
   */
  implicit def addSerialize[T](t: T)(implicit s: Serializable[T]) =
    new {
      def serialize = s.ser(t)
    }
}

trait Serializable[T] {
  def ser(t: T): String
}
