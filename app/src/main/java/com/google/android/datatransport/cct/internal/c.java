package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
public final class c extends NetworkConnectionInfo {

    /* renamed from: a  reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f9915a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f9916b;

    public c(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f9915a = networkType;
        this.f9916b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.MobileSubtype a() {
        return this.f9916b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.NetworkType b() {
        return this.f9915a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f9915a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.b()) : networkConnectionInfo.b() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f9916b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.a() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        NetworkConnectionInfo.NetworkType networkType = this.f9915a;
        if (networkType == null) {
            hashCode = 0;
        } else {
            hashCode = networkType.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f9916b;
        if (mobileSubtype != null) {
            i10 = mobileSubtype.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f9915a + ", mobileSubtype=" + this.f9916b + "}";
    }
}
