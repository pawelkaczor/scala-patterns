package cake

object Main {

  def main(args: Array[String]) {
    val userService = new UserService with DummyUserRepository

    val user = userService.createUser("Pawel")

    // details hidden
    // user.dummyUserDetails

    println(String.format("User created %s of class %s", user, user.getClass))
  }

}
