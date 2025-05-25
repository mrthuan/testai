package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.p;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f6323d;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f6324a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b f6325b;
    private volatile c c;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f6326e = false;

    private a() {
    }

    public static a a() {
        if (f6323d == null) {
            synchronized (a.class) {
                if (f6323d == null) {
                    f6323d = new a();
                }
            }
        }
        return f6323d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public void a(CrashType crashType, long j10, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, b bVar, c cVar) {
        this.f6324a = str;
        this.f6325b = bVar;
        this.c = cVar;
        if (this.f6326e) {
            return;
        }
        this.f6326e = true;
        p.b().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public void b() {
    }
}
