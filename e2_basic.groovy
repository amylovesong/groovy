def variable1 = 1
def variable2 = "I am a person."
def int x = 1
println("variable1=" + variable1)

String testFunction(arg1, arg2){
    "test Function:" + (arg1 + arg2)
}
println(testFunction(1, 2))

def nonReturnTypeFun(){
    last_line
}

String getString(){
    return "I am a string."
}

def getSomething(){
    "getSomething return value"
    1000
}
println("getSomething():" + getSomething())

def singleQuote = 'I am $ dollar'
def doubleQuoteWithoutDollar = "I am one dollar"
def y = 1
def doubleQuoteWithDollar = "I am $y dollar"
println("singleQuote:" + singleQuote)
println("doubleQuoteWithoutDollar:" + doubleQuoteWithoutDollar)
println("doubleQuoteWithDollar:" + doubleQuoteWithDollar)

def multiLines = '''begin
    line 1
    line 2
    end'''
println("multiLines:" + multiLines)

