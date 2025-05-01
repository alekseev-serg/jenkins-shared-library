import ru.devops.*


def call(){
    stage('Build'){
        echo "Hello from Vars library!";
    }

    stage('From Class'){
        def helper  = new Script(this)
        helper.greet('Devops')
    }
}