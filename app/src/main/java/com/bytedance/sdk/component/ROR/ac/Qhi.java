package com.bytedance.sdk.component.ROR.ac;

import a6.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.ROR.CJ.WAv;
import com.bytedance.sdk.component.ROR.Qhi;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.kYc;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: AppConfig.java */
/* loaded from: classes.dex */
public class Qhi implements CQU.Qhi {
    private static boolean Sf;
    private static ThreadPoolExecutor WAv;

    /* renamed from: hm  reason: collision with root package name */
    private static ac f8003hm;
    private final boolean cJ;
    private com.bytedance.sdk.component.ROR.Qhi iMK;
    private int pA;

    /* renamed from: zc  reason: collision with root package name */
    private final Context f8006zc;

    /* renamed from: ac  reason: collision with root package name */
    private volatile boolean f8004ac = false;
    private boolean CJ = true;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8005fl = false;
    private long Tgh = 0;
    private long ROR = 0;
    private AtomicBoolean Gm = new AtomicBoolean(false);
    private volatile boolean ABk = false;
    final CQU Qhi = com.bytedance.sdk.component.Sf.Qhi.Qhi.Qhi().Qhi(this, "tt-net");

    public Qhi(Context context, int i10) {
        this.f8006zc = context;
        this.cJ = kYc.Qhi(context);
        this.pA = i10;
    }

