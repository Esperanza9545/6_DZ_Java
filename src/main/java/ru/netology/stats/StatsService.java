package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) { //подсчет суммы продаж
        long sum = 0; //переменная для суммы
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {// полдсчет средней суммы продаж в месяц
        return calculateSum(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {// максимальные продажи в месяц
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {// минимальные продажи в месяц
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int aboveAverageSum(long[] sales) {// подсчет кол-ва месяцев, в которых продажи были ниже среднего
        int aboveAverageSale = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                aboveAverageSale++;
            }
        }
        return aboveAverageSale;
    }

    public int belowAverageSum(long[] sales) {// подсчет кол-ва месяцев, в которых продажи были выше среднего
        int belowAverageSale = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                belowAverageSale++;
            }
        }
        return belowAverageSale;
    }
}






