package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv1 = findViewById(R.id.imageView);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(view);
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menupopup, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.ayuda1) {
                    Toast.makeText(MainActivity.this, "Ayuda 1", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.ayuda2) {
                    Toast.makeText(MainActivity.this, "Ayuda 2", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
