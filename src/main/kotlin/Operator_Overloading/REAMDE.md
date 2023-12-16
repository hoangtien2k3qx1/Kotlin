
## [Operator Overloading Kotlin](https://kotlinlang.org/docs/operator-overloading.html)

Unary prefix operators:

| Expression | Translated to  |
|------------|----------------|
| +a         | a.unaryPlus()  |
| -a         | a.unaryMinus() |
| !a         | a.not()        |


## [Increments and decrements:]()

| Expression | Translated to       |
|------------|---------------------|
| a++        | a.inc() + see below |
| a--        | a.dec() + see below |


## Binary operations

- [Arithmetic operators:]()

| Expression | Translated to   |
|------------|-----------------|
| a + b      | a.plus(b)       |
| a - b      | a.minus(b)      |
| a * b      | a.times(b)      |
| a / b      | a.div(b)        |
| a % b      | a.rem(b)        |
| a..b       | a.rangeTo(b)    |
| a..<b      | a.rangeUntil(b) |


- [in operator:]()

| Expression | Translated to  |
|------------|----------------|
| a in b     | b.contains(a)  |
| a !in b    | !b.contains(a) |


## [Indexed access operator]()

| Expression           | Translated to           |
|----------------------|-------------------------|
| a[i]                 | a.get(i)                |
| a[i, j]              | a.get(i, j)             |
| a[i_1, ..., i_n]     | a.get(i_1, ..., i_n)    |
| a[i] = b             | a.set(i, b)             |
| a[i, j] = b          | a.set(i, j, b)          |
| a[i_1, ..., i_n] = b | a.set(i_1, ..., i_n, b) |


##  [invoke operator:]()

| Expression       | Translated to           |
|------------------|-------------------------|
| a()              | a.invoke()              |
| a(i)             | a.invoke(i)             |
| a(i, j)          | a.invoke(i, j)          |
| a(i_1, ..., i_n) | a.invoke(i_1, ..., i_n) |


##  [Augmented assignments]()

| Expression | Translated to    |
|------------|------------------|
| a += b     | a.plusAssign(b)  |
| a -= b     | a.minusAssign(b) |
| a *= b     | a.timesAssign(b) |
| a /= b     | a.divAssign(b)   |
| a %= b     | a.remAssign(b)   |


## [Equality and inequality operators]()

| Expression  | Translated to                   |
|-------------|---------------------------------|
| a == b      | a?.equals(b) ?: (b === null)    |
| a != b      | !(a?.equals(b) ?: (b === null)) |


## [Comparison operators:]()

| Expression   | Translated to       |
|--------------|---------------------|
| a > b        | a.compareTo(b) > 0  |
| a < b        | a.compareTo(b) < 0  |
| a >= b       | a.compareTo(b) >= 0 |
| a <= b       | a.compareTo(b) <= 0 |

