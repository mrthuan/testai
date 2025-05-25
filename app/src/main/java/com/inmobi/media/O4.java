package com.inmobi.media;

import android.content.ContentValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes2.dex */
public final class O4 extends AbstractC1875y3 {
    public O4() {
        super("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        String asString5 = contentValues.getAsString("ts");
        kotlin.jvm.internal.g.d(asString5, "getAsString(...)");
        long parseLong = Long.parseLong(asString5);
        kotlin.jvm.internal.g.b(asString);
        kotlin.jvm.internal.g.b(asString3);
        kotlin.jvm.internal.g.b(asString2);
        R4 r4 = new R4(asString, asString3, asString2, asString4);
        r4.f15673b = parseLong;
        Integer asInteger = contentValues.getAsInteger(FacebookMediationAdapter.KEY_ID);
        kotlin.jvm.internal.g.d(asInteger, "getAsInteger(...)");
        r4.c = asInteger.intValue();
        return r4;
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        R4 item = (R4) obj;
        kotlin.jvm.internal.g.e(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", item.f14609e);
        contentValues.put("componentType", item.f14610f);
        contentValues.put("eventType", item.f15672a);
        contentValues.put("payload", item.a());
        contentValues.put("ts", String.valueOf(item.f15673b));
        return contentValues;
    }
}
