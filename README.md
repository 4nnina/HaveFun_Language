# HaveFun_Language

This is the final project for the 'Linguaggi' course at the University of Verona, during the last year of bachelor's degree in Computer Science. It is  a simple imperative language with if-then-else, while, functions, +, -, \*, mod, ^, &, | and comments ( //single line, /* multiple line */ ). Variables are named only with lowercase letter, they could be natural numbers or boolean. 

## Prerequisites
- opendjdk-15
- ANTLR v4.9

### Some program example
```
fun const() {
  return 5}
out(const())

//Output: 5
```

```
fun factorial(n) {
  if (n == 0) then { ret = 1 }
  else { ret = factorial(n - 1) * n };

  return ret
}
out(factorial(5))

/* Output: 120 
```

**The following programs are not correct:**

```
fun f() { return 1 }
fun f(x) { return 1 }

out(1)
```

*There are two functions with the same name!*

```
fun f(x, y) { return x }

out(x)
```

*There is out(x), but x is used but never declared*
