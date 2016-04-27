def aClosure = {
	String param1, int param2 ->
	println "this is code"
	println param1 + " " + param2
}

aClosure.call("this is string:", 100)
aClosure("this is int:", 20)

def greeting = { "Hello, $it!" }
assert greeting('world') == 'Hello, world!'
def greeting2 = { it -> "Hello, $it!" }
assert greeting2('Tom') == 'Hello, Tom!'

def noParamsClosure = { -> true }
println "noParamsClosure return: " + noParamsClosure()

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
	println 'I am in closure'
})
testClosure 4, "test", {
	println 'I am in closure & no ()'
}
