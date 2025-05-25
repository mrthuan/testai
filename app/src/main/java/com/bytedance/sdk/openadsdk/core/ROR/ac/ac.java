package com.bytedance.sdk.openadsdk.core.ROR.ac;

import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: VastMacroHelper.java */
/* loaded from: classes.dex */
public class ac {
    private final List<String> Qhi;
    private final Map<cJ, String> cJ;

    public ac(List<String> list) {
        this.Qhi = list;
        HashMap hashMap = new HashMap();
        this.cJ = hashMap;
        hashMap.put(cJ.CACHEBUSTING, cJ());
    }

    private String cJ() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    public List<String> Qhi() {
        cJ[] values;
        ArrayList arrayList = new ArrayList();
        for (String str : this.Qhi) {
            if (!TextUtils.isEmpty(str)) {
                for (cJ cJVar : cJ.values()) {
                    String str2 = this.cJ.get(cJVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + cJVar.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private String cJ(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }

    public ac Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi qhi) {
        if (qhi != null) {
            this.cJ.put(cJ.ERRORCODE, qhi.Qhi());
        }
        return this;
    }

    public ac Qhi(long j10) {
        if (j10 >= 0) {
            String cJ = cJ(j10);
            if (!TextUtils.isEmpty(cJ)) {
                this.cJ.put(cJ.CONTENTPLAYHEAD, cJ);
            }
        }
        return this;
    }

    public ac Qhi(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.cJ.put(cJ.ASSETURI, str);
        }
        return this;
    }
}
