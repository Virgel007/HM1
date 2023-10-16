        //### **Задача 1.**
        // На уроке мы проходили разные типы переменных.
        // Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их). //
public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5f;
        double f = 6.0;
        System.out.println("тип переменой и их инициализация " + a + b + c + d + e + f);
        //### **Задача 2.**
        // А теперь решите задание.
        // В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
        // что боксеры соответствуют своей весовой категории, и бой будет честным.
        // Вес одного боксера – 78,2 кг
        // Вес второго боксера – 82,7 кг
        // Подсчитайте и выведите в консоль общий вес двух бойцов.
        // Подсчитайте и выведите в консоль разницу между весами бойцов.
        float oneBoxer = 78.2f;
        float twoBoxer = 82.7f;
        var boxerWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес боксеров " +boxerWeight + " кг.");

        var differenceBoxer = twoBoxer - oneBoxer;
        System.out.println("Разница веса боксеров " + differenceBoxer + " кг.");

        //### **Задача 3.**
        // За весом спортсмена следит не только сам спортсмен, но и его тренер.
        // Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
        // Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
        //– Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        // Смешать всё в блендере и готово.
        // Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        // Результат напечатайте в консоль.
        // **Важное условие:** если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
        // то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм,
        // то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.
        var banan = 5;
        var bananWeight = banan * 80;
        var milk = 200;
        var milkWeight = milk * 105 / 100;
        var iceCream = 2;
        var iceCreamWeight = iceCream * 100;
        var rawEggs = 4;
        var rawEggsWeight = rawEggs * 70;
        var sportDrink = (bananWeight + milkWeight + iceCreamWeight + rawEggsWeight) / 1000f;

        System.out.println("Вес спорт-завтрака " + sportDrink + " кг.");
        //### **Задача 4.**
        // Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        // Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        // Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        // Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        // Результаты подсчетов выведите в консоль.
        var sportManWeightLoss = 7;
        var sportManTypeA = 250;
        var sportManTypeB = 500;
        var WeightLossTypeA = (sportManWeightLoss * 1000) / sportManTypeA;
        var WeightLossTypeB = (sportManWeightLoss * 1000) / sportManTypeB;
        System.out.println("Дней уйдет чтобы сбросить " + sportManWeightLoss +" кг. " + WeightLossTypeA + " дней." + " теряя в весе "  +sportManTypeA + " гр.");
        System.out.println("Дней уйдет чтобы сбросить " + sportManWeightLoss +" кг. " + WeightLossTypeB + " дней." + " теряя в весе "  +sportManTypeB + " гр.");
        //### **Задача 5.**
        // Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        // В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники,
        // которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        // К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        // Маша получает 67 760 рублей в месяц
        // Денис получает 83 690 рублей в месяц
        // Кристина получает 76 230 рублей в месяц
        // Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        // Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        // Выведите в консоль информацию по каждому сотруднику.
        // Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

        var moneyMonthWorkerMasha = 67760;
        var moneyMonthWorkerDenis = 83690;
        var moneyMonthWorkerCristina = 76230;
        var moneyMonthWorkerIncrease = 10;
        var monthInYer = 12;

        var moneyMonthWorkerMashaIncrease = moneyMonthWorkerMasha / moneyMonthWorkerIncrease + moneyMonthWorkerMasha;
        var YerMonthWorkerMashaIncrease = moneyMonthWorkerMashaIncrease * monthInYer;
        var YerMonthWorkerMashaTotalIncrease = (YerMonthWorkerMashaIncrease) - (moneyMonthWorkerMasha * monthInYer);
        System.out.println("Маша теперь получает в месяц. "+ moneyMonthWorkerMashaIncrease + " рублей." + " Маша получает в год " + YerMonthWorkerMashaIncrease + " рублей." + " Сумма прибавки " + YerMonthWorkerMashaTotalIncrease + " рублей.");

        var moneyMonthWorkerDenisIncrease = moneyMonthWorkerDenis / moneyMonthWorkerIncrease + moneyMonthWorkerDenis;
        var YerMonthWorkerDenisIncrease = moneyMonthWorkerDenisIncrease * monthInYer;
        var YerMonthWorkerDenisTotalIncrease = (YerMonthWorkerDenisIncrease) - (moneyMonthWorkerDenis * monthInYer);
        System.out.println("Денис теперь получает в месяц. "+ moneyMonthWorkerDenisIncrease + " рублей." + " Денис получает в год " + YerMonthWorkerDenisIncrease + " рублей." + " Сумма прибавки " + YerMonthWorkerDenisTotalIncrease + " рублей.");

        var moneyMonthWorkerCristinaIncrease = moneyMonthWorkerCristina / moneyMonthWorkerIncrease + moneyMonthWorkerCristina;
        var YerMonthWorkerCristinaIncrease = moneyMonthWorkerCristinaIncrease * monthInYer;
        var YerMonthWorkerCristinaTotalIncrease = (YerMonthWorkerCristinaIncrease) - (moneyMonthWorkerCristina * monthInYer);
        System.out.println("Кристина теперь получает в месяц. "+ moneyMonthWorkerCristinaIncrease + " рублей." + " Кристина получает в год " + YerMonthWorkerCristinaIncrease + " рублей." + " Сумма прибавки " + YerMonthWorkerCristinaTotalIncrease + " рублей.");

    }
}