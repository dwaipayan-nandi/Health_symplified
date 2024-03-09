package com.example.javapracticalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Aman Khare", "Hospital Address : Salt Lake", "Exp:5yrs", "Mobile No. : 9854127590", "600"},
                    {"Doctor Name : Amit Saha", "Hospital Address : Kharda", "Exp:6yrs", "Mobile No. : 7584175960", "500"},
                    {"Doctor Name : Nirav Modi", "Hospital Address : Lake Town", "Exp:15yrs", "Mobile No. : 8421759670", "1000"},
                    {"Doctor Name : Nilam Patil", "Hospital Address : ShyamBazar", "Exp:8yrs", "Mobile No. : 7487459604", "650"},
                    {"Doctor Name : Muku Singh", "Hospital Address : Central", "Exp:11yrs", "Mobile No. : 8541057602", "700"}
            };

    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Priya Sharma", "Hospital Address : Kharda", "Exp:5yrs", "Mobile No. : 9854127590", "600"},
                    {"Doctor Name : Raj Patel", "Hospital Address : Salt Lake", "Exp:6yrs", "Mobile No. : 7584175960", "500"},
                    {"Doctor Name : Aishwarya Singh", "Hospital Address : Lake Mall", "Exp:15yrs", "Mobile No. : 8421759670", "1000"},
                    {"Doctor Name : Vivek Mehta", "Hospital Address : Central", "Exp:8yrs", "Mobile No. : 7487459604", "650"},
                    {"Doctor Name : Kavita Verma", "Hospital Address : ShyamBazar", "Exp:11yrs", "Mobile No. : 8541057602", "700"}
            };

    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Aman Saha", "Hospital Address : Juhu ", "Exp:7yrs", "Mobile No. : 9854127590", "600"},
                    {"Doctor Name : Pallabi Khare", "Hospital Address : Connaught ", "Exp:10yrs", "Mobile No. : 7584175960", "500"},
                    {"Doctor Name : Nirav Patil", "Hospital Address : Marina ", "Exp:12yrs", "Mobile No. : 8421759670", "1000"},
                    {"Doctor Name : Nilam Modi", "Hospital Address : Gateway ", "Exp:15yrs", "Mobile No. : 7487459604", "650"},
                    {"Doctor Name : Muku Dey", "Hospital Address : Chowpatty ", "Exp:18yrs", "Mobile No. : 8541057602", "700"}
            };

    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Manisha Kapoor", "Hospital Address : Park Street ", "Exp:7yrs", "Mobile No. : 9854127590", "600"},
                    {"Doctor Name : Arjun Kumar", "Hospital Address : Malleshwaram  ", "Exp:10yrs", "Mobile No. : 7584175960", "500"},
                    {"Doctor Name : Ayesha Sharma", "Hospital Address : Koramangala  ", "Exp:12yrs", "Mobile No. : 8421759670", "1000"},
                    {"Doctor Name : Vikram Singh", "Hospital Address : Bandra  ", "Exp:15yrs", "Mobile No. : 7487459604", "650"},
                    {"Doctor Name : Priyanka Patel", "Hospital Address : Chandni Chowk ", "Exp:18yrs", "Mobile No. : 8541057602", "700"}
            };

    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Rajesh Kumar", "Hospital Address : Charminar", "Exp:7yrs", "Mobile No. : 9854127590", "600"},
                    {"Doctor Name : Priya Joshi", "Hospital Address : Juhu", "Exp:10yrs", "Mobile No. : 7584175960", "500"},
                    {"Doctor Name : Aman Singh", "Hospital Address : Qutub", "Exp:12yrs", "Mobile No. : 8421759670", "1000"},
                    {"Doctor Name : Nisha Sharma", "Hospital Address : Gateway", "Exp:15yrs", "Mobile No. : 7487459604", "650"},
                    {"Doctor Name : Arjun Mehta", "Hospital Address : Marina", "Exp:18yrs", "Mobile No. : 8541057602", "700"}
            };
    private String[][] doctor_details6 =
            {
                    {"Doctor Name : Deepak Patel", "Hospital Address : Bandra ", "Exp:7yrs", "Mobile No. : 9854127590", "600"},
                    {"Doctor Name : Priyanka Kapoor", "Hospital Address : Chandni Chowk ", "Exp:10yrs", "Mobile No. : 7584175960", "500"},
                    {"Doctor Name : Rajesh Verma", "Hospital Address : Marina ", "Exp:12yrs", "Mobile No. : 8421759670", "1000"},
                    {"Doctor Name : Ankit Reddy", "Hospital Address : MG Road", "Exp:15yrs", "Mobile No. : 7487459604", "650"},
                    {"Doctor Name : Pallabi Khare", "Hospital Address : Park Street ", "Exp:18yrs", "Mobile No. : 8541057602", "700"}
            };
    TextView tv;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ImageView exit, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
        exit = findViewById(R.id.buttonDDLogout);
        back = findViewById(R.id.buttonDDBack);
        tv = findViewById(R.id.textViewDDTitle);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);
        if (title.compareTo("General Medicine")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
        if (title.compareTo("Cardiologists")==0)
            doctor_details = doctor_details5;
        else
            doctor_details = doctor_details6;

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorDetailsActivity.this,LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        list = new ArrayList();
        for (int i = 0; i<doctor_details.length; i++){
            item = new HashMap<String,String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees:"+doctor_details[i][4]+"/-");
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5",},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst = findViewById(R.id.listViewBM);
        lst.setAdapter(sa);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent it = new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class);
                it.putExtra("text1", title);
                it.putExtra("text2", doctor_details[i][0]);
                it.putExtra("text3", doctor_details[i][1]);
                it.putExtra("text4", doctor_details[i][3]);
                it.putExtra("text5", doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}