package g8;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.inmobi.media.C1584c7;
import com.inmobi.media.F0;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17671a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17672b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f17671a = i10;
        this.f17672b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f17671a;
        Object obj = this.c;
        Object obj2 = this.f17672b;
        switch (i10) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                f9.h hVar = (f9.h) obj;
                int i11 = AppBarLayout.f11981y;
                appBarLayout.getClass();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.setAlpha(floatValue);
                Iterator it = appBarLayout.f11998r.iterator();
                while (it.hasNext()) {
                    AppBarLayout.f fVar = (AppBarLayout.f) it.next();
                    ColorStateList colorStateList = hVar.f17164a.c;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(floatValue).getDefaultColor();
                        fVar.a();
                    }
                }
                return;
            default:
                F0.b((C1584c7) obj2, (View) obj, valueAnimator);
                return;
        }
    }
}
