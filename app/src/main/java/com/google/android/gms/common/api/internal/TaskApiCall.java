package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Feature[] f10962a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10963b;
    public final int c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public RemoteCall f10964a;
        public Feature[] c;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10965b = true;

        /* renamed from: d  reason: collision with root package name */
        public int f10966d = 0;

        private Builder() {
        }

        public /* synthetic */ Builder(int i10) {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.f10962a = null;
        this.f10963b = false;
        this.c = 0;
    }

    @KeepForSdk
    public abstract void a(Api.Client client, TaskCompletionSource taskCompletionSource);

    @KeepForSdk
    public TaskApiCall(Feature[] featureArr, boolean z10, int i10) {
        this.f10962a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f10963b = z11;
        this.c = i10;
    }
}
