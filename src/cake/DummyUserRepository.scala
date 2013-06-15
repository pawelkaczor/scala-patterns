package cake

trait DummyUserRepository extends UserRepository {
  def save(u: User) {
    println(String.format("Saving user: %s", u))
  }
}
