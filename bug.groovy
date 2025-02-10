```groovy
def myMethod(List<String> list) {
  list.each { it ->
    println it
  }
}

myMethod(null)