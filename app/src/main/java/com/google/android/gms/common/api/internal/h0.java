package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class h0 extends com.google.android.gms.internal.base.zau {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zada f11009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(zada zadaVar, Looper looper) {
        super(looper);
        this.f11009a = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        synchronized (this.f11009a.f11139d) {
            zada zadaVar = this.f11009a.f11138b;
            Preconditions.j(zadaVar);
            if (pendingResult == null) {
                zadaVar.d(new Status(13, "Transform returned null", null, null));
            } else if (pendingResult instanceof zacp) {
                zacp zacpVar = (zacp) pendingResult;
                zadaVar.d(null);
            } else {
                zadaVar.c(pendingResult);
            }
        }
    }
}
