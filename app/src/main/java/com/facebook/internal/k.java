package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeProtocol.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f9807a;

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f9808b;
    public static final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public static final Integer[] f9809d;

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class a extends d {
        @Override // com.facebook.internal.k.d
        public final String b() {
            return "com.facebook.arstudio.player";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class b extends d {
        @Override // com.facebook.internal.k.d
        public final String b() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.k.d
        public final void c() {
            boolean z10;
            if (com.facebook.d.a().getApplicationInfo().targetSdkVersion >= 30) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !k6.a.b(k.class)) {
                try {
                    k kVar = k.f9807a;
                } catch (Throwable th2) {
                    k6.a.a(k.class, th2);
                }
            }
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class c extends d {
        @Override // com.facebook.internal.k.d
        public final String b() {
            return "com.facebook.orca";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class e extends d {
        @Override // com.facebook.internal.k.d
        public final String b() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.k.<clinit>():void");
    }

    public static final Bundle c(Intent intent) {
        int intExtra;
        if (k6.a.b(k.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(intent, "intent");
            boolean z10 = false;
            if (k6.a.b(k.class)) {
                intExtra = 0;
            } else {
                intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            }
            if (!k6.a.b(k.class)) {
                if (kotlin.collections.f.w(Integer.valueOf(intExtra), f9809d) && intExtra >= 20140701) {
                    z10 = true;
                }
            }
            if (!z10) {
                return null;
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        } catch (Throwable th2) {
            k6.a.a(k.class, th2);
            return null;
        }
    }

    public final ArrayList a() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            return ge.a.j(new b(), new e());
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final TreeSet<Integer> b(d dVar) {
        Uri parse;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = com.facebook.d.a().getContentResolver();
            String[] strArr = {"version"};
            if (k6.a.b(this)) {
                parse = null;
            } else {
                parse = Uri.parse("content://" + dVar.b() + ".provider.PlatformProvider/versions");
                kotlin.jvm.internal.g.d(parse, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            }
            try {
                try {
                    providerInfo = com.facebook.d.a().getPackageManager().resolveContentProvider(dVar.b() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException unused) {
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        cursor2 = contentResolver.query(parse, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursor2 = null;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                cursor = cursor2;
                                th = th2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (Throwable th4) {
            k6.a.a(this, th4);
            return null;
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static abstract class d {
        /* JADX WARN: Removed duplicated region for block: B:18:0x0024 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:12:0x0018, B:18:0x0024, B:6:0x000c), top: B:24:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void a() {
            /*
                r3 = this;
                monitor-enter(r3)
                com.facebook.internal.k r0 = com.facebook.internal.k.f9807a     // Catch: java.lang.Throwable -> L29
                java.lang.Class<com.facebook.internal.k> r1 = com.facebook.internal.k.class
                boolean r2 = k6.a.b(r1)     // Catch: java.lang.Throwable -> L29
                if (r2 == 0) goto Lc
                goto L15
            Lc:
                java.util.TreeSet r0 = r0.b(r3)     // Catch: java.lang.Throwable -> L11
                goto L16
            L11:
                r0 = move-exception
                k6.a.a(r1, r0)     // Catch: java.lang.Throwable -> L29
            L15:
                r0 = 0
            L16:
                if (r0 == 0) goto L21
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
                if (r0 == 0) goto L1f
                goto L21
            L1f:
                r0 = 0
                goto L22
            L21:
                r0 = 1
            L22:
                if (r0 == 0) goto L27
                r3.c()     // Catch: java.lang.Throwable -> L29
            L27:
                monitor-exit(r3)
                return
            L29:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.k.d.a():void");
        }

        public abstract String b();

        public void c() {
        }
    }
}
