//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int    a=13567008;
        byte   b=127;
        short  c=-30000;
        long   d=5609090L;
        float  e=5.987f;
        double f=-9.090091234;

        float  g=27.12f;
        long   h=987678965549L;
        char   i=2786;
        short  k=569;
        short  l=-159;
        int    m=27897;
        short  n=67;

        byte  studentsLudmilaPavlovna=23;
        byte  studentsAnnaSergeevna=27;
        byte  studentsEkaterinaAndreevna=30;
        int   listOfPapers=480;
        int   listPerStudent=listOfPapers/(studentsLudmilaPavlovna+studentsAnnaSergeevna+studentsEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано "+listPerStudent+" листов бумаги.");
        System.out.println("   ");

        byte  outputPerMinute=16/2;
        int   outputPer20Minute=outputPerMinute*20;
        int   outputPerDay=outputPerMinute*24*60;
        int   outputPer3Days=outputPerMinute*24*60*3;
        int   outputPerMonth=outputPerMinute*24*60*30;
        System.out.println("За 20 минут машина произвела "+outputPer20Minute+" листов бумаги.");
        System.out.println("За один день машина произвела "+outputPerDay+" листов бумаги.");
        System.out.println("За 3 дня машина произвела "+outputPer3Days+" листов бумаги.");
        System.out.println("За месяц машина произвела "+outputPerMonth+" листов бумаги.");
        System.out.println("   ");

        byte totalCansOfPaint=120;
        byte cansOfWhitePaintPerClass=2;
        byte cansOfBrownPaintsPerClass=4;
        int  amountsOfClasses=totalCansOfPaint/(cansOfWhitePaintPerClass+cansOfBrownPaintsPerClass);
        int  totalCansOfWhitePaint=amountsOfClasses*cansOfWhitePaintPerClass;
        int  totalCansOfBrownPaint=amountsOfClasses*cansOfBrownPaintsPerClass;
        System.out.println("В школе, где "+amountsOfClasses+" классов, нужно "+totalCansOfWhitePaint+" банок белой краски и "+totalCansOfBrownPaint+" банок коричневой краски.");
        System.out.println("   ");

        byte   bananas=5; //items
        int    weightOfBananas=80*bananas; //grams
        int    milk=200;  //ml
        int   weightOfMilk=105*(milk/100); //grams
        byte   iceCream=2;//items
        int    weightOfIceCream=iceCream*100; //grams
        byte   eggs=4;    //items
        int    weightsOfEggs=eggs*70; //grams
        int    weightOfBreakfastGrams=weightOfBananas+weightOfMilk+weightOfIceCream+weightsOfEggs;
        float  weightOfBreakfastKg=weightOfBreakfastGrams/1000f;
        System.out.println("Вес завтрак в граммах составляет "+weightOfBreakfastGrams+", вес завтрака в кг составляет "+weightOfBreakfastKg+".");
        System.out.println("   ");

        byte goal=7; //kg
        int  loosWeight1=250; //grams
        int  loosWeight2=500; //grams
        int  totalDays1=(goal*1000)/loosWeight1;
        int  totalDays2=(goal*1000)/loosWeight2;
        System.out.println("Если спортсмен будет худеть по "+loosWeight1+" грамм в день, то его похудение займет "+ totalDays1 +" дней.");
        System.out.println("Если спортсмен будет худеть по "+loosWeight2+" грамм в день, то его похудение займет "+ totalDays2 +" дней.");
        System.out.println("   ");

        int  salaryOfMasha=67760;
        int  salaryOfDenis=83690;
        int  salaryOfKristina=76230;
        int  salaryOfMashaYear=67760*12;
        int  salaryOfDenisYear=83690*12;
        int  salaryOfKristinaYear=76230*12;
        int  salaryOfMashaNew=salaryOfMasha*10/100+salaryOfMasha;
        int  salaryOfDenisNew=salaryOfDenis*10/100+salaryOfDenis;
        int  salaryOfKristinaNew=salaryOfKristina*10/100+salaryOfKristina;
        int  salaryOfMashaYearNew=salaryOfMashaNew*12;
        int  salaryOfDenisYearNew=salaryOfDenisNew*12;
        int  salaryOfKristinaYearNew=salaryOfKristinaNew*12;
        int  salaryOfMashaYearDiff=salaryOfMashaYearNew-salaryOfMashaYear;
        int  salaryOfDenisYearDiff=salaryOfDenisYearNew-salaryOfDenisYear;
        int  salaryOfKristinaYearDiff=salaryOfKristinaYearNew-salaryOfKristinaYear;
        System.out.println("Маша теперь получает "+salaryOfMashaNew+" рублей в месяц. Годовой доход вырос на "+salaryOfMashaYearDiff+" рублей.");
        System.out.println("Денис теперь получает "+salaryOfDenisNew+" рублей в месяц. Годовой доход вырос на "+salaryOfDenisYearDiff+" рублей.");
        System.out.println("Кристина теперь получает "+salaryOfKristinaNew+" рублей в месяц. Годовой доход вырос на "+salaryOfKristinaYearDiff+" рублей.");













        }
    }
