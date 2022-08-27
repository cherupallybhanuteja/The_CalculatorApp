package com.example.calci;
import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {
private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdot,bdiv,bx,bminus,bplus,bequal,bc,bper,bwrong;
private TextView textView,textView2;
String sum="",str1="",sum1="",sum2="",str2="",str="",str3="",sum3="",dad="",bro="",string="";
double hi=0,hi1=0,a=0,b=0,c=0,d=0,e=0,e1=0,mom=0,z=0,y=0,t=0,p=0,bye=0;
int bhanu=0,k=0;
int tej[]=new int[9999999];
double j[]=new double[9999999];
int f=0,rey=0;
int count=0,sai=0,num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        b00=findViewById(R.id.b00);
        bdot=findViewById(R.id.bdot);
        bdiv=findViewById(R.id.bdiv);
        bx=findViewById(R.id.bx);
        bminus=findViewById(R.id.bminus);
        bplus=findViewById(R.id.bplus);
        bequal=findViewById(R.id.bequal);
        bc=findViewById(R.id.bc);
        bper=findViewById(R.id.bper);
        bwrong=findViewById(R.id.bwrong);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="1";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"1";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "1";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "1";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                               // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                 //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                               // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                              //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                               // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "1";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                               // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                              //  b=a*c;
                            }
                        }
                    }
                           }
                       }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="2";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"2";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "2";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "2";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                               // textView2.setText(String.valueOf(j[num]-1));
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "2";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"2";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="3";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"3";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "3";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "3";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "3";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"3";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="4";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"4";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "4";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "4";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "4";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"4";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="5";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"5";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "5";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "5";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "5";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"5";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="6";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"6";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "6";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "6";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "6";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"6";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="7";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"7";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "7";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "7";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "7";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"7";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="8";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"8";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "8";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "8";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "8";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"8";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="9";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"9";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "9";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            sum = sum + "9";
                            textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            j[num-1]=j[num-1]*c;
                            //num++;
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            sum = sum + "9";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"9";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="0";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"0";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "0";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "0";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "0";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                                sum = sum + "0";
                                textView.setText(sum);
                            //   sum = sum + "1";
                            //    textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                // textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + (j[num - 1] / c);
                                j[num] = j[num - 1] / c;
                                num++;
                                //textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b;
                                String str1 = String.valueOf(mom);
                                if (str1 == "Infinity" || str1 == "NaN") {
                                    str1 = "Undefined";
                                }
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            if(sum.endsWith("0")||sum.endsWith("00")){
                                sum=sum;
                                textView.setText(sum);
                            }
                            else {
                                sum = sum + "0";
                                textView.setText(sum);
                            }
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                // sum = sum + "1";
                                //   textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                //textView2.setText(String.valueOf(num));
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1=="Infinity"||str1=="NaN"){
                                    str1="0";
                                    textView2.setText(str1);
                                }
                                else {
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                }
                                // b=a*c;
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "0";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "0";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "0";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            //num++;
                            j[num-1]=j[num-1]*c;
                            if(sum.charAt(bhanu) == '0'){
                                sum=sum;
                                num--;
                               // textView2.setText(String.valueOf(j[num-1]));
                            }
                            else {
                                sum = sum + "0";
                                textView.setText(sum);
                            }
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                //  textView2.setText(String.valueOf(j[num-1]));
                                b = hi1+(j[num-1]/c);
                                j[num]=j[num-1]/c;
                                num=num+1;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                // e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1=="Infinity"||str1=="NaN"){
                                    str1="Undefined";
                                }
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            if(sum.charAt(bhanu) == '0'){
                                sum=sum;
                                num--;
                            }
                            else {
                                sum = sum + "0";
                                textView.setText(sum);
                            }
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num=num+1;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1=="Infinity"||str1=="NaN"){
                                    str1="0";
                                    textView2.setText(str1);
                                }
                                else {
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"0";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sum==""||(sum2.endsWith("="))) {
                    sum ="00";
                    sum2="";
                    textView.setText(sum);
                    textView2.setText(sum2);
                }
                else if(bhanu==0){
                    if(sum.endsWith("1")||sum.endsWith("-")||sum.endsWith(".")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00")){
                        sum=sum+"00";
                        textView.setText(sum);
                    }
                }
                else if (sum.endsWith("+")|| sum.endsWith("%") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x")) {
                    if (sum.length() >= bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "00";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            sum = sum + "00";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                //  sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                //num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                        else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "00";
                            textView.setText(sum);
                            // textView2.setText("hi");
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                                // textView2.setText("hi");
                            } else {
                                //sum = sum + "1";
                                //textView.setText(sum);
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                    // textView2.setText("hi");
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                                sum = sum + "0";
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length());
                                    c = Double.parseDouble(sum1);
                                    //b = hi;
                                    //textView2.setText(String.valueOf(j[num-1]));
                                    b = hi1 + (j[num - 1] / c);
                                    j[num] = j[num - 1] / c;
                                    num = num + 1;
                                    sum = sum + "0";
                                    j[num - 1]=j[num - 1] * c;
                                    sum1 = sum.substring(bhanu, sum.length());
                                    c = Double.parseDouble(sum1);
                                    textView.setText(sum);
                                    b = hi1+(j[num-1]/c);
                                    j[num]=j[num-1]/c;
                                    num++;
                                    // textView2.setText(String.valueOf(j[num-1]));
                                    // hi=hi1+a;
                                    // hi=d;
                                    // i=a/c;
                                    //   e=a/c;
                                    // hi=b;
                                    //  b=b/a;
                                    mom = b;
                                    String str1 = String.valueOf(mom);
                                    if (str1 == "Infinity" || str1 == "NaN") {
                                        str1 = "Undefined";
                                    }
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            sum = sum + "0";
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //b = hi;
                                //textView2.setText(String.valueOf(j[num-1]));
                                b = hi1 + (j[num - 1] * c);
                                j[num] = j[num - 1] * c;
                               // textView2.setText(String.valueOf(j[num]));
                                num = num + 1;
                                sum = sum + "0";
                                j[num - 1]=j[num - 1] / c;
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                textView.setText(sum);
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(j[num-1]));
                                // hi=hi1+a;
                                // hi=d;
                                // i=a/c;
                                //   e=a/c;
                                // hi=b;
                                //  b=b/a;
                                mom = b;
                                String str1 = String.valueOf(mom);
                                if (str1 == "Infinity" || str1 == "NaN") {
                                    str1 = "Undefined";
                                }
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        }
                    }
                }
                else/* if(sum.endsWith("1"))*/{
                    if(sum.length()>=bhanu) {
                        if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                            sum = sum + "00";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi+c;
                                hi1=hi;
                                //b = hi+(i+c);
                                // hi1=hi+i;
                                // j=i+c;
                                // i=b;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                            sum = sum + "00";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                d = hi-c;
                                hi1=hi;
                                //   hi1=hi+b;
                                c=-c;
                                // e=a;
                                mom=d;
                                String str1 = String.valueOf(mom);
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                            j[num-1]=j[num-1]/a;
                            sum = sum + "00";
                            textView.setText(sum);
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                a = Double.parseDouble(sum1);
                                b = j[num-1];
                                // num++;
                                d =(hi+(b * a));
                                mom=d;
                                String str1 = String.valueOf(mom);
                                j[num]=b*a;
                                num++;
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                            //num++;
                            if(sum.charAt(bhanu) == '0'){
                                sum=sum;
                               // num--;
                                str1="Infinity";
                                if (str1 == "Infinity" || str1 == "NaN") {
                                    str1 = "Undefined";
                                }
                                if (str1.substring(str1.length() - 2).equals(".0")) {
                                    textView2.setText(str1.substring(0, str1.length() - 2));
                                } else {
                                    textView2.setText(str1);
                                }
                            }
                            else {
                                j[num-1]=j[num-1]*c;
                                sum = sum + "0";
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length());
                                    c = Double.parseDouble(sum1);
                                    //b = hi;
                                    //textView2.setText(String.valueOf(j[num-1]));
                                    b = hi1 + (j[num - 1] / c);
                                    j[num] = j[num - 1] / c;
                                    num = num + 1;
                                    sum = sum + "0";
                                    j[num - 1]=j[num - 1] * c;
                                    sum1 = sum.substring(bhanu, sum.length());
                                    c = Double.parseDouble(sum1);
                                    textView.setText(sum);
                                    b = hi1+(j[num-1]/c);
                                    j[num]=j[num-1]/c;
                                    num++;
                                    // textView2.setText(String.valueOf(j[num-1]));
                                    // hi=hi1+a;
                                    // hi=d;
                                    // i=a/c;
                                    //   e=a/c;
                                    // hi=b;
                                    //  b=b/a;
                                    mom = b;
                                    String str1 = String.valueOf(mom);
                                    if (str1 == "Infinity" || str1 == "NaN") {
                                        str1 = "Undefined";
                                    }
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                }
                            }
                        } else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                            j[num-1]=j[num-1]/c;
                            //num++;
                            if(sum.charAt(bhanu) == '0'){
                                sum=sum;
                                num--;
                            }
                            else {
                                sum = sum + "0";
                            }
                            if (bhanu == sum.length()) {
                                textView.setText(sum);
                            } else {
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                //  b = hi;
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                sum = sum + "0";
                                j[num - 1]=j[num - 1] / c;
                                sum1 = sum.substring(bhanu, sum.length());
                                c = Double.parseDouble(sum1);
                                textView.setText(sum);
                                b = hi1+(j[num-1]*c);
                                j[num]=j[num-1]*c;
                                num++;
                                // textView2.setText(String.valueOf(num));
                                //   hi=hi1+j;
                                //  i=a*c;
                                //  e1=a*c;
                                // hi=b;
                                //  b=b/a;
                                mom=b;
                                String str1 = String.valueOf(mom);
                                if (str1=="Infinity"||str1=="NaN"){
                                    str1="0";
                                    textView2.setText(str1);
                                }
                                else {
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                }
                                //  b=a*c;
                            }
                        }
                    }
                    else{
                        if(sum.charAt(sum.length()-1)=='+'){
                            sum=sum+"00";
                            textView.setText(sum);
                            sum1 = sum.substring(sum.length()-1,sum.length());
                            a = Double.parseDouble(sum1);
                            b = hi;
                            b = b + a;
                            String str1 = String.valueOf(b);
                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                textView2.setText(str1.substring(0, str1.length() - 2));
                            } else {
                                textView2.setText(str1);
                                // textView2.setText("hi");
                            }

                        }
                    }
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c=sum.length()-sum.replace(".","").length();
                if(sum==""||sum=="-"){
                    sum=sum+"0.";
                    textView.setText(sum);
                }
                else if (bhanu == 0) {
                    if (sum.endsWith(".")) {
                        textView.setText(sum);
                    }
                    else if(c==0) {
                        sum = sum + ".";
                        textView.setText(sum);
                    }
                    else{
                        sum=sum;
                        textView.setText(sum);
                    }
                }
                else if(bhanu>0) {
                    if (sum.length() >=bhanu) {
                        String sum2 = sum.substring(bhanu, sum.length());
                        int e = sum2.length() - sum2.replace(".", "").length();
                        if (sum.endsWith(".")) {
                            textView.setText(sum);
                        } else if (sum == "") {
                            sum = "0.";
                            textView.setText(sum);
                        } else if (sum == "-") {
                            sum = "-.";
                            textView.setText(sum);
                            //textView2.setText(sum);
                        } else {
                            if (e == 0) {
                                sum = sum + ".";
                                textView.setText(sum);
                                //textView2.setText(sum);
                                // e++;
                            } else if (e > 0) {
                                sum = sum;
                                textView.setText(sum);
                                //  textView2.setText(String.valueOf(e));
                            }
                        }
                    }
                    else{
                        textView.setText(sum);
                    }
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum == "") {
                    textView.setText("");
                    sum = "";
                }
                else if(sum.endsWith("=")||sum.endsWith("+")||sum.endsWith("/")||sum.endsWith("-")||sum.endsWith("x")){
                    if(sum=="-"){
                        sum="-";
                        textView.setText(sum);
                    }
                    else {
                        if(sum.endsWith("/-")){
                            sum = sum.substring(0, sum.length() -2) + "/";
                            textView.setText(sum);
                        }
                        else if(sum.endsWith("x-")){
                            sum = sum.substring(0, sum.length() -2) + "/";
                            textView.setText(sum);
                        }
                        else if (sum.endsWith("/")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "/";
                            textView.setText(sum);
                            // j=a;
                            //hi = hi+j;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                        else if (sum.endsWith("x")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "/";
                            textView.setText(sum);
                            // j=a;
                            //  hi = hi+j;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                        else if (sum.endsWith("+")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "/";
                            textView.setText(sum);
                            hi=hi-c;
                            hi1=hi;
                            j[num]=c;
                            num++;
                            //hi = hi;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                        else if (sum.endsWith("-")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "/";
                            textView.setText(sum);
                            //j=a;
                            hi=hi-c;
                            hi1=hi;
                            j[num]=c;
                            num++;
                            //hi = hi;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                    }
                }
                else {
                    if (sum == "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2);
                        textView.setText(sum);
                    } else {
                        sum = sum + "/";
                        textView.setText(sum);
                        //bhanu=sum.length()-1;
                       /* if (sum.charAt(0) == 'x') {
                            textView.setText("");
                            sum = "";
                        }*/
                        if (bhanu > 0) {
                            if (sum.charAt(bhanu - 1) == 'x') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                  // sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                   // a = hi * a;
                                    //hi=0;
                                    j[num]=j[num-1];
                                    num++;
                                   // j=a*c;
                                    //a=a*c;
                                    //textView2.setText(String.valueOf(a));
                                   // String str1 = String.valueOf(hi);
                                  //  if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                  //  } else {
                                        //textView2.setText(str1);
                                  //  }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai = sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '%') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    //sum1 = sum.substring(bhanu, sum.length() - 1);
                                    //a = Double.parseDouble(sum1);
                                    //hi = (hi) * a;
                                  //  j=c;
                                    hi1=hi;
                                    j=j;
                                  //  a=d;
                                    //hi=0;
                                    //textView2.setText("hi");
                                   // String str1 = String.valueOf(hi);
                                    //if (str1.substring(str1.length() - 2).equals(".0")) {
                                      //  textView2.setText(str1.substring(0, str1.length() - 2));
                                  //  } else {
                                     //   textView2.setText(str1);
                                  //  }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai=sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '/') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                   // sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                   // hi = 0;
                                    e=a/c;
                                    j[num]=j[num-1];
                                    num++;
                                    //textView2.setText(String.valueOf("hi"));
                                  //  a=a/c;
                                    //textView2.setText(String.valueOf(e));
                                   // String str1 = String.valueOf(hi);
                                  //  if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.lengt
                                    // h() - 2));
                                 //   } else {
                                        //textView2.setText(str1);
                                  //  }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai = sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '+') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    c = Double.parseDouble(sum1);
                                  //  hi = hi+a;
                                    //hi=hi-a;
                                    j[num]=c;
                                    num++;
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai = sum.length();
                                   // hi=hi-a;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '-') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    c = Double.parseDouble(sum1);
                                    j[num]=-c;
                                    c=-c;
                                    num++;
                                   // textView2.setText(sum1);
                                   // a = Double.parseDouble(sum1);
                                   // textView2.setText(String.valueOf(hi));
                                    hi =hi;
                                   // a=-a;
                                   //textView2.setText(String.valueOf(a-hi));
                                    //String str1 = String.valueOf(hi);
                                   // if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                  //  } else {
                                        //textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                tej[k]=bhanu;
                                k++;
                                sai = sum.length();
                                  //  hi=hi+a;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }
                        else {
                            sum1 = sum.substring(bhanu, sum.length() - 1);
                            a = Double.parseDouble(sum1);
                           // hi = a;
                            j[num]=a;
                            num++;
                            textView2.setText("");
                            //textView2.setText(String.valueOf(hi));
                            bhanu = sum.length();
                            tej[k]=bhanu;
                            k++;
                            sum2="";
                            sai=sum.length();
                        }
                    }
                }
            }
        });
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum == "") {
                    textView.setText("");
                    sum = "";
                }
               else if(sum.endsWith("=")||sum.endsWith("+")||sum.endsWith("/")||sum.endsWith("-")||sum.endsWith("x")){
                   if(sum=="-"){
                        sum="-";
                        textView.setText(sum);
                    }
                    else {
                       if(sum.endsWith("/-")){
                           sum = sum.substring(0, sum.length() -2) + "x";
                           textView.setText(sum);
                       }
                       else if(sum.endsWith("x-")){
                           sum = sum.substring(0, sum.length() -2) + "x";
                           textView.setText(sum);
                           //textView2.setText(String.valueOf(num));
                       }
                       else if (sum.endsWith("/")) {
                           // j=c;
                           sum = sum.substring(0, sum.length() - 1) + "x";
                           textView.setText(sum);
                           // j=a;
                           //hi = hi+j;
                           // textView2.setText(String.valueOf("hi"));
                           //  hi1=hi;
                       }
                       else if (sum.endsWith("x")) {
                           // j=c;
                           sum = sum.substring(0, sum.length() - 1) + "x";
                           textView.setText(sum);
                           // j=a;
                           //  hi = hi+j;
                           // textView2.setText(String.valueOf("hi"));
                           //  hi1=hi;
                       }
                       else if (sum.endsWith("+")) {
                           // j=c;
                           sum = sum.substring(0, sum.length() - 1) + "x";
                           textView.setText(sum);
                           hi=hi-c;
                           hi1=hi;
                           j[num]=c;
                           num++;
                         //  textView2.setText(String.valueOf(j[num-1]));
                          // hi1=e;
                           //hi = hi;
                          //  textView2.setText(String.valueOf(hi1));
                           //  hi1=hi;
                       }
                       else if (sum.endsWith("-")) {
                           // j=c;
                           sum = sum.substring(0, sum.length() - 1) + "x";
                           textView.setText(sum);
                           hi=hi-c;
                           hi1=hi;
                           j[num]=c;
                           num++;
                         //  hi1=e;
                           //hi = hi;
                           // textView2.setText(String.valueOf(j[num-1]));
                           //  hi1=hi;
                       }
                    }
                }
                else {
                    if (sum == "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2);
                        textView.setText(sum);
                    } else {
                        sum = sum + "x";
                        textView.setText(sum);
                       // textView2.setText("hiygygygyugygyugu");
                        /*if (sum.charAt(0) == 'x') {
                            textView.setText("");

                            sum = "";
                        }*/
                         if (bhanu > 0) {
                            if (sum.charAt(bhanu - 1) == 'x') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    // a = Double.parseDouble(sum1);
                                    // hi = 0;
                                  //  e=a*c;
                                   // a=a*c;
                                    j[num]=j[num-1];
                                    num++;
                                 //   textView2.setText("hi");
                                   /* String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                      //  textView2.setText(str1);
                                    }*/
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai = sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '%') {
                                   // sum=sum+"x";
                                   // bhanu=sum.length();
                                   // textView2.setText("hi");
                                   // bhanu=0;
                               // j=c;
                                hi1=hi;
                                j[num]=j[num];
                               // textView2.setText(String.valueOf(j));
                              /*  if(c==d){
                                    a=c;
                                    textView2.setText(String.valueOf(a));
                                   // textView2.setText("ji");
                                }
                                else if(sum.charAt(sai-1)=='+'){
                                    a=c;
                                }
                                else {
                                    a=d;
                                    //textView2.setText(String.valueOf(a));
                                    //textView2.setText("hi2");
                                }*/
                                 //textView2.setText(String.valueOf(a));
                                // hi=0;
                                if (bhanu == sum.length()) {
                                   // textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                   // hi = (hi)/a;
                                    String str1 = String.valueOf(hi);
                                  //  textView2.setText("hi");
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }
                                     bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai=sum.length();
                                   // textView2.setText(String.valueOf(sai));
                                }
                            }else if (sum.charAt(bhanu - 1) == '/') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                  //  sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                    //hi = hi/a ;
                                    //hi=0;
                                     //e=a/c;
                                   //  j=a/c;
                                    j[num]=j[num-1];
                                    num++;
                                    //textView2.setText(String.valueOf(a));
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                      //  textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai = sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '+') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    c = Double.parseDouble(sum1);
                                   // hi = hi + a;
                                    j[num]=c;
                                    num++;
                                   // textView2.setText(String.valueOf(hi));
                                   // String str1 = String.valueOf(hi);
                                   // textView2.setText("hi");
                                  /*  if (str1.substring(str1.length() - 2).equals(".0")) {
                                     //   textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }*/
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                   // hi=hi-a;
                                    sai = sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '-') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    c = Double.parseDouble(sum1);
                                    j[num]=-c;
                                    c=-c;
                                    num++;
                                    //hi = hi - a;
                                    // hi=hi;
                                       hi=hi;
                                     //a=-a;
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        //textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    sai = sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }
                        } else {
                            sum1 = sum.substring(bhanu, sum.length() - 1);
                            a = Double.parseDouble(sum1);
                           // a=c;
                             j[num]=a;
                             num++;
                             //textView2.setText(String.valueOf(num));
                             //textView2.setText("");
                            // hi = a;
                           // textView2.setText(String.valueOf("hi"));
                            bhanu = sum.length();
                             tej[k]=bhanu;
                             k++;
                             sum2="";
                            sai=sum.length();
                        }
                    }
                }
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (sum == "" && f != 0) {
                   sum=sum+"-";
                   //bhanu=sum.length();
                    textView.setText(sum);
                   // sum = "";
                    // textView2.setText("hi");
                } else if (sum.endsWith("+")) {
                    //sum = sum.replace('+', '-');
                   sum = sum.substring(0,sum.length()-1) + "-";
                    textView.setText(sum);
                } else if (sum.endsWith("-")) {
                    sum = sum.replace('-', '-');
                    textView.setText(sum);
                } else if (sum.endsWith("x")) {
                    // sum = sum.replace('x','x' );
                    sum = sum + "-";
                   //textView2.setText(String.valueOf(j[num-1]));
                    textView.setText(sum);
                    //j[num-1] =hi1+j[num-1];
                   // num++;
                    //hi = hi+j;
                } else if (sum.endsWith("/")) {
                    //  sum = sum.replace('/','-' );
                    sum = sum + "-";
                    textView.setText(sum);
                   //j[num-1] =hi1+j[num-1];
                  // num++;
                   //hi = hi+j;
                } /*else if (sum.endsWith("%")) {
                    //sum = sum.replace('%','-' );
                    sum = sum + "-";
                    textView.setText(sum);
                  //  textView2.setText(sum);
                    bhanu=sum.length();
                }*/ else if (sum.endsWith("=")) {
                    sum = sum.replace('=', '-');
                    textView.setText(sum);
                } else {
                   if (sum == "-.") {
                       //sum="-.";
                       sum = sum.substring(0, 2);
                       textView.setText(sum);
                   } else {
                       if (f == 0 && sum == "") {
                           textView.setText("-");
                           sum = "-";
                           f++;
                       } else {
                           // sum = sum + "-";
                           //textView.setText(sum);
                           sum = sum + "-";
                           textView.setText(sum);
                           if (bhanu > 0) {
                               if (sum.charAt(bhanu - 1) == '+') {
                                   if (bhanu == sum.length()) {
                                       textView.setText(sum);
                                   } else {
                                       sum1 = sum.substring(bhanu, sum.length() - 1);
                                       a = Double.parseDouble(sum1);
                                      // hi = hi + a;
                                       hi=d;
                                       bye=hi;
                                       hi1=hi;
                                       //a=a;
                                       e=d-c;
                                       //textView2.setText(String.valueOf(e));
                                       //e=Math.round(e);
                                     //  DecimalFormat df=new DecimalFormat("#.###");
                                      // str1=df.format(e);
                                      // e=Double.valueOf(str1);
                                    //   textView2.setText(String.valueOf(e));
                                      /* String str1 = String.valueOf(hi);
                                       if (str1.substring(str1.length() - 2).equals(".0")) {
                                          // textView2.setText(str1.substring(0, str1.length() - 2));
                                       } else {
                                          // textView2.setText(str1);
                                       }*/
                                       bhanu = sum.length();
                                       tej[k]=bhanu;
                                       k++;
                                       sai = sum.length();
                                       // textView2.setText(String.valueOf(bhanu));
                                   }
                               } else if (sum.charAt(bhanu - 1) == '%') {
                                   if (bhanu == sum.length()) {
                                       textView.setText(sum);
                                   } else {
                                       //sum1 = sum.substring(bhanu, sum.length() - 1);
                                      // a = Double.parseDouble(sum1);
                                       // hi = (hi) * a;
                                       if(hi==0){
                                           hi = d;
                                           e=hi;
                                           hi1=e;
                                       }
                                       else {
                                           hi = d;
                                           e = hi - (j[num] * hi);
                                           a = j[num];
                                           num++;
                                           e = Math.round(e);
                                           hi1=e;
                                       }
                                       //textView2.setText(String.valueOf(hi));
                                       String str1 = String.valueOf(hi);
                                       if (str1.substring(str1.length() - 2).equals(".0")) {
                                          // textView2.setText(str1.substring(0, str1.length() - 2));
                                       } else {
                                         //  textView2.setText(str1);
                                       }
                                       bhanu = sum.length();
                                       tej[k]=bhanu;
                                       k++;
                                       sai=sum.length();
                                       // textView2.setText(String.valueOf(bhanu));
                                   }
                               } else if (sum.charAt(bhanu - 1) == '-') {
                                   if (bhanu == sum.length()) {
                                       textView.setText(sum);
                                   } else {
                                       sum1 = sum.substring(bhanu, sum.length() - 1);
                                       a = Double.parseDouble(sum1);
                                       hi=d;
                                       bye=hi;
                                       hi1=hi;
                                       //j=-a;
                                     //  hi = hi - a;
                                       //hi=hi;
                                      e=d-c;
                                       a=-a;
                                      //textView2.setText(String.valueOf(a));
                                      // a=-a;
                                       String str1 = String.valueOf(hi);
                                       if (str1.substring(str1.length() - 2).equals(".0")) {
                                         //  textView2.setText(str1.substring(0, str1.length() - 2));
                                       } else {
                                          // textView2.setText(str1);
                                       }
                                       bhanu = sum.length();
                                       tej[k]=bhanu;
                                       k++;
                                       sai = sum.length();
                                       // textView2.setText(String.valueOf(bhanu));
                                   }
                               } else if (sum.charAt(bhanu - 1) == '/') {
                                   if (bhanu == sum.length()) {
                                       textView.setText(sum);
                                   } else {
                                       // sum1 = sum.substring(bhanu, sum.length() - 1);
                                       //  a = Double.parseDouble(sum1);
                                       hi = b ;
                                       //num--;
                                       String str1 = String.valueOf(hi);
                                       if (str1.substring(str1.length() - 2).equals(".0")) {
                                           //  textView2.setText(str1.substring(0, str1.length() - 2));
                                       } else {
                                           //  textView2.setText(str1);
                                       }
                                       bhanu = sum.length();
                                       tej[k]=bhanu;
                                       k++;
                                       sai = sum.length();
                                       // textView2.setText(String.valueOf(bhanu));
                                   }
                               } else if (sum.charAt(bhanu - 1) == 'x') {
                                   if (bhanu == sum.length()) {
                                       textView.setText(sum);
                                   } else {
                                       // sum1 = sum.substring(bhanu, sum.length() - 1);
                                       //  a = Double.parseDouble(sum1);
                                       hi = b;
                                       hi1=hi;
                                      // num--;
                                      // textView2.setText(String.valueOf(hi));
                                       //String str1 = String.valueOf(hi);
                                       //if (str1.substring(str1.length() - 2).equals(".0")) {
                                           //textView2.setText(str1.substring(0, str1.length() - 2));
                                      // } else {
                                          // textView2.setText(str1);
                                      // }
                                       bhanu = sum.length();
                                       tej[k]=bhanu;
                                       k++;
                                       sai = sum.length();
                                       // textView2.setText(String.valueOf(bhanu));
                                   }
                               }
                           } else {
                               sum1 = sum.substring(bhanu, sum.length() - 1);
                                a = Double.parseDouble(sum1);
                                hi= a;
                                c=a;
                               bye=hi;
                                hi1=hi;
                               textView2.setText("");
                               //textView2.setText(String.valueOf(hi));
                               bhanu = sum.length();
                               tej[k]=bhanu;
                               k++;
                               sum2="";
                               sai= sum.length();
                           }
                       }
                   }
               }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum == "") {
                    textView.setText("");
                    sum = "";
                }
                else if(sum.endsWith("=")||sum.endsWith("+")||sum.endsWith("/")||sum.endsWith("-")||sum.endsWith("x")){
                    if(sum=="-"){
                        sum="-";
                        textView.setText(sum);
                    }
                    else {
                        if(sum.endsWith("/-")){
                            sum = sum.substring(0, sum.length() -2) + "+";
                            textView.setText(sum);
                            hi =hi1+c;
                            num--;
                            textView2.setText(String.valueOf(num));
                            //textView2.setText(String.valueOf(hi1));
                           // num++;
                        }
                        else if(sum.endsWith("x-")){
                            sum = sum.substring(0, sum.length() -2) + "+";
                            textView.setText(sum);
                            hi =hi1+c;
                            num--;
                           // num++;
                        }
                        else if (sum.endsWith("/")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "+";
                            textView.setText(sum);
                            hi =hi1+j[num-1];
                            num++;
                            // j=a;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                        else if (sum.endsWith("x")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "+";
                            textView.setText(sum);
                            hi =hi1+j[num-1];
                            num++;
                            // j=a;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                        else if (sum.endsWith("-")) {
                            // j=c;
                            sum = sum.substring(0, sum.length() - 1) + "+";
                            textView.setText(sum);
                            // j=a;
                            hi = hi;
                            // textView2.setText(String.valueOf("hi"));
                            //  hi1=hi;
                        }
                    }
                }
                else {
                    if (sum == "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2);
                        textView.setText(sum);
                    } else {
                        sum = sum + "+";
                      /*  SpannableString ss=new SpannableString(sum);
                        ss.setSpan(new ForegroundColorSpan(Color.parseColor("#5b39c6")),bhanu+1,sum.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);*/
                        textView.setText(sum);
                       /* if (sum.charAt(0) == 'x') {
                            textView.setText("");
                            sum = "";
                        }*/
                        if (bhanu > 0) {
                            if (sum.charAt(bhanu - 1) == 'x') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    // sum1 = sum.substring(bhanu, sum.length() - 1);
                                    //  a = Double.parseDouble(sum1);
                                    hi = b ;
                                    hi1=hi;
                                    //num--;
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    sai = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '%') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                       // sum=sum+"+";
                                       // bhanu=sum.length();
                                  //  sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                    // hi = (hi) * a;
                                    if(hi==0){
                                        hi = d;
                                        e=hi;
                                        hi1=e;
                                    }
                                    else {
                                        hi = d;
                                        e = hi - (j[num-1] * hi);
                                        a = j[num-1];
                                        num++;
                                        e = Math.round(e);
                                        hi1=e;
                                    }
                                    //DecimalFormat df=new DecimalFormat("#.###");
                                  //  str1=df.format(e);
                                    //e=Double.valueOf(str1);
                                    //textView2.setText(String.valueOf("hi"));
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                      //  textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    sai=sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '/') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                   // sum1 = sum.substring(bhanu, sum.length() - 1);
                                  //  a = Double.parseDouble(sum1);
                                    hi = b ;
                                    //textView2.setText(String.valueOf(j[num-1]));
                                  //  num--;
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                      //  textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                      //  textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    sai = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '+') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    a = Double.parseDouble(sum1);
                                    hi=d;
                                    bye=hi;
                                    hi1=hi;
                                    e=d-c;
                                  //  hi = hi + a;
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                       // textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    sai = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }else if (sum.charAt(bhanu - 1) == '-') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    hi=d;
                                    bye=hi;
                                    hi1=hi;
                                    a = Double.parseDouble(sum1);
                                    e=d-c;
                                    a=-a;
                                  //  hi = hi - a;
                                    String str1 = String.valueOf(hi);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       // textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        //textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    sai = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            }
                        } else {
                            sum1 = sum.substring(bhanu, sum.length() - 1);
                            a = Double.parseDouble(sum1);
                            hi =a;
                            c=a;
                            bye=hi;
                            hi1=hi;
                            textView2.setText("");
                            bhanu = sum.length();
                            tej[k]=bhanu;
                            k++;
                            sum2="";
                            sai=sum.length();
                        }
                    }
                }
                }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum == "") {
                    textView.setText("");
                    sum = "";
                } else if (sum.endsWith("=") || sum.endsWith("+") || sum.endsWith("/") || sum.endsWith("-") || sum.endsWith(".") || sum.endsWith("x")) {
                    if (sum == "-") {
                        sum = "-";
                        textView.setText(sum);
                    }/* else {
                        sum = sum.substring(0, sum.length() - 1) + "%";
                        textView.setText(sum);
                        // textView2.setText("hi");
                    }*/
                } else {
                    if (sum == "-.") {
                        //sum="-.";
                        sum = sum.substring(0, 2);
                        textView.setText(sum);
                    } else {
                        sum = sum + "%";
                        textView.setText(sum);
                        if (bhanu > 0) {
                            if (sum.charAt(bhanu - 1) == '%') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    if (sum.charAt(bhanu) == '%') {
                                        textView2.setText(String.valueOf(sai));
                                        if (sum.charAt(sai - 1) == '+') {
                                            d = hi+(j[num-1] / 100);
                                            j[num] = j[num-1] / 100;
                                            num++;
                                            String str1 = String.valueOf(d);
                                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                                textView2.setText(str1.substring(0, str1.length() - 2));
                                            } else {
                                                textView2.setText(String.valueOf(str1));
                                            }
                                            bhanu = sum.length();
                                            tej[k]=bhanu;
                                            k++;
                                            //}
                                        } else if (sum.charAt(sai - 1) == '-') {
                                            d = hi + (j[num-1] / 100);
                                           // textView2.setText(String.valueOf(j[num]));
                                          //  textView2.setText(String.valueOf(hi));
                                            j[num] = j[num-1] / 100;
                                            num++;
                                            //textView2.setText(String.valueOf(j[num]));
                                            String str1 = String.valueOf(d);
                                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                                textView2.setText(str1.substring(0, str1.length() - 2));
                                            } else {
                                                textView2.setText(String.valueOf(str1));
                                            }
                                            bhanu = sum.length();
                                            tej[k]=bhanu;
                                            k++;
                                            //}
                                        }
                                       else if (sum.charAt(sai - 1) == 'x') {
                                            d = hi1 + (j[num-1] / 100);
                                            j[num] = j[num-1] / 100;
                                            num++;
                                            textView2.setText(String.valueOf(num));
                                            // c=d;
                                            //textView2.setText("hi");
                                            String str1 = String.valueOf(d);
                                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                                textView2.setText(str1.substring(0, str1.length() - 2));
                                            } else {
                                                textView2.setText(str1);
                                            }
                                            bhanu = sum.length();
                                            tej[k]=bhanu;
                                            k++;
                                           // sai = sum.length();
                                        }
                                        else if(sum.charAt(sai - 1) == '/') {
                                            d = hi1 + (j[num-1] * 100);
                                            j[num] = j[num-1] * 100;
                                            num++;
                                            // c=d;
                                           // textView2.setText("hi");
                                            String str1 = String.valueOf(d);
                                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                                textView2.setText(str1.substring(0, str1.length() - 2));
                                            } else {
                                                textView2.setText(str1);
                                            }
                                            bhanu = sum.length();
                                            tej[k]=bhanu;
                                            k++;
                                          //  sai = sum.length();
                                        }
                                        else if(sum.charAt(sai - 1) == '%'){
                                           // str=str1;
                                            //b=Double.parseDouble(str);
                                           // textView2.setText("hello"+String.valueOf(b));
                                            d = hi+(j[num-1]/100);
                                            j[num]=j[num-1]/100;
                                            num++;
                                            //b=e1/100;
                                           // j = j / 100;
                                           // textView2.setText(String.valueOf("hi"));
                                            String str1 = String.valueOf(d);
                                            if (str1.substring(str1.length() - 2).equals(".0")) {
                                                textView2.setText(str1.substring(0, str1.length() - 2));
                                            } else {
                                                textView2.setText(str1);
                                            }
                                            bhanu = sum.length();
                                            tej[k]=bhanu;
                                            k++;
                                           // b=e1/100;
                                        }
                                    }
                                    else{
                                        b = hi+(d / 100);
                                        j[num] = d / 100;
                                        num++;
                                        //textView2.setText(String.valueOf(num));
                                        String str1 = String.valueOf(b);
                                        if (str1.substring(str1.length() - 2).equals(".0")) {
                                            textView2.setText(str1.substring(0, str1.length() - 2));
                                        } else {
                                            textView2.setText(str1);
                                        }
                                        bhanu = sum.length();
                                        tej[k]=bhanu;
                                        k++;
                                       // sai=sum.length();
                                    }
                                }
                            } else if (sum.charAt(bhanu - 1) == 'x') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                  //  sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                   // d =(hi1)+(e)*(a/100);
                                    d=hi1+(j[num-1]/100);
                                    j[num]=j[num-1]/100;
                                    num++;
                                    textView2.setText(String.valueOf(num));
                                    String str1 = String.valueOf(d);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                   // c = b/100;
                                  //  d=c;
                                   // sai=sum.length();
                                   //  textView2.setText(String.valueOf(sai));
                                }
                            } else if (sum.charAt(bhanu - 1) == '/') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    //sum1 = sum.substring(bhanu, sum.length() - 1);
                                   // a = Double.parseDouble(sum1);
                                    //textView2.setText(String.valueOf(e));
                                  //  d = (hi1)+(e)/(a/100);
                                    d=hi1+(j[num-1]*100);
                                    j[num]=j[num-1]*100;
                                    num++;
                                    //c = d;
                                    //d=c/100;
                                    String str1 = String.valueOf(d);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                       textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                   // sai=sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                            } else if (sum.charAt(bhanu - 1) == '+') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    a = Double.parseDouble(sum1);
                                    b = hi + ((a / 100) * hi);
                                    j[num] = (a/100);
                                    num++;
                                    textView2.setText(String.valueOf(num));
                                    d=b;
                                  //  c=a;
                                    //  textView2.setText("hi");
                                    String str1 = String.valueOf(b);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                   // textView2.setText(String.valueOf(tej[k]));
                                    k++;
                                 //   sai=sum.length();
                                }
                            } else if (sum.charAt(bhanu - 1) == '-') {
                                if (bhanu == sum.length()) {
                                    textView.setText(sum);
                                } else {
                                    sum1 = sum.substring(bhanu, sum.length() - 1);
                                    a = Double.parseDouble(sum1);
                                    b = hi+((-a / 100) * hi);
                                    j[num] =-(a / 100);
                                    num++;
                                    d=b;
                                    //a=-a;
                                   // textView2.setText(String.valueOf(j[num]));
                                    //hi=hi;
                                   // d = c;
                                    //textView.setText(sum);
                                    String str1 = String.valueOf(b);
                                    if (str1.substring(str1.length() - 2).equals(".0")) {
                                        textView2.setText(str1.substring(0, str1.length() - 2));
                                    } else {
                                        textView2.setText(str1);
                                    }
                                    bhanu = sum.length();
                                    tej[k]=bhanu;
                                    k++;
                                  //  sai=sum.length();
                                    // textView2.setText(String.valueOf(bhanu));
                                }
                              }
                             }else {
                                        sum1 = sum.substring(bhanu, sum.length() - 1);
                                        a = Double.parseDouble(sum1);
                                        d = a / 100;
                                        j[num]=d;
                                        num++;
                                        //b=c;
                                       // d = c;
                                        // hi=c;
                                        // textView2.setText();
                                        textView2.setText(String.valueOf(d));
                                        bhanu = sum.length();
                                        tej[k]=bhanu;
                                        k++;
                                        sai=sum.length();
                                        sum2="";
                                        hi=0;
                                        hi1=0;
                                    }
                                }
                        }
                    }
        });
