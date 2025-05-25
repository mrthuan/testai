package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class t extends com.google.android.gms.internal.base.zau {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zabi f11035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zabi zabiVar, Looper looper) {
        super(looper);
        this.f11035a = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        s sVar = (s) message.obj;
        zabi zabiVar = this.f11035a;
        sVar.getClass();
        zabiVar.f11095a.lock();
        try {
            if (zabiVar.f11104k == sVar.f11034a) {
                sVar.a();
            }
        } finally {
            zabiVar.f11095a.unlock();
        }
    }
}
