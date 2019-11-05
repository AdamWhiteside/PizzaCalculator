package com.pizza_pi;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class calc extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
             //hide();
        }
    };
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calc);

        final CheckBox mToppingsEnable = findViewById(R.id.Toppings_Enable);
        final Button buttonLess = findViewById(R.id.Toppings_Quantity_Less);
        final Button buttonMore = findViewById(R.id.Toppings_Quantity_More);
        final EditText txtQuant = findViewById(R.id.Toppings_Quantity_Custom);
        final EditText txtCost = findViewById(R.id.Toppings_Cost_Custom);
        final TextView topCst = findViewById(R.id.textView10);
        final TextView topQuant = findViewById(R.id.textView11);

        final Button buttonPz = findViewById(R.id.Pizzeria_New);

        final EditText txtDep = findViewById(R.id.customDepth);

        final RadioButton CD = findViewById(R.id.Depth_CD);
        final RadioButton TC = findViewById(R.id.Depth_TC);
        final RadioButton DD = findViewById(R.id.Depth_DD);
        final RadioButton HT = findViewById(R.id.Depth_HT);
        //final RadioGroup DepthGroup = findViewById(R.id.Depth_Group);
        //final int id = DepthGroup.getCheckedRadioButtonId();

        final TextView txtUnit = findViewById(R.id.Unit_Display);
        final RadioButton SL = findViewById(R.id.Unit_S);
        final RadioButton DI = findViewById(R.id.Unit_D);
        final RadioButton RA = findViewById(R.id.Unit_R);
        final RadioButton CI = findViewById(R.id.Unit_C);

        final Button buttonPLess = findViewById(R.id.People_Less);
        final Button buttonPMore = findViewById(R.id.People_More);
        final EditText txtP = findViewById(R.id.People_Custom);
        Button mcalcButton = findViewById(R.id.calcButton);
        mVisible = true;



        //calc button is clicked, switches to leaderboard page
        mcalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(calc.this, leaderboardActivity.class));
            }
        });

        //when the + people button is clicked incriment the people text field by 1
        buttonPMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valP = Integer.parseInt(txtP.getText().toString());
                txtP.setText(Integer.toString(1 + valP));
            }
        });

        //when the - people button is clicked decriment the people text field by 1
        buttonPLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valP = Integer.parseInt(txtP.getText().toString());
                if(valP > 1){
                    txtP.setText(Integer.toString(valP - 1));
                } else {
                    txtP.setText("1");
                }
            }
        });

        //when the + topping button is clicked incriment the people text field by 1
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valT = Integer.parseInt(txtQuant.getText().toString().trim());
                txtQuant.setText(Integer.toString(valT + 1));
            }
        });

        //when the - topping button is clicked decriment the people text field by 1
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valT = Integer.parseInt(txtQuant.getText().toString().trim());
                if(valT > 1){
                    txtQuant.setText(Integer.toString(valT - 1));
                } else {
                    txtQuant.setText("1");
                }

            }
        });

        //Set text for unit specifier to slice
        SL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUnit.setText("Slice");
            }
        });

        //Set text for unit specifier to diameter
        DI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUnit.setText("Diameter");
            }
        });

        //Set text for unit specifier to radius
        RA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUnit.setText("Radius");
            }
        });

        //Set text for unit specifier to circumference
        CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUnit.setText("Circumference");
            }
        });

        //Custom depth is selected, custom textbox is enabled
        CD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDep.setEnabled(CD.isChecked());

            }
        });

        //Hand tossed is selected, custom textbox is dissabled
        HT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDep.setEnabled(!HT.isChecked());

            }
        });

        //Thin crust is selected, custom textbox is dissabled
        TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDep.setEnabled(!TC.isChecked());

            }
        });

        //Deep dish is selected, custom textbox is dissabled
        DD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDep.setEnabled(!DD.isChecked());

            }
        });

        // add pizzaria button is clicked
        buttonPz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //toggle toppings, controls enabling and dissabling topping related fields
        mToppingsEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check current state of a Switch (true or false).
                Boolean switchState = mToppingsEnable.isChecked();

                buttonLess.setEnabled(switchState);
                buttonMore.setEnabled(switchState);
                txtQuant.setEnabled(switchState);
                txtCost.setEnabled(switchState);
                topCst.setEnabled(switchState);
                topQuant.setEnabled(switchState);
            }
        });
/*


        // Set up the user interaction to manually show or hide the system UI.
        mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });
*/
        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.

    }



    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }

    private void toggle() {
        if (mVisible) {
            //hide();
        } else {
            show();
        }
    }
/*
    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        //mControlsView.setVisibility(View.GONE);
        mVisible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }
*/
    @SuppressLint("InlinedApi")
    private void show() {
        // Show the system bar
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        mVisible = true;

        // Schedule a runnable to display UI elements after a delay
        mHideHandler.removeCallbacks(mHidePart2Runnable);
        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }

    /**
     * Schedules a call to hide() in delay milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }
}
