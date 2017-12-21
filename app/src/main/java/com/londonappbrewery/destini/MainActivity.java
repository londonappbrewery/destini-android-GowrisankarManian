package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mAns1Button;
    Button mAns2Button;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mAns1Button = (Button) findViewById(R.id.buttonTop);
        mAns2Button = (Button) findViewById(R.id.buttonBottom);

        mTextView = (TextView) findViewById(R.id.storyTextView);

        final String mT1Text = getString(R.string.T1_Story);
        final String mT2Text = getString(R.string.T2_Story);
        final String mT3Text = getString(R.string.T3_Story);

        final String mT1Ans1 = getString(R.string.T1_Ans1);
        final String mT2Ans1 = getString(R.string.T2_Ans1);
        final String mT3Ans1 = getString(R.string.T3_Ans1);

        final String mT1Ans2 = getString(R.string.T1_Ans2);
        final String mT2Ans2 = getString(R.string.T2_Ans2);
        final String mT3Ans2 = getString(R.string.T3_Ans2);

        final String mT4End = getString(R.string.T4_End);
        final String mT5End = getString(R.string.T5_End);
        final String mT6End = getString(R.string.T6_End);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mAns1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        //        String mT1Text = getString(R.string.T1_Story);

                if(mTextView.getText() == mT1Text || mTextView.getText() == mT2Text  ){
                    Log.d("Test","Working...");
                    mTextView.setText(mT3Text);
                    mAns1Button.setText(mT3Ans1);
                    mAns2Button.setText(mT3Ans2);
                } else if (mTextView.getText() == mT3Text) {
                    mTextView.setText(mT6End);
                    mAns1Button.setVisibility(View.GONE);
                    mAns2Button.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mAns2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(mTextView.getText() == mT1Text){

                    mTextView.setText(mT2Text);
                    mAns1Button.setText(mT2Ans1);
                    mAns2Button.setText(mT2Ans2);
                } else if (mTextView.getText() == mT2Text) {
                    Log.d("Test","False Working...");
                    mTextView.setText(mT4End);
                    mAns1Button.setVisibility(View.GONE);
                    mAns2Button.setVisibility(View.GONE);
                } else if (mTextView.getText() == mT3Text) {
                    mTextView.setText(mT5End);
                    mAns1Button.setVisibility(View.GONE);
                    mAns2Button.setVisibility(View.GONE);
                }

            }
        });


    }
}
