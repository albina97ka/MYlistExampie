package com.example.listexampie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listofprod = {"Маринет и Адриан", "Маринет и Лука", "Адриант и Кагами", "Тикки и Плаг",
                "Габриэль и Натали", "Адриан и Хлоя", "Аля и Нино", "Адриан и Лило", "Адриан и Лука"};
        ListView listView = findViewById(R.id.list);
        TextView textView = findViewById(R.id.text);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                listofprod);
        listView.setAdapter(adapter);

        String MarAndAdr = "Маринет и Эдриан \n " +
                "Хорошая была бы пара, но одна трусиха признать свои чувства, а для другого она лучшая подруга." +
                " И как только они узнают личность друг друга, кто-то стирает им память.";
        String ocenka_1 = "4/10";

        String MarAndLyk = "Маринет и Лука \n" +
                "Лука это красивый мужчина, в шикарных трусах и просто хороший человек. " +
                        "Маринет рядом с ним чувствует себя защищёной и умиротворённой, а ещё он панк," +
                        " поэтому одобряем.";
        String ocenka_2 = "9/10";

        String AdyAndKag = "Эдриан и Кагами \n" +
                "Такое ощущение, что у Адриана проблемы со зрением, ведь Кагами похожа на маринет " +
                "только цветом волос, а он умудряется их путать";
        String ocenka_3 = "2/10";

        String TikiAnd = "Тикки и Плаг \n" +
                "Это как дед и бабка сидящие на лавочке пытаются разобраться в отношениях детей," +
                "а что происходит между ними не понятно";
        String ocenka_4 = "1000/10";

        String GabAndNata = "Габриэль и Натали \n" +
                "Натали это как Наташа из мужского и женского, никогда не уйдёт от него," +
                " хоть он думает только о мёртвой жене";
        String ocenka_5 = "5/10";

        String AdrAndHlo = "Адриан и Хлоя \n" +
                "Друзья детства. Хлоя хочет заполучить Адриана, как красивое украшение, " +
                "а он умный мальчик любит Леди Баг.";
        String ocenka_6 = "0/10";

        String AlaAndNino = "Аля и Нино \n" +
                "Шикарная пара, очень нравится. Самые адыкватные персонажи начали встречаться. " +
                "Я хочу быть их ребёнком";
        String ocenka_7 = "10/10";

        String AdrAndLilo = "Адриан и Лило \n" +
                "Это как совместить несовместимое. Как солёный огурцы и сгущёнка, на любителя.";
        String ocenka_8 = "-9/10";

        String AdrAndLyka = "Адриан и Лука \n" +
                "Вам тоже такое нравится?)";
        String ocenka_9 = "ONE LOVE";

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(listofprod[i]);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                switch(i){
                    case 0:
                        intent.putExtra("key", MarAndAdr);
                        intent.putExtra("key1", ocenka_1);
                        break;
                    case 1:
                        intent.putExtra("key", MarAndLyk);
                        intent.putExtra("key1", ocenka_2);
                        break;
                    case 2:
                        intent.putExtra("key", AdyAndKag);
                        intent.putExtra("key1", ocenka_3);
                        break;
                    case 3:
                        intent.putExtra("key", TikiAnd);
                        intent.putExtra("key1", ocenka_4);
                        break;
                    case 4:
                        intent.putExtra("key", GabAndNata);
                        intent.putExtra("key1", ocenka_5);
                        break;
                    case 5:
                        intent.putExtra("key", AdrAndHlo);
                        intent.putExtra("key1", ocenka_6);
                        break;
                    case 6:
                        intent.putExtra("key", AlaAndNino);
                        intent.putExtra("key1", ocenka_7);
                        break;
                    case 7:
                        intent.putExtra("key", AdrAndLilo);
                        intent.putExtra("key1", ocenka_8);
                        break;
                    case 8:
                        intent.putExtra("key", AdrAndLyka);
                        intent.putExtra("key1", ocenka_9);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}