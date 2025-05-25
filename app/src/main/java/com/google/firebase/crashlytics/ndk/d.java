package com.google.firebase.crashlytics.ndk;

import android.util.Log;
import com.google.firebase.crashlytics.ndk.g;
import java.io.File;
import java.io.IOException;
import oa.d0;

/* compiled from: FirebaseCrashlyticsNdk.java */
/* loaded from: classes2.dex */
public final class d implements ja.a {

    /* renamed from: a  reason: collision with root package name */
    public final b f13556a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13557b;
    public String c;

    public d(b bVar, boolean z10) {
        this.f13556a = bVar;
        this.f13557b = z10;
    }

    @Override // ja.a
    public final ja.e a(String str) {
        return new h(this.f13556a.b(str));
    }

    @Override // ja.a
    public final boolean b() {
        String str = this.c;
        if (str != null && d(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.crashlytics.ndk.c] */
    @Override // ja.a
    public final synchronized void c(final String str, final String str2, final long j10, final d0 d0Var) {
        this.c = str;
        ?? r72 = new Object() { // from class: com.google.firebase.crashlytics.ndk.c
            public final void a() {
                String str3 = str2;
                long j11 = j10;
                d0 d0Var2 = d0Var;
                d dVar = d.this;
                dVar.getClass();
                Log.isLoggable("FirebaseCrashlytics", 3);
                b bVar = dVar.f13556a;
                ra.d dVar2 = bVar.c;
                String str4 = str;
                try {
                    String canonicalPath = dVar2.b(str4).getCanonicalPath();
                    if (((JniNativeApi) bVar.f13551b).b(bVar.f13550a.getAssets(), canonicalPath)) {
                        bVar.d(j11, str4, str3);
                        bVar.e(str4, d0Var2.a());
                        bVar.h(str4, d0Var2.c());
                        bVar.f(str4, d0Var2.b());
                    }
                } catch (IOException unused) {
                }
            }
        };
        if (this.f13557b) {
            r72.a();
        }
    }

    @Override // ja.a
    public final boolean d(String str) {
        boolean z10;
        g.b bVar = this.f13556a.b(str).f13558a;
        if (bVar == null) {
            return false;
        }
        File file = bVar.f13568a;
        if ((file != null && file.exists()) || bVar.f13569b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }
}
