package cake


trait UserRepository {
  type User <: UserLike

  def save(u: User)

  def mkUser(name: String): User

  trait UserLike {
    def fullName: String
  }

}


