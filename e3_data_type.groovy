println "Primary datatype example: "
def int x = 1
println x.getClass().getCanonicalName()

println "\nList example:"
def aList = [5, 'string', true]
assert aList[1] == 'string'
assert aList[5] == null
aList[100] = 100
assert aList[100] == 100
println "aList.size: " + aList.size

println "\nMap example:"
def aMap = ['key1':'value1', 'key2':true]
println "aMap.key1: " + aMap.key1
println "aMap['key2']: " + aMap['key2']
aMap.anotherkey = "I am map"
println "aMap: " + aMap

//注意key的正确使用方式
def playMap() {
	println("playMap:")
	def map = [a: "a", b: "b"]
	println(map)

	def key = "name"
	def map2 = [key: 'a']
	def map3 = [(key): 'a']
	println(map2)
	println(map3)
}
playMap()

println "\nRange example:"
def aRange = 1..5
def aRangeWithoutEnd = 1..<5
println "aRange: " + aRange
println "aRangeWithoutEnd: " + aRangeWithoutEnd
println "aRange.from: " + aRange.from
println "aRangeWithoutEnd.to: " + aRangeWithoutEnd.to