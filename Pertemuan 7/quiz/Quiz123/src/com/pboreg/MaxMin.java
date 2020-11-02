package com.pboreg;

public class MaxMin extends Nilai {

    public MaxMin() {
        super();
    }
    int max,min;

    public void nilaiMax() {
        if (this.a > this.b && this.a > this.c) {
             max = this.a;
        } else {
            if (this.b > this.c) {
                max = this.b;
            } else {
                max = this.c;
            }
        }
        System.out.println("Nilai Maximum : " + max);
    }

    public void nilaiMin() {
        if (this.a < this.b && this.a < this.c) {
            min = this.a;
        } else {
            if (this.b < this.c) {
                min = this.b;
            } else {
                min = this.c;
            }
        }
        System.out.println("Nilai Minimum : " + min);
    }
}
