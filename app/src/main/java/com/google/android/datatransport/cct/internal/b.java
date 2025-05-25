package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class b extends ClientInfo {

    /* renamed from: a  reason: collision with root package name */
    public final ClientInfo.ClientType f9913a;

    /* renamed from: b  reason: collision with root package name */
    public final u6.a f9914b;

    public b(ClientInfo.ClientType clientType, u6.a aVar) {
        this.f9913a = clientType;
        this.f9914b = aVar;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final u6.a a() {
        return this.f9914b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType b() {
        return this.f9913a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f9913a;
        if (clientType != null ? clientType.equals(clientInfo.b()) : clientInfo.b() == null) {
            u6.a aVar = this.f9914b;
            if (aVar == null) {
                if (clientInfo.a() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        ClientInfo.ClientType clientType = this.f9913a;
        if (clientType == null) {
            hashCode = 0;
        } else {
            hashCode = clientType.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        u6.a aVar = this.f9914b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f9913a + ", androidClientInfo=" + this.f9914b + "}";
    }
}
