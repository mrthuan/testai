package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes2.dex */
public class Q extends Handler {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<a> f15788a;

    /* compiled from: WeakHandler.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Message message);
    }

    public Q(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.f15788a = new WeakReference<>(aVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.f15788a;
        if (weakReference != null && (aVar = weakReference.get()) != null && message != null) {
            aVar.a(message);
        }
    }
}
