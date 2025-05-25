package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.request.SingleRequest;
import i4.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public final class e<TranscodeType> extends l4.a<e<TranscodeType>> {
    public final Context A;
    public final f B;
    public final Class<TranscodeType> C;
    public final d D;
    public g<?, ? super TranscodeType> E;
    public Object F;
    public ArrayList G;
    public Float H;
    public boolean I;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6850a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6851b;

        static {
            int[] iArr = new int[Priority.values().length];
            f6851b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6851b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6851b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6851b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f6850a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6850a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6850a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6850a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6850a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6850a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6850a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6850a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        l4.e eVar = (l4.e) new l4.e().g(v3.f.f30510b).q(Priority.LOW).w();
    }

    @SuppressLint({"CheckResult"})
    public e(b bVar, f fVar, Class<TranscodeType> cls, Context context) {
        l4.e eVar;
        this.B = fVar;
        this.C = cls;
        this.A = context;
        Map<Class<?>, g<?, ?>> map = fVar.f6853a.c.f6845f;
        com.bumptech.glide.a aVar = map.get(cls);
        if (aVar == null) {
            for (Map.Entry<Class<?>, g<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    aVar = (g<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.E = (g<?, ? super TranscodeType>) (aVar == null ? d.f6840k : aVar);
        this.D = bVar.c;
        Iterator<l4.d<Object>> it = fVar.f6861j.iterator();
        while (it.hasNext()) {
            l4.d<Object> next = it.next();
            if (next != null) {
                if (this.G == null) {
                    this.G = new ArrayList();
                }
                this.G.add(next);
            }
        }
        synchronized (fVar) {
            eVar = fVar.f6862k;
        }
        C(eVar);
    }

    public final e<TranscodeType> C(l4.a<?> aVar) {
        com.google.android.play.core.assetpacks.c.l(aVar);
        return (e) super.a(aVar);
    }

    @Override // l4.a
    /* renamed from: D */
    public final e<TranscodeType> e() {
        e<TranscodeType> eVar = (e) super.clone();
        eVar.E = (g<?, ? super TranscodeType>) eVar.E.clone();
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.widget.ImageView r5) {
        /*
            r4 = this;
            char[] r0 = p4.j.f23703a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto Lbe
            com.google.android.play.core.assetpacks.c.l(r5)
            int r0 = r4.f20479a
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = l4.a.l(r0, r1)
            if (r0 != 0) goto L79
            boolean r0 = r4.f20491n
            if (r0 == 0) goto L79
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L79
            int[] r0 = com.bumptech.glide.e.a.f6850a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L69;
                case 2: goto L59;
                case 3: goto L49;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L39;
                default: goto L38;
            }
        L38:
            goto L79
        L39:
            com.bumptech.glide.e r0 = r4.e()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7041b
            c4.g r3 = new c4.g
            r3.<init>()
            l4.a r0 = r0.r(r1, r3, r2)
            goto L7a
        L49:
            com.bumptech.glide.e r0 = r4.e()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7040a
            c4.m r3 = new c4.m
            r3.<init>()
            l4.a r0 = r0.r(r1, r3, r2)
            goto L7a
        L59:
            com.bumptech.glide.e r0 = r4.e()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7041b
            c4.g r3 = new c4.g
            r3.<init>()
            l4.a r0 = r0.r(r1, r3, r2)
            goto L7a
        L69:
            com.bumptech.glide.e r0 = r4.e()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
            c4.f r2 = new c4.f
            r2.<init>()
            l4.a r0 = r0.m(r1, r2)
            goto L7a
        L79:
            r0 = r4
        L7a:
            com.bumptech.glide.d r1 = r4.D
            kotlinx.coroutines.y r1 = r1.c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class<TranscodeType> r2 = r4.C
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L91
            m4.b r1 = new m4.b
            r1.<init>(r5)
            goto L9e
        L91:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto La5
            m4.d r1 = new m4.d
            r1.<init>(r5)
        L9e:
            p4.e$a r5 = p4.e.f23694a
            r2 = 0
            r4.G(r1, r2, r0, r5)
            return
        La5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lbe:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You must call this method on the main thread"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.E(android.widget.ImageView):void");
    }

    public final void F(m4.c cVar) {
        G(cVar, null, this, p4.e.f23694a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(m4.g gVar, l4.c cVar, l4.a aVar, Executor executor) {
        boolean z10;
        int i10;
        SingleRequest I;
        boolean z11;
        int i11;
        Priority priority;
        com.google.android.play.core.assetpacks.c.l(gVar);
        if (this.I) {
            Object obj = new Object();
            g<?, ? super TranscodeType> gVar2 = this.E;
            Priority priority2 = aVar.f20481d;
            int i12 = aVar.f20488k;
            int i13 = aVar.f20487j;
            if (this.H != null) {
                com.bumptech.glide.request.a aVar2 = new com.bumptech.glide.request.a(obj);
                z10 = true;
                SingleRequest I2 = I(i12, i13, priority2, gVar2, aVar, aVar2, cVar, gVar, obj, executor);
                l4.a v10 = aVar.clone().v(this.H.floatValue());
                int i14 = a.f6851b[priority2.ordinal()];
                if (i14 != 1) {
                    i11 = 2;
                    if (i14 != 2) {
                        if (i14 != 3 && i14 != 4) {
                            throw new IllegalArgumentException("unknown priority: " + this.f20481d);
                        }
                        priority = Priority.IMMEDIATE;
                    } else {
                        priority = Priority.HIGH;
                    }
                } else {
                    i11 = 2;
                    priority = Priority.NORMAL;
                }
                SingleRequest I3 = I(i12, i13, priority, gVar2, v10, aVar2, cVar, gVar, obj, executor);
                aVar2.c = I2;
                aVar2.f7100d = I3;
                I = aVar2;
                i10 = i11;
            } else {
                z10 = true;
                i10 = 2;
                I = I(i12, i13, priority2, gVar2, aVar, null, cVar, gVar, obj, executor);
            }
            l4.b h10 = gVar.h();
            if (I.c(h10)) {
                if (!aVar.f20486i && h10.j()) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    com.google.android.play.core.assetpacks.c.l(h10);
                    if (!h10.isRunning()) {
                        h10.h();
                        return;
                    }
                    return;
                }
            }
            this.B.k(gVar);
            gVar.e(I);
            f fVar = this.B;
            synchronized (fVar) {
                fVar.f6857f.f18464a.add(gVar);
                l lVar = fVar.f6855d;
                lVar.f18457a.add(I);
                if (!lVar.c) {
                    I.h();
                } else {
                    I.clear();
                    Log.isLoggable("RequestTracker", i10);
                    lVar.f18458b.add(I);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final void H(l4.d dVar) {
        this.G = null;
        this.G = new ArrayList();
        this.G.add(dVar);
    }

    public final SingleRequest I(int i10, int i11, Priority priority, g gVar, l4.a aVar, com.bumptech.glide.request.a aVar2, l4.c cVar, m4.g gVar2, Object obj, Executor executor) {
        Context context = this.A;
        Object obj2 = this.F;
        Class<TranscodeType> cls = this.C;
        ArrayList arrayList = this.G;
        d dVar = this.D;
        return new SingleRequest(context, dVar, obj, obj2, cls, aVar, i10, i11, priority, gVar2, cVar, arrayList, aVar2, dVar.f6846g, gVar.f6866a, executor);
    }

    public final l4.c J(int i10, int i11) {
        l4.c cVar = new l4.c(i10, i11);
        G(cVar, cVar, this, p4.e.f23695b);
        return cVar;
    }

    public final void K(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.H = Float.valueOf(f10);
            return;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @Override // l4.a
    public final l4.a a(l4.a aVar) {
        com.google.android.play.core.assetpacks.c.l(aVar);
        return (e) super.a(aVar);
    }
}
