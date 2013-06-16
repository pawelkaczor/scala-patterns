package cake

trait DummyUserRepository extends UserRepository {


  override def save(u: User) {
    println(String.format("Saving user: %s", u))
  }

  override def mkUser(name: String) = DummyUser(name).asInstanceOf[User]

  case class DummyUser(n: String) extends UserLike {
    def fullName: String = n

    def dummyUserDetails = "dummy details"

    override def toString = n
  }

}

