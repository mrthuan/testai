package com.bykv.vk.openvk.preload.geckox.a;

import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelCleanHelper.java */
/* loaded from: classes.dex */
public final class c {
    public static void a(final String str) {
        i.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.c(str);
                } catch (Throwable th2) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(new RuntimeException("delete old channel version failed，path：" + str, th2));
                }
            }
        });
    }

    public static boolean b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("update.lock");
            com.bykv.vk.openvk.preload.geckox.g.a a10 = com.bykv.vk.openvk.preload.geckox.g.a.a(sb2.toString());
            if (a10 == null) {
                return true;
            }
            com.bykv.vk.openvk.preload.geckox.g.b a11 = com.bykv.vk.openvk.preload.geckox.g.b.a(str + str2 + "select.lock");
            try {
                com.bykv.vk.openvk.preload.geckox.utils.c.c(new File(str));
            } catch (Throwable unused) {
            }
            a11.a();
            a10.a();
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0093, LOOP:0: B:19:0x005b->B:21:0x0061, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:4:0x0018, B:23:0x0085, B:26:0x008c, B:5:0x0030, B:7:0x0040, B:9:0x0043, B:12:0x0048, B:15:0x0050, B:18:0x0057, B:19:0x005b, B:21:0x0061), top: B:36:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void c(java.lang.String r4) {
        /*
            java.lang.StringBuilder r0 = a0.a.k(r4)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = "update.lock"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.openvk.preload.geckox.g.a r0 = com.bykv.vk.openvk.preload.geckox.g.a.a(r0)
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            r2.append(r4)     // Catch: java.lang.Throwable -> L98
            r2.append(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "select.lock"
            r2.append(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L98
            com.bykv.vk.openvk.preload.geckox.g.b r1 = com.bykv.vk.openvk.preload.geckox.g.b.a(r1)     // Catch: java.lang.Throwable -> L98
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L93
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L93
            com.bykv.vk.openvk.preload.geckox.a.c$2 r4 = new com.bykv.vk.openvk.preload.geckox.a.c$2     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            java.io.File[] r4 = r2.listFiles(r4)     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L4d
            int r2 = r4.length     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L4d
            int r2 = r4.length     // Catch: java.lang.Throwable -> L93
            r3 = 1
            if (r2 != r3) goto L48
            goto L4d
        L48:
            java.util.List r4 = a(r4)     // Catch: java.lang.Throwable -> L93
            goto L4e
        L4d:
            r4 = 0
        L4e:
            if (r4 == 0) goto L8c
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L57
            goto L8c
        L57:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L93
        L5b:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L85
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L93
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r3.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L93
            r3.append(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L93
            r3.append(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "using.lock"
            r3.append(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L93
            com.bykv.vk.openvk.preload.geckox.g.c.c(r2)     // Catch: java.lang.Throwable -> L93
            goto L5b
        L85:
            r1.a()     // Catch: java.lang.Throwable -> L98
            r0.a()
            return
        L8c:
            r1.a()     // Catch: java.lang.Throwable -> L98
            r0.a()
            return
        L93:
            r4 = move-exception
            r1.a()     // Catch: java.lang.Throwable -> L98
            throw r4     // Catch: java.lang.Throwable -> L98
        L98:
            r4 = move-exception
            r0.a()
            throw r4
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.a.c.c(java.lang.String):void");
    }

    private static List<File> a(File[] fileArr) {
        long j10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j11 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (parseLong > j11) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j11 = parseLong;
                                a(file2);
                            }
                        }
                        file = file2;
                        j11 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                a(file3);
            } else {
                try {
                    j10 = Long.parseLong(name2.substring(0, indexOf));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                    j10 = -1;
                }
                if (j10 <= j11) {
                    a(file3);
                }
            }
        }
        return arrayList2;
    }

    private static void a(final File file) {
        e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
            }
        });
    }
}
