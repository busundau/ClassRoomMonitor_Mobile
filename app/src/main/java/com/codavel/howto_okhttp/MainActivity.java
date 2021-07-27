package com.codavel.howto_okhttp;

import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.gson.JsonObject;
import com.zhy.autolayout.AutoLayoutActivity;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity   extends AutoLayoutActivity {

    private ProgressDialog prg;
    private WebView webView;
    private Button button;
    private  int counter=0;
    private Timer myTimer;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button07;
    private Button button08;
    private Button button09;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    public int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init timer
       // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);// 横屏
        setRequestedOrientation(ActivityInfo .SCREEN_ORIENTATION_PORTRAIT);//竖屏

        button01 = (Button)findViewById(R.id.button);
        button02 = (Button)findViewById(R.id.button2);
        button03 = (Button)findViewById(R.id.button3);
        button04 = (Button)findViewById(R.id.button4);
        button05 = (Button)findViewById(R.id.button5);
        button06 = (Button)findViewById(R.id.button6);
        button07 = (Button)findViewById(R.id.button7);
        button08 = (Button)findViewById(R.id.button8);
        button09 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        button17 = (Button)findViewById(R.id.button17);
        button18 = (Button)findViewById(R.id.button18);
        button19 = (Button)findViewById(R.id.button19);
        button20 = (Button)findViewById(R.id.button20);
        button21 = (Button)findViewById(R.id.button21);
        button22 = (Button)findViewById(R.id.button22);


        webView =(WebView)findViewById(R.id.webview);

       // webView.getSettings().setJavaScriptEnabled(true);
      //  webView.getSettings().setAppCacheEnabled(true);
      //  webView.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getPath());
      //  webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

        WebSettings settings = webView.getSettings();
        settings.setUseWideViewPort(true);

        settings.setLoadWithOverviewMode(true);
        webView.setWebViewClient(new WebViewClient());



        //URL gir "....."
       // getWebview("http://192.168.100.253/jpgimage/1/image.jpg");
        getWebview("http://192.168.100.253/mjpgstreamreq/1/image.jpg");


        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                TimerMethod();
            }

        }, 0, 2000);






/*
        // GET
        Request get = new Request.Builder()
                .url("http://192.168.100.253")
                .build();

        client.newCall(get).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) {
                try {
                    ResponseBody responseBody = response.body();
                    if (!response.isSuccessful()) {
                        throw new IOException("Unexpected code " + response);
                    }

                    Log.i("data", responseBody.string());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
*/

        button01.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=5&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });






            }

        });
        button02.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=1&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });


            }

        });
        button03.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=7&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });
        button04.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=3&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });
        button05.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Stop=0&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });
        button06.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=4&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });
        button07.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=6&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });


            }

        });
        button08.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=2&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });
        button09.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Direction=8&PanSpeed=6&TiltSpeed=6")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });


            }

        });

        button10.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {   //Zoom Out
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Zoom=0")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });


            }

        });


        button11.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {         //Zoom in
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Zoom=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });


            }

        });


        button12.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {   //Focus far
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Focus=0")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });








            }

        });


        button13.setOnClickListener(new Button.OnClickListener(){


            @Override

            public void onClick(View v) {     //Focus Near
                flag=1;
                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Focus=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });








            }


        });

        button14.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorHor=0")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });

        button15.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorHor=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });

        button16.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorVer=0")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });

        button17.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorVer=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });


        button18.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/presetSet?existFlag=1&flag=3&language=en&presetName=G4&presetNum=4")//flag=3表示set presetNum從0開始表示第一組
                //http://192.168.100.253/form/presetSet?_=1627369923499
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();




                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });

        button19.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/presetSet?existFlag=1&flag=4&language=en&presetName=G4&presetNum=4")//flag=4表示call presetNum從0開始表示第一組
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });


        button20.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorVer=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });


        button21.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorVer=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });


        button22.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {
                flag=1;

                OkHttpClient client = new OkHttpClient();
                // POST
                JsonObject postData = new JsonObject();
                postData.addProperty("name", "morpheus");
                postData.addProperty("job", "leader");

                final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                RequestBody postBody = RequestBody.create(JSON, postData.toString());
                Request post = new Request.Builder()
                        .url("http://192.168.100.253/cgi/camera_set?Channel=1&Group=BasicInfo&MirrorVer=1")
                        .addHeader("Authorization", Credentials.basic("admin", "admin"))
                        .post(postBody)
                        .build();

                client.newCall(post).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        try {
                            ResponseBody responseBody = response.body();
                            if (!response.isSuccessful()) {
                                throw new IOException("Unexpected code " + response);
                            }

                            Log.i("data", responseBody.string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

        });



    }
    private void TimerMethod()
    {
        //This method is called directly by the timer
        //and runs in the same thread as the timer.

        //We call the method that will work with the UI
        //through the runOnUiThread method.
        this.runOnUiThread(Timer_Tick);
    }


    private Runnable Timer_Tick = new Runnable() {
        public void run() {
            //This method runs in the same thread as the UI.
            webView.reload();

         if(  flag==1)
         {

             //Do something to the UI thread here
             OkHttpClient client = new OkHttpClient();
             // POST
             JsonObject postData = new JsonObject();
             postData.addProperty("name", "morpheus");
             postData.addProperty("job", "leader");

             final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
             RequestBody postBody = RequestBody.create(JSON, postData.toString());
             Request post = new Request.Builder()
                     .url("http://192.168.100.253/cgi/ptz_set?Channel=1&Group=PTZCtrlInfo&Stop=0&PanSpeed=6&TiltSpeed=6")
                     .addHeader("Authorization", Credentials.basic("admin", "admin"))
                     .post(postBody)
                     .build();

             client.newCall(post).enqueue(new Callback() {
                 @Override
                 public void onFailure(Call call, IOException e) {
                     e.printStackTrace();
                 }

                 @Override
                 public void onResponse(Call call, Response response) {
                     try {
                         ResponseBody responseBody = response.body();
                         if (!response.isSuccessful()) {
                             throw new IOException("Unexpected code " + response);
                         }

                         Log.i("data", responseBody.string());
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             });
             flag=0;
         }
        }
    };

    public void getWebview(String myurl)
    {





        webView.setWebViewClient(new WebViewClient()
        {


            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {


                prg.show();



                return super.shouldOverrideUrlLoading(view, url);
            }

            @Override
            public void onPageFinished(WebView view, String url) {

                prg.dismiss();

                view.getSettings().setJavaScriptEnabled(true);




                super.onPageFinished(view, url);
            }


            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {



                super.onPageStarted(view, url, favicon);
            }





        });
        String credentials = "admin" + ":" + "admin";

        final String basic =
                "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

        HashMap<String, String> headerMap = new HashMap<>();
        //put all headers in this header map
        headerMap.put("Authorization", basic);
        prg = ProgressDialog.show(MainActivity.this, "Blog App", "İçerik Yükleniyor", true);
        webView.loadUrl(myurl,headerMap);
        webView.reload();


    }

    @Override
    protected void onResume() {
        super.onResume();


    }


    @Override
    public void onBackPressed() {


        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }

    }

}
