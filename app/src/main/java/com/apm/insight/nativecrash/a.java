package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f6669a;

    public a(File file) {
        String a10;
        File c = n.c(file);
        if (!c.exists() || c.length() == 0 || (a10 = NativeImpl.a(c.getAbsolutePath())) == null) {
            return;
        }
        String[] split = a10.split("\n");
        this.f6669a = new HashMap();
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                this.f6669a.put(split2[0], split2[1]);
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.f6669a;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(this.f6669a.get("process_name")) || TextUtils.isEmpty(this.f6669a.get("crash_thread_name")) || TextUtils.isEmpty(this.f6669a.get("pid")) || TextUtils.isEmpty(this.f6669a.get("tid")) || TextUtils.isEmpty(this.f6669a.get("start_time")) || TextUtils.isEmpty(this.f6669a.get("crash_time")) || TextUtils.isEmpty(this.f6669a.get("signal_line"))) {
            return false;
        }
        return true;
    }

    public String b() {
        return this.f6669a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.f6669a;
    }
}
