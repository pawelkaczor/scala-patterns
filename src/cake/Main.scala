package cake

object Main {

  def main(args: Array[String]) {
    val context = new UserService with DummyUserRepository

    val u = context.createUser("Pawel")

    println(String.format("User created %s", u))
  }

}
