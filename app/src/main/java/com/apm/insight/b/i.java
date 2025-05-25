package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f6426a;

    /* renamed from: b  reason: collision with root package name */
    private static Printer f6427b;

    /* renamed from: d  reason: collision with root package name */
    private static e f6428d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f6429e;
    private static final CopyOnWriteArrayList<e> c = new CopyOnWriteArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f6430f = false;

    /* renamed from: g  reason: collision with root package name */
    private static long f6431g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static int f6432h = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);
    }

    public static void a() {
        if (f6426a) {
            return;
        }
        f6426a = true;
        f6427b = new Printer() { // from class: com.apm.insight.b.i.1
            @Override // android.util.Printer
            public void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean z10 = false;
                if (str.charAt(0) == '>') {
                    z10 = true;
                } else if (str.charAt(0) != '<') {
                    return;
                }
                i.a(z10, str);
            }
        };
        j.a();
        j.a(f6427b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e eVar;
        e eVar2;
        long nanoTime = System.nanoTime();
        e.f6368a = nanoTime / 1000000;
        e.f6369b = SystemClock.currentThreadTimeMillis();
        if (z10 && (eVar2 = f6428d) != null && eVar2.a()) {
            f6428d.a(str);
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar3 = copyOnWriteArrayList.get(i10);
            if (eVar3 != null && eVar3.a()) {
                boolean z11 = eVar3.c;
                if (z10) {
                    if (!z11) {
                        eVar3.a(str);
                    }
                } else if (z11) {
                    eVar3.b(str);
                }
            } else if (!z10 && eVar3.c) {
                eVar3.b("");
            }
        }
        if (!z10 && (eVar = f6428d) != null && eVar.a()) {
            f6428d.b("");
        }
        if (f6430f) {
            f6431g = (System.nanoTime() - nanoTime) + f6431g;
            int i11 = f6432h;
            f6432h = i11 + 1;
            if (i11 >= 1000) {
                if (f6429e != null) {
                    f6429e.a(f6431g);
                }
                f6432h = 0;
                f6431g = 0L;
                f6430f = false;
            }
        }
    }
}
