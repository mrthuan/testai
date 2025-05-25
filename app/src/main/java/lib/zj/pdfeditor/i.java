package lib.zj.pdfeditor;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PDFPageTextInfo.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f21501e = {0.9f, 1.2f, 1.5f, 1.8f, 2.1f, 2.4f};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f21502f = {"100%", "200%", "400%", "600%", "800%", "1000%"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f21503g = {"1", "2", "4", "6", "8", "10"};

    /* renamed from: h  reason: collision with root package name */
    public static final float[] f21504h = {0.05f, -0.2f, 0.375f};

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f21505a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f21506b = new ConcurrentHashMap<>();
    public int c = 1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21507d;

    /* compiled from: PDFPageTextInfo.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f21508a = new i();
    }

    public final String a() {
        int i10 = this.c;
        if (i10 >= 0 && i10 < 6) {
            return f21502f[i10];
        }
        return "out of range";
    }
}
