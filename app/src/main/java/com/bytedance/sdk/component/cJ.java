package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: TTPropHelper.java */
/* loaded from: classes.dex */
public class cJ {
    private static Qhi ABk = null;
    private static ArrayMap<String, File> Gm = null;
    private static boolean Qhi = false;

    /* renamed from: zc  reason: collision with root package name */
    private static ArrayMap<File, cJ> f8329zc;
    private Properties CJ;
    private long ROR;
    private long Sf;
    private int Tgh;
    private final File WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Object f8330ac;
    private final Object cJ;

    /* renamed from: fl  reason: collision with root package name */
    private volatile boolean f8331fl;

    /* renamed from: hm  reason: collision with root package name */
    private final File f8332hm;

    /* compiled from: TTPropHelper.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        ExecutorService getExecutorService();
    }

    /* compiled from: TTPropHelper.java */
    /* renamed from: com.bytedance.sdk.component.cJ$cJ  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0095cJ {
        volatile boolean CJ;
        final long Qhi;

        /* renamed from: ac  reason: collision with root package name */
        final CountDownLatch f8368ac;
        final Properties cJ;

        /* renamed from: fl  reason: collision with root package name */
        boolean f8369fl;

        public void Qhi(boolean z10, boolean z11) {
            this.f8369fl = z10;
            this.CJ = z11;
            this.f8368ac.countDown();
        }

