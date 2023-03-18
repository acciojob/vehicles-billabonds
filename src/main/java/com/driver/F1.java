package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned

        this.name = name;
        this.isManual = isManual;
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        if(rate>0 && rate<=50){
            newSpeed = rate;
            changeGear(1);
        }
        else if(rate>50 && rate<=100){
            newSpeed = rate;
            changeGear(2);
        }
        else if(rate>100 && rate<=150){
            newSpeed = rate;
            changeGear(3);
        }
        else if(rate>150 && rate<=200){
            newSpeed = rate;
            changeGear(4);
        }
        else if(rate>200 && rate<=250){
            newSpeed = rate;
            changeGear(5);
        }
        else if(rate>250){
            newSpeed = rate;
            changeGear(6);
        }

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            int direction  = 1;
            if(rate < 0) {
                int direction = 0;
            }

            changeSpeed(newSpeed, direction);
        }
    }
}
