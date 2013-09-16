package monad.tutorial.intwrapper

case class IntWrapper(value: Int) extends Monad[Int] {

  override def >>=[B](f: (Int) => Monad[B]): Monad[B] = {
    f(value)
  }

}
