package com.inmobi.media;

import android.content.ContentValues;

/* renamed from: com.inmobi.media.z2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1887z2 extends AbstractC1860x1 {
    public C1887z2() {
        super("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        String asString = contentValues.getAsString("e_data");
        kotlin.jvm.internal.g.d(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("timestamp");
        kotlin.jvm.internal.g.d(asLong, "getAsLong(...)");
        return new C1810t3(asString, asLong.longValue());
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        C1810t3 data = (C1810t3) obj;
        kotlin.jvm.internal.g.e(data, "data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("e_data", data.f15459a);
        contentValues.put("timestamp", Long.valueOf(data.f15460b));
        return contentValues;
    }
}
