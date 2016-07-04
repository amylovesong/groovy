import groovy.util.slurpersupport.GPathResult

def xparser = new XmlSlurper()
def targetFile = new File("e5_3_test.xml")

GPathResult gpathResult = xparser.parse(targetFile)

def book4 = gpathResult.value.books.book[3]
def author = book4.author
assert author.text() == 'Manuel De Cervantes'
println "author.text(): " + author.text()

assert author.@id == '4'
assert author['@id'] == '4'
assert author.@id.toInteger() == 4
println "author.@id: " + author.@id

// Read package from AndroidManifest.xml
def androidManifest = new XmlSlurper().parse("e5_3_" + "AndroidManifest.xml")
println "package: " + androidManifest.@package
