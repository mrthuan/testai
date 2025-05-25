package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.o2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1745o2 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1745o2 f15358a = new C1745o2();

    public C1745o2() {
        super(1);
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        if (contentValues.getAsString("config_value") != null) {
            return contentValues.getAsLong("update_ts");
        }
        return null;
    }
}
