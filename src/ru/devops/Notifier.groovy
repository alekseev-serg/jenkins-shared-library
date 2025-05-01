// write Class
package ru.devops

class Notifier implements Serializable {
    def steps;

    Notifier(steps){
        this.steps = steps;
    }
    

    def info(String message) {
        steps.echo "[INFO] ${message}"
    }

    def success(String message) {
        steps.echo "[SUCCESS] ✅ ${message}"
    }

    def error(String message) {
        steps.echo "[ERROR] ❌ ${message}"
    }

}