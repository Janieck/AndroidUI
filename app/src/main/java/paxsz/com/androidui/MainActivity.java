package paxsz.com.androidui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView text_view;
    private EditText edit_text;
    private ImageView image_view;
    private ProgressBar progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        text_view = (TextView) findViewById(R.id.text_view);
        edit_text = (EditText) findViewById(R.id.edit_text);
        image_view = (ImageView) findViewById(R.id.image_view);
        progress_bar = (ProgressBar) findViewById(R.id.progress_bar);
        progress_bar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
              /*  String inputText = edit_text.getText().toString();
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show();*/
                // image_view.setImageResource(R.drawable.banana);
              /*  if (progress_bar.getVisibility() == View.GONE) {
                    progress_bar.setVisibility(View.VISIBLE);
                } else {
                    progress_bar.setVisibility(View.GONE);
                }*/
               /* int progress = progress_bar.getProgress();
                progress = progress + 10;
                progress_bar.setProgress(progress);*/
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
                break;
        }
    }

    private void submit() {
        // validate
        String text = edit_text.getText().toString().trim();
        if (TextUtils.isEmpty(text)) {
            Toast.makeText(this, "Type something here", Toast.LENGTH_SHORT).show();
            return;
        }
        // TODO validate success, do something
    }
}
