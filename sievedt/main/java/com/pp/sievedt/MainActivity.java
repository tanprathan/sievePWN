package com.pp.sievedt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

import static com.pp.sievedt.R.id.scrollView;
import static com.pp.sievedt.R.id.textView1;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(textView1);

        Uri targetURI = Uri.parse("content://com.mwr.example.sieve.FileBackupProvider/etc/hosts");
        try {
            InputStream content = getContentResolver().openInputStream(targetURI);

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(content));
            String line1;
            while ((line1 = reader1.readLine()) != null) {
                text.append(line1);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
