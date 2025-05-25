package n4;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import n4.d;

/* compiled from: DrawableCrossFadeTransition.java */
/* loaded from: classes.dex */
public final class b implements d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f22335a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22336b;

    public b(int i10, boolean z10) {
        this.f22335a = i10;
        this.f22336b = z10;
    }

    @Override // n4.d
    public final boolean a(Drawable drawable, d.a aVar) {
        Drawable drawable2 = drawable;
        m4.e eVar = (m4.e) aVar;
        Drawable drawable3 = ((ImageView) eVar.f21813a).getDrawable();
        if (drawable3 == null) {
            drawable3 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable3, drawable2});
        transitionDrawable.setCrossFadeEnabled(this.f22336b);
        transitionDrawable.startTransition(this.f22335a);
        ((ImageView) eVar.f21813a).setImageDrawable(transitionDrawable);
        return true;
    }
}
