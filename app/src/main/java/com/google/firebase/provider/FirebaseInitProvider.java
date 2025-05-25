package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import z9.a;
import z9.e;
import z9.f;

/* loaded from: classes2.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13690a = new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f13691b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
                super.attachInfo(context, providerInfo);
                return;
            }
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        throw new NullPointerException("FirebaseInitProvider ProviderInfo cannot be null.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            AtomicBoolean atomicBoolean = f13691b;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (e.f32306j) {
                if (e.f32307k.containsKey("[DEFAULT]")) {
                    e.c();
                } else {
                    f a10 = f.a(context);
                    if (a10 != null) {
                        e.f(context, a10);
                    }
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th2) {
            f13691b.set(false);
            throw th2;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
