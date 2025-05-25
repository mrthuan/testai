package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class q extends com.google.android.gms.internal.base.zau {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zabe f11027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zabe zabeVar, Looper looper) {
        super(looper);
        this.f11027a = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i10 = message.what;
        zabe zabeVar = this.f11027a;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            zabeVar.f11073b.lock();
            try {
                if (zabeVar.f11079i) {
                    zabeVar.q();
                }
                return;
            } finally {
                lock = zabeVar.f11073b;
            }
        }
        lock = zabeVar.f11073b;
        lock.lock();
        try {
            if (zabeVar.o()) {
                zabeVar.q();
            }
        } finally {
            lock.unlock();
        }
    }
}
