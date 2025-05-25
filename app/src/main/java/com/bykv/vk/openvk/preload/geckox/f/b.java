package com.bykv.vk.openvk.preload.geckox.f;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.r;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: VersionedResLoader.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f7589a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f7590b = new AtomicBoolean(false);
    public String c;

    /* renamed from: d  reason: collision with root package name */
    private String f7591d;

    public b(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f7591d = str;
            if (file == null) {
                this.c = new File(context.getFilesDir(), r.g(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
                return;
            } else {
                this.c = new File(file, str).getAbsolutePath();
                return;
            }
        }
        throw new RuntimeException("access key empty");
    }

    public final a a(String str) {
        a aVar;
        int indexOf = str.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING);
        if (indexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String substring = str.substring(0, indexOf);
        synchronized (this.f7589a) {
            aVar = this.f7589a.get(substring);
            if (aVar == null) {
                aVar = new a(this.c, substring);
                this.f7589a.put(substring, aVar);
            }
        }
        return aVar;
    }

    public final Map<String, Long> a() {
        HashMap hashMap = new HashMap();
        synchronized (this.f7589a) {
            Collection<a> values = this.f7589a.values();
            if (values == null) {
                return hashMap;
            }
            for (a aVar : values) {
                hashMap.put(aVar.f7584b, aVar.f7585d);
            }
            return hashMap;
        }
    }
}
