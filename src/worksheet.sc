import typeclass.{Serializable, Person}

val p = Person("Pawel")
val ps = Serializable.serialize(p)
val personsSerialized = Serializable.serialize(List(p, p))





