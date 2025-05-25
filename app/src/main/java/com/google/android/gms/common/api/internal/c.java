package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10990a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zaad f10991b;

    public c(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f10991b = zaadVar;
        this.f10990a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f10991b.f11046b.remove(this.f10990a);
    }
}
