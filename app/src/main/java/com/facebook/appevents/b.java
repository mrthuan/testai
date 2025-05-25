package com.facebook.appevents;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: AnalyticsUserIDStore.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9470a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f9471b = new ReentrantReadWriteLock();
    public static String c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f9472d;

    public static void a() {
        if (f9472d) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f9471b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f9472d) {
                c = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f9472d = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f9471b.writeLock().unlock();
            throw th2;
        }
    }
}
