package com.gyf.immersionbar;

import android.app.FragmentManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.g0;
import java.util.HashMap;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes2.dex */
public final class n implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final String f13816a = g.class.getName().concat(".");
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f13818d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f13819e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f13820f = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f13817b = new Handler(Looper.getMainLooper(), this);

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final n f13821a = new n();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    this.f13820f.remove((String) message.obj);
                    return true;
                }
                this.f13819e.remove((String) message.obj);
                return true;
            }
            this.f13818d.remove((g0) message.obj);
            return true;
        }
        this.c.remove((FragmentManager) message.obj);
        return true;
    }
}
