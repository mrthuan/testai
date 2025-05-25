package com.apm.insight.runtime;

import com.inmobi.commons.core.configs.CrashConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static long f6747a = -30000;

    /* renamed from: b  reason: collision with root package name */
    private static File f6748b;

    public static String a(long j10, String str) {
        try {
            String j11 = com.apm.insight.l.n.j(com.apm.insight.i.g());
            return com.apm.insight.l.h.c(new File(j11, "apminsight/TrackInfo/" + ((j10 - (j10 % 86400000)) / 86400000) + PackagingURIHelper.FORWARD_SLASH_STRING + str));
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    private static File b() {
        if (f6748b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String j10 = com.apm.insight.l.n.j(com.apm.insight.i.g());
            f6748b = new File(j10, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + PackagingURIHelper.FORWARD_SLASH_STRING + com.apm.insight.i.f());
        }
        return f6748b;
    }

    public static void a() {
        File file = new File(com.apm.insight.l.n.j(com.apm.insight.i.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.insight.l.h.a(new File(file, list[i10]));
            }
        }
    }

    public static void a(long j10) {
        if (j10 - f6747a < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return;
        }
        f6747a = j10;
        try {
            com.apm.insight.l.h.a(b(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }
}
