package com.apm.insight.runtime;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static File f6795a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6796a;

        /* renamed from: b  reason: collision with root package name */
        public String f6797b;
        public long c;

        public a(String str) {
            String[] split = str.split("\\s+");
            if (split.length == 3) {
                this.f6796a = split[0];
                this.f6797b = split[1];
                try {
                    this.c = Long.parseLong(split[2]);
                    return;
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str), th2));
                    return;
                }
            }
            com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str)));
        }
    }

    private static File a() {
        if (f6795a == null) {
            String c = com.apm.insight.l.a.c(com.apm.insight.i.g());
            if (c == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String j10 = com.apm.insight.l.n.j(com.apm.insight.i.g());
            f6795a = new File(j10, "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + PackagingURIHelper.FORWARD_SLASH_CHAR + c.replace(':', '_') + ".txt");
        }
        return f6795a;
    }

    public static File a(long j10) {
        String j11 = com.apm.insight.l.n.j(com.apm.insight.i.g());
        return new File(j11, "apminsight/ProcessTrack/" + ((j10 - (j10 % 86400000)) / 86400000));
    }

    public static HashMap<String, a> a(long j10, String str) {
        File file = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j10 - (j10 % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a10 = com.apm.insight.l.h.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a10.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a10.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new a(optString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    public static void a(String str, String str2) {
        try {
            File a10 = a();
            if (a10 != null) {
                com.apm.insight.l.h.a(a10, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
