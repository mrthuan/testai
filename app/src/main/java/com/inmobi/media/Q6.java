package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class Q6 implements qc {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f14597a = new Rect();

    @Override // com.inmobi.media.qc
    public final boolean a(View rootView, View adView, int i10) {
        kotlin.jvm.internal.g.e(rootView, "rootView");
        kotlin.jvm.internal.g.e(adView, "adView");
        return true;
    }

    @Override // com.inmobi.media.qc
    public final boolean a(View view, View view2, int i10, Object obj) {
        A7 mediaPlayer;
        if ((obj instanceof M6) && !((M6) obj).f14477s) {
            if ((!(view2 instanceof C1627f8) || (mediaPlayer = ((C1627f8) view2).getMediaPlayer()) == null || 3 == mediaPlayer.f14128a) && view2 != null && view2.isShown()) {
                if ((view != null ? view.getParent() : null) != null && view2.getGlobalVisibleRect(this.f14597a)) {
                    long height = this.f14597a.height() * this.f14597a.width();
                    long width = view.getWidth() * view.getHeight();
                    return width > 0 && ((long) 100) * height >= ((long) i10) * width;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
