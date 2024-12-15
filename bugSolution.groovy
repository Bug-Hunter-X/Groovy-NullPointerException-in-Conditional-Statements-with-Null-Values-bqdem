def myMethod(a, b) {
  a = a ?: 0 // If a is null, set a to 0
  b = b ?: 0 // If b is null, set b to 0
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2) // Output: 5
println myMethod(2, 5) // Output: 5
println myMethod(null, 5) // Output: 5
println myMethod(5, null) // Output: 5
println myMethod(null, null) // Output: 0