package com.bytedance.sdk.component.fl.ac.Qhi;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* compiled from: SoftLruCache.java */
/* loaded from: classes.dex */
public class ac<K, V> {
    private int CJ;
    private final LinkedHashMap<K, SoftReference<V>> Qhi;
    private int ROR;
    private int Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f8389ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8390fl;

    public ac(int i10) {
        if (i10 > 0) {
            this.f8389ac = i10;
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
        V v10;
        if (k10 != null) {
            synchronized (this) {
                SoftReference<V> softReference = this.Qhi.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.ROR++;
                        return v10;
                    }
                    this.Qhi.remove(k10);
                } else {
                    v10 = null;
                }
                this.Sf++;
                V cJ = cJ(k10);
                if (cJ == null) {
                    return null;
                }
                synchronized (this) {
                    this.f8390fl++;
                    SoftReference<V> put = this.Qhi.put(k10, new SoftReference<>(cJ));
                    if (put != null) {
                        v10 = put.get();
                    }
                    if (v10 != null) {
                        this.Qhi.put(k10, put);
                    } else {
                        this.cJ += ac(k10, cJ);
                    }
                }
                if (v10 != null) {
                    return v10;
                }
                Qhi(this.f8389ac);
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
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f8389ac), Integer.valueOf(this.ROR), Integer.valueOf(this.Sf), Integer.valueOf(i10));
    }

    public V cJ(K k10) {
        return null;
    }

    public final V Qhi(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                this.CJ++;
                this.cJ += ac(k10, v10);
                SoftReference<V> put = this.Qhi.put(k10, new SoftReference<>(v10));
                if (put != null) {
                    v11 = put.get();
                    if (v11 != null) {
                        this.cJ -= ac(k10, v11);
                    }
                } else {
                    v11 = null;
                }
            }
            Qhi(this.f8389ac);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        r3.cJ = 0;
        r3.Qhi.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        return;
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
            int r0 = r3.cJ     // Catch: java.lang.Throwable -> L5c
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.Qhi     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L12
            int r0 = r3.cJ     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L12
            goto L52
        L12:
            int r0 = r3.cJ     // Catch: java.lang.Throwable -> L5c
            if (r0 > r4) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            return
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.Qhi     // Catch: java.lang.Throwable -> L5c
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L5c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            return
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L5c
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L5c
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.Qhi     // Catch: java.lang.Throwable -> L5c
            r2.remove(r1)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L5c
            int r2 = r3.cJ     // Catch: java.lang.Throwable -> L5c
            int r0 = r3.ac(r1, r0)     // Catch: java.lang.Throwable -> L5c
            int r2 = r2 - r0
            r3.cJ = r2     // Catch: java.lang.Throwable -> L5c
        L4a:
            int r0 = r3.Tgh     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 + 1
            r3.Tgh = r0     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            goto L0
        L52:
            r4 = 0
            r3.cJ = r4     // Catch: java.lang.Throwable -> L5c
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.Qhi     // Catch: java.lang.Throwable -> L5c
            r4.clear()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            return
        L5c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fl.ac.Qhi.ac.Qhi(int):void");
    }
}
