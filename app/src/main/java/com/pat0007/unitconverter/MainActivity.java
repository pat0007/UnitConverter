package com.pat0007.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtMile, txtKM, txtLB, txtKG, txtGAL, txtL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtMile = findViewById(R.id.txtMile);
        txtKM = findViewById(R.id.txtKM);
        txtLB = findViewById(R.id.txtLB);
        txtKG = findViewById(R.id.txtKG);
        txtGAL = findViewById(R.id.txtGAL);
        txtL = findViewById(R.id.txtL);

        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF + " at " + format);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC + " at " + format);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMile.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strMile = s.toString();
                Log.i("UnitConverter", "Value in txtMile = " + strMile + " at " + format);

                if (!txtMile.isFocused()) return;
                if (strMile.length() == 0) return;

                try {
                    double valMile = Double.parseDouble(strMile);
                    double valKM = valMile * 1.609344;
                    String strKM = Double.toString(valKM);
                    Log.i("UnitConverter", "Value in txtKM = " + strKM);

                    MainActivity.this.txtKM.setText(strKM);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKM.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strKM = s.toString();
                Log.i("UnitConverter", "Value in txtKM = " + strKM + " at " + format);

                if (!txtKM.isFocused()) return;
                if (strKM.length() == 0) return;

                try {
                    double valKM = Double.parseDouble(strKM);
                    double valMile = valKM * 0.6213711922;
                    String strMile = Double.toString(valMile);
                    Log.i("UnitConverter", "Value in txtMile = " + strMile);

                    MainActivity.this.txtMile.setText(strMile);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLB.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strLB = s.toString();
                Log.i("UnitConverter", "Value in txtLB = " + strLB + " at " + format);

                if (!txtLB.isFocused()) return;
                if (strLB.length() == 0) return;

                try {
                    double valLB = Double.parseDouble(strLB);
                    double valKG = valLB * 0.45359237;
                    String strKG = Double.toString(valKG);
                    Log.i("UnitConverter", "Value in txtKG = " + strKG);

                    MainActivity.this.txtKG.setText(strKG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strKG = s.toString();
                Log.i("UnitConverter", "Value in txtKG = " + strKG + " at " + format);

                if (!txtKG.isFocused()) return;
                if (strKG.length() == 0) return;

                try {
                    double valKG = Double.parseDouble(strKG);
                    double valLB = valKG * 2.2046226218;
                    String strLB = Double.toString(valLB);
                    Log.i("UnitConverter", "Value in txtLB = " + strLB);

                    MainActivity.this.txtLB.setText(strLB);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtGAL.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strGAL = s.toString();
                Log.i("UnitConverter", "Value in txtGAL = " + strGAL + " at " + format);

                if (!txtGAL.isFocused()) return;
                if (strGAL.length() == 0) return;

                try {
                    double valGAL = Double.parseDouble(strGAL);
                    double valL = valGAL * 3.785411784;
                    String strL = Double.toString(valL);
                    Log.i("UnitConverter", "Value in txtL = " + strL);

                    MainActivity.this.txtL.setText(strL);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtL.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                String strL = s.toString();
                Log.i("UnitConverter", "Value in txtL = " + strL + " at " + format);

                if (!txtL.isFocused()) return;
                if (strL.length() == 0) return;

                try {
                    double valL = Double.parseDouble(strL);
                    double valGAL = valL * 0.2641720524;
                    String strGAL = Double.toString(valGAL);
                    Log.i("UnitConverter", "Value in txtGAL = " + strGAL);

                    MainActivity.this.txtGAL.setText(strGAL);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
    }
}