    private void CJ(boolean z10) {
        if (this.f8005fl) {
            return;
        }
        if (this.CJ) {
            this.CJ = false;
            this.Tgh = 0L;
            this.ROR = 0L;
        }
        long j10 = z10 ? 360000L : 43200000L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.Tgh > j10) {
            if (currentTimeMillis - this.ROR > 120000 || !this.ABk) {
                ac();
            }
        }
    }

    public static ExecutorService ROR() {
        ExecutorService executorService;
        ac acVar = f8003hm;
        if (acVar != null) {
            executorService = acVar.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (WAv == null) {
            synchronized (Qhi.class) {
                if (WAv == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    WAv = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return WAv;
    }

    private boolean Sf() {
        String[] Tgh = Tgh();
        if (Tgh != null && Tgh.length != 0) {
            Qhi(0);
        }
        return false;
    }

    private com.bytedance.sdk.component.ROR.Qhi hm() {
        if (this.iMK == null) {
            Qhi.C0078Qhi c0078Qhi = new Qhi.C0078Qhi();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.iMK = c0078Qhi.Qhi(10L, timeUnit).cJ(10L, timeUnit).ac(10L, timeUnit).Qhi();
        }
        return this.iMK;
    }

    public String[] Tgh() {
        String[] strArr;
        if (hm.Qhi().Qhi(this.pA).CJ() != null) {
            strArr = hm.Qhi().Qhi(this.pA).CJ().Tgh();
        } else {
            strArr = null;
        }
        if (strArr == null || strArr.length <= 0) {
            return new String[0];
        }
        return strArr;
    }

    public boolean ac() {
        this.Gm.get();
        ROR().execute(new Runnable() { // from class: com.bytedance.sdk.component.ROR.ac.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                boolean Qhi = WAv.Qhi(Qhi.this.f8006zc);
                if (Qhi) {
                    Qhi.this.ROR = System.currentTimeMillis();
                    if (!Qhi.this.Gm.compareAndSet(false, true)) {
                        return;
                    }
                    Qhi.this.ac(Qhi);
                }
            }
        });
        return true;
    }

    public void fl() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.cJ) {
                CJ();
            } else {
                cJ();
            }
        } catch (Throwable unused) {
        }
    }

    public static void cJ(boolean z10) {
        Sf = z10;
    }

    public void ac(boolean z10) {
        CJ();
        this.f8005fl = true;
        if (!z10) {
            this.Qhi.sendEmptyMessage(102);
            return;
        }
        try {
            Sf();
        } catch (Exception unused) {
            this.Gm.set(false);
        }
    }

    public synchronized void cJ() {
        if (System.currentTimeMillis() - this.Tgh > 3600000) {
            this.Tgh = System.currentTimeMillis();
            try {
                if (hm.Qhi().Qhi(this.pA).Sf() != null) {
                    hm.Qhi().Qhi(this.pA).Sf().cJ();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void Qhi() {
        Qhi(false);
    }

    public synchronized void Qhi(boolean z10) {
        if (this.cJ) {
            CJ(z10);
            return;
        }
        if (this.Tgh <= 0) {
            try {
                ROR().execute(new Runnable() { // from class: com.bytedance.sdk.component.ROR.ac.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi.this.cJ();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void CJ() {
        if (this.ABk) {
            return;
        }
        this.ABk = true;
        long j10 = this.f8006zc.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j10 > currentTimeMillis) {
            j10 = currentTimeMillis;
        }
        this.Tgh = j10;
        try {
            if (hm.Qhi().Qhi(this.pA).Sf() != null) {
                hm.Qhi().Qhi(this.pA).Sf().Qhi();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(int i10) {
        CQU cqu = this.Qhi;
        if (cqu != null) {
            cqu.sendEmptyMessage(i10);
        }
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        int i10 = message.what;
        if (i10 == 101) {
            this.f8005fl = false;
            this.Tgh = System.currentTimeMillis();
            if (this.CJ) {
                Qhi();
            }
            this.Gm.set(false);
        } else if (i10 != 102) {
        } else {
            this.f8005fl = false;
            if (this.CJ) {
                Qhi();
            }
            this.Gm.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString(PglCryptUtils.KEY_MESSAGE))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.f8006zc.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (hm.Qhi().Qhi(this.pA).Sf() != null) {
            hm.Qhi().Qhi(this.pA).Sf().Qhi(jSONObject2);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final int i10) {
        String[] Tgh = Tgh();
        if (Tgh != null && Tgh.length > i10) {
            String str = Tgh[i10];
            if (TextUtils.isEmpty(str)) {
                cJ(102);
                return;
            }
            try {
                String Qhi = Qhi(str);
                if (TextUtils.isEmpty(Qhi)) {
                    cJ(102);
                    return;
                }
                com.bytedance.sdk.component.ROR.cJ.cJ ac2 = hm().ac();
                ac2.cJ(Qhi);
                Qhi(ac2);
                ac2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.component.ROR.ac.Qhi.3
                    @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                    public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                        JSONObject jSONObject;
                        if (cJVar != null && cJVar.Tgh()) {
                            String str2 = null;
                            try {
                                jSONObject = new JSONObject(cJVar.CJ());
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            if (jSONObject == null) {
                                Qhi.this.Qhi(i10 + 1);
                                return;
                            }
                            try {
                                str2 = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
                            } catch (Exception unused2) {
                            }
                            if (!"success".equals(str2)) {
                                Qhi.this.Qhi(i10 + 1);
                                return;
                            }
                            try {
                                if (Qhi.this.Qhi(jSONObject)) {
                                    Qhi.this.cJ(101);
                                    return;
                                } else {
                                    Qhi.this.Qhi(i10 + 1);
                                    return;
                                }
                            } catch (Exception unused3) {
                                return;
                            }
                        }
                        Qhi.this.Qhi(i10 + 1);
                    }

                    @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                    public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                        Qhi.this.Qhi(i10 + 1);
                    }
                });
                return;
            } catch (Throwable th2) {
                th2.toString();
                return;
            }
        }
        cJ(102);
    }

    private String Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return h.d("https://", str, "/get_domains/v4/");
    }

    private void Qhi(com.bytedance.sdk.component.ROR.cJ.cJ cJVar) {
        if (cJVar == null) {
            return;
        }
        Address Qhi = hm.Qhi().Qhi(this.pA).CJ() != null ? hm.Qhi().Qhi(this.pA).CJ().Qhi(this.f8006zc) : null;
        if (Qhi != null && Qhi.hasLatitude() && Qhi.hasLongitude()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Qhi.getLatitude());
            cJVar.Qhi("latitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Qhi.getLongitude());
            cJVar.Qhi("longitude", sb3.toString());
            String locality = Qhi.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                cJVar.Qhi("city", Uri.encode(locality));
            }
        }
        if (this.f8004ac) {
            cJVar.Qhi("force", "1");
        }
        try {
            cJVar.Qhi("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (hm.Qhi().Qhi(this.pA).CJ() != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(hm.Qhi().Qhi(this.pA).CJ().Qhi());
            cJVar.Qhi("aid", sb4.toString());
            cJVar.Qhi("device_platform", hm.Qhi().Qhi(this.pA).CJ().ac());
            cJVar.Qhi("channel", hm.Qhi().Qhi(this.pA).CJ().cJ());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(hm.Qhi().Qhi(this.pA).CJ().CJ());
            cJVar.Qhi("version_code", sb5.toString());
            cJVar.Qhi("custom_info_1", hm.Qhi().Qhi(this.pA).CJ().fl());
        }
    }

    public static void Qhi(ac acVar) {
        f8003hm = acVar;
    }
}
