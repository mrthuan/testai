package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.a.a.a;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.vk.openvk.preload.geckox.utils.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class GeckoHubImp {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static GeckoHubImp f7480a = new GeckoHubImp();
    }

    public static GeckoHubImp inst(Context context) {
        c.a(context);
        return a.f7480a;
    }

    public static void setRandomHost(String str) {
        c.a(str);
    }

    public static void setThreadPoolExecutorCallback(IThreadPoolCallback iThreadPoolCallback) {
        b.a(iThreadPoolCallback);
    }

    public WebResourceResponse findRes(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2).getWebResourceResponse();
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2);
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        c.a();
        return c.b();
    }

    public int getResCount(ILoader iLoader, String str) {
        c.a();
        return c.a(iLoader, str);
    }

    public void preload(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        c a10 = c.a();
        if (!TextUtils.isEmpty(str)) {
            b.a aVar = new b.a(c.f7547b);
            aVar.f7525b = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
            aVar.c = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
            aVar.f7531i = 38L;
            aVar.f7533k = str;
            aVar.f7532j = "9999999.0.0";
            a.C0067a c0067a = new a.C0067a();
            c0067a.f7497a = 20;
            com.bykv.vk.openvk.preload.geckox.a.a.b bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.c;
            if (bVar == null) {
                bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.f7499a;
            }
            c0067a.f7498b = bVar;
            aVar.f7530h = new com.bykv.vk.openvk.preload.geckox.a.a.a(c0067a, (byte) 0);
            aVar.f7535m = c.f7546a;
            aVar.f7529g = false;
            aVar.f7534l = c.c;
            aVar.f7528f = iStatisticMonitor;
            aVar.f7524a = iNetWork;
            b bVar2 = new b(aVar, (byte) 0);
            a10.f7549d = iNetWork;
            List<String> list = bVar2.f7512e;
            if (list != null && !list.isEmpty()) {
                Context context = bVar2.f7509a;
                if (context != null) {
                    f.f7664a = context;
                }
                final com.bykv.vk.openvk.preload.geckox.a aVar2 = new com.bykv.vk.openvk.preload.geckox.a(bVar2);
                final HashMap hashMap = new HashMap();
                LinkedList linkedList = new LinkedList();
                for (String str2 : set) {
                    linkedList.add(new CheckRequestBodyModel.TargetChannel(str2));
                }
                hashMap.put("cca47107bfcbdb211d88f3385aeede40", linkedList);
                if (!TextUtils.isEmpty("default")) {
                    if (aVar2.a()) {
                        if (aVar2.a(hashMap)) {
                            b.b().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1

                                /* renamed from: b */
                                final /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a f7486b = null;
                                final /* synthetic */ Map c = null;

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:126:0x062e  */
                                /* JADX WARN: Removed duplicated region for block: B:131:0x0668 A[Catch: all -> 0x067d, TryCatch #9 {all -> 0x067d, blocks: (B:129:0x0658, B:131:0x0668, B:133:0x066e, B:135:0x0678), top: B:147:0x0658 }] */
                                /* JADX WARN: Removed duplicated region for block: B:140:0x0683  */
                                /* JADX WARN: Type inference failed for: r26v3 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instructions count: 1691
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.a.AnonymousClass1.run():void");
                                }
                            });
                            return;
                        }
                        throw new IllegalArgumentException("target keys not in deployments keys");
                    }
                    throw new IllegalArgumentException("deployments keys not in local keys");
                }
                throw new IllegalArgumentException("groupType == null");
            }
            throw new IllegalArgumentException("access key empty");
        }
    }

    public void releaseGeckoResLoader(ILoader iLoader) {
        c.a();
        c.a(iLoader);
    }

    private GeckoHubImp() {
    }
}
