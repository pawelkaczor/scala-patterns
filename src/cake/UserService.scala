package cake

trait UserService {
  self: UserRepository =>

  def createUser(name: String): User = {
    val u = mkUser(name)
    save(u)
    u
  }

}
