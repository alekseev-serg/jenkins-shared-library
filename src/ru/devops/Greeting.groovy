// write Class
package ru.devops

class Greeting implements Serializable {
    def steps;

    Greeting(steps){
        this.steps = steps;
    }

    def greet(String name){
        steps.echo "Hello, $name from class"
    }
}