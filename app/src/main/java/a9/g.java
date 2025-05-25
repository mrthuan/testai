package a9;

import a9.b;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import g1.a;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class g<S extends b> extends j {

    /* renamed from: q  reason: collision with root package name */
    public static final a f420q = new a();

    /* renamed from: l  reason: collision with root package name */
    public k<S> f421l;

    /* renamed from: m  reason: collision with root package name */
    public final g1.e f422m;

    /* renamed from: n  reason: collision with root package name */
    public final g1.d f423n;

    /* renamed from: o  reason: collision with root package name */
    public float f424o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f425p;

    /* compiled from: DeterminateDrawable.java */
    /* loaded from: classes2.dex */
    public class a extends g1.c {
        public a() {
            super("indicatorLevel");
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((g) obj).f424o * 10000.0f;
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            g gVar = (g) obj;
            gVar.f424o = f10 / 10000.0f;
            gVar.invalidateSelf();
        }
    }

    public g(Context context, b bVar, k<S> kVar) {
        super(context, bVar);
        this.f425p = false;
        this.f421l = kVar;
        kVar.f439b = this;
        g1.e eVar = new g1.e();
        this.f422m = eVar;
        eVar.f17404b = 1.0f;
        eVar.c = false;
        eVar.f17403a = Math.sqrt(50.0f);
        eVar.c = false;
        g1.d dVar = new g1.d(this);
        this.f423n = dVar;
        dVar.f17400r = eVar;
        if (this.f435h != 1.0f) {
            this.f435h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            k<S> kVar = this.f421l;
            Rect bounds = getBounds();
            float b10 = b();
            kVar.f438a.a();
            kVar.a(canvas, bounds, b10);
            k<S> kVar2 = this.f421l;
            Paint paint = this.f436i;
            kVar2.c(canvas, paint);
            this.f421l.b(t0.x(this.f430b.c[0], this.f437j), paint, canvas, 0.0f, this.f424o);
            canvas.restore();
        }
    }

    @Override // a9.j
    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f10 = super.f(z10, z11, z12);
        a9.a aVar = this.c;
        ContentResolver contentResolver = this.f429a.getContentResolver();
        aVar.getClass();
        float f11 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f11 == 0.0f) {
            this.f425p = true;
        } else {
            this.f425p = false;
            float f12 = 50.0f / f11;
            g1.e eVar = this.f422m;
            eVar.getClass();
            if (f12 > 0.0f) {
                eVar.f17403a = Math.sqrt(f12);
                eVar.c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f421l.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f421l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f423n.c();
        this.f424o = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10 = this.f425p;
        g1.d dVar = this.f423n;
        if (z10) {
            dVar.c();
            this.f424o = i10 / 10000.0f;
            invalidateSelf();
        } else {
            dVar.f17388b = this.f424o * 10000.0f;
            dVar.c = true;
            float f10 = i10;
            if (dVar.f17391f) {
                dVar.f17401s = f10;
            } else {
                if (dVar.f17400r == null) {
                    dVar.f17400r = new g1.e(f10);
                }
                g1.e eVar = dVar.f17400r;
                double d10 = f10;
                eVar.f17410i = d10;
                double d11 = (float) d10;
                if (d11 <= Float.MAX_VALUE) {
                    float f11 = dVar.f17392g;
                    if (d11 >= f11) {
                        double abs = Math.abs(dVar.f17394i * 0.75f);
                        eVar.f17405d = abs;
                        eVar.f17406e = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            boolean z11 = dVar.f17391f;
                            if (!z11 && !z11) {
                                dVar.f17391f = true;
                                if (!dVar.c) {
                                    dVar.f17388b = dVar.f17390e.c(dVar.f17389d);
                                }
                                float f12 = dVar.f17388b;
                                if (f12 <= Float.MAX_VALUE && f12 >= f11) {
                                    ThreadLocal<g1.a> threadLocal = g1.a.f17372f;
                                    if (threadLocal.get() == null) {
                                        threadLocal.set(new g1.a());
                                    }
                                    g1.a aVar = threadLocal.get();
                                    ArrayList<a.b> arrayList = aVar.f17374b;
                                    if (arrayList.size() == 0) {
                                        if (aVar.f17375d == null) {
                                            aVar.f17375d = new a.d(aVar.c);
                                        }
                                        a.d dVar2 = aVar.f17375d;
                                        dVar2.f17379b.postFrameCallback(dVar2.c);
                                    }
                                    if (!arrayList.contains(dVar)) {
                                        arrayList.add(dVar);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
            }
        }
        return true;
    }
}
