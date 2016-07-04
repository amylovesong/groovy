// import
import com.sun.groovy.Test

def test = new Test("sun", "is wonderful")
test.print()

// variable scope
// def x = 1 // 不可被printx()方法访问
// x = 1 // 不可被其他脚本访问
import groovy.transform.Field
@Field x = 1 // 被@Field标注的x是成员变量了

def printx(){
    println x
}

printx()