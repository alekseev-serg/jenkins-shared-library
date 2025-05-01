// write Class
package ru.devops

class Script implements Serializable {
    def steps;

    Script(steps){
        this.steps = steps;
    }

    def greet(String name){
        steps.echo "Hello, $name from class"
    }
}