package com.google.android.datatransport.runtime.backends;

import android.support.v4.media.session.h;
import com.google.android.datatransport.runtime.backends.BackendResponse;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
public final class a extends BackendResponse {

    /* renamed from: a  reason: collision with root package name */
    public final BackendResponse.Status f9918a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9919b;

    public a(BackendResponse.Status status, long j10) {
        if (status != null) {
            this.f9918a = status;
            this.f9919b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long a() {
        return this.f9919b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status b() {
        return this.f9918a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (this.f9918a.equals(backendResponse.b()) && this.f9919b == backendResponse.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9919b;
        return ((this.f9918a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f9918a);
        sb2.append(", nextRequestWaitMillis=");
        return h.e(sb2, this.f9919b, "}");
    }
}
