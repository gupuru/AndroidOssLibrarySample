package gupuru.scaleanimation;

import android.view.View;

/**
 * 拡大アニメーション
 */
public class ScaleAnimation {

    public ScaleAnimation() {
    }

    public void start(View view) {
        android.view.animation.ScaleAnimation scale = new android.view.animation.ScaleAnimation(1, 2.5f, 1, 2.5f);
        scale.setDuration(3000);
        view.startAnimation(scale);
    }

}
