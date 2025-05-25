package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;

/* compiled from: CameraActivity.kt */
/* loaded from: classes3.dex */
public final class p implements l4.d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraActivity f25841a;

    public p(CameraActivity cameraActivity) {
        this.f25841a = cameraActivity;
    }

    @Override // l4.d
    public final void b(Object obj, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        CameraActivity cameraActivity = this.f25841a;
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(cameraActivity)) {
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.4f, 0.76f);
            Keyframe ofFloat3 = Keyframe.ofFloat(1.0f, 0.76f);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(ea.a.p("PGNQbBxY", "bKD6boww"), ofFloat, ofFloat2, ofFloat3);
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZZ", "hEsX5BbF"), ofFloat, ofFloat2, ofFloat3);
            Keyframe ofFloat4 = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat5 = Keyframe.ofFloat(0.4f, 0.0f);
            Keyframe ofFloat6 = Keyframe.ofFloat(0.7f, 1.0f);
            Keyframe ofFloat7 = Keyframe.ofFloat(1.0f, 0.0f);
            cameraActivity.q2().f917o.setScaleX(0.76f);
            cameraActivity.q2().f917o.setScaleY(0.76f);
            PropertyValuesHolder ofKeyframe3 = PropertyValuesHolder.ofKeyframe(ea.a.p("LmxBaGE=", "rgIsse6E"), ofFloat4, ofFloat5, ofFloat6, ofFloat7);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(cameraActivity.q2().f916n, ofKeyframe, ofKeyframe2);
            kotlin.jvm.internal.g.d(ofPropertyValuesHolder, ea.a.p("XGYbchxwB3IGeWJhBXUzcwxvXmQjcmtirYDxYVxla0hcbC9lASxCcxFhWGUwSDlsIGVAKQ==", "OW03D75x"));
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(cameraActivity.q2().f917o, ofKeyframe3);
            kotlin.jvm.internal.g.d(ofPropertyValuesHolder2, ea.a.p("K2YhchxwVHI8eTBhWHUyc3BvPmQsch5iloDXYyRzFGkhdzNnXyBQbDhoB0JTSDhsXGUgKQ==", "qFDqs1YG"));
            ofPropertyValuesHolder.setDuration(570L);
            ofPropertyValuesHolder2.setDuration(570L);
            AnimatorSet animatorSet = new AnimatorSet();
            cameraActivity.f25728t0 = animatorSet;
            animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
            AnimatorSet animatorSet2 = cameraActivity.f25728t0;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new o(cameraActivity));
            }
            AnimatorSet animatorSet3 = cameraActivity.f25728t0;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    @Override // l4.d
    public final void a(GlideException glideException) {
    }
}
