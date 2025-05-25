package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: ITTProvider.java */
/* loaded from: classes.dex */
public interface Qhi {
    int Qhi(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int Qhi(Uri uri, String str, String[] strArr);

    Cursor Qhi(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri Qhi(Uri uri, ContentValues contentValues);

    String Qhi();

    String Qhi(Uri uri);
}
