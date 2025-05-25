package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class l2 extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m2 f13298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f13297a = taskCompletionSource;
        this.f13298b = m2Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.f13297a;
        if (i10 != 1) {
            if (i10 != 2) {
                taskCompletionSource.c(new AssetPackException(-100));
                return;
            } else {
                taskCompletionSource.d(0);
                return;
            }
        }
        taskCompletionSource.d(-1);
        this.f13298b.f13318e.f13349a = null;
    }
}
