package com.fadetoproductions.rvkn.clothesconsensus.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.fadetoproductions.rvkn.clothesconsensus.R;
import com.fadetoproductions.rvkn.clothesconsensus.models.User;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.rlEmailLogin) RelativeLayout rlEmailLogin;
    @BindView(R.id.rlButtonContainer) RelativeLayout rlButtonContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User user = User.getLoggedInUser(this);
        if (user != null) {
            startHomeActivity();
        }

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.rlButtonContainer)
    public void hideLoginWithEmailStuff(View view) {
        Animation animFadeOut = AnimationUtils.loadAnimation(this, R.anim.slide_down_email);
        animFadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                rlEmailLogin.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        rlEmailLogin.startAnimation(animFadeOut);
    }


    @OnClick(R.id.btnSignInWithEmail)
    public void loginWithEmail(View view) {
        rlEmailLogin.setVisibility(View.VISIBLE);

        Animation animFadeOut = AnimationUtils.loadAnimation(this, R.anim.slide_up_email);
        animFadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Fires when animation starts
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // ...
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // ...
            }
        });

        rlEmailLogin.startAnimation(animFadeOut);
    }



    @OnClick({R.id.btnSignInWithTwitter, R.id.btnSignInWithFacebook, R.id.btnCompleteLogin})
    public void login(View view) {
        Log.v("actions", "Logging in");
        //TODO: Hardcoded user for now. Change to the user which is logged in.
        client.getUser(119);
    }

    @Override
    public void onGetUser(User user) {
        User.setLoggedInUser(this, user);
        startHomeActivity();
    }

    private void startHomeActivity() {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}
