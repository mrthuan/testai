package ng;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CustomScaleGestureDetector.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22463a;

    /* renamed from: b  reason: collision with root package name */
    public final a f22464b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f22465d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22466e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22467f;

    /* renamed from: g  reason: collision with root package name */
    public float f22468g;

    /* renamed from: h  reason: collision with root package name */
    public float f22469h;

    /* renamed from: i  reason: collision with root package name */
    public float f22470i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22471j;

    /* renamed from: k  reason: collision with root package name */
    public final int f22472k;

    /* renamed from: l  reason: collision with root package name */
    public final int f22473l;

    /* renamed from: m  reason: collision with root package name */
    public float f22474m;

    /* renamed from: n  reason: collision with root package name */
    public float f22475n;

    /* renamed from: o  reason: collision with root package name */
    public int f22476o = 0;

    /* renamed from: p  reason: collision with root package name */
    public GestureDetector f22477p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22478q;

    /* compiled from: CustomScaleGestureDetector.java */
    /* loaded from: classes.dex */
    public interface a {
        void b(b bVar);

        void e(b bVar);
    }

    public b(Context context, a aVar) {
        this.f22463a = context;
        this.f22464b = aVar;
        this.f22472k = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f22473l = context.getResources().getDimensionPixelSize(R.dimen.config_minScalingSpan);
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            this.f22466e = true;
            if (this.f22477p == null) {
                this.f22477p = new GestureDetector(context, new ng.a(this), null);
            }
        }
        if (i10 > 22) {
            this.f22467f = true;
        }
    }

    public final float a() {
        boolean z10;
        if (b()) {
            boolean z11 = this.f22478q;
            if ((z11 && this.f22468g < this.f22469h) || (!z11 && this.f22468g > this.f22469h)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float abs = Math.abs(1.0f - (this.f22468g / this.f22469h)) * 0.5f;
            if (this.f22469h <= this.f22472k) {
                return 1.0f;
            }
            if (z10) {
                return 1.0f + abs;
            }
            return 1.0f - abs;
        }
        float f10 = this.f22469h;
        if (f10 <= 0.0f) {
            return 1.0f;
        }
        return this.f22468g / f10;
    }

    public final boolean b() {
        if (this.f22476o != 0) {
            return true;
        }
        return false;
    }
}
