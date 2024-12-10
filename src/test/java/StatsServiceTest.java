import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long sumSales = service.sumSales(sales);
        Assertions.assertEquals(expected, sumSales);
        System.out.println(sumSales + " сумма продаж");
    }

    @Test
    public void shouldFindAvgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double avg = service.avgSales(sales);
        Assertions.assertEquals(expected, avg);
        System.out.println(avg + " средняя сумма продаж в месяц");
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int minMonth = service.minSales(sales);
        Assertions.assertEquals(expected, minMonth);
        System.out.println(minMonth + " месяц минимальных продаж");
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int maxMonth = service.maxSales(sales);
        Assertions.assertEquals(expected, maxMonth);
        System.out.println(maxMonth + " месяц максимальных продаж");
    }

    @Test
    public void shouldFindUnderAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int numberUnderAvg = service.UnderAvg(sales);
        Assertions.assertEquals(expected, numberUnderAvg);
        System.out.println(numberUnderAvg + " месяцев, в которых продажи были ниже среднего");
    }

    @Test
    public void shouldFindAboveAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int numberAboveAvg = service.AboveAvg(sales);
        Assertions.assertEquals(expected, numberAboveAvg);
        System.out.println(numberAboveAvg + " месяцев, в которых продажи были выше среднего");
    }

}
