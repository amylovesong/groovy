// Read file
def targetFile = new File("import.groovy")

println "File.eachLine():"
targetFile.eachLine {
	String oneLine ->
	println oneLine
}

println "\nFile.getBytes():\n" + targetFile.getBytes()
println "\nFile.bytes:\n" + targetFile.bytes

def ism = targetFile.newInputStream()
// Operation here
println "\nInputStream: " + ism
ism.close()

targetFile.withInputStream {
	ism1 ->
	println "InputStream instance in closure: " + ism1
	// Operation here
	// 无需close，Groovy自动处理
}

// Write file
def srcFile = new File("import.groovy")
def destFile = new File("copy_import.groovy")
destFile.withOutputStream {
	os -> 
	srcFile.withInputStream {
		ins ->
		os << ins
	}
}









