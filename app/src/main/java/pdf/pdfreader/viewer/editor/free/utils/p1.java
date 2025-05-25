package pdf.pdfreader.viewer.editor.free.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: ValueAnimatorUtils.java */
/* loaded from: classes3.dex */
public final class p1 {
    public static ValueAnimator a(ViewGroup viewGroup, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
            ofInt.addListener(new o1(viewGroup, i11));
            ofInt.addUpdateListener(new k9.b(viewGroup, 4));
            ofInt.setDuration(300L);
            ofInt.start();
            return ofInt;
        }
        return null;
    }
}
