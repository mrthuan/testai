package com.inmobi.media;

import android.content.ContentValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* renamed from: com.inmobi.media.lb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1714lb extends AbstractC1875y3 {
    public C1714lb() {
        super("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        String asString3 = contentValues.getAsString("eventSource");
        String asString4 = contentValues.getAsString("ts");
        kotlin.jvm.internal.g.d(asString4, "getAsString(...)");
        long parseLong = Long.parseLong(asString4);
        kotlin.jvm.internal.g.b(asString);
        kotlin.jvm.internal.g.b(asString3);
        C1728mb c1728mb = new C1728mb(asString, asString2, asString3);
        c1728mb.f15673b = parseLong;
        Integer asInteger = contentValues.getAsInteger(FacebookMediationAdapter.KEY_ID);
        kotlin.jvm.internal.g.d(asInteger, "getAsInteger(...)");
        c1728mb.c = asInteger.intValue();
        return c1728mb;
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        C1728mb item = (C1728mb) obj;
        kotlin.jvm.internal.g.e(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", item.f15672a);
        contentValues.put("payload", item.a());
        contentValues.put("eventSource", item.f15323e);
        contentValues.put("ts", String.valueOf(item.f15673b));
        return contentValues;
    }
}
