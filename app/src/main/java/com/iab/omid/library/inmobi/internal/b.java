package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes2.dex */
public class b extends d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static b f13960d = new b();

    private b() {
    }

    public static b g() {
        return f13960d;
    }

    @Override // com.iab.omid.library.inmobi.internal.d
    public void b(boolean z10) {
        for (com.iab.omid.library.inmobi.adsession.a aVar : c.c().b()) {
            aVar.getAdSessionStatePublisher().a(z10);
        }
    }

    @Override // com.iab.omid.library.inmobi.internal.d
    public boolean d() {
        for (com.iab.omid.library.inmobi.adsession.a aVar : c.c().a()) {
            View c = aVar.c();
            if (c != null && c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
