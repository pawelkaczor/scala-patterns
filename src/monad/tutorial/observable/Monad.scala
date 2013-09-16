package monad.tutorial.observable

trait Monad[A] {

  def flatMap[B](f: A => Monad[B]): Monad[B] = {
    >>=(f)
  }

  def >>=[B](f: A => Monad[B]): Monad[B]

  def map[B](f: A => B): Monad[B]

}
