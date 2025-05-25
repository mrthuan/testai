package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: b  reason: collision with root package name */
    public final Map f11014b;
    public final /* synthetic */ zaaw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zaaw zaawVar, HashMap hashMap) {
        super(zaawVar);
        this.c = zaawVar;
        this.f11014b = hashMap;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void a() {
        com.google.android.gms.signin.zae zaeVar;
        zaaw zaawVar = this.c;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(zaawVar.f11054d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.f11014b;
        for (Api.Client client : map.keySet()) {
            if (client.requiresGooglePlayServices() && !((h) map.get(client)).c) {
                arrayList.add(client);
            } else {
                arrayList2.add(client);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        Context context = zaawVar.c;
        int i10 = 0;
        int i11 = -1;
        if (isEmpty) {
            int size = arrayList2.size();
            while (i10 < size) {
                i11 = zalVar.a(context, (Api.Client) arrayList2.get(i10));
                i10++;
                if (i11 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                i11 = zalVar.a(context, (Api.Client) arrayList.get(i10));
                i10++;
                if (i11 != 0) {
                    break;
                }
            }
        }
        zabi zabiVar = zaawVar.f11052a;
        if (i11 != 0) {
            zabiVar.i(new i(this, zaawVar, new ConnectionResult(i11, null)));
            return;
        }
        if (zaawVar.f11063m && (zaeVar = zaawVar.f11061k) != null) {
            zaeVar.d();
        }
        for (Api.Client client2 : map.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) map.get(client2);
            if (client2.requiresGooglePlayServices() && zalVar.a(context, client2) != 0) {
                zabiVar.i(new j(zaawVar, connectionProgressReportCallbacks));
            } else {
                client2.connect(connectionProgressReportCallbacks);
            }
        }
    }
}
