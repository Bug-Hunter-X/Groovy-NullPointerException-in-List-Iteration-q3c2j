```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { it ->
      println it
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])