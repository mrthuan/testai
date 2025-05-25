package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LoadLocalChannelVersionInterceptorMulti.java */
/* loaded from: classes.dex */
public class e extends com.bykv.vk.openvk.preload.b.d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: g  reason: collision with root package name */
    private File f7578g;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f7579h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Map<String, List<Pair<String, Long>>>> bVar, String str) {
        Long a10;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", str);
        HashMap hashMap = new HashMap();
        for (String str2 : this.f7579h) {
            File file = new File(this.f7578g, str2);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    File file2 = new File(file, str3);
                    if (file2.isDirectory() && (a10 = j.a(file2)) != null) {
                        arrayList.add(new Pair(str3, a10));
                    }
                }
            }
            hashMap.put(str2, arrayList);
        }
        return bVar.a((com.bykv.vk.openvk.preload.b.b<Map<String, List<Pair<String, Long>>>>) hashMap);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f7578g = (File) objArr[0];
        this.f7579h = (List) objArr[1];
    }
}
