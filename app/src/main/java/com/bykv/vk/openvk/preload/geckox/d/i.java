package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

/* compiled from: TerminalInterceptor.java */
/* loaded from: classes.dex */
public class i extends com.bykv.vk.openvk.preload.b.d<Pair<String, Long>, Pair<String, Long>> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Pair<String, Long>> bVar, Pair<String, Long> pair) {
        Pair<String, Long> pair2 = pair;
        GeckoLogger.d("gecko-debug-tag", "update success:", pair2);
        return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<String, Long>>) pair2);
    }
}
