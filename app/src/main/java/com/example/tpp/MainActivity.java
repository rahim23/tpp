package com.example.tpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void modf(View view)
{
    TextView nometprenom =(TextView)findViewById(R.id.textView) ;
  i++ ;
//    Toast.makeText(this , "nbr de click :" +i,Toast.LENGTH_LONG).show(); ;
    nometprenom.setText("nbr de click :"+  i);

}



}
