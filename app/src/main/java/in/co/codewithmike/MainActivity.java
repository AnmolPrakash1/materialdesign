package in.co.codewithmike;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import in.co.codewithmike.activity.MaterialDesignMain;
import in.co.codewithmike.activity.MyProjectMain;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    private CardView tabMaterialDesign, tabMyProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        tabMaterialDesign.setOnClickListener(this);
        tabMyProject.setOnClickListener(this);
    }

    private void initComponents() {
        tabMaterialDesign = findViewById(R.id.tabMaterialDesign);
        tabMyProject = findViewById(R.id.tabMyProject);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tabMaterialDesign:
                showToast("Clicked Material Design Tab");
                startActivity(new Intent(MainActivity.this, MaterialDesignMain.class));
                break;
            case R.id.tabMyProject:
                showToast("Clicked My Project Tab");
                startActivity(new Intent(MainActivity.this, MyProjectMain.class));
        }
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
