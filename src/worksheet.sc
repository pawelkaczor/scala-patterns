import typeclass.{Serializable, Person}
import Serializable._

val p = Person("Pawel")
val ps = Serializable.serialize(p)
val personsSerialized = Serializable.serialize(List(p, p))

val ps2 = p.serialize


assert(ps == ps2)







