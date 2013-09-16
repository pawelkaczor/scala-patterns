package monad.tutorial.intwrapper

trait Monad[A] {

  def >>=[B](f: A => Monad[B]): Monad[B]

}