        private C0095cJ(long j10, Properties properties) {
            this.f8368ac = new CountDownLatch(1);
            this.CJ = false;
            this.f8369fl = false;
            this.Qhi = j10;
            this.cJ = properties;
        }
    }

    private cJ(File file) {
        Object obj = new Object();
        this.cJ = obj;
        this.f8330ac = new Object();
        this.CJ = new Properties();
        this.f8331fl = false;
        this.Tgh = 0;
        this.f8332hm = file;
        this.WAv = Qhi(file);
        synchronized (obj) {
            this.f8331fl = false;
        }
        Qhi qhi = ABk;
        if (qhi != null && qhi.getExecutorService() != null) {
            ABk.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.cJ.2
                @Override // java.lang.Runnable
                public void run() {
                    cJ.this.Qhi();
                }
            });
        } else {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.cJ.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    cJ.this.Qhi();
                }
            }.start();
        }
    }

    public static /* synthetic */ long Tgh(cJ cJVar) {
        long j10 = cJVar.ROR;
        cJVar.ROR = 1 + j10;
        return j10;
    }

    public static /* synthetic */ int fl(cJ cJVar) {
        int i10 = cJVar.Tgh;
        cJVar.Tgh = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int hm(cJ cJVar) {
        int i10 = cJVar.Tgh;
        cJVar.Tgh = i10 - 1;
        return i10;
    }

    private void CJ() {
        while (!this.f8331fl) {
            try {
                this.cJ.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public ac cJ() {
        return new ac();
    }

    /* compiled from: TTPropHelper.java */
    /* loaded from: classes.dex */
    public class ac implements SharedPreferences.Editor {
        private final Object cJ = new Object();

        /* renamed from: ac  reason: collision with root package name */
        private final Map<String, Object> f8367ac = new HashMap();
        private boolean CJ = false;

        public ac() {
        }

        private C0095cJ cJ() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (cJ.this.cJ) {
                if (cJ.this.Tgh > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(cJ.this.CJ);
                    cJ.this.CJ = properties2;
                }
                properties = cJ.this.CJ;
                cJ.fl(cJ.this);
                synchronized (this.cJ) {
                    boolean z11 = false;
                    if (this.CJ) {
                        if (!properties.isEmpty()) {
                            properties.clear();
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.CJ = false;
                        z11 = z10;
                    }
                    for (Map.Entry<String, Object> entry : this.f8367ac.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z11 = true;
                            }
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z11 = true;
                        }
                    }
                    this.f8367ac.clear();
                    if (z11) {
                        cJ.Tgh(cJ.this);
                    }
                    j10 = cJ.this.ROR;
                }
            }
            return new C0095cJ(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac putStringSet(String str, Set<String> set) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            cJ.this.Qhi(cJ(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            if (cJ.Qhi) {
                System.currentTimeMillis();
            }
            C0095cJ cJ = cJ();
            cJ.this.Qhi(cJ, true);
            try {
                cJ.f8368ac.await();
                if (cJ.Qhi) {
                    cJ.this.f8332hm.getName();
                    System.currentTimeMillis();
                }
                return cJ.CJ;
            } catch (InterruptedException unused) {
                if (cJ.Qhi) {
                    cJ.this.f8332hm.getName();
                    long j10 = cJ.Qhi;
                    System.currentTimeMillis();
                    return false;
                }
                return false;
            } catch (Throwable th2) {
                if (cJ.Qhi) {
                    cJ.this.f8332hm.getName();
                    long j11 = cJ.Qhi;
                    System.currentTimeMillis();
                }
                throw th2;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac putInt(String str, int i10) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac putLong(String str, long j10) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac putFloat(String str, float f10) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac putString(String str, String str2) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac putBoolean(String str, boolean z10) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac remove(String str) {
            synchronized (this.cJ) {
                this.f8367ac.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: Qhi */
        public ac clear() {
            synchronized (this.cJ) {
                this.CJ = true;
            }
            return this;
        }
    }

    public static void Qhi(Qhi qhi) {
        ABk = qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0 A[Catch: all -> 0x00d5, TryCatch #4 {all -> 0x00d5, blocks: (B:38:0x006a, B:39:0x006c, B:65:0x00ac, B:67:0x00b0, B:68:0x00b3, B:70:0x00bc, B:71:0x00bf, B:51:0x0094, B:64:0x00ab, B:78:0x00d1, B:74:0x00c9), top: B:92:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc A[Catch: all -> 0x00d5, TryCatch #4 {all -> 0x00d5, blocks: (B:38:0x006a, B:39:0x006c, B:65:0x00ac, B:67:0x00b0, B:68:0x00b3, B:70:0x00bc, B:71:0x00bf, B:51:0x0094, B:64:0x00ab, B:78:0x00d1, B:74:0x00c9), top: B:92:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void cJ(com.bytedance.sdk.component.cJ.C0095cJ r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.cJ.cJ(com.bytedance.sdk.component.cJ$cJ, boolean):void");
    }

    public static cJ Qhi(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (cJ.class) {
            if (Gm == null) {
                Gm = new ArrayMap<>();
            }
            File file = Gm.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                Gm.put(str, file);
            }
            if (f8329zc == null) {
                f8329zc = new ArrayMap<>();
            }
            cJ cJVar = f8329zc.get(file);
            if (cJVar == null) {
                cJ cJVar2 = new cJ(file);
                f8329zc.put(file, cJVar2);
                return cJVar2;
            }
            return cJVar;
        }
    }

    public static File Qhi(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005e -> B:54:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.cJ
            monitor-enter(r0)
            boolean r1 = r4.f8331fl     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto Lb
            boolean r1 = com.bytedance.sdk.component.cJ.Qhi     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            return
        Lb:
            java.io.File r1 = r4.WAv     // Catch: java.lang.Throwable -> L7c
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L1f
            java.io.File r1 = r4.f8332hm     // Catch: java.lang.Throwable -> L7c
            r1.delete()     // Catch: java.lang.Throwable -> L7c
            java.io.File r1 = r4.WAv     // Catch: java.lang.Throwable -> L7c
            java.io.File r2 = r4.f8332hm     // Catch: java.lang.Throwable -> L7c
            r1.renameTo(r2)     // Catch: java.lang.Throwable -> L7c
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            boolean r0 = com.bytedance.sdk.component.cJ.Qhi
            if (r0 == 0) goto L2e
            java.io.File r0 = r4.f8332hm
            r0.getAbsolutePath()
            java.io.File r0 = r4.f8332hm
            r0.exists()
        L2e:
            java.io.File r0 = r4.f8332hm
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L62
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57
            java.io.File r3 = r4.f8332hm     // Catch: java.lang.Throwable -> L57
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L57
            r0.load(r2)     // Catch: java.lang.Throwable -> L56
            boolean r1 = com.bytedance.sdk.component.cJ.Qhi     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L52
            r0.size()     // Catch: java.lang.Throwable -> L56
            java.io.File r1 = r4.f8332hm     // Catch: java.lang.Throwable -> L56
            r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L56
        L52:
            r2.close()     // Catch: java.lang.Throwable -> L5d
            goto L61
        L56:
            r1 = r2
        L57:
            if (r1 == 0) goto L61
            r1.close()     // Catch: java.lang.Throwable -> L5d
            goto L61
        L5d:
            r1 = move-exception
            r1.getMessage()
        L61:
            r1 = r0
        L62:
            java.lang.Object r0 = r4.cJ
            monitor-enter(r0)
            if (r1 == 0) goto L6f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r2 != 0) goto L6f
            r4.CJ = r1     // Catch: java.lang.Throwable -> L79
        L6f:
            r1 = 1
            r4.f8331fl = r1     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r4.cJ     // Catch: java.lang.Throwable -> L79
            r1.notifyAll()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L7c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.cJ.Qhi():void");
    }

    public String Qhi(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.cJ) {
            CJ();
            property = this.CJ.getProperty(str, str2);
        }
        return property;
    }

    public int Qhi(String str, int i10) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        synchronized (this.cJ) {
            try {
                try {
                    CJ();
                    parseInt = Integer.parseInt(this.CJ.getProperty(str, String.valueOf(i10)));
                } catch (NumberFormatException e10) {
                    e10.getMessage();
                    return i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseInt;
    }

    public long Qhi(String str, long j10) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        synchronized (this.cJ) {
            try {
                try {
                    CJ();
                    parseLong = Long.parseLong(this.CJ.getProperty(str, String.valueOf(j10)));
                } catch (NumberFormatException e10) {
                    e10.getMessage();
                    return j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseLong;
    }

    public float Qhi(String str, float f10) {
        float parseFloat;
        if (TextUtils.isEmpty(str)) {
            return f10;
        }
        synchronized (this.cJ) {
            try {
                try {
                    CJ();
                    parseFloat = Float.parseFloat(this.CJ.getProperty(str, String.valueOf(f10)));
                } catch (NumberFormatException e10) {
                    e10.getMessage();
                    return f10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseFloat;
    }

    public boolean Qhi(String str, boolean z10) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        synchronized (this.cJ) {
            try {
                try {
                    CJ();
                    parseBoolean = Boolean.parseBoolean(this.CJ.getProperty(str, String.valueOf(z10)));
                } catch (NumberFormatException e10) {
                    e10.getMessage();
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseBoolean;
    }

    public boolean Qhi(String str) {
        boolean containsKey;
        synchronized (this.cJ) {
            try {
                try {
                    CJ();
                    containsKey = this.CJ.containsKey(str);
                } catch (NumberFormatException e10) {
                    e10.getMessage();
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final C0095cJ c0095cJ, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.cJ.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (cJ.this.f8330ac) {
                    try {
                        cJ.this.cJ(c0095cJ, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (cJ.this.cJ) {
                    cJ.hm(cJ.this);
                }
            }
        };
        if (z10) {
            synchronized (this.cJ) {
                z11 = this.Tgh == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.ac.Qhi(runnable, true ^ z10);
    }
}
