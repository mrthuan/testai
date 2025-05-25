package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes2.dex */
public final class Q2 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14585a = 0;

    public Q2(Context context) {
        super(context, "com.im_10.7.8.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db2) {
        kotlin.jvm.internal.g.e(db2, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db2, int i10, int i11) {
        kotlin.jvm.internal.g.e(db2, "db");
    }
}
