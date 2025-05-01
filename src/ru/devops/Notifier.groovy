// write Class
package ru.devops

class Notifier implements Serializable {
    def msg;

    Notifier(steps){
        this.msg = msg;
    }
    def message(){
        msg.echo "Build is complete";
    }

}