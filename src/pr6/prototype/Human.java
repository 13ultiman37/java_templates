package pr6.prototype;

class Human implements Copyable {
    int age;
    String name;

    public Human (int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Object copy(){
        Human copy = new Human(age, name);
        return copy;
    }
}