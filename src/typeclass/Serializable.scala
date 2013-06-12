package typeclass

object Serializable {
  def serialize[T](t: T)(implicit s: Serializable[T]) = {
    s.ser(t)
  }
}

trait Serializable[T] {
  def ser(t: T): String
}
