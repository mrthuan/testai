package f2;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17088a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewOverlay f17089b;

    public v(ViewGroup viewGroup, int i10) {
        this.f17088a = i10;
        if (i10 != 1) {
            this.f17089b = viewGroup.getOverlay();
        } else {
            this.f17089b = viewGroup.getOverlay();
        }
    }

    public final void a(Drawable drawable) {
        int i10 = this.f17088a;
        ViewOverlay viewOverlay = this.f17089b;
        switch (i10) {
            case 0:
                viewOverlay.remove(drawable);
                return;
            default:
                viewOverlay.remove(drawable);
                return;
        }
    }
}
