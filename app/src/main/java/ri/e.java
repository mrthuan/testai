package ri;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* compiled from: ScaleGestureDetector.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29599a;

    /* renamed from: b  reason: collision with root package name */
    public final a f29600b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f29601d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29602e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f29603f;

    /* renamed from: g  reason: collision with root package name */
    public float f29604g;

    /* renamed from: h  reason: collision with root package name */
    public float f29605h;

    /* renamed from: i  reason: collision with root package name */
    public float f29606i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f29607j;

    /* renamed from: k  reason: collision with root package name */
    public final int f29608k;

    /* renamed from: m  reason: collision with root package name */
    public float f29610m;

    /* renamed from: n  reason: collision with root package name */
    public float f29611n;

    /* renamed from: p  reason: collision with root package name */
    public GestureDetector f29613p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f29614q;

    /* renamed from: o  reason: collision with root package name */
    public int f29612o = 0;

    /* renamed from: l  reason: collision with root package name */
    public final int f29609l = 10;

    /* compiled from: ScaleGestureDetector.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public e(Context context, a aVar) {
        this.f29599a = context;
        this.f29600b = aVar;
        this.f29608k = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            this.f29602e = true;
            if (this.f29613p == null) {
                this.f29613p = new GestureDetector(context, new d(this), null);
            }
        }
        if (i10 > 22) {
            this.f29603f = true;
        }
    }

    public final boolean a() {
        if (this.f29612o != 0) {
            return true;
        }
        return false;
    }
}
