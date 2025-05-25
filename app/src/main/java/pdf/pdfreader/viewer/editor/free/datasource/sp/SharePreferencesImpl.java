package pdf.pdfreader.viewer.editor.free.datasource.sp;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.internal.g;
import tf.c;

/* compiled from: SharePreferencesImpl.kt */
/* loaded from: classes3.dex */
public class SharePreferencesImpl {

    /* renamed from: a  reason: collision with root package name */
    public final String f24206a;

    /* renamed from: b  reason: collision with root package name */
    public final c f24207b;

    public SharePreferencesImpl(String str) {
        ea.a.p("XWEmZQ==", "KPaSmHsm");
        this.f24206a = str;
        this.f24207b = kotlin.a.a(new cg.a<SharedPreferences>() { // from class: pdf.pdfreader.viewer.editor.free.datasource.sp.SharePreferencesImpl$sharedPreferences$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final SharedPreferences invoke() {
                SharePreferencesImpl.this.getClass();
                return SharePreferencesImpl.c().getSharedPreferences(SharePreferencesImpl.this.f24206a, 0);
            }
        });
    }

    public static Application c() {
        Application application = ea.a.f16522g;
        if (application != null) {
            return application;
        }
        g.i(ea.a.p("GXAFbAZjMXQhb24=", "zHxuoPpd"));
        throw null;
    }

    public final a a(String str, String str2, boolean z10) {
        return new a(d(), Boolean.valueOf(z10), str, str2);
    }

    public final a<Float> b(float f10, String str, String str2) {
        return new a<>(d(), Float.valueOf(f10), str, str2);
    }

    public final SharedPreferences d() {
        Object value = this.f24207b.getValue();
        g.d(value, ea.a.p("c2dUdFRzX2EoZS5QB2UOZUdlAGMgc1soQi5eKQ==", "d1hXlplA"));
        return (SharedPreferences) value;
    }

    public final a<Integer> e(int i10, String str, String str2) {
        return new a<>(d(), Integer.valueOf(i10), str, str2);
    }

    public final a<Long> f(long j10, String str, String str2) {
        return new a<>(d(), Long.valueOf(j10), str, str2);
    }

    public final a<String> g(String str, String str2, String str3) {
        g.e(str, "default");
        return new a<>(d(), str, str2, str3);
    }
}
