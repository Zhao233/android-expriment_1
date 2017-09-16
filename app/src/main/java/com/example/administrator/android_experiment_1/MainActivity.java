package com.example.administrator.android_experiment_1;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button button_tips;
    Button button_login;

    AlertDialog alertDialog_tips;
    AlertDialog alertDialog_login;

    Button login;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_tips = (Button) findViewById(R.id.tip);
        button_login = (Button) findViewById(R.id.login);

        button_tips.setOnClickListener(e -> {
            alertDialog_tips = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog_tips.setMessage("点击登陆按钮登陆");
            alertDialog_tips.setTitle("提示");
            /*CharSequence a = "q确定";
            alertDialog_tips.setButton(a, DialogInterface.BUTTON_POSITIVE, null);*/
            alertDialog_tips.show();

        });

        button_login.setOnClickListener(e -> {
            alertDialog_login = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog_login.show();
            alertDialog_login.getWindow().setContentView(R.layout.dialog_item);

            login = (Button) alertDialog_login.findViewById(R.id.loginButton);
            login.setOnClickListener(b -> {
                EditText account = (EditText) alertDialog_login.findViewById(R.id.account);
                EditText password = (EditText) alertDialog_login.findViewById(R.id.password);

                if( !(String.valueOf(account.getText()).equals("123") && String.valueOf(password.getText()).equals("abc")) ){
                    Toast.makeText(this, "账号或密码错误", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
                }
            });
        });

    }
}
