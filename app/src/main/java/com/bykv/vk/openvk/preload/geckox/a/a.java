package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import androidx.activity.r;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AbandonChannelClenUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AbandonChannelClenUtils.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0066a {

        /* renamed from: a  reason: collision with root package name */
        String f7491a;

        /* renamed from: b  reason: collision with root package name */
        String f7492b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        long f7493d;

        /* renamed from: e  reason: collision with root package name */
        File f7494e;

        public C0066a(String str, String str2, int i10, long j10, File file) {
            this.f7491a = str;
            this.f7492b = str2;
            this.c = i10;
            this.f7493d = j10;
            this.f7494e = file;
        }
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, final com.bykv.vk.openvk.preload.geckox.e.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        File file2;
        List<Long> b10;
        File file3;
        Iterator<Long> it3;
        List<Long> b11;
        Iterator<Map.Entry<String, ComponentModel.b>> it4;
        Iterator<ComponentModel.a> it5;
        File file4;
        String str;
        File file5;
        List<Long> list2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it6 = map.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it6.next();
                String key = next.getKey();
                File file6 = new File(file, key);
                if (file6.isDirectory() && (value = next.getValue()) != null && (list = value.f7616a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list3 = value.f7616a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it7 = list3.iterator();
                    while (it7.hasNext()) {
                        ComponentModel.a next2 = it7.next();
                        String str2 = next2.f7614a;
                        if (!hashSet.contains(str2)) {
                            hashSet.add(str2);
                            int i10 = next2.f7615b;
                            List<Long> list4 = next2.c;
                            File file7 = new File(file6, str2);
                            String str3 = "--pending-delete";
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        File file8 = new File(file6, str2);
                                        File file9 = new File(file6, str2 + "--pending-delete");
                                        file8.renameTo(file9);
                                        arrayList.add(new C0066a(key, str2, i10, 0L, file9));
                                    }
                                } else if (list4 != null && (b11 = j.b(file7)) != null && !b11.isEmpty()) {
                                    for (Long l10 : b11) {
                                        if (list4.get(0).longValue() > l10.longValue()) {
                                            File file10 = new File(file7, l10 + str3);
                                            new File(file7, String.valueOf(l10)).renameTo(file10);
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list2 = list4;
                                            arrayList.add(new C0066a(key, str2, i10, l10.longValue(), file10));
                                        } else {
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list2 = list4;
                                        }
                                        it6 = it4;
                                        str3 = str;
                                        list4 = list2;
                                        file6 = file5;
                                        file7 = file4;
                                        it7 = it5;
                                    }
                                }
                                it = it6;
                                it2 = it7;
                                file2 = file6;
                            } else {
                                it = it6;
                                it2 = it7;
                                File file11 = file7;
                                file2 = file6;
                                if (list4 != null && (b10 = j.b(file11)) != null && !b10.isEmpty()) {
                                    Iterator<Long> it8 = b10.iterator();
                                    while (it8.hasNext()) {
                                        Long next3 = it8.next();
                                        if (list4.contains(next3)) {
                                            File file12 = file11;
                                            File file13 = new File(file12, next3 + "--pending-delete");
                                            new File(file12, String.valueOf(next3)).renameTo(file13);
                                            it3 = it8;
                                            file3 = file12;
                                            arrayList.add(new C0066a(key, str2, i10, next3.longValue(), file13));
                                        } else {
                                            file3 = file11;
                                            it3 = it8;
                                        }
                                        it8 = it3;
                                        file11 = file3;
                                    }
                                }
                            }
                            it6 = it;
                            file6 = file2;
                            it7 = it2;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0066a> list5 = arrayList;
                    if (list5 != null && !list5.isEmpty()) {
                        for (C0066a c0066a : list5) {
                            File file14 = c0066a.f7494e;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            boolean a10 = com.bykv.vk.openvk.preload.geckox.utils.c.a(file14);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (a10) {
                                b.a(context2).a(c0066a.f7491a, c0066a.f7492b, c0066a.c, 200, c0066a.f7493d, 0, null, uptimeMillis2 - uptimeMillis);
                            } else {
                                b.a(context2).a(c0066a.f7491a, c0066a.f7492b, c0066a.c, 201, c0066a.f7493d, 601, "delete failed", uptimeMillis2 - uptimeMillis);
                            }
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
                }
            }
        });
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.f7522o) {
            Common common = new Common(bVar.f7515h.longValue(), bVar.f7516i, bVar.f7517j, com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.f7509a), h.a(bVar.f7509a), bVar.f7520m, bVar.f7519l);
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.f7509a).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String g10 = r.g(new StringBuilder("https://"), bVar.f7518k, "/gecko/server/packages/stats");
            try {
                Response doPost = bVar.f7511d.doPost(g10, com.bykv.vk.openvk.preload.geckox.c.b.a().f7555a.a(statisticModel));
                if (doPost.code == 200) {
                    if (new JSONObject(doPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                    return;
                }
                throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + g10);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
