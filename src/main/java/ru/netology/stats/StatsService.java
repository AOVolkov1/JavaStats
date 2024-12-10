package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double avgSales(long[] sales) {
        long sum = sumSales(sales);

        double avg = sum / sales.length;

        return avg;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int UnderAvg(long[] sales) {
        int numberUnderAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales(sales)) {
                numberUnderAvg++;
            }
        }
        return numberUnderAvg;
    }

    public int AboveAvg(long[] sales) {
        int numberAboveAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSales(sales)) {
                numberAboveAvg++;
            }
        }
        return numberAboveAvg;
    }
}