def aClosure = {
	String param1, int param2 ->
	println "this is code in closure"
	println param1 + " " + param2
}

aClosure.call("this is string:", 100)
aClosure("this is int:", 20)

// Closure的隐含参数it
def greeting = { "Hello, $it!" }
assert greeting('world') == 'Hello, world!'
def greeting2 = { it -> "Hello, $it!" }
assert greeting2('Tom') == 'Hello, Tom!'

// 不含参数的Closure的写法
def noParamsClosure = { -> true }
println "noParamsClosure return: " + noParamsClosure()

// 在Groovy中，如果函数的最后一个参数是闭包，在调用该函数时可以省略圆括号
def iamList = [1, 2, 3, 4, 5]
iamList.each({
	println it
})
iamList.each{
	println it + "..."
}

def testClosure(int param1, String param2, Closure closure) {
	//do something
	closure()
}
testClosure(4, "test", {
	println "I am in closure"
})
testClosure 4, "test", {
	println 'I am in closure & no ()'
}
