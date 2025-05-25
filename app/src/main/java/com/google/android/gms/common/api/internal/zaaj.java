package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaaj implements zabf {

    /* renamed from: a  reason: collision with root package name */
    public final zabi f11050a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11051b = false;

    public zaaj(zabi zabiVar) {
        this.f11050a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
        if (this.f11051b) {
            this.f11051b = false;
            this.f11050a.i(new f(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(int i10) {
        zabi zabiVar = this.f11050a;
        zabiVar.h();
        zabiVar.f11107n.c(i10, this.f11051b);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl f(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        h(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean g() {
        if (!this.f11051b) {
            zabi zabiVar = this.f11050a;
            HashSet hashSet = zabiVar.f11106m.f11093w;
            if (hashSet != null && !hashSet.isEmpty()) {
                this.f11051b = true;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((zada) it.next()).getClass();
                }
                return false;
            }
            zabiVar.h();
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = this.f11050a;
        try {
            zadc zadcVar = zabiVar.f11106m.f11094x;
            zadcVar.f11144a.add(apiMethodImpl);
            apiMethodImpl.zan(zadcVar.f11145b);
            zabe zabeVar = zabiVar.f11106m;
            Api.Client client = (Api.Client) zabeVar.f11085o.get(apiMethodImpl.getClientKey());
            Preconditions.k(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && zabiVar.f11100g.containsKey(apiMethodImpl.getClientKey())) {
                apiMethodImpl.setFailedResult(new Status(17, null, null, null));
            } else {
                apiMethodImpl.run(client);
            }
        } catch (DeadObjectException unused) {
            zabiVar.i(new e(this, this));
        }
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c(ConnectionResult connectionResult, Api api, boolean z10) {
    }
}
