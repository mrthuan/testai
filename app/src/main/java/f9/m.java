package f9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: m  reason: collision with root package name */
    public static final k f17211m = new k(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final ge.a f17212a;

    /* renamed from: b  reason: collision with root package name */
    public final ge.a f17213b;
    public final ge.a c;

    /* renamed from: d  reason: collision with root package name */
    public final ge.a f17214d;

    /* renamed from: e  reason: collision with root package name */
    public final d f17215e;

    /* renamed from: f  reason: collision with root package name */
    public final d f17216f;

    /* renamed from: g  reason: collision with root package name */
    public final d f17217g;

    /* renamed from: h  reason: collision with root package name */
    public final d f17218h;

    /* renamed from: i  reason: collision with root package name */
    public final f f17219i;

    /* renamed from: j  reason: collision with root package name */
    public final f f17220j;

    /* renamed from: k  reason: collision with root package name */
    public final f f17221k;

    /* renamed from: l  reason: collision with root package name */
    public final f f17222l;

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes2.dex */
    public interface b {
        d a(d dVar);
    }

    public m(a aVar) {
        this.f17212a = aVar.f17223a;
        this.f17213b = aVar.f17224b;
        this.c = aVar.c;
        this.f17214d = aVar.f17225d;
        this.f17215e = aVar.f17226e;
        this.f17216f = aVar.f17227f;
        this.f17217g = aVar.f17228g;
        this.f17218h = aVar.f17229h;
        this.f17219i = aVar.f17230i;
        this.f17220j = aVar.f17231j;
        this.f17221k = aVar.f17232k;
        this.f17222l = aVar.f17233l;
    }

    public static a a(Context context, int i10, int i11) {
        return b(context, i10, i11, new f9.a(0));
    }

    public static a b(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(e8.a.V);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            d e10 = e(obtainStyledAttributes, 5, dVar);
            d e11 = e(obtainStyledAttributes, 8, e10);
            d e12 = e(obtainStyledAttributes, 9, e10);
            d e13 = e(obtainStyledAttributes, 7, e10);
            d e14 = e(obtainStyledAttributes, 6, e10);
            a aVar = new a();
            ge.a p10 = b.b.p(i13);
            aVar.f17223a = p10;
            float a10 = a.a(p10);
            if (a10 != -1.0f) {
                aVar.e(a10);
            }
            aVar.f17226e = e11;
            ge.a p11 = b.b.p(i14);
            aVar.f17224b = p11;
            float a11 = a.a(p11);
            if (a11 != -1.0f) {
                aVar.f(a11);
            }
            aVar.f17227f = e12;
            ge.a p12 = b.b.p(i15);
            aVar.c = p12;
            float a12 = a.a(p12);
            if (a12 != -1.0f) {
                aVar.d(a12);
            }
            aVar.f17228g = e13;
            ge.a p13 = b.b.p(i16);
            aVar.f17225d = p13;
            float a13 = a.a(p13);
            if (a13 != -1.0f) {
                aVar.c(a13);
            }
            aVar.f17229h = e14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a c(Context context, AttributeSet attributeSet, int i10, int i11) {
        return d(context, attributeSet, i10, i11, new f9.a(0));
    }

    public static a d(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.G, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, dVar);
    }

    public static d e(TypedArray typedArray, int i10, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return dVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new f9.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new k(peekValue.getFraction(1.0f, 1.0f));
        }
        return dVar;
    }

    public final boolean f(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f17222l.getClass().equals(f.class) && this.f17220j.getClass().equals(f.class) && this.f17219i.getClass().equals(f.class) && this.f17221k.getClass().equals(f.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f17215e.a(rectF);
        if (this.f17216f.a(rectF) == a10 && this.f17218h.a(rectF) == a10 && this.f17217g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f17213b instanceof l) && (this.f17212a instanceof l) && (this.c instanceof l) && (this.f17214d instanceof l)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 && z11 && z12) {
            return true;
        }
        return false;
    }

    public final m g(float f10) {
        a aVar = new a(this);
        aVar.b(f10);
        return new m(aVar);
    }

    public final m h(b bVar) {
        a aVar = new a(this);
        aVar.f17226e = bVar.a(this.f17215e);
        aVar.f17227f = bVar.a(this.f17216f);
        aVar.f17229h = bVar.a(this.f17218h);
        aVar.f17228g = bVar.a(this.f17217g);
        return new m(aVar);
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public ge.a f17223a;

        /* renamed from: b  reason: collision with root package name */
        public ge.a f17224b;
        public ge.a c;

        /* renamed from: d  reason: collision with root package name */
        public ge.a f17225d;

        /* renamed from: e  reason: collision with root package name */
        public d f17226e;

        /* renamed from: f  reason: collision with root package name */
        public d f17227f;

        /* renamed from: g  reason: collision with root package name */
        public d f17228g;

        /* renamed from: h  reason: collision with root package name */
        public d f17229h;

        /* renamed from: i  reason: collision with root package name */
        public f f17230i;

        /* renamed from: j  reason: collision with root package name */
        public final f f17231j;

        /* renamed from: k  reason: collision with root package name */
        public f f17232k;

        /* renamed from: l  reason: collision with root package name */
        public final f f17233l;

        public a() {
            this.f17223a = new l();
            this.f17224b = new l();
            this.c = new l();
            this.f17225d = new l();
            this.f17226e = new f9.a(0.0f);
            this.f17227f = new f9.a(0.0f);
            this.f17228g = new f9.a(0.0f);
            this.f17229h = new f9.a(0.0f);
            this.f17230i = new f();
            this.f17231j = new f();
            this.f17232k = new f();
            this.f17233l = new f();
        }

        public static float a(ge.a aVar) {
            if (aVar instanceof l) {
                return ((l) aVar).f17210o;
            }
            if (aVar instanceof e) {
                return ((e) aVar).f17161o;
            }
            return -1.0f;
        }

        public final void b(float f10) {
            e(f10);
            f(f10);
            d(f10);
            c(f10);
        }

        public final void c(float f10) {
            this.f17229h = new f9.a(f10);
        }

        public final void d(float f10) {
            this.f17228g = new f9.a(f10);
        }

        public final void e(float f10) {
            this.f17226e = new f9.a(f10);
        }

        public final void f(float f10) {
            this.f17227f = new f9.a(f10);
        }

        public a(m mVar) {
            this.f17223a = new l();
            this.f17224b = new l();
            this.c = new l();
            this.f17225d = new l();
            this.f17226e = new f9.a(0.0f);
            this.f17227f = new f9.a(0.0f);
            this.f17228g = new f9.a(0.0f);
            this.f17229h = new f9.a(0.0f);
            this.f17230i = new f();
            this.f17231j = new f();
            this.f17232k = new f();
            this.f17233l = new f();
            this.f17223a = mVar.f17212a;
            this.f17224b = mVar.f17213b;
            this.c = mVar.c;
            this.f17225d = mVar.f17214d;
            this.f17226e = mVar.f17215e;
            this.f17227f = mVar.f17216f;
            this.f17228g = mVar.f17217g;
            this.f17229h = mVar.f17218h;
            this.f17230i = mVar.f17219i;
            this.f17231j = mVar.f17220j;
            this.f17232k = mVar.f17221k;
            this.f17233l = mVar.f17222l;
        }
    }

    public m() {
        this.f17212a = new l();
        this.f17213b = new l();
        this.c = new l();
        this.f17214d = new l();
        this.f17215e = new f9.a(0.0f);
        this.f17216f = new f9.a(0.0f);
        this.f17217g = new f9.a(0.0f);
        this.f17218h = new f9.a(0.0f);
        this.f17219i = new f();
        this.f17220j = new f();
        this.f17221k = new f();
        this.f17222l = new f();
    }
}