bequal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        for(int gm=0;gm<sum.length();gm++){
            if(sum.charAt(gm)=='+'||sum.charAt(gm)=='-'||sum.charAt(gm)=='/'||sum.charAt(gm)=='x'){
                count++;
            }
        }
        if(count==1&&(sum.endsWith("+")|| sum.endsWith("/") || sum.endsWith("-") || sum.endsWith("x"))){
            Toast.makeText(MainActivity.this, "Please Enter an number", Toast.LENGTH_SHORT).show();
            textView2.setText("");
            count=0;
        }
        else if(bhanu==0){
            Toast.makeText(MainActivity.this, "Please Enter an Operator", Toast.LENGTH_SHORT).show();
            textView2.setText("");
        }
        else if(sum3.endsWith("=")){
            textView.setText("");
            sum3="";
        }
        else {
            sum3=sum;
            sum3 = sum3+"=";
            sum2=sum3;
            textView.setText("");
            //   textView2.setText(String.valueOf(d));
            str = "Ans:";
            String str1 = String.valueOf(mom);
            if (str1.substring(str1.length() - 2).equals(".0")) {
                textView2.setText(str +" "+str1.substring(0, str1.length() - 2));
                str2=str1.substring(0, str1.length() - 2);
            } else {
                textView2.setText(str +" "+str1);
                str2=str1;
            }
            sum=str2;
            bhanu=0;
            a=0;
            b=0;
            c=0;
            d=0;
            e=0;
            e1=0;
            //i=0;
            j[num]=0;
            hi1=0;
            sum3="";
            count=0;
            hi=Double.parseDouble(sum);
           // textView2.setText(sum);
        }
    }
});
bwrong.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // str2 = sum.substring(bhanu, sum.length());
        //g = str2.length();
        if (sum.length() > 0) {
            for (int gm = 0; gm < sum.length(); gm++) {
                if (sum.charAt(gm) == '+' || sum.charAt(gm) == '-' || sum.charAt(gm) == '/' || sum.charAt(gm) == 'x' || sum.charAt(gm) == '%') {
                    count++;
                }
            }
            if ((count==0)&&(sum.endsWith("1")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00"))){
                sum = sum.substring(0,sum.length()-1);
                textView.setText(sum);
                if(sum.length()==0){
                    sum="";
                }
                count=0;
            }
                /*if ((count==0)&&(sum.endsWith("1")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00"))){
                    sum = sum.substring(0,sum.length()-1);
                    textView.setText(sum);
                    if(sum.length()==0){
                        sum="";
                    }
                }*/
            else if (sum == "-.") {
                sum = "-";
                textView.setText(sum);
                count=0;
            }
            else if(sum.endsWith("/-")||sum.endsWith("x-")){
                sum= sum.substring(0,sum.length()-1);
                textView.setText(sum);
                count=0;
            }
            else if (sum.endsWith("+")) {
                count=0;
                for (int gm = 0; gm < sum.length(); gm++) {
                    if (sum.charAt(gm) == '+' || sum.charAt(gm) == '-' || sum.charAt(gm) == '/' || sum.charAt(gm) == 'x' || sum.charAt(gm) == '%') {
                        count++;
                    }
                }
                rey=sum.length();
                if (sum.charAt(rey-1)=='+' && (sum.charAt(0) == '-')) {
                        sum = sum.substring(0, sum.length() - 1);
                        textView.setText(sum);
                        textView2.setText("");
                        bhanu = 0;
                        count = 0;
                }
                else {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    if (count == 1) {
                        bhanu = 0;
                        count = 0;
                        hi = hi - a;
                        hi1 = hi;
                        textView2.setText("");
                    } else {
                        bhanu = tej[k - 2];
                        k = k - 1;
                        if (k < 0) {
                            k = 0;
                        }
                        if (sum.charAt(bhanu - 1) == '+') {
                            string = sum.substring(bhanu, sum.length());
                            t = Double.parseDouble(string);
                            hi = hi - (t);
                        } else if (sum.charAt(bhanu - 1) == '-') {
                            string = sum.substring(bhanu, sum.length());
                            t = Double.parseDouble(string);
                            //textView2.setText(String.valueOf(hi));
                            hi = hi + (t);
                        } else if (sum.charAt(bhanu - 1) == 'x' || sum.charAt(bhanu - 1) == '/') {
                            hi = hi - j[num - 1];
                            //  textView2.setText(String.valueOf(j[num-2]));
                            hi1 = hi;
                        } else if (sum.charAt(bhanu - 1) == '%') {
                            //  ;
                            hi = hi - j[num - 1];
                            hi1 = hi;
                        }
                    }
                }
                count=0;
            } else if (sum.endsWith("-")) {
                count=0;
                for (int gm = 0; gm < sum.length(); gm++) {
                    if (sum.charAt(gm) == '+' || sum.charAt(gm) == '-' || sum.charAt(gm) == '/' || sum.charAt(gm) == 'x' || sum.charAt(gm) == '%') {
                        count++;
                    }
                }
                rey=sum.length();
                if (sum.charAt(rey-1)=='-' && (sum.charAt(0) == '-')) {
                    sum = sum.substring(0, sum.length() - 1);
                    if(sum.length()==0){
                        sum="";
                        textView.setText(sum);
                        textView2.setText("");
                        bhanu = 0;
                        count = 0;
                    }
                    else {
                        textView.setText(sum);
                        textView2.setText("");
                        bhanu = 0;
                        count = 0;
                    }
                }
                else {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    if (count == 1) {
                    bhanu = 0;
                    count = 0;
                    hi=hi-a;
                    hi1=hi;
                    textView2.setText("");
                }else {
                            bhanu = tej[k - 2];
                            k = k - 1;
                            if (k < 0) {
                                k = 0;
                            }
                            if (sum.charAt(bhanu - 1) == '-') {
                                string = sum.substring(bhanu, sum.length());
                                t = Double.parseDouble(string);
                                //textView2.setText(String.valueOf(hi));
                                hi = hi + (t);
                            } else if (sum.charAt(bhanu - 1) == '+') {
                                string = sum.substring(bhanu, sum.length());
                                t = Double.parseDouble(string);
                                //textView2.setText(String.valueOf(hi));
                                hi = hi - (t);
                            } else if (sum.charAt(bhanu - 1) == 'x' || sum.charAt(bhanu - 1) == '/') {
                                hi = hi - j[num - 1];
                                hi1 = hi;
                            } else if (sum.charAt(bhanu - 1) == '%') {
                                //  textView2.setText(String.valueOf(bhanu));
                                hi = hi - j[num - 1];
                                hi1 = hi;
                            }
                    }
                }
                count=0;
            } else if (sum.endsWith("/")) {
                count=0;
                for (int gm = 0; gm < sum.length(); gm++) {
                    if (sum.charAt(gm) == '+' || sum.charAt(gm) == '-' || sum.charAt(gm) == '/' || sum.charAt(gm) == 'x' || sum.charAt(gm) == '%') {
                        count++;
                    }
                }
                rey=sum.length();
                if (sum.charAt(rey-1)=='/' && (sum.charAt(0) == '-')) {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    textView2.setText("");
                    bhanu = 0;
                    count = 0;
                }
                else {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    if (count == 1) {
                    bhanu = 0;
                    count = 0;
                    textView2.setText("");
                } else {
                        bhanu = tej[k - 2];
                        k = k - 1;
                        if (k < 0) {
                            k = 0;
                        }
                        j[num] = j[num - 1];
                        num--;
                        count = 0;
                        //textView2.setText(String.valueOf(j[num-1]));
             /*if (sum.charAt(bhanu - 1) == '+') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi +(t);
             }
             else if(sum.charAt(bhanu - 1) == '-') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi -(t);
             //textView2.setText(String.valueOf(hi));
             }
             // string = sum.substring(bhanu, sum.length());
             //   t = Double.parseDouble(string);
             //j = j * t;
             }*/
                    }
                }
            } else if (sum.endsWith("%")) {
                count=0;
                for (int gm = 0; gm < sum.length(); gm++) {
                    if (sum.charAt(gm) == '+' || sum.charAt(gm) == '-' || sum.charAt(gm) == '/' || sum.charAt(gm) == 'x' || sum.charAt(gm) == '%') {
                        count++;
                    }
                }
                rey=sum.length();
                if (sum.charAt(rey-1)=='%' && (sum.charAt(0) == '-')) {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    textView2.setText("");
                    bhanu = 0;
                    count = 0;
                }
                else {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    if (count == 1) {
                    bhanu = 0;
                    count = 0;
                    textView2.setText("");
                }
                else {
                        bhanu = tej[k - 2];
                        k = k - 1;
                        if (k < 0) {
                            k = 0;
                        }
                        if (sum.charAt(bhanu - 1) == '/') {
                            string = sum.substring(bhanu, sum.length());
                            t = Double.parseDouble(string);
                            j[num] = j[num - 1] / 100;
                            d = hi1 + (j[num]);
                            num--;
                        } else if (sum.charAt(bhanu - 1) == 'x') {
                            //textView2.setText(String.valueOf(num));
                            string = sum.substring(bhanu, sum.length());
                            t = Double.parseDouble(string);
                            j[num] = j[num - 1] * 100;
                            d = hi1 + (j[num]);
                            num--;
                        } else if (sum.charAt(bhanu - 1) == '+' || sum.charAt(bhanu - 1) == '-') {
                            j[num - 1] = j[num - 1] * 100;
                            if (num - 1 == 1) {
                                j[num] = j[num - 1] * 100;
                                d = hi + (j[num]);
                            } else {
                                d = hi + (j[num - 1]);
                                // textView2.setText(String.valueOf(d));
                                j[num] = j[num - 1];
                            }
                            num--;
                        } else if (sum.charAt(bhanu - 1) == '%') {
                            j[num] = j[num - 1] * 100;
                            d = hi + (j[num]);
                            num--;
                        }
                        mom = d;
                        String str1 = String.valueOf(mom);
                        count = 0;
                        if (str1.substring(str1.length() - 2).equals(".0")) {
                            textView2.setText(str1.substring(0, str1.length() - 2));
                        } else {
                            textView2.setText(str1);
                        }
                    }
                }
            } else if (sum.endsWith("x")) {
                count=0;
                for (int gm = 0; gm < sum.length(); gm++) {
                    if (sum.charAt(gm) == '+' || sum.charAt(gm) == '-' || sum.charAt(gm) == '/' || sum.charAt(gm) == 'x' || sum.charAt(gm) == '%') {
                        count++;
                    }
                }
                rey=sum.length();
                if (sum.charAt(rey-1)=='x' && (sum.charAt(0) == '-')) {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    textView2.setText("");
                    bhanu = 0;
                    count = 0;
                }
                else {
                    sum = sum.substring(0, sum.length() - 1);
                    textView.setText(sum);
                    if (count == 1) {
                    bhanu = 0;
                    count = 0;
                    textView2.setText("");
                } else {
                        bhanu = tej[k - 2];
                        k = k - 1;
                        if (k < 0) {
                            k = 0;
                        }
                        j[num] = j[num - 1];
                        num--;
                        //  textView2.setText(String.valueOf(num));
                        count = 0;
                        //textView2.setText(String.valueOf(hi));
             /* if (sum.charAt(bhanu - 1) == '+') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi + (t);
             }
             else if(sum.charAt(bhanu - 1) == '-') {
             string = sum.substring(bhanu, sum.length());
             t = Double.parseDouble(string);
             hi = hi - (t);
             }
             //string = sum.substring(bhanu, sum.length());
             //t = Double.parseDouble(string);
             //j=j/t;
             }*/
                    }
                }
            } else if (bhanu > 0 && sum.charAt(bhanu - 1) == '+') {
                sum = sum.substring(0, sum.length() - 1);
                textView.setText(sum);
                sum1 = sum.substring(bhanu, sum.length());
                if(sum1.isEmpty()){
                    d=hi;
                }
                else {
                    c = Double.parseDouble(sum1);
                    d = hi + c;
                    hi1 = hi;
                }
                mom = d;
                count=0;
                String str1 = String.valueOf(mom);
                if (str1.substring(str1.length() - 2).equals(".0")) {
                    textView2.setText(str1.substring(0, str1.length() - 2));
                } else {
                    textView2.setText(str1);
                }
            }
            else if (bhanu > 0 && sum.charAt(bhanu - 1) == '-') {
                sum = sum.substring(0, sum.length() - 1);
                textView.setText(sum);
                sum1 = sum.substring(bhanu, sum.length());
                if(sum1.isEmpty()){
                    d=hi;
                }
                else {
                    c = Double.parseDouble(sum1);
                    d = hi - c;
                    hi1 = hi;
                }
                mom = d;
                count=0;
                String str1 = String.valueOf(mom);
                if (str1.substring(str1.length() - 2).equals(".0")) {
                    textView2.setText(str1.substring(0, str1.length() - 2));
                } else {
                    textView2.setText(str1);
                }
            }else if (bhanu > 0 && sum.charAt(bhanu - 1) == 'x') {
                c=Double.parseDouble(sum.substring(bhanu,sum.length()));
                // textView2.setText(String.valueOf(j[num-1]));
                j[num-1] = j[num-1] / c;
                sum = sum.substring(0, sum.length() - 1);
                textView.setText(sum);
                sum1 = sum.substring(bhanu, sum.length());
                if(sum1.isEmpty()){
                    b=hi1+j[num-1];
                }
                else {
                    c = Double.parseDouble(sum1);
                    b = hi1 + (j[num-1] * c);
                    j[num-2] = j[num-1] * c;
                    if(num-2<0){
                        j[num-2]=0;
                    }
                    //textView2.setText(String.valueOf(num-1));
                }
                num--;
                // textView2.setText(String.valueOf(num));
                mom = b;
                count=0;
                String str1 = String.valueOf(mom);
                if (str1.substring(str1.length() - 2).equals(".0")) {
                    textView2.setText(str1.substring(0, str1.length() - 2));
                } else {
                    textView2.setText(str1);
                }
            }
            else if (bhanu > 0 && sum.charAt(bhanu - 1) == '/') {
                c=Double.parseDouble(sum.substring(bhanu,sum.length()));
                j[num-1] = j[num-1] * c;
                sum = sum.substring(0, sum.length() - 1);
                textView.setText(sum);
                sum1 = sum.substring(bhanu, sum.length());
                if(sum1.isEmpty()){
                    b=hi1+j[num-1];
                }
                else {
                    c = Double.parseDouble(sum1);
                    b = hi1 + (j[num-1] / c);
                    j[num-2] = j[num-1] / c;
                    if(num-2<0){
                        j[num-2]=0;
                    }
                    //textView2.setText(String.valueOf(num-1));
                }
                num--;
                mom = b;
                count=0;
                String str1 = String.valueOf(mom);
                if (str1.substring(str1.length() - 2).equals(".0")) {
                    textView2.setText(str1.substring(0, str1.length() - 2));
                } else {
                    textView2.setText(str1);
                }
            }
            else if (bhanu > 0 && sum.charAt(bhanu - 1) == '%') {
                c=Double.parseDouble(sum.substring(bhanu,sum.length()));
                j[num-1] = j[num-1] /c;
                sum = sum.substring(0, sum.length() - 1);
                textView.setText(sum);
                sum1 = sum.substring(bhanu, sum.length());
                if(sum1.isEmpty()){
                    b=hi1+j[num-1];
                }
                else {
                    c = Double.parseDouble(sum1);
                    b = hi1 + ((j[num-1])*c);
                    j[num-2] = (j[num-1])*c;
                    if(num-2<0){
                        j[num-2]=0;
                    }
                    //textView2.setText(String.valueOf(num-1));
                }
                num--;
                mom = b;
                count=0;
                String str1 = String.valueOf(mom);
                if (str1.substring(str1.length() - 2).equals(".0")) {
                    textView2.setText(str1.substring(0, str1.length() - 2));
                } else {
                    textView2.setText(str1);
                }
            }
            else if((sum.charAt(0)=='-')&&(sum.endsWith("1")||sum.endsWith("2")||sum.endsWith("3")||sum.endsWith("4")||sum.endsWith("5")||sum.endsWith("6")||sum.endsWith("7")||sum.endsWith("8")||sum.endsWith("9")||sum.endsWith("0")||sum.endsWith("00"))){
                sum = sum.substring(0, sum.length() - 1);
                textView.setText(sum);
            }
        }
    }
});
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("");
                sum="";
                bhanu=0;
                hi=0;
                a=0;
                b=0;
                c=0;
                d=0;
                e=0;
                e1=0;
                mom=0;
                j[num]=0;
                z=0;
                num=0;
                y=0;
                t=0;
                p=0;
                bye=0;
                count=0;
                hi1=0;
            }
        });
    }
    }