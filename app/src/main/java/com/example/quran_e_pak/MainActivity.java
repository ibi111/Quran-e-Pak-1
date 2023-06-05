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

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,urduSurahNames);

        scroll_view.setAdapter(adp);


        scroll_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }
}