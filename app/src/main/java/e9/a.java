package e9;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f16506i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f16507j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f16508k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f16509l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f16510a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f16511b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public int f16512d;

    /* renamed from: e  reason: collision with root package name */
    public int f16513e;

    /* renamed from: f  reason: collision with root package name */
    public int f16514f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f16515g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f16516h;

    public a() {
        Paint paint = new Paint();
        this.f16516h = paint;
        this.f16510a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f16511b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f16512d = o0.a.d(i10, 68);
        this.f16513e = o0.a.d(i10, 20);
        this.f16514f = o0.a.d(i10, 0);
        this.f16510a.setColor(this.f16512d);
    }
}
