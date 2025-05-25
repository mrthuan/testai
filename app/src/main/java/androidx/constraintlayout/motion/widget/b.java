package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import lib.zj.office.fc.ss.util.CellUtil;

/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
public final class b {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public float A;
    public float B;
    public int C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public int f3105a;

    /* renamed from: b  reason: collision with root package name */
    public int f3106b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3107d;

    /* renamed from: e  reason: collision with root package name */
    public int f3108e;

    /* renamed from: f  reason: collision with root package name */
    public int f3109f;

    /* renamed from: g  reason: collision with root package name */
    public float f3110g;

    /* renamed from: h  reason: collision with root package name */
    public float f3111h;

    /* renamed from: i  reason: collision with root package name */
    public int f3112i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3113j;

    /* renamed from: k  reason: collision with root package name */
    public float f3114k;

    /* renamed from: l  reason: collision with root package name */
    public float f3115l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3116m = false;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f3117n = new float[2];

    /* renamed from: o  reason: collision with root package name */
    public final int[] f3118o = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public float f3119p;

    /* renamed from: q  reason: collision with root package name */
    public float f3120q;

    /* renamed from: r  reason: collision with root package name */
    public final MotionLayout f3121r;

    /* renamed from: s  reason: collision with root package name */
    public float f3122s;

    /* renamed from: t  reason: collision with root package name */
    public float f3123t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3124u;

    /* renamed from: v  reason: collision with root package name */
    public float f3125v;

    /* renamed from: w  reason: collision with root package name */
    public int f3126w;

    /* renamed from: x  reason: collision with root package name */
    public float f3127x;

    /* renamed from: y  reason: collision with root package name */
    public float f3128y;

    /* renamed from: z  reason: collision with root package name */
    public float f3129z;

    public b(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f3105a = 0;
        this.f3106b = 0;
        this.c = 0;
        this.f3107d = -1;
        this.f3108e = -1;
        this.f3109f = -1;
        this.f3110g = 0.5f;
        this.f3111h = 0.5f;
        this.f3112i = -1;
        this.f3113j = false;
        this.f3114k = 0.0f;
        this.f3115l = 1.0f;
        this.f3122s = 4.0f;
        this.f3123t = 1.2f;
        this.f3124u = true;
        this.f3125v = 1.0f;
        this.f3126w = 0;
        this.f3127x = 10.0f;
        this.f3128y = 10.0f;
        this.f3129z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f3121r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g0.d.f17362y);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 16) {
                this.f3107d = obtainStyledAttributes.getResourceId(index, this.f3107d);
            } else if (index == 17) {
                int i11 = obtainStyledAttributes.getInt(index, this.f3105a);
                this.f3105a = i11;
                float[] fArr = E[i11];
                this.f3111h = fArr[0];
                this.f3110g = fArr[1];
            } else if (index == 1) {
                int i12 = obtainStyledAttributes.getInt(index, this.f3106b);
                this.f3106b = i12;
                if (i12 < 6) {
                    float[] fArr2 = F[i12];
                    this.f3114k = fArr2[0];
                    this.f3115l = fArr2[1];
                } else {
                    this.f3115l = Float.NaN;
                    this.f3114k = Float.NaN;
                    this.f3113j = true;
                }
            } else if (index == 6) {
                this.f3122s = obtainStyledAttributes.getFloat(index, this.f3122s);
            } else if (index == 5) {
                this.f3123t = obtainStyledAttributes.getFloat(index, this.f3123t);
            } else if (index == 7) {
                this.f3124u = obtainStyledAttributes.getBoolean(index, this.f3124u);
            } else if (index == 2) {
                this.f3125v = obtainStyledAttributes.getFloat(index, this.f3125v);
            } else if (index == 3) {
                this.f3127x = obtainStyledAttributes.getFloat(index, this.f3127x);
            } else if (index == 18) {
                this.f3108e = obtainStyledAttributes.getResourceId(index, this.f3108e);
            } else if (index == 9) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == 8) {
                this.f3126w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f3109f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f3112i = obtainStyledAttributes.getResourceId(index, this.f3112i);
            } else if (index == 12) {
                this.f3128y = obtainStyledAttributes.getFloat(index, this.f3128y);
            } else if (index == 13) {
                this.f3129z = obtainStyledAttributes.getFloat(index, this.f3129z);
            } else if (index == 14) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(MotionLayout motionLayout, RectF rectF) {
        View findViewById;
        int i10 = this.f3109f;
        if (i10 == -1 || (findViewById = motionLayout.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f3108e;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z10) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f3105a];
        this.f3111h = fArr3[0];
        this.f3110g = fArr3[1];
        int i10 = this.f3106b;
        if (i10 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i10];
        this.f3114k = fArr4[0];
        this.f3115l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f3114k)) {
            return CellUtil.ROTATION;
        }
        return this.f3114k + " , " + this.f3115l;
    }
}
