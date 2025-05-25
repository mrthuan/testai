package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class f0 extends TaskApiCall {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskApiCall.Builder f11003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(TaskApiCall.Builder builder, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f11003d = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void a(Api.Client client, TaskCompletionSource taskCompletionSource) {
        this.f11003d.f10964a.accept(client, taskCompletionSource);
    }
}
