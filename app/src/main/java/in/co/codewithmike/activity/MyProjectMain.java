package in.co.codewithmike.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import in.co.codewithmike.R;

public class MyProjectMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_project_main);

        initToolbar(); // initialize Toolbar
    }

    private void initToolbar() {
        ImageView backArrow = findViewById(R.id.buttonBackArrow);
        TextView toolbarHeading = findViewById(R.id.toolbarHeading);
        toolbarHeading.setText("My Project");
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
