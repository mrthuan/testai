package com.bytedance.adsdk.lottie;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class iMK<K, V> {
    private int CJ;
    private final LinkedHashMap<K, V> Qhi;
    private int ROR;
    private int Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f7865ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7866fl;

    public iMK(int i10) {
        if (i10 > 0) {
            this.f7865ac = i10;
            this.Qhi = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int ac(K k10, V v10) {
        int cJ = cJ(k10, v10);
        if (cJ >= 0) {
            return cJ;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final V Qhi(K k10) {
        V put;
        if (k10 != null) {
            synchronized (this) {
                V v10 = this.Qhi.get(k10);
                if (v10 != null) {
                    this.ROR++;
                    return v10;
                }
                this.Sf++;
                V cJ = cJ(k10);
                if (cJ == null) {
                    return null;
                }
                synchronized (this) {
                    this.f7866fl++;
                    put = this.Qhi.put(k10, cJ);
                    if (put != null) {
                        this.Qhi.put(k10, put);
                    } else {
                        this.cJ += ac(k10, cJ);
                    }
                }
                if (put != null) {
                    return put;
                }
                Qhi(this.f7865ac);
                return cJ;
            }
        }
        throw new NullPointerException("key == null");
    }

    public int cJ(K k10, V v10) {
        return 1;
    }

    public final synchronized String toString() {
        int i10;
        int i11 = this.ROR;
        int i12 = this.Sf + i11;
        if (i12 != 0) {
            i10 = (i11 * 100) / i12;
        } else {
            i10 = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f7865ac), Integer.valueOf(this.ROR), Integer.valueOf(this.Sf), Integer.valueOf(i10));
    }

    public V cJ(K k10) {
        return null;
    }

    public final V Qhi(K k10, V v10) {
        V put;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                this.CJ++;
                this.cJ += ac(k10, v10);
                put = this.Qhi.put(k10, v10);
                if (put != null) {
                    this.cJ -= ac(k10, put);
                }
            }
            Qhi(this.f7865ac);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.cJ     // Catch: java.lang.Throwable -> L6d
            if (r0 < 0) goto L4e
            java.util.LinkedHashMap<K, V> r0 = r3.Qhi     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L11
            int r0 = r3.cJ     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L4e
        L11:
            int r0 = r3.cJ     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r4) goto L4c
            java.util.LinkedHashMap<K, V> r0 = r3.Qhi     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1e
            goto L4c
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.Qhi     // Catch: java.lang.Throwable -> L6d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.LinkedHashMap<K, V> r2 = r3.Qhi     // Catch: java.lang.Throwable -> L6d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6d
            int r2 = r3.cJ     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.ac(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r2 = r2 - r0
            r3.cJ = r2     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.Tgh     // Catch: java.lang.Throwable -> L6d
            int r0 = r0 + 1
            r3.Tgh = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            goto L0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            return
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6d
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L6d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.iMK.Qhi(int):void");
    }
}
