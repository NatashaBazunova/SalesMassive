package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public int calculateMaxMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateLessAvg(int[] sales) {
        int lessAvg = 0;
        for (int sale : sales) {
            if (sale < calculateAverage (sales)) {
                lessAvg++;
            }
        }
        return lessAvg;
    }

    public int calculateAboveAvg(int[] sales) {
        int aboveAvg = 0;
        for (int sale : sales) {
            if (sale > calculateAverage (sales)) {
                aboveAvg++;
            }
        }
        return aboveAvg;
    }
}
