import monad.tutorial.observable.Observable

def combinationOfPositionAndMomentum = for {
// start measuring
  position <- Observable(int2Integer(4))
  momentum <- Observable(int2Integer(6))
} yield {
  // do calculations
  BigDecimal.valueOf(
    if (position.doubleValue() > 4.5) {
      momentum.doubleValue() + position.doubleValue()
    } else {
      momentum.doubleValue() - position.doubleValue()
    }
  )
}





combinationOfPositionAndMomentum




combinationOfPositionAndMomentum





Observable(int2Integer(4)) >>=
  (position => Observable(int2Integer(6)).map(
    momentum => BigDecimal.valueOf(position.doubleValue() + momentum.doubleValue()))
    )








val singleMeasurement = for {
  v1 <- Observable(int2Integer(4))
} yield {
  BigDecimal.valueOf(
    v1.doubleValue()
  )
}




