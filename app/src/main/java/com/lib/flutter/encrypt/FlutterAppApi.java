package com.lib.flutter.encrypt;

import android.os.Handler;
import android.os.Looper;
import cg.l;
import gf.f;
import gf.j;
import kotlin.jvm.internal.g;

/* compiled from: MessagKt.kt */
/* loaded from: classes2.dex */
public final class FlutterAppApi {
    public static final tf.c<j> c = kotlin.a.a(new cg.a<j>() { // from class: com.lib.flutter.encrypt.FlutterAppApi$Companion$codec$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final j invoke() {
            return new j();
        }
    });

    /* renamed from: a  reason: collision with root package name */
    public final gf.c f15734a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15735b;

    /* compiled from: MessagKt.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static f a() {
            return FlutterAppApi.c.getValue();
        }
    }

    public FlutterAppApi(we.a aVar) {
        ea.a.p("LmlXYR55dGU7cwNuU2Vy", "2eL9l9AU");
        this.f15734a = aVar;
        this.f15735b = new Handler(Looper.getMainLooper());
    }

    public final void a(String typeArg) {
        g.e(typeArg, "typeArg");
        new gf.b(this.f15734a, ea.a.p("AGVFLjNsTHQ8ZRQuRGkwZVdufEYldUJ0EXIwcCFBMmlKbFxhMUNWbSppCGFAaThueWQ=", "MXd3U9oQ"), a.a(), null).a(ge.a.H(typeArg), new t5.f(12));
    }

    public final void b(String str, cg.a<tf.d> aVar) {
        new gf.b(this.f15734a, ea.a.p("V2U9LhVsF3QGZUYuGWkxZStuHEYqdTd0E3JwcAJBImkdbyVBF0MObwFl", "v1rRd865"), a.a(), null).a(ge.a.H(str), new b(aVar, 1));
    }

    public final void c(String typeArg, boolean z10, cg.a<tf.d> callback) {
        boolean z11;
        g.e(typeArg, "typeArg");
        g.e(callback, "callback");
        try {
            z11 = g.a(Looper.myLooper(), Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
            z11 = false;
        }
        if (z11) {
            new gf.b(this.f15734a, ea.a.p("V2U9LhVsF3QGZUYuGWkxZStuHEYqdTd0EnJxcBVBJWkdbyVBF0wNYRZlUFIMcyNsdA==", "w0eUtbFi"), a.a(), null).a(ge.a.I(typeArg, Boolean.valueOf(z10)), new b(callback, 0));
        } else {
            new Handler(Looper.getMainLooper()).post(new androidx.fragment.app.e(this, typeArg, z10, callback, 1));
        }
    }

    public final void d(String typeArg, boolean z10, cg.a<tf.d> callback) {
        g.e(typeArg, "typeArg");
        g.e(callback, "callback");
        new gf.b(this.f15734a, ea.a.p("K2VHLh9sQnQuZTguBWkPZVpuQEYpdRF0VHJwcDRBA2lhb19BHVNfby1lZA==", "fyhc11Ds"), a.a(), null).a(ge.a.I(typeArg, Boolean.valueOf(z10)), new d9.g(callback, 3));
    }

    public final void e(String str, l<? super String, tf.d> lVar) {
        boolean z10;
        gf.b bVar = new gf.b(this.f15734a, ea.a.p("V2U9LhVsF3QGZUYuGWkxZStuHEYqdTd0MnI2cDRBJWkdci5mAWURaDNuUEcMdBVvKmZbZw==", "WwDUYay9"), a.a(), null);
        try {
            z10 = g.a(Looper.myLooper(), Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
            z10 = false;
        }
        if (z10) {
            bVar.a(ge.a.H(str), new com.google.android.tools.d(lVar, 8));
        } else {
            this.f15735b.post(new androidx.fragment.app.f(6, bVar, str, lVar));
        }
    }
}
