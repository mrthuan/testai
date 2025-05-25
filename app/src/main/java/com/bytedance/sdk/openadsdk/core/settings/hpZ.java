package com.bytedance.sdk.openadsdk.core.settings;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.settings.Tgh;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: SettingsPropRepository.java */
/* loaded from: classes.dex */
public abstract class hpZ implements Tgh {
    private final String ROR;
    private Qhi WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f9174ac = new ConcurrentHashMap<>();
    private final Object CJ = new Object();

    /* renamed from: fl  reason: collision with root package name */
    private final Object f9175fl = new Object();
    private final CountDownLatch Tgh = new CountDownLatch(1);
    private Properties Sf = new Properties();

    /* renamed from: hm  reason: collision with root package name */
    private volatile boolean f9176hm = false;

    /* compiled from: SettingsPropRepository.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void cJ();
    }

    public hpZ(String str, Qhi qhi) {
        this.ROR = str;
        this.WAv = qhi;
        lG.Qhi(new com.bytedance.sdk.component.Sf.hm("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.hpZ.1
            @Override // java.lang.Runnable
            public void run() {
                hpZ.this.Qhi(false);
            }
        });
    }

    private File Tgh() {
        return new File(com.bytedance.sdk.openadsdk.core.HzH.Qhi().getFilesDir(), this.ROR);
    }

    private void fl() {
        int i10;
        if (!this.f9176hm) {
            try {
                SystemClock.elapsedRealtime();
                if (lG.fl()) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                this.Tgh.await(i10, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
            }
        }
    }

    public void CJ() {
        Qhi qhi = this.WAv;
        if (qhi != null) {
            qhi.cJ();
        }
    }

    public void ac() {
        File Tgh = Tgh();
        if (Tgh.exists()) {
            Tgh.delete();
        }
    }

    public String Qhi(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        fl();
        return this.Sf.getProperty(str, str2);
    }

    public boolean cJ() {
        return this.f9176hm;
    }

    public int Qhi(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            fl();
            try {
                return Integer.parseInt(this.Sf.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long Qhi(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            fl();
            try {
                return Long.parseLong(this.Sf.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float Qhi(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            fl();
            try {
                return Float.parseFloat(this.Sf.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    /* compiled from: SettingsPropRepository.java */
    /* loaded from: classes.dex */
    public class cJ implements Tgh.Qhi {
        private final Map<String, Object> cJ = new HashMap();

        /* renamed from: ac  reason: collision with root package name */
        private final Object f9177ac = new Object();

        public cJ() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public void Qhi() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.f9177ac) {
                properties.putAll(hpZ.this.Sf);
                boolean z10 = false;
                for (Map.Entry<String, Object> entry : this.cJ.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != this && value != null) {
                        if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        }
                    }
                    if (properties.containsKey(key)) {
                        properties.remove(key);
                        z10 = true;
                    }
                }
                this.cJ.clear();
                if (z10) {
                    hpZ.this.Qhi(properties);
                    hpZ.this.Sf = properties;
                    hpZ.this.f9174ac.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public Tgh.Qhi Qhi(String str, String str2) {
            synchronized (this.f9177ac) {
                this.cJ.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public Tgh.Qhi Qhi(String str, int i10) {
            synchronized (this.f9177ac) {
                this.cJ.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public Tgh.Qhi Qhi(String str, long j10) {
            synchronized (this.f9177ac) {
                this.cJ.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public Tgh.Qhi Qhi(String str) {
            synchronized (this.f9177ac) {
                this.cJ.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public Tgh.Qhi Qhi(String str, float f10) {
            synchronized (this.f9177ac) {
                this.cJ.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.Qhi
        public Tgh.Qhi Qhi(String str, boolean z10) {
            synchronized (this.f9177ac) {
                this.cJ.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean Qhi(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            fl();
            try {
                return Boolean.parseBoolean(this.Sf.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[Catch: all -> 0x0108, TryCatch #5 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000b, B:11:0x0016, B:17:0x0042, B:18:0x0047, B:60:0x00f4, B:62:0x00f8, B:64:0x00fc, B:65:0x00ff, B:66:0x0106, B:26:0x005b, B:27:0x005e, B:36:0x0071, B:37:0x0074, B:42:0x0082, B:44:0x008c, B:46:0x0096, B:48:0x00ab, B:49:0x00bb, B:51:0x00c1, B:53:0x00d3, B:56:0x00db, B:58:0x00e6, B:59:0x00e9, B:24:0x0052, B:31:0x0063), top: B:79:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(boolean r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.hpZ.Qhi(boolean):void");
    }

    public Tgh.Qhi Qhi() {
        return new cJ();
    }

    public <T> T Qhi(String str, T t4, Tgh.cJ<T> cJVar) {
        T cJ2;
        if (str != null && !str.isEmpty()) {
            if (this.f9174ac.containsKey(str)) {
                try {
                    return (T) this.f9174ac.get(str);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "", e10);
                    return t4;
                }
            }
            fl();
            String property = this.Sf.getProperty(str, null);
            if (property != null && cJVar != null && (cJ2 = cJVar.cJ(property)) != null) {
                this.f9174ac.put(str, cJ2);
                return cJ2;
            }
        }
        return t4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(Properties properties) {
        synchronized (this.f9175fl) {
            File Tgh = Tgh();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(Tgh);
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        Tgh.getAbsolutePath();
                        com.bytedance.sdk.openadsdk.utils.Gm.Qhi(fileOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        com.bytedance.sdk.component.utils.ABk.Qhi("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.Gm.Qhi(fileOutputStream);
                        }
                        HzH.SNp();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.Gm.Qhi(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        HzH.SNp();
    }
}
