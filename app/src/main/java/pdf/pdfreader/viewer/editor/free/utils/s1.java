package pdf.pdfreader.viewer.editor.free.utils;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ViewShakeUtil.java */
/* loaded from: classes3.dex */
public final class s1 {
    public static ObjectAnimator a(TextView textView) {
        int dimensionPixelOffset = textView.getResources().getDimensionPixelOffset(R.dimen.dp_5);
        float f10 = -dimensionPixelOffset;
        float f11 = dimensionPixelOffset;
        return ObjectAnimator.ofPropertyValuesHolder(textView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f10), Keyframe.ofFloat(0.26f, f11), Keyframe.ofFloat(0.42f, f10), Keyframe.ofFloat(0.58f, f11), Keyframe.ofFloat(0.74f, f10), Keyframe.ofFloat(0.9f, f11), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
    }
}
