package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.tools.d;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.c;
import ha.e;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes2.dex */
public final class b extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f13664b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f13665a;

    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public b(EnhancedIntentService.a aVar) {
        this.f13665a = aVar;
    }

    public final void a(c.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("FirebaseMessaging", 3);
            Intent intent = aVar.f13671a;
            EnhancedIntentService.a aVar2 = (EnhancedIntentService.a) this.f13665a;
            aVar2.getClass();
            int i10 = EnhancedIntentService.f13634f;
            EnhancedIntentService enhancedIntentService = EnhancedIntentService.this;
            enhancedIntentService.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            enhancedIntentService.f13635a.execute(new e(1, enhancedIntentService, intent, taskCompletionSource));
            taskCompletionSource.f11978a.c(new t1.e(2), new d(aVar, 1));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
