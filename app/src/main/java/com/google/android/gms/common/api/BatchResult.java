package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class BatchResult implements Result {

    /* renamed from: a  reason: collision with root package name */
    public final Status f10899a;

    public BatchResult(Status status) {
        this.f10899a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f10899a;
    }
}
