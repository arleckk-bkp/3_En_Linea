package com.arleckk.tresenlinea;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class JuegoActivity extends ActionBarActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        btn1 = (Button) findViewById(R.id.btnUno);
        btn2 = (Button) findViewById(R.id.btnDos);
        btn3 = (Button) findViewById(R.id.btnTres);
        btn4= (Button) findViewById(R.id.btnCuatro);
        btn5 = (Button) findViewById(R.id.btnCinco);
        btn6 = (Button) findViewById(R.id.btnSeis);
        btn7 = (Button) findViewById(R.id.btnSiete);
        btn8 = (Button) findViewById(R.id.btnOcho);
        btn9 = (Button) findViewById(R.id.btnNueve);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        escribirX(v);
        verificarGanador("X","Oscar");
    }

    public void verificarGanador(String s,String ganador) {
        Toast toast = Toast.makeText(this, ganador+" es el ganador", Toast.LENGTH_SHORT);
        if(btn1.getText().equals(s)&&btn2.getText().equals(s)&&btn3.getText().equals(s)){
            toast.show();
            btn1.setBackgroundResource(R.color.casillas);
            btn2.setBackgroundResource(R.color.casillas);
            btn3.setBackgroundResource(R.color.casillas);
        } else if(btn1.getText().equals(s)&&btn4.getText().equals(s)&&btn7.getText().equals(s)){
            toast.show();
            btn1.setBackgroundResource(R.color.casillas);
            btn4.setBackgroundResource(R.color.casillas);
            btn7.setBackgroundResource(R.color.casillas);
        } else if(btn1.getText().equals(s)&&btn5.getText().equals(s)&&btn9.getText().equals(s)){
            toast.show();
            btn1.setBackgroundResource(R.color.casillas);
            btn5.setBackgroundResource(R.color.casillas);
            btn9.setBackgroundResource(R.color.casillas);
        } else if(btn2.getText().equals(s)&&btn5.getText().equals(s)&&btn8.getText().equals(s)){
            toast.show();
            btn2.setBackgroundResource(R.color.casillas);
            btn5.setBackgroundResource(R.color.casillas);
            btn8.setBackgroundResource(R.color.casillas);
        } else if(btn3.getText().equals(s)&&btn5.getText().equals(s)&&btn7.getText().equals(s)){
            toast.show();
            btn3.setBackgroundResource(R.color.casillas);
            btn5.setBackgroundResource(R.color.casillas);
            btn7.setBackgroundResource(R.color.casillas);
        } else if(btn3.getText().equals(s)&&btn6.getText().equals(s)&&btn9.getText().equals(s)){
            toast.show();
            btn3.setBackgroundResource(R.color.casillas);
            btn6.setBackgroundResource(R.color.casillas);
            btn9.setBackgroundResource(R.color.casillas);
        } else if(btn4.getText().equals(s)&&btn5.getText().equals(s)&&btn6.getText().equals(s)){
            toast.show();
            btn4.setBackgroundResource(R.color.casillas);
            btn5.setBackgroundResource(R.color.casillas);
            btn6.setBackgroundResource(R.color.casillas);
        } else if(btn7.getText().equals(s)&&btn8.getText().equals(s)&&btn9.getText().equals(s)){
            toast.show();
            btn7.setBackgroundResource(R.color.casillas);
            btn8.setBackgroundResource(R.color.casillas);
            btn9.setBackgroundResource(R.color.casillas);
        }

    }

    public void escribirX(View v){
        switch (v.getId()) {
            case R.id.btnUno:
                if(vacio(btn1)){
                    btn1.setText("X");
                    btn1.setEnabled(false);
                }
                break;
            case R.id.btnDos:
                if(vacio(btn2)){
                    btn2.setText("X");
                    btn2.setEnabled(false);
                }
                break;
            case R.id.btnTres:
                if(vacio(btn3)){
                    btn3.setText("X");
                    btn3.setEnabled(false);
                }
                break;
            case R.id.btnCuatro:
                if(vacio(btn4)){
                    btn4.setText("X");
                    btn4.setEnabled(false);
                }
                break;
            case R.id.btnCinco:
                if(vacio(btn5)){
                    btn5.setText("X");
                    btn5.setEnabled(false);
                }
                break;
            case R.id.btnSeis:
                if(vacio(btn6)){
                    btn6.setText("X");
                    btn6.setEnabled(false);
                }
                break;
            case R.id.btnSiete:
                if(vacio(btn7)){
                    btn7.setText("X");
                    btn7.setEnabled(false);
                }
                break;
            case R.id.btnOcho:
                if(vacio(btn8)){
                    btn8.setText("X");
                    btn8.setEnabled(false);
                }
                break;
            case R.id.btnNueve:
                if(vacio(btn9)){
                    btn9.setText("X");
                    btn9.setEnabled(false);
                }
                break;
        }//switch
    }

    public boolean vacio(Button btn){
        if (!(btn.getText().equals("X")|| btn.getText().equals("O")))  {
            return true;
        } else {
            return false;
        }
    }//vacio

    public void escribirO(){

    }

}
