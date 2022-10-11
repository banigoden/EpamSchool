package by.epam.java_introduction.programming_with_classes.task6;

    /*
    Составьте описание класса для представления времени.  Предусмотрите возможности установки времени и
    изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    недопустимых значений полей поле устанавливается в значение 0.  Создать методы изменения времени на
    заданное количество часов, минут и секунд.
     */

public class GetTime {

    private int  hours, minutes, seconds;

    public GetTime(int hours, int minutes, int seconds) {
        if (seconds > 60 || seconds < 0)
            seconds = 0;
        if (minutes > 60 || minutes < 0)
            minutes = 0;
        if (hours > 24 || hours < 0)
            hours = 0;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds > 60){
            this.seconds = 0;
        }else  {
            this.seconds = seconds;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 60){
            this.minutes = 0;
        }else  {
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 24){
            this.hours = 0;
        }else  {
            this.hours = hours;
        }
    }

    public void changeSeconds(int seconds){
        this.seconds += seconds;
        if(this.seconds > 59){
            changeMinutes(1);
            this.seconds -= 60;
        }

    }

    public void changeMinutes(int minutes){
        this.minutes += minutes;
        if(this.minutes > 59){
            changeHours(1);
            this.minutes -= 60;
        }

    }

    public void changeHours(int hours){
        this.hours += hours;
        if(this.hours >= 24){
            this.hours -= 24;
        }
    }

    @Override
    public String toString() {
        return  hours + ":" + minutes + ":" + seconds;
    }
}
