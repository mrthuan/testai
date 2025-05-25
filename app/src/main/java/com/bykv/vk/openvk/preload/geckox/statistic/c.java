package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.r;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: UploadStatistic.java */
/* loaded from: classes.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        List<StatisticModel.PackageStatisticModel> list;
        StatisticModel b10 = b(bVar, aVar);
        if (b10 == null || (list = b10.packages) == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitor = bVar.c;
        if (iStatisticMonitor != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel : list) {
                    iStatisticMonitor.upload("geckosdk_update_stats", a(packageStatisticModel, b10.common));
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.f7522o) {
            try {
                String a10 = com.bykv.vk.openvk.preload.geckox.c.b.a().f7555a.a(b10);
                if (TextUtils.isEmpty(a10)) {
                    return;
                }
                a(bVar, a10);
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject b(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", bVar.f7517j);
        jSONObject.put("os", 0);
        jSONObject.put("app_version", bVar.f7516i);
        jSONObject.put("api_version", "v3");
        jSONObject.put("aid", bVar.f7515h.longValue());
        jSONObject.put("x_tt_logid", bVar2.f7655e);
        jSONObject.put("http_status", bVar2.f7657g);
        jSONObject.put("err_msg", bVar2.f7654d);
        if (TextUtils.isEmpty(bVar2.f7655e)) {
            jSONObject.put("deployments_info", bVar2.f7653b);
            jSONObject.put("local_info", bVar2.f7652a);
            jSONObject.put("custom_info", bVar2.c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        jSONObject.put("os_version", sb2.toString());
        jSONObject.put("device_platform", "android");
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("ac", bVar2.f7656f);
        return jSONObject;
    }

    private static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, final String str) {
        final String g10 = r.g(new StringBuilder("https://"), bVar.f7518k, "/gecko/server/packages/stats");
        com.bykv.vk.openvk.preload.geckox.b.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
            @Override // java.lang.Runnable
            public final void run() {
                Response doPost;
                for (int i10 = 0; i10 < 3; i10++) {
                    try {
                        doPost = com.bykv.vk.openvk.preload.geckox.b.this.f7511d.doPost(g10, str);
                    } catch (Exception e10) {
                        GeckoLogger.w("gecko-debug-tag", "upload statistic:", e10);
                    }
                    if (doPost.code == 200) {
                        if (new JSONObject(doPost.body).getInt("status") == 0) {
                            return;
                        }
                    } else {
                        throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + g10);
                        break;
                    }
                }
            }
        });
    }

    private static JSONObject a(StatisticModel.PackageStatisticModel packageStatisticModel, Common common) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("region", common.region);
        jSONObject.put("err_code", packageStatisticModel.errCode);
        jSONObject.put("err_msg", packageStatisticModel.errMsg);
        jSONObject.put("sdk_version", common.sdkVersion);
        jSONObject.put("access_key", packageStatisticModel.accessKey);
        jSONObject.put("stats_type", packageStatisticModel.statsType);
        jSONObject.put("device_id", common.deviceId);
        Long l10 = packageStatisticModel.patchId;
        jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
        jSONObject.put("group_name", packageStatisticModel.groupName);
        jSONObject.put("os", common.os);
        jSONObject.put("app_version", common.appVersion);
        jSONObject.put("device_model", common.deviceModel);
        jSONObject.put("channel", packageStatisticModel.channel);
        Long l11 = packageStatisticModel.f7626id;
        jSONObject.put(FacebookMediationAdapter.KEY_ID, l11 == null ? 0L : l11.longValue());
        jSONObject.put("ac", common.f7613ac);
        Integer num = packageStatisticModel.downloadRetryTimes;
        jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
        String str = packageStatisticModel.downloadUrl;
        if (str == null) {
            str = "";
        }
        jSONObject.put("download_url", str);
        jSONObject.put("download_duration", packageStatisticModel.downloadDuration);
        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = packageStatisticModel.downloadFailRecords;
        jSONObject.put("download_fail_records", list != null ? list : "");
        jSONObject.put("log_id", packageStatisticModel.logId);
        Long l12 = packageStatisticModel.activeCheckDuration;
        jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
        Long l13 = packageStatisticModel.applyDuration;
        jSONObject.put("apply_duration", l13 != null ? l13.longValue() : 0L);
        return jSONObject;
    }

    private static StatisticModel b(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f7629d != null || aVar2.f7631f != 0) {
                if (aVar2.f7633h && aVar2.f7634i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f7628b;
                    packageStatisticModel.accessKey = aVar2.f7627a;
                    packageStatisticModel.channel = aVar2.c;
                    packageStatisticModel.f7625ac = aVar2.f7641p;
                    packageStatisticModel.f7626id = aVar2.f7643r;
                    packageStatisticModel.patchId = aVar2.f7642q;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f7630e);
                    packageStatisticModel.downloadUrl = aVar2.f7629d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f7630e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f7632g - aVar2.f7631f);
                    if (!aVar2.f7635j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f7645t;
                        packageStatisticModel2.f7625ac = aVar2.f7641p;
                        packageStatisticModel2.patchId = aVar2.f7642q;
                        packageStatisticModel2.f7626id = aVar2.f7643r;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f7630e);
                        packageStatisticModel2.downloadUrl = aVar2.f7629d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f7630e);
                    } else if (aVar2.f7636k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f7627a;
                        packageStatisticModel3.groupName = aVar2.f7628b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f7642q;
                        packageStatisticModel3.f7626id = aVar2.f7643r;
                        packageStatisticModel3.channel = aVar2.c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f7639n - aVar2.f7632g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f7640o - aVar2.f7639n);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f7627a;
                        packageStatisticModel4.groupName = aVar2.f7628b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.c;
                        packageStatisticModel4.patchId = aVar2.f7642q;
                        packageStatisticModel4.f7626id = aVar2.f7643r;
                        packageStatisticModel4.errMsg = aVar2.f7646u;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f7627a;
                    packageStatisticModel5.groupName = aVar2.f7628b;
                    packageStatisticModel5.channel = aVar2.c;
                    packageStatisticModel5.f7625ac = aVar2.f7641p;
                    packageStatisticModel5.patchId = aVar2.f7642q;
                    packageStatisticModel5.f7626id = aVar2.f7643r;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f7630e);
                    packageStatisticModel5.downloadUrl = aVar2.f7629d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f7630e);
                    if (!aVar2.f7633h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f7630e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f7630e.get(0).reason;
                        }
                    } else if (!aVar2.f7634i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f7644s;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context context = bVar.f7509a;
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.b.a(context).a());
        if (arrayList.isEmpty()) {
            return null;
        }
        Common common = new Common(bVar.f7515h.longValue(), bVar.f7516i, bVar.f7517j, com.bykv.vk.openvk.preload.geckox.utils.a.b(context), h.a(context), bVar.f7520m, bVar.f7519l);
        StatisticModel statisticModel = new StatisticModel();
        statisticModel.common = common;
        statisticModel.packages = arrayList;
        String uuid = UUID.randomUUID().toString();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((StatisticModel.PackageStatisticModel) it.next()).logId = uuid;
        }
        return statisticModel;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.B && aVar.C) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f7627a;
            packageStatisticModel.groupName = aVar.f7628b;
            packageStatisticModel.channel = aVar.c;
            packageStatisticModel.f7625ac = aVar.f7641p;
            packageStatisticModel.f7626id = aVar.f7643r;
            packageStatisticModel.downloadRetryTimes = a(aVar.f7648w);
            packageStatisticModel.downloadUrl = aVar.f7647v;
            packageStatisticModel.downloadFailRecords = b(aVar.f7648w);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f7650y - aVar.f7649x);
            if (aVar.D) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f7627a;
                packageStatisticModel2.groupName = aVar.f7628b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f7626id = aVar.f7643r;
                packageStatisticModel2.channel = aVar.c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f7651z - aVar.f7650y);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.A - aVar.f7651z);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f7627a;
            packageStatisticModel3.groupName = aVar.f7628b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f7626id = aVar.f7643r;
            packageStatisticModel3.channel = aVar.c;
            packageStatisticModel3.errMsg = aVar.F;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f7627a;
        packageStatisticModel4.groupName = aVar.f7628b;
        packageStatisticModel4.channel = aVar.c;
        packageStatisticModel4.f7625ac = aVar.f7641p;
        packageStatisticModel4.f7626id = aVar.f7643r;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f7648w);
        packageStatisticModel4.downloadUrl = aVar.f7647v;
        packageStatisticModel4.downloadFailRecords = b(aVar.f7648w);
        if (!aVar.B) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f7648w;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f7648w.get(0).reason;
        } else if (aVar.C) {
        } else {
            packageStatisticModel4.errCode = "450";
            packageStatisticModel4.errMsg = aVar.E;
        }
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) {
        IStatisticMonitor iStatisticMonitor = bVar.c;
        if (iStatisticMonitor != null) {
            try {
                iStatisticMonitor.upload("geckosdk_query_pkgs", b(bVar, bVar2));
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }
}
