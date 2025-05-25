package com.bykv.vk.openvk.preload.geckox.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.activity.r;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import java.io.File;
import java.io.FileFilter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: GetServerChannelVersionInterceptorMulti.java */
/* loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: g  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f7566g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Map<String, Object>> f7567h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f7568i;

    /* renamed from: j  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.e.a f7569j;

    /* renamed from: k  reason: collision with root package name */
    private String f7570k;

    /* renamed from: l  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.statistic.model.b f7571l = new com.bykv.vk.openvk.preload.geckox.statistic.model.b();

    /* compiled from: GetServerChannelVersionInterceptorMulti.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: GetServerChannelVersionInterceptorMulti.java */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* compiled from: GetServerChannelVersionInterceptorMulti.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.d.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0068c extends RuntimeException {
        public C0068c(String str, Throwable th2) {
            super(str, th2);
        }
    }

    private static void b(List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list) {
        if (list == null) {
            return;
        }
        for (Pair<String, com.bykv.vk.openvk.preload.geckox.g.a> pair : list) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.g.a) pair.second).a();
            } catch (Exception e10) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e10);
            }
        }
    }

    private List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.f7566g.f7521n, updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                    break;
                }
                com.bykv.vk.openvk.preload.geckox.g.a a10 = com.bykv.vk.openvk.preload.geckox.g.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (a10 != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), a10));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.e.a aVar = this.f7569j;
                    updatePackage.getChannel();
                }
            } catch (Exception e10) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e10);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.e.a aVar2 = this.f7569j;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f7566g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f7567h = (Map) objArr[1];
        this.f7568i = (Map) objArr[2];
        this.f7569j = (com.bykv.vk.openvk.preload.geckox.e.a) objArr[3];
        this.f7570k = (String) objArr[4];
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        com.bykv.vk.openvk.preload.geckox.b bVar = this.f7566g;
        Context context = bVar.f7509a;
        long longValue = bVar.f7515h.longValue();
        com.bykv.vk.openvk.preload.geckox.b bVar2 = this.f7566g;
        String str = bVar2.f7516i;
        String str2 = bVar2.f7517j;
        String b10 = com.bykv.vk.openvk.preload.geckox.utils.a.b(context);
        String a10 = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
        com.bykv.vk.openvk.preload.geckox.b bVar3 = this.f7566g;
        checkRequestBodyModel.setCommon(new Common(longValue, str, str2, b10, a10, bVar3.f7520m, bVar3.f7519l));
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        try {
            com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().f7555a;
            this.f7571l.f7652a = fVar.a(hashMap);
            checkRequestBodyModel.setLocal(hashMap);
            HashMap hashMap3 = new HashMap();
            for (String str3 : this.f7566g.f7512e) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f7570k;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map2 = this.f7568i;
                if (map2 != null && !map2.isEmpty() && (list = this.f7568i.get(str3)) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    group.targetChannels = arrayList;
                    arrayList.addAll(list);
                }
                hashMap3.put(str3, group);
            }
            this.f7571l.f7653b = fVar.a(hashMap3);
            checkRequestBodyModel.setDeployments(hashMap3);
            Map<String, Map<String, Object>> map3 = this.f7567h;
            if (map3 != null) {
                this.f7571l.c = fVar.a(map3);
                checkRequestBodyModel.setCustom(this.f7567h);
            }
            return fVar.a(checkRequestBodyModel);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) {
        List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list;
        char c = 2;
        int i10 = 0;
        char c10 = 1;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> a10 = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f7566g, this.f7571l);
        for (Map.Entry<String, List<UpdatePackage>> entry : a10.entrySet()) {
            Iterator<UpdatePackage> it = entry.getValue().iterator();
            while (it.hasNext()) {
                UpdatePackage next = it.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    Object[] objArr = new Object[5];
                    objArr[i10] = next.getChannel();
                    objArr[c10] = "rollback：";
                    objArr[c] = Long.valueOf(localVersion);
                    objArr[3] = "->";
                    objArr[4] = Long.valueOf(version);
                    GeckoLogger.d("gecko-debug-tag", objArr);
                    File[] listFiles = new File(this.f7566g.f7521n, next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (listFiles == null || listFiles.length == 0) {
                        c = 2;
                        c10 = 1;
                        i10 = 0;
                    } else {
                        int length = listFiles.length;
                        int i11 = i10;
                        while (i11 < length) {
                            File file = listFiles[i11];
                            try {
                                int i12 = (Long.parseLong(file.getName()) > version ? 1 : (Long.parseLong(file.getName()) == version ? 0 : -1));
                                if (i12 > 0) {
                                    final File file2 = new File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.c.a(file2);
                                        }
                                    });
                                } else if (i12 == 0) {
                                    it.remove();
                                }
                            } catch (Exception unused) {
                            }
                            i11++;
                            c = 2;
                            c10 = 1;
                            i10 = 0;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<UpdatePackage>> entry2 : a10.entrySet()) {
            arrayList.addAll(entry2.getValue());
        }
        Object obj = null;
        try {
            list = c(arrayList);
        } catch (Throwable th2) {
            th = th2;
            list = null;
        }
        try {
            obj = bVar.a((com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>>) arrayList);
            b(list);
            GeckoLogger.d("gecko-debug-tag", "all channel update finished");
        } catch (Throwable th3) {
            th = th3;
            try {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                b(list);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                a(arrayList);
                return obj;
            } catch (Throwable th4) {
                b(list);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                throw th4;
            }
        }
        a(arrayList);
        return obj;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.f7566g.f7521n, updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) {
        Object a10;
        String b10 = b(map);
        String g10 = r.g(new StringBuilder("https://"), this.f7566g.f7518k, "/gecko/server/v3/package");
        try {
            this.f7571l.f7656f = com.bykv.vk.openvk.preload.geckox.utils.h.a(this.f7566g.f7509a);
            Response doPost = this.f7566g.f7511d.doPost(g10, b10);
            com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar = this.f7571l;
            bVar.f7657g = doPost.code;
            bVar.f7654d = doPost.msg;
            Map<String, String> map2 = doPost.headers;
            String str = "";
            if (map2 != null && !map2.isEmpty()) {
                String str2 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str2)) {
                    str2 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str2)) {
                        String str3 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str3)) {
                            str = str3;
                        }
                    }
                }
                str = str2;
            }
            bVar.f7655e = str;
            if (doPost.code == 200) {
                String str4 = doPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str4);
                try {
                    Type type = new com.bykv.vk.openvk.preload.a.c.a<com.bykv.vk.openvk.preload.geckox.model.Response<ComponentModel>>() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.3
                    }.c;
                    com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().f7555a;
                    if (str4 == null) {
                        a10 = null;
                    } else {
                        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(new StringReader(str4));
                        aVar.f7368a = fVar.f7411j;
                        a10 = fVar.a(aVar, type);
                        com.bykv.vk.openvk.preload.a.f.a(a10, aVar);
                    }
                    com.bykv.vk.openvk.preload.geckox.model.Response response = (com.bykv.vk.openvk.preload.geckox.model.Response) a10;
                    int i10 = response.status;
                    if (i10 != 0) {
                        if (i10 == 2000) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.f7566g);
                            return new HashMap();
                        }
                        String str5 = "check update error，unknow status code，response.status：" + response.status;
                        com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2 = this.f7571l;
                        bVar2.f7654d = str5;
                        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f7566g, bVar2);
                        throw new a(str5);
                    }
                    T t4 = response.data;
                    if (t4 != 0) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f7566g.f7509a, ((ComponentModel) t4).getUniversalStrategies(), this.f7566g.f7521n, this.f7569j);
                        Map<String, List<UpdatePackage>> packages = ((ComponentModel) response.data).getPackages();
                        if (packages != null && !packages.isEmpty()) {
                            for (String str6 : this.f7566g.f7512e) {
                                List<UpdatePackage> list = packages.get(str6);
                                if (list != null && !list.isEmpty()) {
                                    for (UpdatePackage updatePackage : list) {
                                        updatePackage.setAccessKey(str6);
                                        updatePackage.setLocalVersion(a(map.get(str6), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f7566g);
                        return new HashMap();
                    }
                    com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar3 = this.f7571l;
                    bVar3.f7654d = "check update error：response.data==null";
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f7566g, bVar3);
                    throw new a("check update error：response.data==null");
                } catch (Throwable th2) {
                    this.f7571l.f7654d = "json parse failed：" + th2.getMessage();
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f7566g, this.f7571l);
                    StringBuilder g11 = b.a.g("json parse failed：", str4, " caused by:");
                    g11.append(th2.getMessage());
                    throw new b(g11.toString(), th2);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + g10);
        } catch (Exception e10) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f7566g, this.f7571l);
            StringBuilder g12 = b.a.g("request failed：url:", g10, ", caused by:");
            g12.append(e10.getMessage());
            throw new C0068c(g12.toString(), e10);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }
}
