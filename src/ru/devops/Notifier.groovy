// write Class
package ru.devops

class Notifier implements Serializable {

    def message(){
        steps.echo "Build is complete";
    }

}