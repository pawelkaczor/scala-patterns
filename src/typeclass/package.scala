
package object typeclass {

  implicit object PersonSerializer extends Serializable[Person] {
    def ser(t: Person): String = "Person serialized"
  }

  implicit object RestaurantSerializer extends Serializable[Restaurant] {
    def ser(t: Restaurant): String = "Restaurant serialized"
  }

}
