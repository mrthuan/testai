package com.bykv.vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import java.util.Map;

/* compiled from: UpdateListeners.java */
/* loaded from: classes.dex */
public final class b {
    public static com.bykv.vk.openvk.preload.b.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar) {
                super.a(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f7523p.put(dVar.getClass().getSimpleName().concat("onStart"), "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f7523p.put(dVar.getClass().getSimpleName().concat("onEnd"), "");
                    if ((dVar instanceof e) && (dVar.c instanceof Map)) {
                        com.bykv.vk.openvk.preload.geckox.b.this.f7523p.put(dVar.getClass().getSimpleName(), ((Map) dVar.c).get("cca47107bfcbdb211d88f3385aeede40"));
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                try {
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.f7457f));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar, Throwable th2) {
                super.a(bVar2, dVar, th2);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f7523p.put(dVar.getClass().getSimpleName().concat("onException"), th2.toString());
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.f7457f));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar, Throwable th2) {
                super.b(bVar2, dVar, th2);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f7523p.put(dVar.getClass().getSimpleName().concat("onChainException"), th2.toString());
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.f7457f));
                } catch (Throwable unused) {
                }
            }
        };
    }

    public static com.bykv.vk.openvk.preload.b.b.a b(final Context context) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) pair.second).getChannel());
                a10.f7629d = ((Uri) pair.first).toString();
                a10.f7641p = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
                a10.f7631f = SystemClock.uptimeMillis();
                a10.f7642q = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                a10.f7643r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a10.c = ((UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar.b(h.class)).second).getChannel());
                a10.f7633h = true;
                a10.f7632g = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th2) {
                super.a(bVar, dVar, th2);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a10.f7633h = false;
                a10.f7632g = SystemClock.uptimeMillis();
                a10.f7630e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th2.getMessage()));
            }
        };
    }

    public static com.bykv.vk.openvk.preload.b.b.a a(final Context context) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) pair.second).getChannel());
                a10.f7647v = ((Uri) pair.first).toString();
                a10.f7641p = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
                a10.f7649x = SystemClock.uptimeMillis();
                a10.f7643r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a10.c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    a10.f7627a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                a10.f7628b = ((UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar.b(g.class)).second).getChannel());
                a10.B = true;
                a10.f7650y = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th2) {
                super.a(bVar, dVar, th2);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a10.B = false;
                a10.f7650y = SystemClock.uptimeMillis();
                a10.f7648w.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th2.getMessage()));
            }
        };
    }
}
