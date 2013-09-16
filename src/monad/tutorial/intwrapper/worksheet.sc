import monad.tutorial.intwrapper.IntWrapper

// f :: a -> m b
def f: Int => IntWrapper = {
  x => IntWrapper(x + 2)
}

// g :: b -> m c
def g: Int => IntWrapper = {
  x => {
    new IntWrapper(x * 3)
  }
}

// h :: b -> m c
def h1(a: Int) = {
  f(a) >>= g
}

def h2(a: Int) = {
  IntWrapper(a + 2) >>= (b => IntWrapper(b * 3))
}

h1(2)

h2(2)