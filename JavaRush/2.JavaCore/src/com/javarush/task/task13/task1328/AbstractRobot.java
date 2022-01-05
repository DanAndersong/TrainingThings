package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Defensable, Attackable {
    private Random random = new Random();

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        int i = random.nextInt(4);

        if (i == 0) {
            attackedBodyPart = BodyPart.ARM;
        } else if (i == 1) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (i == 2) {
            attackedBodyPart = BodyPart.LEG;
        } else if (i == 3) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        int i = random.nextInt(4);

        if (i == 0) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (i == 1) {
            defendedBodyPart = BodyPart.LEG;
        } else if (i == 2) {
            defendedBodyPart = BodyPart.ARM;
        } else if (i == 3) {
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }


}
