package monad.tutorial.observable

case class Observable[A <: Number](value: A) extends Monad[Number] {

  override def >>=[B](f: (Number) => Monad[B]): Monad[B] = {
    f(Math.random() + value.doubleValue())
  }

  override def map[B](f: (Number) => B): Monad[B] = {
    Observable(f(value).asInstanceOf[Number]).asInstanceOf[Monad[B]]
  }
}
