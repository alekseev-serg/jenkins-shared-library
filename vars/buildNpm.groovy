import ru.devops.*


def call(){

    echo "Hello from Vars library!";
    def helper  = new Script(this)
    helper.greet('Devops')
    
}