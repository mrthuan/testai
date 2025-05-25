package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class Ac {

    /* renamed from: a  reason: collision with root package name */
    public C1664i3 f14133a;

    /* renamed from: b  reason: collision with root package name */
    public final zc f14134b;

    public Ac(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(webAssetCacheConfig, "webAssetCacheConfig");
        this.f14134b = new zc();
        Ha.a(new a6.e(2, webAssetCacheConfig, this, context));
    }

    public final InputStream a(String url, A4 a42) {
        C1650h3 b10;
        kotlin.jvm.internal.g.e(url, "url");
        C1664i3 c1664i3 = this.f14133a;
        if (c1664i3 == null) {
            if (a42 != null) {
                ((B4) a42).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: ".concat(url));
            }
            return null;
        }
        try {
            b10 = c1664i3.b(String.valueOf(url.hashCode()));
        } catch (Exception e10) {
            if (a42 != null) {
                ((B4) a42).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e10.getMessage() + " for " + url);
            }
        }
        if (b10 == null || !kotlin.jvm.internal.g.a(url, Ub.a(new InputStreamReader(b10.f15122a[0], Ub.f14742b)))) {
            if (a42 != null) {
                ((B4) a42).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for ".concat(url));
            }
            return null;
        }
        return b10.f15122a[1];
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, Ac this$0, Context context) {
        kotlin.jvm.internal.g.e(webAssetCacheConfig, "$webAssetCacheConfig");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(context, "$context");
        try {
            long e10 = C1566b3.f14952a.e();
            if (e10 < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                a(context, e10);
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1838v5.a(context, "web_asset_file_key").a("cache_enabled", false);
            } else {
                this$0.a(context, webAssetCacheConfig, e10);
                ConcurrentHashMap concurrentHashMap2 = C1851w5.f15578b;
                AbstractC1838v5.a(context, "web_asset_file_key").a("cache_enabled", true);
            }
        } catch (Exception e11) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e11, "event"));
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j10) {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        kotlin.jvm.internal.g.e(webAssetCacheConfig, "webAssetCacheConfig");
        long min = (j10 == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j10 * webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent()) / 100))) * 1024 * 1024;
        zc zcVar = this.f14134b;
        Pattern pattern = C1664i3.f15166p;
        if (min > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            C1664i3 c1664i3 = new C1664i3(file, min, zcVar);
            if (c1664i3.f15169b.exists()) {
                try {
                    c1664i3.c();
                    c1664i3.b();
                    c1664i3.f15176j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c1664i3.f15169b, true), Ub.f14741a));
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    c1664i3.close();
                    Ub.a(c1664i3.f15168a);
                }
                this.f14133a = c1664i3;
                return;
            }
            file.mkdirs();
            c1664i3 = new C1664i3(file, min, zcVar);
            c1664i3.d();
            this.f14133a = c1664i3;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j10) {
        Pair pair = new Pair("size", Long.valueOf(j10));
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        LinkedHashMap B0 = kotlin.collections.q.B0(pair, new Pair("state", Boolean.valueOf(AbstractC1838v5.a(context, "web_asset_file_key").f15579a.getBoolean("cache_enabled", false))));
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("LowAvailableSpaceForCache", B0, EnumC1686jb.f15238a);
    }
}
