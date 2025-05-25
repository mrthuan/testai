package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11015b;
    public final /* synthetic */ zaaw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar);
        this.c = zaawVar;
        this.f11015b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void a() {
        Set set;
        zaaw zaawVar = this.c;
        zabe zabeVar = zaawVar.f11052a.f11106m;
        zabi zabiVar = zaawVar.f11052a;
        ClientSettings clientSettings = zaawVar.f11068r;
        if (clientSettings == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(clientSettings.f11182b);
            Map map = clientSettings.f11183d;
            for (Api api : map.keySet()) {
                if (!zabiVar.f11100g.containsKey(api.f10898b)) {
                    ((com.google.android.gms.common.internal.zab) map.get(api)).getClass();
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        zabeVar.f11086p = set;
        ArrayList arrayList = this.f11015b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Api.Client) arrayList.get(i10)).getRemoteService(zaawVar.f11065o, zabiVar.f11106m.f11086p);
        }
    }
}
