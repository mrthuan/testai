package com.bytedance.sdk.openadsdk.ABk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: BusMonitorCenter.java */
/* loaded from: classes.dex */
public class Qhi {
    private static Context CJ;

    /* renamed from: fl  reason: collision with root package name */
    private static final long f8444fl = System.currentTimeMillis();
    private cJ Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private Boolean f8445ac;
    private com.bytedance.sdk.openadsdk.ABk.ac.Qhi cJ;
    private int Tgh = 0;
    private Runnable ROR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ABk.Qhi.3
        @Override // java.lang.Runnable
        public void run() {
            int i10;
            String str;
            ArrayList arrayList;
            String str2 = "_id";
            try {
                SQLiteDatabase cJ = com.bytedance.sdk.openadsdk.ABk.Qhi.Qhi.cJ();
                if (cJ != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                    String str3 = "extra";
                    String[] strArr2 = {String.valueOf(Qhi.f8444fl)};
                    try {
                        int max = Math.max(10, Qhi.this.Qhi.getOnceLogCount());
                        if (max > 100) {
                            i10 = 10;
                        } else {
                            i10 = max;
                        }
                        int i11 = i10;
                        Cursor query = cJ.query("monitor_table", strArr, "timestamp <= ?", strArr2, null, null, null, String.valueOf(i10));
                        if (query != null) {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            while (query.moveToNext()) {
                                com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                if (query.getColumnIndex(str2) >= 0) {
                                    str = str2;
                                    arrayList = arrayList2;
                                    long j10 = query.getLong(query.getColumnIndex(str2));
                                    qhi.Qhi(j10);
                                    arrayList3.add(String.valueOf(j10));
                                } else {
                                    str = str2;
                                    arrayList = arrayList2;
                                }
                                if (query.getColumnIndex("sdk_version") >= 0) {
                                    qhi.Qhi(query.getString(query.getColumnIndex("sdk_version")));
                                }
                                if (query.getColumnIndex("scene") >= 0) {
                                    qhi.cJ(query.getString(query.getColumnIndex("scene")));
                                }
                                if (query.getColumnIndex("start_count") >= 0) {
                                    qhi.Qhi(query.getInt(query.getColumnIndex("start_count")));
                                }
                                if (query.getColumnIndex("success_count") >= 0) {
                                    qhi.cJ(query.getInt(query.getColumnIndex("success_count")));
                                }
                                if (query.getColumnIndex("fail_count") >= 0) {
                                    qhi.ac(query.getInt(query.getColumnIndex("fail_count")));
                                }
                                if (query.getColumnIndex("rit") >= 0) {
                                    qhi.ac(query.getString(query.getColumnIndex("rit")));
                                }
                                if (query.getColumnIndex("tag") >= 0) {
                                    qhi.CJ(query.getString(query.getColumnIndex("tag")));
                                }
                                if (query.getColumnIndex("label") >= 0) {
                                    qhi.fl(query.getString(query.getColumnIndex("label")));
                                }
                                if (query.getColumnIndex("mediation") >= 0) {
                                    qhi.Tgh(query.getString(query.getColumnIndex("mediation")));
                                }
                                if (query.getColumnIndex("is_init") >= 0) {
                                    qhi.CJ(query.getInt(query.getColumnIndex("is_init")));
                                }
                                String str4 = str3;
                                if (query.getColumnIndex(str4) >= 0) {
                                    qhi.ROR(query.getString(query.getColumnIndex(str4)));
                                }
                                ArrayList arrayList4 = arrayList;
                                arrayList4.add(qhi);
                                str3 = str4;
                                arrayList2 = arrayList4;
                                str2 = str;
                            }
                            ArrayList arrayList5 = arrayList2;
                            query.close();
                            if (!arrayList5.isEmpty()) {
                                Qhi.this.Qhi.onMonitorUpload(arrayList5);
                                SQLiteDatabase Qhi = com.bytedance.sdk.openadsdk.ABk.Qhi.Qhi.Qhi();
                                if (Qhi != null && Qhi.isOpen()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("_id IN (");
                                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                        sb2.append("?");
                                        if (i12 < arrayList3.size() - 1) {
                                            sb2.append(",");
                                        }
                                    }
                                    sb2.append(")");
                                    Qhi.delete("monitor_table", sb2.toString(), (String[]) arrayList3.toArray(new String[0]));
                                    if (Qhi.this.cJ != null) {
                                        Qhi.this.cJ.Qhi(Qhi.f8444fl);
                                    }
                                }
                                if (arrayList5.size() >= i11 && Qhi.this.Tgh <= 1000) {
                                    Qhi.this.Qhi(false);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th.getMessage();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    };

    private Qhi(cJ cJVar) {
        try {
            this.Qhi = new BusMonitorDependWrapper(cJVar);
            this.cJ = new com.bytedance.sdk.openadsdk.ABk.ac.Qhi(cJVar.getContext());
            CJ = cJVar.getContext();
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static /* synthetic */ int ac(Qhi qhi) {
        int i10 = qhi.Tgh;
        qhi.Tgh = i10 + 1;
        return i10;
    }

    private boolean ac() {
        if (this.f8445ac == null) {
            cJ cJVar = this.Qhi;
            if (cJVar != null && cJVar.getContext() != null && this.Qhi.getExecutorService() != null) {
                return true;
            }
        } else {
            cJ cJVar2 = this.Qhi;
            if (cJVar2 != null && cJVar2.getContext() != null && this.Qhi.isMonitorOpen() && this.Qhi.getExecutorService() != null) {
                return true;
            }
        }
        return false;
    }

    public static Qhi Qhi(cJ cJVar) {
        return new Qhi(cJVar);
    }

    public static Context Qhi() {
        Context context = CJ;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void Qhi(final fl flVar) {
        flVar.generatorModel().ac();
        if (ac()) {
            flVar.generatorModel().ac();
            this.Qhi.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ABk.Qhi.1
                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 574
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ABk.Qhi.AnonymousClass1.run():void");
                }
            });
        }
    }

    public void Qhi(final boolean z10) {
        cJ cJVar = this.Qhi;
        if (cJVar == null || cJVar.getHandler() == null || this.Qhi.getContext() == null || this.cJ == null || !this.Qhi.isMonitorOpen()) {
            return;
        }
        this.Qhi.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ABk.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Qhi.ac(Qhi.this);
                    if (z10) {
                        long Qhi = Qhi.this.cJ.Qhi();
                        if (Qhi == 0) {
                            Qhi.this.cJ.Qhi(System.currentTimeMillis());
                            return;
                        } else if (Qhi.f8444fl - Qhi < Qhi.this.Qhi.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (Qhi.this.Qhi.getExecutorService() != null) {
                        Qhi.this.Qhi.getExecutorService().execute(Qhi.this.ROR);
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }, Math.max(this.Qhi.getOnceLogInterval(), (int) Constants.CP_MAC_ROMAN));
    }
}
