package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: FacebookInitProvider.kt */
/* loaded from: classes.dex */
public final class FacebookInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        kotlin.jvm.internal.g.e(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        kotlin.jvm.internal.g.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        kotlin.jvm.internal.g.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                com.facebook.d dVar = com.facebook.d.f9685a;
                synchronized (com.facebook.d.class) {
                    com.facebook.d.j(context);
                }
                return false;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        kotlin.jvm.internal.g.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        kotlin.jvm.internal.g.e(uri, "uri");
        return 0;
    }
}
