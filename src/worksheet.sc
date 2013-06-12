import typeclass.{Serializable, Person}

val p = new Person
val ps = Serializable.serialize(p)
