
val odds = List(1, 3, 5)
val evens = List("2", "4", "6")


for {
  l1 <- odds
  l2 <- evens
  if l1 < l2.toInt
} yield l1 * 10 + l2.toInt

Map


// combine ods with even

/**
 * def ﬂatMap[B](f : (A) => Iterable[B]) : List[B]
 * ﬂatMap applies the given function f to each
 * element of the list t, then concatenates the
 * result.
 */
odds.flatMap(a => evens.map(_ + a * 10))