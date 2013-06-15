package cake

trait UserService {
  self: UserRepository =>

  def createUser(name: String): User = {
    val u = User(name)
    save(u)
    u
  }
}
