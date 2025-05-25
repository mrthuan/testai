package com.facebook.applinks;

import android.content.Context;
import com.facebook.applinks.b;

/* compiled from: AppLinkData.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f9670a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9671b;
    public final /* synthetic */ b.a c;

    public a(Context context, String str, b.a aVar) {
        this.f9670a = context;
        this.f9671b = str;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            b.a(this.f9670a, this.f9671b, this.c);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
