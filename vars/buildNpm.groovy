import ru.devops.*


def call(){

    echo "Hello from Vars library!";
    def helper  = new Greeting(this)
    
    helper.greet('Devops')

    def notify = new Notifier(this)

    echo "Build"

    notify.success('Build complete')

}