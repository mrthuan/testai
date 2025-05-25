package g8;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.inmobi.media.C1584c7;
import com.inmobi.media.F0;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17673a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17674b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f17673a = i10;
        this.f17674b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f17673a;
        Object obj = this.c;
        Object obj2 = this.f17674b;
        switch (i10) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i11 = AppBarLayout.f11981y;
                appBarLayout.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((f9.h) obj).m(floatValue);
                Drawable drawable = appBarLayout.f12002v;
                if (drawable instanceof f9.h) {
                    ((f9.h) drawable).m(floatValue);
                }
                Iterator it = appBarLayout.f11998r.iterator();
                while (it.hasNext()) {
                    ((AppBarLayout.f) it.next()).a();
                }
                return;
            default:
                F0.a((C1584c7) obj2, (View) obj, valueAnimator);
                return;
        }
    }
}
