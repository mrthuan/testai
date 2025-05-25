package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class d0 {
    public static final q9.y c = new q9.y("AssetPackStorage");

    /* renamed from: d  reason: collision with root package name */
    public static final long f13205d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f13206e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13207a;

    /* renamed from: b  reason: collision with root package name */
    public final w1 f13208b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f13205d = timeUnit.toMillis(14L);
        f13206e = timeUnit.toMillis(28L);
    }

    public d0(Context context, w1 w1Var) {
        this.f13207a = context;
        this.f13208b = w1Var;
    }

    public static long b(File file, boolean z10) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            q9.y yVar = c;
            if (z10 && file.listFiles().length > 1) {
                yVar.e("Multiple pack versions found, using highest version code.", new Object[0]);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e10) {
                yVar.c(e10, "Corrupt asset pack directories.", new Object[0]);
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
            }
            return -1L;
        }
        return -1L;
    }

    public static void g(File file) {
        File[] listFiles;
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b10 = b(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(b10)) && !file2.getName().equals("stale.tmp")) {
                    h(file2);
                }
            }
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z10 &= h(file2);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z10;
    }

    public final void a(int i10, long j10, String str) {
        File[] listFiles;
        File[] listFiles2;
        File c10 = c(str);
        if (c10.exists()) {
            for (File file : c10.listFiles()) {
                if (!file.getName().equals(String.valueOf(i10)) && !file.getName().equals("stale.tmp")) {
                    h(file);
                } else if (file.getName().equals(String.valueOf(i10))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j10))) {
                            h(file2);
                        }
                    }
                }
            }
        }
    }

    public final File c(String str) {
        return new File(e(), str);
    }

    public final File d(int i10, long j10, String str) {
        return new File(new File(new File(new File(e(), "_tmp"), str), String.valueOf(i10)), String.valueOf(j10));
    }

    public final File e() {
        return new File(this.f13207a.getFilesDir(), "assetpacks");
    }

    public final ArrayList f() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            if (e().exists() && e().listFiles() != null) {
                for (File file : e().listFiles()) {
                    if (!file.getCanonicalPath().equals(new File(e(), "_tmp").getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
            }
        } catch (IOException e10) {
            c.b("Could not process directory while scanning installed packs. %s", e10);
        }
        return arrayList;
    }

    public final int i(int i10, long j10, String str) {
        File file = new File(new File(d(i10, j10, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e10) {
                    throw new ck("Merge checkpoint file corrupt.", e10);
                }
            }
            throw new ck("Merge checkpoint file corrupt.");
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final long j(String str) {
        return b(new File(c(str), String.valueOf((int) b(c(str), true))), true);
    }

    public final h0 k(String str) {
        String o10 = o(str);
        if (o10 == null) {
            return null;
        }
        File file = new File(o10, "assets");
        if (!file.isDirectory()) {
            c.b("Failed to find assets directory: %s", file);
            return null;
        }
        return new h0(0, o10, file.getCanonicalPath());
    }

    public final File l(int i10, long j10, String str) {
        return new File(new File(c(str), String.valueOf(i10)), String.valueOf(j10));
    }

    public final File m(int i10, String str, String str2, long j10) {
        return new File(new File(new File(d(i10, j10, str), "_slices"), "_unverified"), str2);
    }

    public final File n(int i10, String str, String str2, long j10) {
        return new File(new File(new File(d(i10, j10, str), "_slices"), "_verified"), str2);
    }

    public final String o(String str) {
        int length;
        File file = new File(e(), str);
        boolean exists = file.exists();
        q9.y yVar = c;
        if (!exists) {
            yVar.a("Pack not found with pack name: %s", str);
            return null;
        }
        w1 w1Var = this.f13208b;
        File file2 = new File(file, String.valueOf(w1Var.a()));
        if (!file2.exists()) {
            yVar.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(w1Var.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles != null && (length = listFiles.length) != 0) {
            if (length > 1) {
                yVar.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(w1Var.a()));
                return null;
            }
            return listFiles[0].getCanonicalPath();
        }
        yVar.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(w1Var.a()));
        return null;
    }

    public final HashMap p() {
        HashMap hashMap = new HashMap();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int b10 = (int) b(c(name), true);
            long b11 = b(new File(c(name), String.valueOf(b10)), true);
            if (l(b10, b11, name).exists()) {
                hashMap.put(name, Long.valueOf(b11));
            }
        }
        return hashMap;
    }

    public final HashMap q() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = f().iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                h0 k10 = k(file.getName());
                if (k10 != null) {
                    hashMap2.put(file.getName(), k10);
                }
            }
        } catch (IOException e10) {
            c.b("Could not process directory while scanning installed packs: %s", e10);
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(j(str)));
        }
        return hashMap;
    }
}
