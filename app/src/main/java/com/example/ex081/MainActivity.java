package com.example.ex081;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{
    Button redTeam, blueTeam, resultBtn;
    int redTeamScore, blueTeamScore;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        redTeam = findViewById(R.id.redTeam);
        blueTeam = findViewById(R.id.blueTeam);
        resultBtn = findViewById(R.id.result);
        redTeamScore = 0;
        blueTeamScore = 0;


        redTeam.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                redTeamScore += 1;
            }
        });

        blueTeam.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v)
            {
                blueTeamScore += 1;
                return false;
            }
        });
    }


    public void show_result(View view)
    {

    }
}