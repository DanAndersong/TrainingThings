package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 142;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
