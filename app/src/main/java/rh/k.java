package rh;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: WordPageTextInfo.java */
/* loaded from: classes3.dex */
public final class k {
    public static final float[] c = {0.9f, 1.7f, 2.5f, 3.3f, 4.1f, 4.9f};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f29577d = {"100%", "200%", "400%", "600%", "800%", "1000%"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f29578e = {"1", "2", "4", "6", "8", "10"};

    /* renamed from: a  reason: collision with root package name */
    public int f29579a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f29580b;

    /* compiled from: WordPageTextInfo.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f29581a = new k();
    }

    public k() {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f29579a = 1;
    }

    public final String a() {
        int i10 = this.f29579a;
        if (i10 >= 0 && i10 < 6) {
            return f29577d[i10];
        }
        return "out of range";
    }

    public final float b() {
        int i10 = this.f29579a;
        float[] fArr = c;
        if (i10 >= 0 && i10 < 6) {
            return fArr[i10];
        }
        return fArr[1];
    }
}
