package vn.edu.ntu.tiendat.huynhtiendat_58133627_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editTen, editNS, editSTK;
    RadioGroup rdgGT;
    RadioButton btnNam, btnNu;
    CheckBox ch1, ch2, ch3, ch4, ch5;
    Button btnXN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private void addView() {
        editTen = findViewById(R.id.editTen);
        editNS = findViewById(R.id.editNS);
        editSTK = findViewById(R.id.editSTK);
        rdgGT = findViewById(R.id.rdgGT);
        btnNam = findViewById(R.id.btnNam);
        btnNu = findViewById(R.id.btnNu);
        btnXN = findViewById(R.id.btnXN);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
    }
    private void addEvent() {

        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = rdgGT.getCheckedRadioButtonId();
                RadioButton GT = rdgGT.findViewById(i);
                final String Ten = editTen.getText().toString();
                final String Ngaysinh = editNS.getText().toString();
                String check1 = "";
                String check2 = "";
                String check3 = "";
                String check4 = "";
                String check5 = "";
                if(ch1.isChecked()){
                    check1 = ch1.getText().toString() + ", ";
                }else
                    check1 = "";
                if(ch2.isChecked()){
                    check2 = ch2.getText().toString() + ", ";
                }else
                    check2 = "";
                if(ch3.isChecked()){
                    check3 = ch3.getText().toString() + ", ";
                }else
                    check3 = "";
                if(ch4.isChecked()){
                    check4 = ch4.getText().toString() + ", ";
                }else
                    check4 = "";
                if(ch5.isChecked()){
                    check5 = ch5.getText().toString() + ", ";
                }else
                    check5 = "";
                String STK = editSTK.getText().toString();

                Toast.makeText(MainActivity.this, Ten+"\nNgày sinh: "+Ngaysinh+"\nGiới Tính: "+GT.getText().toString()+"\nSở thích: " + check1 + check2 + check3 + check4 + check5 + STK,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
