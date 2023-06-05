package com.example.quran_e_pak;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView scroll_view ;
        scroll_view=findViewById(R.id.lst);

        String[] urduSurahNames = {
                "الفاتحۃ",
                " البقرۃ",
                "آل عمران",
                "النسآء",
                "المآئدۃ",
                "الانعام",
                "الاعراف",
                "الانفال",
                "التوبۃ",
                "یونس",
                "ھود",
                "یوسف",
                "الرعد",
                "ابراھیم",
                "الحجر",
                "النحل",
                "الاسراء",
                "الکہف",
                "مریم",
                "طٰہٰ",
                "الانبیآء",
                "الحج",
                "المؤمنون",
                "النور",
                "الفرقان",
                "الشعراء",
                "النمل",
                "القصص",
                "العنکبوت",
                "الروم",
                "لقمٰن",
                "السجدۃ",
                "الاحزاب",
                "سبا",
                "فاطر",
                "یٰسٓ",
                "الصّٰفّٰت",
                "صٓ",
                "الزمر",
                "الغافر",
                "فصلت",
                "الشُّورٰی",
                "الزُّخرُف",
                "الدُّخَان",
                "الجاثیہ",
                "الاحقاف",
                "محمد",
                "الفتح",
                "الحجرات",
                "قٓ",
                "الذّٰریٰت",
                "الطّور",
                "النجم",
                "القمر",
                "الرحمٰن",
                "الواقعۃ",
                " الحدید",
                "المجادلۃ",
                "الحشر",
                " الممتحنۃ",
                "الصّف",
                "الجُمعۃ",
                "المُنٰفِقُون",
                " التّغابن",
                "الطّلاق",
                "التحریم",
                "الملک",
                "القلم",
                " الحاقہ",
                "المعارج",
                "نُوح",
                "الجن",
                "المزّمّل",
                "المدّثّر",
                "القیٰمۃ",
                "الانسان",
                "المرسلٰت",
                "النَّبَاِ",
                "النّٰزِعٰتِ",
                "عَبَسَ",
                " التَّکوِیر",
                " الاِنفِطَار",
                "المُطَفِّفِین",
                "الاِنشِقَاق",
                "البُرُوج",
                "الطَّارق",
                "الاَعلیٰ",
                "الغَاشِیَۃ",
                "الفجر",
                "البلد",
                " الشَّمس",
                "الَّیل",
                "الضُّحٰی",
                "الم نشرح",
                "التّین",
                "العَلَق",
                " القدر",
                "البیّنۃ",
                "الزّلزال",
                "العٰدیٰت",
                " القارعۃ",
                "التّکاثُر",
                " العصر",
                "الھُمَزَۃ",
                "الفِیل",
                "قُرَیش",
                "المَاعُون",
                "الکوثر",
                "الکٰفرون",
                "النَّصَر",
                "اللَّھب",
                "الاخلاص",
                "الفَلَق",
                " النَّاس"
        };

        int[] SSP = {
                1,
                8,
                295,
                496,
                673,
                794,
                960,
                1167,
                1243,
                1372,
                1482,
                1606,
                1718,
                1762,
                1815,
                1915,
                2044,
                2156,
                2267,
                2366,
                2502,
                2615,
                2694,
                2813,
                2878,
                2956,
                3184,
                3278,
                3367,
                3437,
                3498,
                3533,
                3564,
                3638,
                3693,
                3739,
                3823,
                4006,
                4095,
                4171,
                4257,
                4312,
                4366,
                4456,
                4516,
                4554,
                4590,
                4629,
                4659,
                4678,
                4724,
                4785,
                4835,
                4898,
                4954,
                5033,
                5130,
                5160,
                5183,
                5208,
                5222,
                5237,
                5249,
                5261,
                5280,
                5293,
                5306,
                5337,
                5390,
                5443,
                5488,
                5517,
                5546,
                5567,
                5624,
                5665,
                5697,
                5748,
                5789,
                5836,
                5879,
                5909,
                5929,
                5966,
                5992,
                6015,
                6033,
                6053,
                6080,
                6111,
                6132,
                6148,
                6170,
                6182,
                6191,
                6200,
                6220,
                6226,
                6235,
                6244,
                6256,
                6268,
                6277,
                6281,
                6291,
                6297,
                6302,
                6310,
                6314,
                6321,
                6325,
                6331,
                6336,
                6342,
                6342
        };
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,urduSurahNames);

        scroll_view.setAdapter(adp);


        scroll_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }
}