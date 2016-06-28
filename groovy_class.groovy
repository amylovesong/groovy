class People{
	String name
	int age
}
People p1 = new People();
People p2 = new People(name:"Luis", age:29)//类似map的方式赋值参数
println("p1.getName(): " + p1.getName())//自带的getter
println("p2.getAge(): " + p2.getAge())

def foo(String p1, int p2 = 1) {//p2为默认参数
	println(p1)
	println(p2)
}

foo("hello")
foo("hello", 2)

// Trait，可实现多继承
trait Fly {
	void fly() {
		println("fly")
	}
}

trait Walk {
	void walk() {
		println("walk")
	}
}

class Duck implements Fly, Walk {

}

Duck duck = new Duck()
duck.fly()
duck.walk()












