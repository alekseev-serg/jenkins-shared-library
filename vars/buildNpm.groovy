import ru.devops.*


def call(){

    echo "Hello from Vars library!";
    def helper  = new Greeting(this)
    
    helper.greet('Devops')

    def notify = new Notifier(this)

    notify.info('Start Build')

}