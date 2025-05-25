package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LoadLocalChannelVersionInterceptor.java */
/* loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<List<String>, List<Pair<String, Long>>> {

    /* renamed from: g  reason: collision with root package name */
    private File f7576g;

    /* renamed from: h  reason: collision with root package name */
    private String f7577h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>> bVar, List<String> list) {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f7576g, this.f7577h);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long a10 = j.a(new File(file, str));
            arrayList.add(new Pair(str, Long.valueOf(a10 == null ? 0L : a10.longValue())));
        }
        return bVar.a((com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>>) arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f7576g = (File) objArr[0];
        this.f7577h = (String) objArr[1];
    }
}
