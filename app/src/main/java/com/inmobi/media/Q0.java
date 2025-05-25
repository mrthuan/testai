package com.inmobi.media;

import android.content.ContentValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Q0 extends AbstractC1860x1 {
    public Q0() {
        super("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger(FacebookMediationAdapter.KEY_ID);
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString(InMobiNetworkValues.URL);
        String asString2 = contentValues.getAsString("disk_uri");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Long asLong3 = contentValues.getAsLong("ttl");
        Long asLong4 = contentValues.getAsLong("soft_ttl");
        kotlin.jvm.internal.g.b(asInteger);
        int intValue = asInteger.intValue();
        kotlin.jvm.internal.g.b(asString);
        kotlin.jvm.internal.g.b(asInteger2);
        int intValue2 = asInteger2.intValue();
        kotlin.jvm.internal.g.b(asLong);
        long longValue = asLong.longValue();
        kotlin.jvm.internal.g.b(asLong2);
        long longValue2 = asLong2.longValue();
        kotlin.jvm.internal.g.b(asLong3);
        long longValue3 = asLong3.longValue();
        kotlin.jvm.internal.g.b(asLong4);
        return new C1674j(intValue, asString, asString2, intValue2, longValue, longValue2, longValue3, asLong4.longValue());
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        C1674j adAsset = (C1674j) obj;
        kotlin.jvm.internal.g.e(adAsset, "adAsset");
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(adAsset.f15196a));
        contentValues.put(InMobiNetworkValues.URL, adAsset.f15197b);
        contentValues.put("disk_uri", adAsset.c);
        contentValues.put("pending_attempts", Integer.valueOf(adAsset.f15198d));
        contentValues.put("ts", String.valueOf(adAsset.f15199e));
        contentValues.put("created_ts", String.valueOf(adAsset.f15200f));
        contentValues.put("ttl", String.valueOf(adAsset.f15201g));
        contentValues.put("soft_ttl", String.valueOf(adAsset.f15202h));
        return contentValues;
    }

    public final ArrayList a() {
        ArrayList a10 = AbstractC1860x1.a(this, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            C1674j c1674j = (C1674j) obj;
            if (c1674j != null && c1674j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1674j c1674j2 = (C1674j) it.next();
            if (c1674j2 != null) {
                arrayList2.add(c1674j2);
            }
        }
        return arrayList2;
    }

    public final ArrayList b() {
        ArrayList a10 = AbstractC1860x1.a(this, null, null, null, null, "ts ASC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            C1674j c1674j = (C1674j) obj;
            if (c1674j != null && !c1674j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1674j c1674j2 = (C1674j) it.next();
            if (c1674j2 != null) {
                arrayList2.add(c1674j2);
            }
        }
        return arrayList2;
    }

    public final C1674j a(String remoteUrl) {
        kotlin.jvm.internal.g.e(remoteUrl, "remoteUrl");
        ArrayList a10 = AbstractC1860x1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (a10.isEmpty()) {
            return null;
        }
        return (C1674j) a10.get(0);
    }

    public final C1674j b(String remoteUrl) {
        kotlin.jvm.internal.g.e(remoteUrl, "remoteUrl");
        ArrayList a10 = AbstractC1860x1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (a10.isEmpty()) {
            return null;
        }
        return (C1674j) a10.get(0);
    }

    public final void a(C1674j asset) {
        kotlin.jvm.internal.g.e(asset, "asset");
        b(asset, "url = ?", new String[]{asset.f15197b.toString()});
    }
}
