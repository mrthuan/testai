package com.facebook.appevents;

import android.content.SharedPreferences;
import f6.f;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9664a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9665b;
    public final /* synthetic */ String c;

    public /* synthetic */ t(String str, String str2, int i10) {
        this.f9664a = i10;
        this.f9665b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9664a;
        String buttonText = this.c;
        String queriedEvent = this.f9665b;
        switch (i10) {
            case 0:
                if (!k6.a.b(u.class)) {
                    try {
                        kotlin.jvm.internal.g.e(queriedEvent, "$key");
                        kotlin.jvm.internal.g.e(buttonText, "$value");
                        if (!u.c.get()) {
                            u.f9666a.b();
                        }
                        SharedPreferences sharedPreferences = u.f9667b;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(queriedEvent, buttonText).apply();
                            return;
                        } else {
                            kotlin.jvm.internal.g.i("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        k6.a.a(u.class, th2);
                        return;
                    }
                }
                return;
            default:
                kotlin.jvm.internal.g.e(queriedEvent, "$queriedEvent");
                kotlin.jvm.internal.g.e(buttonText, "$buttonText");
                HashSet hashSet = f6.f.f17135e;
                f.a.c(queriedEvent, buttonText, new float[0]);
                return;
        }
    }
}
