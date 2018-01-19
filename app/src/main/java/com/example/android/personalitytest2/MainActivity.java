package com.example.android.personalitytest2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public double avg1 = 0, avg2 = 0, avg3 = 0, avg4 = 0, avg5 = 0, avg6 = 0, avg7 = 0, avg8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.send_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean ok;
                double sum1 = 0;
                CheckBox box1_1 = (CheckBox) findViewById(R.id.text_choice_11);
                CheckBox box1_2 = (CheckBox) findViewById(R.id.text_choice_12);
                CheckBox box1_3 = (CheckBox) findViewById(R.id.text_choice_13);
                CheckBox box1_4 = (CheckBox) findViewById(R.id.text_choice_14);
                CheckBox box1_5 = (CheckBox) findViewById(R.id.text_choice_15);
                uncheckAll(R.id.text_choice_11, R.id.text_choice_12,
                        R.id.text_choice_13, R.id.text_choice_14, R.id.text_choice_15);
                ok = false;
                if (box1_1.isChecked()) {
                    sum1 += 5;
                    ok = true;
                    Log.i("Check1", "1");
                }
                if (box1_2.isChecked() && !ok) {
                    sum1 += 4;
                    Log.i("Check1", "2");
                    ok = true;
                }
                if (box1_3.isChecked() && !ok) {
                    sum1 += 3;
                    Log.i("Check1", "3");
                    ok = true;
                }
                if (box1_4.isChecked() && !ok) {
                    sum1 += 2;
                    Log.i("Check1", "4");
                    ok = true;
                }
                if (box1_5.isChecked() && !ok) {
                    sum1 += 1;
                    Log.i("Check1", "5");
                    ok = true;
                }

                CheckBox box2_1 = (CheckBox) findViewById(R.id.text_choice_21);
                CheckBox box2_2 = (CheckBox) findViewById(R.id.text_choice_22);
                CheckBox box2_3 = (CheckBox) findViewById(R.id.text_choice_23);
                CheckBox box2_4 = (CheckBox) findViewById(R.id.text_choice_24);
                CheckBox box2_5 = (CheckBox) findViewById(R.id.text_choice_25);
                uncheckAll(R.id.text_choice_21, R.id.text_choice_22,
                        R.id.text_choice_23, R.id.text_choice_24, R.id.text_choice_25);
                ok = false;
                if (box2_1.isChecked()) {
                    sum1 += 5;
                    ok = true;
                }
                if (box2_2.isChecked() && !ok) {
                    sum1 += 4;
                    ok = true;
                }
                if (box2_3.isChecked() && !ok) {
                    sum1 += 3;
                    ok = true;
                }
                if (box2_4.isChecked() && !ok) {
                    sum1 += 2;
                    ok = true;
                }
                if (box2_5.isChecked() && !ok) {
                    sum1 += 1;
                    ok = true;
                }
                Log.i("Sum1", "" + sum1);
                avg1 = sum1;

                // a doua categorie de intrebari
                double sum2 = 0;
                CheckBox box3_1 = (CheckBox) findViewById(R.id.text_choice_31);
                CheckBox box3_2 = (CheckBox) findViewById(R.id.text_choice_32);
                CheckBox box3_3 = (CheckBox) findViewById(R.id.text_choice_33);
                CheckBox box3_4 = (CheckBox) findViewById(R.id.text_choice_34);
                CheckBox box3_5 = (CheckBox) findViewById(R.id.text_choice_35);
                uncheckAll(R.id.text_choice_31, R.id.text_choice_32,
                        R.id.text_choice_33, R.id.text_choice_34, R.id.text_choice_35);
                ok = false;
                if (box3_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box3_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box3_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box3_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box3_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box4_1 = (CheckBox) findViewById(R.id.text_choice_41);
                CheckBox box4_2 = (CheckBox) findViewById(R.id.text_choice_42);
                CheckBox box4_3 = (CheckBox) findViewById(R.id.text_choice_43);
                CheckBox box4_4 = (CheckBox) findViewById(R.id.text_choice_44);
                CheckBox box4_5 = (CheckBox) findViewById(R.id.text_choice_45);
                uncheckAll(R.id.text_choice_41, R.id.text_choice_42,
                        R.id.text_choice_43, R.id.text_choice_44, R.id.text_choice_45);
                ok = false;
                if (box4_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box4_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box4_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box4_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box4_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box5_1 = (CheckBox) findViewById(R.id.text_choice_51);
                CheckBox box5_2 = (CheckBox) findViewById(R.id.text_choice_52);
                CheckBox box5_3 = (CheckBox) findViewById(R.id.text_choice_53);
                CheckBox box5_4 = (CheckBox) findViewById(R.id.text_choice_54);
                CheckBox box5_5 = (CheckBox) findViewById(R.id.text_choice_55);
                uncheckAll(R.id.text_choice_51, R.id.text_choice_52,
                        R.id.text_choice_53, R.id.text_choice_54, R.id.text_choice_55);
                ok = false;
                if (box5_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box5_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box5_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box5_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box5_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box6_1 = (CheckBox) findViewById(R.id.text_choice_61);
                CheckBox box6_2 = (CheckBox) findViewById(R.id.text_choice_62);
                CheckBox box6_3 = (CheckBox) findViewById(R.id.text_choice_63);
                CheckBox box6_4 = (CheckBox) findViewById(R.id.text_choice_64);
                CheckBox box6_5 = (CheckBox) findViewById(R.id.text_choice_65);
                uncheckAll(R.id.text_choice_61, R.id.text_choice_62,
                        R.id.text_choice_63, R.id.text_choice_64, R.id.text_choice_65);
                ok = false;
                if (box6_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box6_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box6_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box6_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box6_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box7_1 = (CheckBox) findViewById(R.id.text_choice_71);
                CheckBox box7_2 = (CheckBox) findViewById(R.id.text_choice_72);
                CheckBox box7_3 = (CheckBox) findViewById(R.id.text_choice_73);
                CheckBox box7_4 = (CheckBox) findViewById(R.id.text_choice_74);
                CheckBox box7_5 = (CheckBox) findViewById(R.id.text_choice_75);
                uncheckAll(R.id.text_choice_71, R.id.text_choice_72,
                        R.id.text_choice_73, R.id.text_choice_74, R.id.text_choice_75);
                ok = false;
                if (box7_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box7_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box7_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box7_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box7_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box8_1 = (CheckBox) findViewById(R.id.text_choice_81);
                CheckBox box8_2 = (CheckBox) findViewById(R.id.text_choice_82);
                CheckBox box8_3 = (CheckBox) findViewById(R.id.text_choice_83);
                CheckBox box8_4 = (CheckBox) findViewById(R.id.text_choice_84);
                CheckBox box8_5 = (CheckBox) findViewById(R.id.text_choice_85);
                uncheckAll(R.id.text_choice_81, R.id.text_choice_82,
                        R.id.text_choice_83, R.id.text_choice_84, R.id.text_choice_85);
                ok = false;
                if (box8_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box8_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box8_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box8_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box8_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box9_1 = (CheckBox) findViewById(R.id.text_choice_91);
                CheckBox box9_2 = (CheckBox) findViewById(R.id.text_choice_92);
                CheckBox box9_3 = (CheckBox) findViewById(R.id.text_choice_93);
                CheckBox box9_4 = (CheckBox) findViewById(R.id.text_choice_94);
                CheckBox box9_5 = (CheckBox) findViewById(R.id.text_choice_95);
                uncheckAll(R.id.text_choice_91, R.id.text_choice_92,
                        R.id.text_choice_93, R.id.text_choice_94, R.id.text_choice_95);
                ok = false;
                if (box9_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box9_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box9_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box9_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box9_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box10_1 = (CheckBox) findViewById(R.id.text_choice_101);
                CheckBox box10_2 = (CheckBox) findViewById(R.id.text_choice_102);
                CheckBox box10_3 = (CheckBox) findViewById(R.id.text_choice_103);
                CheckBox box10_4 = (CheckBox) findViewById(R.id.text_choice_104);
                CheckBox box10_5 = (CheckBox) findViewById(R.id.text_choice_105);
                uncheckAll(R.id.text_choice_101, R.id.text_choice_102,
                        R.id.text_choice_103, R.id.text_choice_104, R.id.text_choice_105);
                ok = false;
                if (box10_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box10_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box10_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box10_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box10_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box11_1 = (CheckBox) findViewById(R.id.text_choice_111);
                CheckBox box11_2 = (CheckBox) findViewById(R.id.text_choice_112);
                CheckBox box11_3 = (CheckBox) findViewById(R.id.text_choice_113);
                CheckBox box11_4 = (CheckBox) findViewById(R.id.text_choice_114);
                CheckBox box11_5 = (CheckBox) findViewById(R.id.text_choice_115);
                uncheckAll(R.id.text_choice_111, R.id.text_choice_112,
                        R.id.text_choice_113, R.id.text_choice_114, R.id.text_choice_115);
                ok = false;
                if (box11_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box11_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box11_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box11_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box11_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box12_1 = (CheckBox) findViewById(R.id.text_choice_121);
                CheckBox box12_2 = (CheckBox) findViewById(R.id.text_choice_122);
                CheckBox box12_3 = (CheckBox) findViewById(R.id.text_choice_123);
                CheckBox box12_4 = (CheckBox) findViewById(R.id.text_choice_124);
                CheckBox box12_5 = (CheckBox) findViewById(R.id.text_choice_125);
                uncheckAll(R.id.text_choice_121, R.id.text_choice_122,
                        R.id.text_choice_123, R.id.text_choice_124, R.id.text_choice_125);
                ok = false;
                if (box12_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box12_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box12_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box12_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box12_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box13_1 = (CheckBox) findViewById(R.id.text_choice_131);
                CheckBox box13_2 = (CheckBox) findViewById(R.id.text_choice_132);
                CheckBox box13_3 = (CheckBox) findViewById(R.id.text_choice_133);
                CheckBox box13_4 = (CheckBox) findViewById(R.id.text_choice_134);
                CheckBox box13_5 = (CheckBox) findViewById(R.id.text_choice_135);
                uncheckAll(R.id.text_choice_131, R.id.text_choice_132,
                        R.id.text_choice_133, R.id.text_choice_134, R.id.text_choice_135);
                ok = false;
                if (box13_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box13_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box13_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box13_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box13_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box14_1 = (CheckBox) findViewById(R.id.text_choice_141);
                CheckBox box14_2 = (CheckBox) findViewById(R.id.text_choice_142);
                CheckBox box14_3 = (CheckBox) findViewById(R.id.text_choice_143);
                CheckBox box14_4 = (CheckBox) findViewById(R.id.text_choice_144);
                CheckBox box14_5 = (CheckBox) findViewById(R.id.text_choice_145);
                uncheckAll(R.id.text_choice_141, R.id.text_choice_142,
                        R.id.text_choice_143, R.id.text_choice_144, R.id.text_choice_145);
                ok = false;
                if (box14_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box14_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box14_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box14_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box14_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box15_1 = (CheckBox) findViewById(R.id.text_choice_151);
                CheckBox box15_2 = (CheckBox) findViewById(R.id.text_choice_152);
                CheckBox box15_3 = (CheckBox) findViewById(R.id.text_choice_153);
                CheckBox box15_4 = (CheckBox) findViewById(R.id.text_choice_154);
                CheckBox box15_5 = (CheckBox) findViewById(R.id.text_choice_155);
                uncheckAll(R.id.text_choice_151, R.id.text_choice_152,
                        R.id.text_choice_153, R.id.text_choice_154, R.id.text_choice_155);
                ok = false;
                if (box15_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box15_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box15_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box15_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box15_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box16_1 = (CheckBox) findViewById(R.id.text_choice_161);
                CheckBox box16_2 = (CheckBox) findViewById(R.id.text_choice_162);
                CheckBox box16_3 = (CheckBox) findViewById(R.id.text_choice_163);
                CheckBox box16_4 = (CheckBox) findViewById(R.id.text_choice_164);
                CheckBox box16_5 = (CheckBox) findViewById(R.id.text_choice_165);
                uncheckAll(R.id.text_choice_161, R.id.text_choice_162,
                        R.id.text_choice_163, R.id.text_choice_164, R.id.text_choice_165);
                ok = false;
                if (box16_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box16_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box16_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box16_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box16_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box17_1 = (CheckBox) findViewById(R.id.text_choice_171);
                CheckBox box17_2 = (CheckBox) findViewById(R.id.text_choice_172);
                CheckBox box17_3 = (CheckBox) findViewById(R.id.text_choice_173);
                CheckBox box17_4 = (CheckBox) findViewById(R.id.text_choice_174);
                CheckBox box17_5 = (CheckBox) findViewById(R.id.text_choice_175);
                uncheckAll(R.id.text_choice_171, R.id.text_choice_172,
                        R.id.text_choice_173, R.id.text_choice_174, R.id.text_choice_175);
                ok = false;
                if (box17_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box17_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box17_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box17_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box17_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box18_1 = (CheckBox) findViewById(R.id.text_choice_181);
                CheckBox box18_2 = (CheckBox) findViewById(R.id.text_choice_182);
                CheckBox box18_3 = (CheckBox) findViewById(R.id.text_choice_183);
                CheckBox box18_4 = (CheckBox) findViewById(R.id.text_choice_184);
                CheckBox box18_5 = (CheckBox) findViewById(R.id.text_choice_185);
                uncheckAll(R.id.text_choice_181, R.id.text_choice_182,
                        R.id.text_choice_183, R.id.text_choice_184, R.id.text_choice_185);
                ok = false;
                if (box18_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box18_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box18_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box18_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box18_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box19_1 = (CheckBox) findViewById(R.id.text_choice_191);
                CheckBox box19_2 = (CheckBox) findViewById(R.id.text_choice_192);
                CheckBox box19_3 = (CheckBox) findViewById(R.id.text_choice_193);
                CheckBox box19_4 = (CheckBox) findViewById(R.id.text_choice_194);
                CheckBox box19_5 = (CheckBox) findViewById(R.id.text_choice_195);
                uncheckAll(R.id.text_choice_191, R.id.text_choice_192,
                        R.id.text_choice_193, R.id.text_choice_194, R.id.text_choice_195);
                ok = false;
                if (box19_1.isChecked()) {
                    sum2 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box19_2.isChecked() && !ok) {
                    sum2 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box19_3.isChecked() && !ok) {
                    sum2 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box19_4.isChecked() && !ok) {
                    sum2 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box19_5.isChecked() && !ok) {
                    sum2 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                avg2 = sum2 / 17;

                double sum3 = 0;
                CheckBox box20_1 = (CheckBox) findViewById(R.id.text_choice_201);
                CheckBox box20_2 = (CheckBox) findViewById(R.id.text_choice_202);
                CheckBox box20_3 = (CheckBox) findViewById(R.id.text_choice_203);
                CheckBox box20_4 = (CheckBox) findViewById(R.id.text_choice_204);
                CheckBox box20_5 = (CheckBox) findViewById(R.id.text_choice_205);
                uncheckAll(R.id.text_choice_201, R.id.text_choice_202,
                        R.id.text_choice_203, R.id.text_choice_204, R.id.text_choice_205);
                ok = false;
                if (box20_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box20_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box20_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box20_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box20_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box21_1 = (CheckBox) findViewById(R.id.text_choice_211);
                CheckBox box21_2 = (CheckBox) findViewById(R.id.text_choice_212);
                CheckBox box21_3 = (CheckBox) findViewById(R.id.text_choice_213);
                CheckBox box21_4 = (CheckBox) findViewById(R.id.text_choice_214);
                CheckBox box21_5 = (CheckBox) findViewById(R.id.text_choice_215);
                uncheckAll(R.id.text_choice_211, R.id.text_choice_212,
                        R.id.text_choice_213, R.id.text_choice_214, R.id.text_choice_215);
                ok = false;
                if (box21_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box21_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box21_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box21_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box21_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box22_1 = (CheckBox) findViewById(R.id.text_choice_221);
                CheckBox box22_2 = (CheckBox) findViewById(R.id.text_choice_222);
                CheckBox box22_3 = (CheckBox) findViewById(R.id.text_choice_223);
                CheckBox box22_4 = (CheckBox) findViewById(R.id.text_choice_224);
                CheckBox box22_5 = (CheckBox) findViewById(R.id.text_choice_225);
                uncheckAll(R.id.text_choice_221, R.id.text_choice_222,
                        R.id.text_choice_223, R.id.text_choice_224, R.id.text_choice_225);
                ok = false;
                if (box22_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box22_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box22_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box22_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box22_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box23_1 = (CheckBox) findViewById(R.id.text_choice_231);
                CheckBox box23_2 = (CheckBox) findViewById(R.id.text_choice_232);
                CheckBox box23_3 = (CheckBox) findViewById(R.id.text_choice_233);
                CheckBox box23_4 = (CheckBox) findViewById(R.id.text_choice_234);
                CheckBox box23_5 = (CheckBox) findViewById(R.id.text_choice_235);
                uncheckAll(R.id.text_choice_231, R.id.text_choice_232,
                        R.id.text_choice_233, R.id.text_choice_234, R.id.text_choice_235);
                ok = false;
                if (box23_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box23_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box23_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box23_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box23_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box24_1 = (CheckBox) findViewById(R.id.text_choice_241);
                CheckBox box24_2 = (CheckBox) findViewById(R.id.text_choice_242);
                CheckBox box24_3 = (CheckBox) findViewById(R.id.text_choice_243);
                CheckBox box24_4 = (CheckBox) findViewById(R.id.text_choice_244);
                CheckBox box24_5 = (CheckBox) findViewById(R.id.text_choice_245);
                uncheckAll(R.id.text_choice_241, R.id.text_choice_242,
                        R.id.text_choice_243, R.id.text_choice_244, R.id.text_choice_245);
                ok = false;
                if (box24_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box24_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box24_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box24_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box24_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box25_1 = (CheckBox) findViewById(R.id.text_choice_251);
                CheckBox box25_2 = (CheckBox) findViewById(R.id.text_choice_252);
                CheckBox box25_3 = (CheckBox) findViewById(R.id.text_choice_253);
                CheckBox box25_4 = (CheckBox) findViewById(R.id.text_choice_254);
                CheckBox box25_5 = (CheckBox) findViewById(R.id.text_choice_255);
                uncheckAll(R.id.text_choice_251, R.id.text_choice_252,
                        R.id.text_choice_253, R.id.text_choice_254, R.id.text_choice_255);
                ok = false;
                if (box25_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box25_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box25_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box25_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box25_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box26_1 = (CheckBox) findViewById(R.id.text_choice_261);
                CheckBox box26_2 = (CheckBox) findViewById(R.id.text_choice_262);
                CheckBox box26_3 = (CheckBox) findViewById(R.id.text_choice_263);
                CheckBox box26_4 = (CheckBox) findViewById(R.id.text_choice_264);
                CheckBox box26_5 = (CheckBox) findViewById(R.id.text_choice_265);
                uncheckAll(R.id.text_choice_261, R.id.text_choice_262,
                        R.id.text_choice_263, R.id.text_choice_264, R.id.text_choice_265);
                ok = false;
                if (box26_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box26_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box26_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box26_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box26_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box27_1 = (CheckBox) findViewById(R.id.text_choice_271);
                CheckBox box27_2 = (CheckBox) findViewById(R.id.text_choice_272);
                CheckBox box27_3 = (CheckBox) findViewById(R.id.text_choice_273);
                CheckBox box27_4 = (CheckBox) findViewById(R.id.text_choice_274);
                CheckBox box27_5 = (CheckBox) findViewById(R.id.text_choice_275);
                uncheckAll(R.id.text_choice_271, R.id.text_choice_272,
                        R.id.text_choice_273, R.id.text_choice_274, R.id.text_choice_275);
                ok = false;
                if (box27_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box27_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box27_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box27_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box27_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box28_1 = (CheckBox) findViewById(R.id.text_choice_281);
                CheckBox box28_2 = (CheckBox) findViewById(R.id.text_choice_282);
                CheckBox box28_3 = (CheckBox) findViewById(R.id.text_choice_283);
                CheckBox box28_4 = (CheckBox) findViewById(R.id.text_choice_284);
                CheckBox box28_5 = (CheckBox) findViewById(R.id.text_choice_285);
                uncheckAll(R.id.text_choice_281, R.id.text_choice_282,
                        R.id.text_choice_283, R.id.text_choice_284, R.id.text_choice_285);
                ok = false;
                if (box28_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box28_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box28_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box28_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box28_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box29_1 = (CheckBox) findViewById(R.id.text_choice_291);
                CheckBox box29_2 = (CheckBox) findViewById(R.id.text_choice_292);
                CheckBox box29_3 = (CheckBox) findViewById(R.id.text_choice_293);
                CheckBox box29_4 = (CheckBox) findViewById(R.id.text_choice_294);
                CheckBox box29_5 = (CheckBox) findViewById(R.id.text_choice_295);
                uncheckAll(R.id.text_choice_291, R.id.text_choice_292,
                        R.id.text_choice_293, R.id.text_choice_294, R.id.text_choice_295);
                ok = false;
                if (box29_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box29_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box29_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box29_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box29_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box30_1 = (CheckBox) findViewById(R.id.text_choice_301);
                CheckBox box30_2 = (CheckBox) findViewById(R.id.text_choice_302);
                CheckBox box30_3 = (CheckBox) findViewById(R.id.text_choice_303);
                CheckBox box30_4 = (CheckBox) findViewById(R.id.text_choice_304);
                CheckBox box30_5 = (CheckBox) findViewById(R.id.text_choice_305);
                uncheckAll(R.id.text_choice_301, R.id.text_choice_302,
                        R.id.text_choice_303, R.id.text_choice_304, R.id.text_choice_305);
                ok = false;
                if (box30_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box30_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box30_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box30_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box30_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box31_1 = (CheckBox) findViewById(R.id.text_choice_311);
                CheckBox box31_2 = (CheckBox) findViewById(R.id.text_choice_312);
                CheckBox box31_3 = (CheckBox) findViewById(R.id.text_choice_313);
                CheckBox box31_4 = (CheckBox) findViewById(R.id.text_choice_314);
                CheckBox box31_5 = (CheckBox) findViewById(R.id.text_choice_315);
                uncheckAll(R.id.text_choice_311, R.id.text_choice_312,
                        R.id.text_choice_313, R.id.text_choice_314, R.id.text_choice_315);
                ok = false;
                if (box31_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box31_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box31_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box31_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box31_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box32_1 = (CheckBox) findViewById(R.id.text_choice_321);
                CheckBox box32_2 = (CheckBox) findViewById(R.id.text_choice_322);
                CheckBox box32_3 = (CheckBox) findViewById(R.id.text_choice_323);
                CheckBox box32_4 = (CheckBox) findViewById(R.id.text_choice_324);
                CheckBox box32_5 = (CheckBox) findViewById(R.id.text_choice_325);
                uncheckAll(R.id.text_choice_321, R.id.text_choice_322,
                        R.id.text_choice_323, R.id.text_choice_324, R.id.text_choice_325);
                ok = false;
                if (box32_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box32_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box32_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box32_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box32_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box33_1 = (CheckBox) findViewById(R.id.text_choice_331);
                CheckBox box33_2 = (CheckBox) findViewById(R.id.text_choice_332);
                CheckBox box33_3 = (CheckBox) findViewById(R.id.text_choice_333);
                CheckBox box33_4 = (CheckBox) findViewById(R.id.text_choice_334);
                CheckBox box33_5 = (CheckBox) findViewById(R.id.text_choice_335);
                uncheckAll(R.id.text_choice_331, R.id.text_choice_332,
                        R.id.text_choice_333, R.id.text_choice_334, R.id.text_choice_335);
                ok = false;
                if (box33_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box33_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box33_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box33_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box33_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box34_1 = (CheckBox) findViewById(R.id.text_choice_341);
                CheckBox box34_2 = (CheckBox) findViewById(R.id.text_choice_342);
                CheckBox box34_3 = (CheckBox) findViewById(R.id.text_choice_343);
                CheckBox box34_4 = (CheckBox) findViewById(R.id.text_choice_344);
                CheckBox box34_5 = (CheckBox) findViewById(R.id.text_choice_345);
                uncheckAll(R.id.text_choice_341, R.id.text_choice_342,
                        R.id.text_choice_343, R.id.text_choice_344, R.id.text_choice_345);
                ok = false;
                if (box34_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box34_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box34_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box34_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box34_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box35_1 = (CheckBox) findViewById(R.id.text_choice_351);
                CheckBox box35_2 = (CheckBox) findViewById(R.id.text_choice_352);
                CheckBox box35_3 = (CheckBox) findViewById(R.id.text_choice_353);
                CheckBox box35_4 = (CheckBox) findViewById(R.id.text_choice_354);
                CheckBox box35_5 = (CheckBox) findViewById(R.id.text_choice_355);
                uncheckAll(R.id.text_choice_351, R.id.text_choice_352,
                        R.id.text_choice_353, R.id.text_choice_354, R.id.text_choice_355);
                ok = false;
                if (box35_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box35_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box35_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box35_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box35_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box36_1 = (CheckBox) findViewById(R.id.text_choice_361);
                CheckBox box36_2 = (CheckBox) findViewById(R.id.text_choice_362);
                CheckBox box36_3 = (CheckBox) findViewById(R.id.text_choice_363);
                CheckBox box36_4 = (CheckBox) findViewById(R.id.text_choice_364);
                CheckBox box36_5 = (CheckBox) findViewById(R.id.text_choice_365);
                uncheckAll(R.id.text_choice_361, R.id.text_choice_362,
                        R.id.text_choice_363, R.id.text_choice_364, R.id.text_choice_365);
                ok = false;
                if (box36_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box36_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box36_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box36_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box36_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box37_1 = (CheckBox) findViewById(R.id.text_choice_371);
                CheckBox box37_2 = (CheckBox) findViewById(R.id.text_choice_372);
                CheckBox box37_3 = (CheckBox) findViewById(R.id.text_choice_373);
                CheckBox box37_4 = (CheckBox) findViewById(R.id.text_choice_374);
                CheckBox box37_5 = (CheckBox) findViewById(R.id.text_choice_375);
                uncheckAll(R.id.text_choice_371, R.id.text_choice_372,
                        R.id.text_choice_373, R.id.text_choice_374, R.id.text_choice_375);
                ok = false;
                if (box37_1.isChecked()) {
                    sum3 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box37_2.isChecked() && !ok) {
                    sum3 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box37_3.isChecked() && !ok) {
                    sum3 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box37_4.isChecked() && !ok) {
                    sum3 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box37_5.isChecked() && !ok) {
                    sum3 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                avg3 = sum3 / 18;
                double sum4 = 0;

                CheckBox box38_1 = (CheckBox) findViewById(R.id.text_choice_381);
                CheckBox box38_2 = (CheckBox) findViewById(R.id.text_choice_382);
                CheckBox box38_3 = (CheckBox) findViewById(R.id.text_choice_383);
                CheckBox box38_4 = (CheckBox) findViewById(R.id.text_choice_384);
                CheckBox box38_5 = (CheckBox) findViewById(R.id.text_choice_385);
                uncheckAll(R.id.text_choice_381, R.id.text_choice_382,
                        R.id.text_choice_383, R.id.text_choice_384, R.id.text_choice_385);
                ok = false;
                if (box38_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box38_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box38_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box38_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box38_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box39_1 = (CheckBox) findViewById(R.id.text_choice_391);
                CheckBox box39_2 = (CheckBox) findViewById(R.id.text_choice_392);
                CheckBox box39_3 = (CheckBox) findViewById(R.id.text_choice_393);
                CheckBox box39_4 = (CheckBox) findViewById(R.id.text_choice_394);
                CheckBox box39_5 = (CheckBox) findViewById(R.id.text_choice_395);
                uncheckAll(R.id.text_choice_391, R.id.text_choice_392,
                        R.id.text_choice_393, R.id.text_choice_394, R.id.text_choice_395);
                ok = false;
                if (box39_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box39_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box39_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box39_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box39_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box40_1 = (CheckBox) findViewById(R.id.text_choice_401);
                CheckBox box40_2 = (CheckBox) findViewById(R.id.text_choice_402);
                CheckBox box40_3 = (CheckBox) findViewById(R.id.text_choice_403);
                CheckBox box40_4 = (CheckBox) findViewById(R.id.text_choice_404);
                CheckBox box40_5 = (CheckBox) findViewById(R.id.text_choice_405);
                uncheckAll(R.id.text_choice_401, R.id.text_choice_402,
                        R.id.text_choice_403, R.id.text_choice_404, R.id.text_choice_405);
                ok = false;
                if (box40_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box40_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box40_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box40_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box40_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box41_1 = (CheckBox) findViewById(R.id.text_choice_411);
                CheckBox box41_2 = (CheckBox) findViewById(R.id.text_choice_412);
                CheckBox box41_3 = (CheckBox) findViewById(R.id.text_choice_413);
                CheckBox box41_4 = (CheckBox) findViewById(R.id.text_choice_414);
                CheckBox box41_5 = (CheckBox) findViewById(R.id.text_choice_415);
                uncheckAll(R.id.text_choice_411, R.id.text_choice_412,
                        R.id.text_choice_413, R.id.text_choice_414, R.id.text_choice_415);
                ok = false;
                if (box41_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box41_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box41_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box41_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box41_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box42_1 = (CheckBox) findViewById(R.id.text_choice_421);
                CheckBox box42_2 = (CheckBox) findViewById(R.id.text_choice_422);
                CheckBox box42_3 = (CheckBox) findViewById(R.id.text_choice_423);
                CheckBox box42_4 = (CheckBox) findViewById(R.id.text_choice_424);
                CheckBox box42_5 = (CheckBox) findViewById(R.id.text_choice_425);
                uncheckAll(R.id.text_choice_421, R.id.text_choice_422,
                        R.id.text_choice_423, R.id.text_choice_424, R.id.text_choice_425);
                ok = false;
                if (box42_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box42_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box42_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box42_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box42_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box43_1 = (CheckBox) findViewById(R.id.text_choice_431);
                CheckBox box43_2 = (CheckBox) findViewById(R.id.text_choice_432);
                CheckBox box43_3 = (CheckBox) findViewById(R.id.text_choice_433);
                CheckBox box43_4 = (CheckBox) findViewById(R.id.text_choice_434);
                CheckBox box43_5 = (CheckBox) findViewById(R.id.text_choice_435);
                uncheckAll(R.id.text_choice_431, R.id.text_choice_432,
                        R.id.text_choice_433, R.id.text_choice_434, R.id.text_choice_435);
                ok = false;
                if (box43_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box43_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box43_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box43_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box43_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box44_1 = (CheckBox) findViewById(R.id.text_choice_441);
                CheckBox box44_2 = (CheckBox) findViewById(R.id.text_choice_442);
                CheckBox box44_3 = (CheckBox) findViewById(R.id.text_choice_443);
                CheckBox box44_4 = (CheckBox) findViewById(R.id.text_choice_444);
                CheckBox box44_5 = (CheckBox) findViewById(R.id.text_choice_445);
                uncheckAll(R.id.text_choice_441, R.id.text_choice_442,
                        R.id.text_choice_443, R.id.text_choice_444, R.id.text_choice_445);
                ok = false;
                if (box44_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box44_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box44_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box44_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box44_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box45_1 = (CheckBox) findViewById(R.id.text_choice_451);
                CheckBox box45_2 = (CheckBox) findViewById(R.id.text_choice_452);
                CheckBox box45_3 = (CheckBox) findViewById(R.id.text_choice_453);
                CheckBox box45_4 = (CheckBox) findViewById(R.id.text_choice_454);
                CheckBox box45_5 = (CheckBox) findViewById(R.id.text_choice_455);
                uncheckAll(R.id.text_choice_451, R.id.text_choice_452,
                        R.id.text_choice_453, R.id.text_choice_454, R.id.text_choice_455);
                ok = false;
                if (box45_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box45_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box45_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box45_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box45_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box46_1 = (CheckBox) findViewById(R.id.text_choice_461);
                CheckBox box46_2 = (CheckBox) findViewById(R.id.text_choice_462);
                CheckBox box46_3 = (CheckBox) findViewById(R.id.text_choice_463);
                CheckBox box46_4 = (CheckBox) findViewById(R.id.text_choice_464);
                CheckBox box46_5 = (CheckBox) findViewById(R.id.text_choice_465);
                uncheckAll(R.id.text_choice_461, R.id.text_choice_462,
                        R.id.text_choice_463, R.id.text_choice_464, R.id.text_choice_465);
                ok = false;
                if (box46_1.isChecked()) {
                    sum4 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box46_2.isChecked() && !ok) {
                    sum4 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box46_3.isChecked() && !ok) {
                    sum4 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box46_4.isChecked() && !ok) {
                    sum4 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box46_5.isChecked() && !ok) {
                    sum4 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                avg4 = sum4 / 9;
                double sum5 = 0;

                CheckBox box47_1 = (CheckBox) findViewById(R.id.text_choice_471);
                CheckBox box47_2 = (CheckBox) findViewById(R.id.text_choice_472);
                CheckBox box47_3 = (CheckBox) findViewById(R.id.text_choice_473);
                CheckBox box47_4 = (CheckBox) findViewById(R.id.text_choice_474);
                CheckBox box47_5 = (CheckBox) findViewById(R.id.text_choice_475);
                uncheckAll(R.id.text_choice_471, R.id.text_choice_472,
                        R.id.text_choice_473, R.id.text_choice_474, R.id.text_choice_475);
                ok = false;
                if (box47_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box47_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box47_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box47_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box47_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box48_1 = (CheckBox) findViewById(R.id.text_choice_481);
                CheckBox box48_2 = (CheckBox) findViewById(R.id.text_choice_482);
                CheckBox box48_3 = (CheckBox) findViewById(R.id.text_choice_483);
                CheckBox box48_4 = (CheckBox) findViewById(R.id.text_choice_484);
                CheckBox box48_5 = (CheckBox) findViewById(R.id.text_choice_485);
                uncheckAll(R.id.text_choice_481, R.id.text_choice_482,
                        R.id.text_choice_483, R.id.text_choice_484, R.id.text_choice_485);
                ok = false;
                if (box48_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box48_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box48_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box48_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box48_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box49_1 = (CheckBox) findViewById(R.id.text_choice_491);
                CheckBox box49_2 = (CheckBox) findViewById(R.id.text_choice_492);
                CheckBox box49_3 = (CheckBox) findViewById(R.id.text_choice_493);
                CheckBox box49_4 = (CheckBox) findViewById(R.id.text_choice_494);
                CheckBox box49_5 = (CheckBox) findViewById(R.id.text_choice_495);
                uncheckAll(R.id.text_choice_491, R.id.text_choice_492,
                        R.id.text_choice_493, R.id.text_choice_494, R.id.text_choice_495);
                ok = false;
                if (box49_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box49_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box49_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box49_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box49_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box50_1 = (CheckBox) findViewById(R.id.text_choice_501);
                CheckBox box50_2 = (CheckBox) findViewById(R.id.text_choice_502);
                CheckBox box50_3 = (CheckBox) findViewById(R.id.text_choice_503);
                CheckBox box50_4 = (CheckBox) findViewById(R.id.text_choice_504);
                CheckBox box50_5 = (CheckBox) findViewById(R.id.text_choice_505);
                uncheckAll(R.id.text_choice_501, R.id.text_choice_502,
                        R.id.text_choice_503, R.id.text_choice_504, R.id.text_choice_505);
                ok = false;
                if (box50_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box50_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box50_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box50_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box50_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box51_1 = (CheckBox) findViewById(R.id.text_choice_511);
                CheckBox box51_2 = (CheckBox) findViewById(R.id.text_choice_512);
                CheckBox box51_3 = (CheckBox) findViewById(R.id.text_choice_513);
                CheckBox box51_4 = (CheckBox) findViewById(R.id.text_choice_514);
                CheckBox box51_5 = (CheckBox) findViewById(R.id.text_choice_515);
                uncheckAll(R.id.text_choice_511, R.id.text_choice_512,
                        R.id.text_choice_513, R.id.text_choice_514, R.id.text_choice_515);
                ok = false;
                if (box51_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box51_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box51_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box51_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box51_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box52_1 = (CheckBox) findViewById(R.id.text_choice_521);
                CheckBox box52_2 = (CheckBox) findViewById(R.id.text_choice_522);
                CheckBox box52_3 = (CheckBox) findViewById(R.id.text_choice_523);
                CheckBox box52_4 = (CheckBox) findViewById(R.id.text_choice_524);
                CheckBox box52_5 = (CheckBox) findViewById(R.id.text_choice_525);
                uncheckAll(R.id.text_choice_521, R.id.text_choice_522,
                        R.id.text_choice_523, R.id.text_choice_524, R.id.text_choice_525);
                ok = false;
                if (box52_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box52_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box52_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box52_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box52_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box53_1 = (CheckBox) findViewById(R.id.text_choice_531);
                CheckBox box53_2 = (CheckBox) findViewById(R.id.text_choice_532);
                CheckBox box53_3 = (CheckBox) findViewById(R.id.text_choice_533);
                CheckBox box53_4 = (CheckBox) findViewById(R.id.text_choice_534);
                CheckBox box53_5 = (CheckBox) findViewById(R.id.text_choice_535);
                uncheckAll(R.id.text_choice_531, R.id.text_choice_532,
                        R.id.text_choice_533, R.id.text_choice_534, R.id.text_choice_535);
                ok = false;
                if (box53_1.isChecked()) {
                    sum5 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box53_2.isChecked() && !ok) {
                    sum5 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box53_3.isChecked() && !ok) {
                    sum5 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box53_4.isChecked() && !ok) {
                    sum5 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box53_5.isChecked() && !ok) {
                    sum5 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                avg5 = sum5 / 7;

                double sum6 = 0;

                CheckBox box54_1 = (CheckBox) findViewById(R.id.text_choice_541);
                CheckBox box54_2 = (CheckBox) findViewById(R.id.text_choice_542);
                CheckBox box54_3 = (CheckBox) findViewById(R.id.text_choice_543);
                CheckBox box54_4 = (CheckBox) findViewById(R.id.text_choice_544);
                CheckBox box54_5 = (CheckBox) findViewById(R.id.text_choice_545);
                uncheckAll(R.id.text_choice_541, R.id.text_choice_542,
                        R.id.text_choice_543, R.id.text_choice_544, R.id.text_choice_545);
                ok = false;
                if (box54_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box54_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box54_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box54_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box54_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box55_1 = (CheckBox) findViewById(R.id.text_choice_551);
                CheckBox box55_2 = (CheckBox) findViewById(R.id.text_choice_552);
                CheckBox box55_3 = (CheckBox) findViewById(R.id.text_choice_553);
                CheckBox box55_4 = (CheckBox) findViewById(R.id.text_choice_554);
                CheckBox box55_5 = (CheckBox) findViewById(R.id.text_choice_555);
                uncheckAll(R.id.text_choice_551, R.id.text_choice_552,
                        R.id.text_choice_553, R.id.text_choice_554, R.id.text_choice_555);
                ok = false;
                if (box55_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box55_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box55_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box55_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box55_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box56_1 = (CheckBox) findViewById(R.id.text_choice_561);
                CheckBox box56_2 = (CheckBox) findViewById(R.id.text_choice_562);
                CheckBox box56_3 = (CheckBox) findViewById(R.id.text_choice_563);
                CheckBox box56_4 = (CheckBox) findViewById(R.id.text_choice_564);
                CheckBox box56_5 = (CheckBox) findViewById(R.id.text_choice_565);
                uncheckAll(R.id.text_choice_561, R.id.text_choice_562,
                        R.id.text_choice_563, R.id.text_choice_564, R.id.text_choice_565);
                ok = false;
                if (box56_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box56_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box56_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box56_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box56_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box57_1 = (CheckBox) findViewById(R.id.text_choice_571);
                CheckBox box57_2 = (CheckBox) findViewById(R.id.text_choice_572);
                CheckBox box57_3 = (CheckBox) findViewById(R.id.text_choice_573);
                CheckBox box57_4 = (CheckBox) findViewById(R.id.text_choice_574);
                CheckBox box57_5 = (CheckBox) findViewById(R.id.text_choice_575);
                uncheckAll(R.id.text_choice_571, R.id.text_choice_572,
                        R.id.text_choice_573, R.id.text_choice_574, R.id.text_choice_575);
                ok = false;
                if (box57_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box57_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box57_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box57_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box57_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box58_1 = (CheckBox) findViewById(R.id.text_choice_581);
                CheckBox box58_2 = (CheckBox) findViewById(R.id.text_choice_582);
                CheckBox box58_3 = (CheckBox) findViewById(R.id.text_choice_583);
                CheckBox box58_4 = (CheckBox) findViewById(R.id.text_choice_584);
                CheckBox box58_5 = (CheckBox) findViewById(R.id.text_choice_585);
                uncheckAll(R.id.text_choice_581, R.id.text_choice_582,
                        R.id.text_choice_583, R.id.text_choice_584, R.id.text_choice_585);
                ok = false;
                if (box58_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box58_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box58_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box58_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box58_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box59_1 = (CheckBox) findViewById(R.id.text_choice_591);
                CheckBox box59_2 = (CheckBox) findViewById(R.id.text_choice_592);
                CheckBox box59_3 = (CheckBox) findViewById(R.id.text_choice_593);
                CheckBox box59_4 = (CheckBox) findViewById(R.id.text_choice_594);
                CheckBox box59_5 = (CheckBox) findViewById(R.id.text_choice_595);
                uncheckAll(R.id.text_choice_591, R.id.text_choice_592,
                        R.id.text_choice_593, R.id.text_choice_594, R.id.text_choice_595);
                ok = false;
                if (box59_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box59_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box59_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box59_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box59_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box60_1 = (CheckBox) findViewById(R.id.text_choice_601);
                CheckBox box60_2 = (CheckBox) findViewById(R.id.text_choice_602);
                CheckBox box60_3 = (CheckBox) findViewById(R.id.text_choice_603);
                CheckBox box60_4 = (CheckBox) findViewById(R.id.text_choice_604);
                CheckBox box60_5 = (CheckBox) findViewById(R.id.text_choice_605);
                uncheckAll(R.id.text_choice_601, R.id.text_choice_602,
                        R.id.text_choice_603, R.id.text_choice_604, R.id.text_choice_605);
                ok = false;
                if (box60_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box60_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box60_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box60_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box60_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box61_1 = (CheckBox) findViewById(R.id.text_choice_611);
                CheckBox box61_2 = (CheckBox) findViewById(R.id.text_choice_612);
                CheckBox box61_3 = (CheckBox) findViewById(R.id.text_choice_613);
                CheckBox box61_4 = (CheckBox) findViewById(R.id.text_choice_614);
                CheckBox box61_5 = (CheckBox) findViewById(R.id.text_choice_615);
                uncheckAll(R.id.text_choice_611, R.id.text_choice_612,
                        R.id.text_choice_613, R.id.text_choice_614, R.id.text_choice_615);
                ok = false;
                if (box61_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box61_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box61_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box61_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box61_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box62_1 = (CheckBox) findViewById(R.id.text_choice_621);
                CheckBox box62_2 = (CheckBox) findViewById(R.id.text_choice_622);
                CheckBox box62_3 = (CheckBox) findViewById(R.id.text_choice_623);
                CheckBox box62_4 = (CheckBox) findViewById(R.id.text_choice_624);
                CheckBox box62_5 = (CheckBox) findViewById(R.id.text_choice_625);
                uncheckAll(R.id.text_choice_621, R.id.text_choice_622,
                        R.id.text_choice_623, R.id.text_choice_624, R.id.text_choice_625);
                ok = false;
                if (box62_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box62_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box62_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box62_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box62_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box63_1 = (CheckBox) findViewById(R.id.text_choice_631);
                CheckBox box63_2 = (CheckBox) findViewById(R.id.text_choice_632);
                CheckBox box63_3 = (CheckBox) findViewById(R.id.text_choice_633);
                CheckBox box63_4 = (CheckBox) findViewById(R.id.text_choice_634);
                CheckBox box63_5 = (CheckBox) findViewById(R.id.text_choice_635);
                uncheckAll(R.id.text_choice_631, R.id.text_choice_632,
                        R.id.text_choice_633, R.id.text_choice_634, R.id.text_choice_635);
                ok = false;
                if (box63_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box63_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box63_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box63_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box63_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box64_1 = (CheckBox) findViewById(R.id.text_choice_641);
                CheckBox box64_2 = (CheckBox) findViewById(R.id.text_choice_642);
                CheckBox box64_3 = (CheckBox) findViewById(R.id.text_choice_643);
                CheckBox box64_4 = (CheckBox) findViewById(R.id.text_choice_644);
                CheckBox box64_5 = (CheckBox) findViewById(R.id.text_choice_645);
                uncheckAll(R.id.text_choice_641, R.id.text_choice_642,
                        R.id.text_choice_643, R.id.text_choice_644, R.id.text_choice_645);
                ok = false;
                if (box64_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box64_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box64_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box64_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box64_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box65_1 = (CheckBox) findViewById(R.id.text_choice_651);
                CheckBox box65_2 = (CheckBox) findViewById(R.id.text_choice_652);
                CheckBox box65_3 = (CheckBox) findViewById(R.id.text_choice_653);
                CheckBox box65_4 = (CheckBox) findViewById(R.id.text_choice_654);
                CheckBox box65_5 = (CheckBox) findViewById(R.id.text_choice_655);
                uncheckAll(R.id.text_choice_651, R.id.text_choice_652,
                        R.id.text_choice_653, R.id.text_choice_654, R.id.text_choice_655);
                ok = false;
                if (box65_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box65_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box65_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box65_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box65_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box66_1 = (CheckBox) findViewById(R.id.text_choice_661);
                CheckBox box66_2 = (CheckBox) findViewById(R.id.text_choice_662);
                CheckBox box66_3 = (CheckBox) findViewById(R.id.text_choice_663);
                CheckBox box66_4 = (CheckBox) findViewById(R.id.text_choice_664);
                CheckBox box66_5 = (CheckBox) findViewById(R.id.text_choice_665);
                uncheckAll(R.id.text_choice_661, R.id.text_choice_662,
                        R.id.text_choice_663, R.id.text_choice_664, R.id.text_choice_665);
                ok = false;
                if (box66_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box66_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box66_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box66_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box66_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box67_1 = (CheckBox) findViewById(R.id.text_choice_671);
                CheckBox box67_2 = (CheckBox) findViewById(R.id.text_choice_672);
                CheckBox box67_3 = (CheckBox) findViewById(R.id.text_choice_673);
                CheckBox box67_4 = (CheckBox) findViewById(R.id.text_choice_674);
                CheckBox box67_5 = (CheckBox) findViewById(R.id.text_choice_675);
                uncheckAll(R.id.text_choice_671, R.id.text_choice_672,
                        R.id.text_choice_673, R.id.text_choice_674, R.id.text_choice_675);
                ok = false;
                if (box67_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box67_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box67_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box67_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box67_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box68_1 = (CheckBox) findViewById(R.id.text_choice_681);
                CheckBox box68_2 = (CheckBox) findViewById(R.id.text_choice_682);
                CheckBox box68_3 = (CheckBox) findViewById(R.id.text_choice_683);
                CheckBox box68_4 = (CheckBox) findViewById(R.id.text_choice_684);
                CheckBox box68_5 = (CheckBox) findViewById(R.id.text_choice_685);
                uncheckAll(R.id.text_choice_681, R.id.text_choice_682,
                        R.id.text_choice_683, R.id.text_choice_684, R.id.text_choice_685);
                ok = false;
                if (box68_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box68_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box68_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box68_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box68_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box69_1 = (CheckBox) findViewById(R.id.text_choice_691);
                CheckBox box69_2 = (CheckBox) findViewById(R.id.text_choice_692);
                CheckBox box69_3 = (CheckBox) findViewById(R.id.text_choice_693);
                CheckBox box69_4 = (CheckBox) findViewById(R.id.text_choice_694);
                CheckBox box69_5 = (CheckBox) findViewById(R.id.text_choice_695);
                uncheckAll(R.id.text_choice_691, R.id.text_choice_692,
                        R.id.text_choice_693, R.id.text_choice_694, R.id.text_choice_695);
                ok = false;
                if (box69_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box69_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box69_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box69_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box69_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box70_1 = (CheckBox) findViewById(R.id.text_choice_701);
                CheckBox box70_2 = (CheckBox) findViewById(R.id.text_choice_702);
                CheckBox box70_3 = (CheckBox) findViewById(R.id.text_choice_703);
                CheckBox box70_4 = (CheckBox) findViewById(R.id.text_choice_704);
                CheckBox box70_5 = (CheckBox) findViewById(R.id.text_choice_705);
                uncheckAll(R.id.text_choice_701, R.id.text_choice_702,
                        R.id.text_choice_703, R.id.text_choice_704, R.id.text_choice_705);
                ok = false;
                if (box70_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box70_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box70_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box70_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box70_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box71_1 = (CheckBox) findViewById(R.id.text_choice_711);
                CheckBox box71_2 = (CheckBox) findViewById(R.id.text_choice_712);
                CheckBox box71_3 = (CheckBox) findViewById(R.id.text_choice_713);
                CheckBox box71_4 = (CheckBox) findViewById(R.id.text_choice_714);
                CheckBox box71_5 = (CheckBox) findViewById(R.id.text_choice_715);
                uncheckAll(R.id.text_choice_711, R.id.text_choice_712,
                        R.id.text_choice_713, R.id.text_choice_714, R.id.text_choice_715);
                ok = false;
                if (box71_1.isChecked()) {
                    sum6 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box71_2.isChecked() && !ok) {
                    sum6 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box71_3.isChecked() && !ok) {
                    sum6 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box71_4.isChecked() && !ok) {
                    sum6 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box71_5.isChecked() && !ok) {
                    sum6 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                avg6 = sum6 / 18;
                double sum7 = 0;
                CheckBox box72_1 = (CheckBox) findViewById(R.id.text_choice_721);
                CheckBox box72_2 = (CheckBox) findViewById(R.id.text_choice_722);
                CheckBox box72_3 = (CheckBox) findViewById(R.id.text_choice_723);
                CheckBox box72_4 = (CheckBox) findViewById(R.id.text_choice_724);
                CheckBox box72_5 = (CheckBox) findViewById(R.id.text_choice_725);
                uncheckAll(R.id.text_choice_721, R.id.text_choice_722,
                        R.id.text_choice_723, R.id.text_choice_724, R.id.text_choice_725);
                ok = false;
                if (box72_1.isChecked()) {
                    sum7 += 1;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box72_2.isChecked() && !ok) {
                    sum7 += 2;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box72_3.isChecked() && !ok) {
                    sum7 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box72_4.isChecked() && !ok) {
                    sum7 += 4;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box72_5.isChecked() && !ok) {
                    sum7 += 5;
                    Log.i("Check3", "5");
                    ok = true;
                }

                CheckBox box73_1 = (CheckBox) findViewById(R.id.text_choice_731);
                CheckBox box73_2 = (CheckBox) findViewById(R.id.text_choice_732);
                CheckBox box73_3 = (CheckBox) findViewById(R.id.text_choice_733);
                CheckBox box73_4 = (CheckBox) findViewById(R.id.text_choice_734);
                CheckBox box73_5 = (CheckBox) findViewById(R.id.text_choice_735);
                uncheckAll(R.id.text_choice_731, R.id.text_choice_732,
                        R.id.text_choice_733, R.id.text_choice_734, R.id.text_choice_735);
                ok = false;
                if (box73_1.isChecked()) {
                    sum7 += 5;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box73_2.isChecked() && !ok) {
                    sum7 += 4;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box73_3.isChecked() && !ok) {
                    sum7 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box73_4.isChecked() && !ok) {
                    sum7 += 2;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box73_5.isChecked() && !ok) {
                    sum7 += 1;
                    Log.i("Check3", "5");
                    ok = true;
                }
                avg7 = sum7 / 2;

                double sum8 = 0;
                CheckBox box74_1 = (CheckBox) findViewById(R.id.text_choice_741);
                CheckBox box74_2 = (CheckBox) findViewById(R.id.text_choice_742);
                CheckBox box74_3 = (CheckBox) findViewById(R.id.text_choice_743);
                CheckBox box74_4 = (CheckBox) findViewById(R.id.text_choice_744);
                CheckBox box74_5 = (CheckBox) findViewById(R.id.text_choice_745);
                uncheckAll(R.id.text_choice_741, R.id.text_choice_742,
                        R.id.text_choice_743, R.id.text_choice_744, R.id.text_choice_745);
                ok = false;
                if (box74_1.isChecked()) {
                    sum8 += 5;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box74_2.isChecked() && !ok) {
                    sum8 += 4;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box74_3.isChecked() && !ok) {
                    sum8 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box74_4.isChecked() && !ok) {
                    sum8 += 2;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box74_5.isChecked() && !ok) {
                    sum8 += 1;
                    Log.i("Check3", "5");
                    ok = true;
                }
                CheckBox box75_1 = (CheckBox) findViewById(R.id.text_choice_751);
                CheckBox box75_2 = (CheckBox) findViewById(R.id.text_choice_752);
                CheckBox box75_3 = (CheckBox) findViewById(R.id.text_choice_753);
                CheckBox box75_4 = (CheckBox) findViewById(R.id.text_choice_754);
                CheckBox box75_5 = (CheckBox) findViewById(R.id.text_choice_755);
                uncheckAll(R.id.text_choice_751, R.id.text_choice_752,
                        R.id.text_choice_753, R.id.text_choice_754, R.id.text_choice_755);
                ok = false;
                if (box75_1.isChecked()) {
                    sum8 += 5;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box75_2.isChecked() && !ok) {
                    sum8 += 4;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box75_3.isChecked() && !ok) {
                    sum8 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box75_4.isChecked() && !ok) {
                    sum8 += 2;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box75_5.isChecked() && !ok) {
                    sum8 += 1;
                    Log.i("Check3", "5");
                    ok = true;
                }
                CheckBox box76_1 = (CheckBox) findViewById(R.id.text_choice_761);
                CheckBox box76_2 = (CheckBox) findViewById(R.id.text_choice_762);
                CheckBox box76_3 = (CheckBox) findViewById(R.id.text_choice_763);
                CheckBox box76_4 = (CheckBox) findViewById(R.id.text_choice_764);
                CheckBox box76_5 = (CheckBox) findViewById(R.id.text_choice_765);
                uncheckAll(R.id.text_choice_761, R.id.text_choice_762,
                        R.id.text_choice_763, R.id.text_choice_764, R.id.text_choice_765);
                ok = false;
                if (box76_1.isChecked()) {
                    sum8 += 5;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box76_2.isChecked() && !ok) {
                    sum8 += 4;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box76_3.isChecked() && !ok) {
                    sum8 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box76_4.isChecked() && !ok) {
                    sum8 += 2;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box76_5.isChecked() && !ok) {
                    sum8 += 1;
                    Log.i("Check3", "5");
                    ok = true;
                }
                CheckBox box77_1 = (CheckBox) findViewById(R.id.text_choice_771);
                CheckBox box77_2 = (CheckBox) findViewById(R.id.text_choice_772);
                CheckBox box77_3 = (CheckBox) findViewById(R.id.text_choice_773);
                CheckBox box77_4 = (CheckBox) findViewById(R.id.text_choice_774);
                CheckBox box77_5 = (CheckBox) findViewById(R.id.text_choice_775);
                uncheckAll(R.id.text_choice_771, R.id.text_choice_772,
                        R.id.text_choice_773, R.id.text_choice_774, R.id.text_choice_775);
                ok = false;
                if (box77_1.isChecked()) {
                    sum8 += 5;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box77_2.isChecked() && !ok) {
                    sum8 += 4;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box77_3.isChecked() && !ok) {
                    sum8 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box77_4.isChecked() && !ok) {
                    sum8 += 2;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box77_5.isChecked() && !ok) {
                    sum8 += 1;
                    Log.i("Check3", "5");
                    ok = true;
                }
                CheckBox box78_1 = (CheckBox) findViewById(R.id.text_choice_781);
                CheckBox box78_2 = (CheckBox) findViewById(R.id.text_choice_782);
                CheckBox box78_3 = (CheckBox) findViewById(R.id.text_choice_783);
                CheckBox box78_4 = (CheckBox) findViewById(R.id.text_choice_784);
                CheckBox box78_5 = (CheckBox) findViewById(R.id.text_choice_785);
                uncheckAll(R.id.text_choice_781, R.id.text_choice_782,
                        R.id.text_choice_783, R.id.text_choice_784, R.id.text_choice_785);
                ok = false;
                if (box78_1.isChecked()) {
                    sum8 += 5;
                    Log.i("Check3", "1");
                    ok = true;
                }
                if (box78_2.isChecked() && !ok) {
                    sum8 += 4;
                    Log.i("Check3", "2");
                    ok = true;
                }
                if (box78_3.isChecked() && !ok) {
                    sum8 += 3;
                    Log.i("Check3", "3");
                    ok = true;
                }
                if (box78_4.isChecked() && !ok) {
                    sum8 += 2;
                    Log.i("Check3", "4");
                    ok = true;
                }
                if (box78_5.isChecked() && !ok) {
                    sum8 += 1;
                    Log.i("Check3", "5");
                    ok = true;
                }
                avg8 = sum8 / 5;

                DecimalFormat ft = new DecimalFormat("#.##");

                String message = "Masura globala a capacitatii creative: " + ft.format(avg1).replaceAll(",", ".")
                        + "\nCredinta in importanta proceselor inconstiente: " + ft.format(avg2).replaceAll(",", ".")
                        + "\nUtilizarea de tehnici: " + ft.format(avg3).replaceAll(",", ".")
                        + "\nActivitatea cu alte persoane (echipa): " + ft.format(avg4).replaceAll(",", ".")
                        + "\nOrientarea catre produsul final: " + ft.format(avg5).replaceAll(",", ".")
                        + "\nControlul comportamentului si al mediului: " + ft.format(avg6).replaceAll(",", ".")
                        + "\nMistica: " + ft.format(avg7).replaceAll(",", ".")
                        + "\nUtilizarea simturilor: " + ft.format(avg8).replaceAll(",", ".");
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT, "Cercetare test CSQ");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"mfr_1997@yahoo.com"});
                intent.putExtra(Intent.EXTRA_TEXT, message);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }


    public void uncheckAll (int a, int b, int c, int d, int e) {
        int count = 0;
        CheckBox box1 = (CheckBox) findViewById(a);
        CheckBox box2 = (CheckBox) findViewById(b);
        CheckBox box3 = (CheckBox) findViewById(c);
        CheckBox box4 = (CheckBox) findViewById(d);
        CheckBox box5 = (CheckBox) findViewById(e);

        if (box1.isChecked())
            count++;
        if (box2.isChecked())
            count++;
        if (box3.isChecked())
            count++;
        if (box4.isChecked())
            count++;
        if (box5.isChecked())
            count++;
        if (count > 1) {
            box1.setChecked(false);
            box2.setChecked(false);
            box3.setChecked(false);
            box4.setChecked(false);
            box5.setChecked(false);
        }
    }
}
