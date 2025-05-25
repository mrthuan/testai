package h3;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class g implements h4.b, x6.b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17973a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17974b;
    public final Object c;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3) {
        this.f17973a = obj;
        this.f17974b = obj2;
        this.c = obj3;
    }

    @Override // h4.b
    public final v3.l e(v3.l lVar, t3.e eVar) {
        Drawable drawable = (Drawable) lVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((h4.b) this.f17974b).e(c4.c.b(((BitmapDrawable) drawable).getBitmap(), (w3.c) this.f17973a), eVar);
        }
        if (drawable instanceof g4.c) {
            return ((h4.b) this.c).e(lVar, eVar);
        }
        return null;
    }

    @Override // pf.a
    public final Object get() {
        return new w6.g((Context) ((pf.a) this.f17973a).get(), (e7.a) ((pf.a) this.f17974b).get(), (e7.a) ((pf.a) this.c).get());
    }

    public g(List list) {
        this.c = list;
        this.f17973a = new ArrayList(list.size());
        this.f17974b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((List) this.f17973a).add(((Mask) list.get(i10)).f6055b.a());
            ((List) this.f17974b).add(((Mask) list.get(i10)).c.a());
        }
    }
}
