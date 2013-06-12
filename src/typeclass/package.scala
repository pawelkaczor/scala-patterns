
package object typeclass {

  implicit object PersonSerializer extends Serializable[Person] {
    def ser(t: Person): String = String.format("Person %s serialized", t)
  }

  implicit object RestaurantSerializer extends Serializable[Restaurant] {
    def ser(t: Restaurant): String = "Restaurant serialized"
  }

  /*
    implicit def ListSerializer[T](implicit ev: Serializable[T]) =
      new Serializable[List[T]] {
        def ser(xs: List[T]) =
          xs.map(Serializable.serialize(_)).mkString("List(", ",", ")")
      }
  */
  // simplified:


  implicit def ListSerializer[T: Serializable] =
    new Serializable[List[T]] {
      def ser(xs: List[T]) =
        xs.map(Serializable.serialize(_)).mkString("List(", ",", ")")
    }


}
