package com.gyf.immersionbar;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;

/* compiled from: NavigationBarObserver.java */
/* loaded from: classes2.dex */
public final class j extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13813a = 0;

    /* compiled from: NavigationBarObserver.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f13814a = new j();
    }

    public j() {
        super(new Handler(Looper.getMainLooper()));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
    }
}
