package com.gyf.immersionbar;

import android.app.Application;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: EMUI3NavigationBarObserver.java */
/* loaded from: classes2.dex */
public final class c extends ContentObserver {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f13776d = 0;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<h> f13777a;

    /* renamed from: b  reason: collision with root package name */
    public Application f13778b;
    public Boolean c;

    /* compiled from: EMUI3NavigationBarObserver.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13779a = new c();
    }

    public c() {
        super(new Handler(Looper.getMainLooper()));
        this.c = Boolean.FALSE;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        ArrayList<h> arrayList;
        boolean z11;
        super.onChange(z10);
        Application application = this.f13778b;
        if (application != null && application.getContentResolver() != null && (arrayList = this.f13777a) != null && !arrayList.isEmpty()) {
            int i10 = Settings.System.getInt(this.f13778b.getContentResolver(), "navigationbar_is_min", 0);
            Iterator<h> it = this.f13777a.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                next.a(z11);
            }
        }
    }
}
