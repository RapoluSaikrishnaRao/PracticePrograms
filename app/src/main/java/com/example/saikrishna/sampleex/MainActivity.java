package com.example.saikrishna.sampleex;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static final long DISCONNECT_TIMEOUT = 300000;

    EditText Age_EditText;
    Button check_Button;
    Handler handler;
    Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Age_EditText= findViewById(R.id.Age_EditText);
        check_Button = findViewById(R.id.check_Button);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Hiiiiiii");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog alertDialog=builder.create();
                final Window dialogWindow = alertDialog.getWindow();
                final WindowManager.LayoutParams dialogWindowAttributes = dialogWindow.getAttributes();

                // Set fixed width (280dp) and WRAP_CONTENT height
                final WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialogWindowAttributes);
                lp.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 280, getResources().getDisplayMetrics());
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                dialogWindow.setAttributes(lp);

                // Set to TYPE_SYSTEM_ALERT so that the Service can display it
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    alertDialog.getWindow().setType(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);

                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    alertDialog.getWindow().setType(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);

                }
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
                {
                    alertDialog.getWindow().setType(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);

                }
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                builder.show();
            }
        },10000);


        check_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String dateFromEditText= Age_EditText.getText().toString();
                String result=convertingDateFormat(dateFromEditText);
                Log.e("TAG", "onClick: "+result );
               int checkAge= calculateAge(result);
               if(checkAge>18)
               {
                   Toast.makeText(MainActivity.this, "Yor Are Major", Toast.LENGTH_SHORT).show();
               }else
               {
                   Toast.makeText(MainActivity.this, "Yor Are Minor", Toast.LENGTH_SHORT).show();
               }
            }
        });


        handler = new Handler();
        r = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "user is inactive from last 5 minutes",Toast.LENGTH_SHORT).show();
            }
        };
       // startHandler();

    }
    @Override
    public void onUserInteraction() {
        // TODO Auto-generated method stub
        super.onUserInteraction();
       // stopHandler();//stop first and then start
       // startHandler();
    }
 /*   public void stopHandler() {
        handler.removeCallbacks(r);
    }
    public void startHandler() {
        handler.postDelayed(r, 5000*//*5*60*1000*//*); //for 5 minutes
    }*/

    private int calculateAge(String result)
    {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(date == null) return 0;

        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(date);

        int year = dob.get(Calendar.YEAR);
        int month = dob.get(Calendar.MONTH);
        int day = dob.get(Calendar.DAY_OF_MONTH);

        dob.set(year, month+1, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)){
            age--;
        }



        return age;

    }

    private String convertingDateFormat(String dateFromEditText) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = fmt.parse(dateFromEditText);
            return fmt.format(date);
        }
        catch(ParseException pe) {

            return "date";
        }
    }
}
