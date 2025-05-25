package com.inmobi.media;

import android.content.ContentValues;

/* loaded from: classes2.dex */
public final class R5 extends AbstractC1860x1 {

    /* renamed from: b  reason: collision with root package name */
    public D4 f14611b;

    public R5() {
        super("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        String asString = contentValues.getAsString("filename");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        Integer asInteger = contentValues.getAsInteger("retryCount");
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        boolean z10 = asInteger3 != null && asInteger3.intValue() == 1;
        kotlin.jvm.internal.g.b(asString);
        kotlin.jvm.internal.g.b(asLong);
        long longValue = asLong.longValue();
        kotlin.jvm.internal.g.b(asInteger);
        int intValue = asInteger.intValue();
        kotlin.jvm.internal.g.b(asLong2);
        long longValue2 = asLong2.longValue();
        kotlin.jvm.internal.g.b(asInteger2);
        return new Q5(asString, longValue, intValue, longValue2, z10, asInteger2.intValue());
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        Q5 item = (Q5) obj;
        kotlin.jvm.internal.g.e(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", item.f14592a);
        contentValues.put("saveTimestamp", Long.valueOf(item.f14593b));
        contentValues.put("retryCount", Integer.valueOf(item.c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(item.f14594d));
        contentValues.put("checkpoints", Integer.valueOf(item.f14596f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(item.f14595e ? 1 : 0));
        return contentValues;
    }

    public final void a(Q5 data) {
        kotlin.jvm.internal.g.e(data, "data");
        a("filename=\"" + data.f14592a + '\"', null);
    }

    public final void b(Q5 data) {
        kotlin.jvm.internal.g.e(data, "data");
        b(data, androidx.activity.r.f(new StringBuilder("filename=\""), data.f14592a, '\"'), null);
        if (this.f14611b != null) {
            D4.a();
        }
    }
}
