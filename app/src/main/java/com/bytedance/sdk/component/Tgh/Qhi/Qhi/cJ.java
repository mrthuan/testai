package com.bytedance.sdk.component.Tgh.Qhi.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: CacheManager.java */
/* loaded from: classes.dex */
public class cJ extends Qhi {
    private final fl Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final Queue<String> f8074ac;
    private final ac cJ;

    public cJ() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f8074ac = concurrentLinkedQueue;
        this.Qhi = new ROR(concurrentLinkedQueue);
        this.cJ = new ac();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public synchronized void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh, int i10) {
        fl flVar;
        if (i10 != 5) {
            if (hm.ROR().hpZ().Qhi(hm.ROR().Tgh()) && (flVar = this.Qhi) != null && tgh != null) {
                flVar.Qhi(tgh, i10);
            }
        }
        ac acVar = this.cJ;
        if (acVar != null && tgh != null) {
            acVar.Qhi(tgh, i10);
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public synchronized void Qhi(int i10, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh : list) {
            this.f8074ac.remove(tgh.ac());
        }
        fl flVar = this.Qhi;
        if (flVar != null) {
            flVar.Qhi(i10, list);
        }
        ac acVar = this.cJ;
        if (acVar != null) {
            acVar.Qhi(i10, list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public synchronized List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ;
        boolean z10;
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi = this.Qhi.Qhi(i10, i11, list);
        if (Qhi != null && Qhi.size() != 0) {
            Qhi.size();
            if ((i10 == 1 || i10 == 2) && (cJ = this.cJ.cJ(Qhi.get(0), Qhi.size())) != null && cJ.size() != 0) {
                cJ.size();
                HashMap hashMap = new HashMap();
                for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh : cJ) {
                    hashMap.put(tgh.ac(), tgh);
                }
                ArrayList arrayList = new ArrayList(this.f8074ac);
                for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh2 : cJ) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals(tgh2.ac(), (String) it.next())) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        hashMap.remove(tgh2.ac());
                    }
                }
                for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh3 : Qhi) {
                    hashMap.put(tgh3.ac(), tgh3);
                }
                Qhi.clear();
                for (String str : hashMap.keySet()) {
                    Qhi.add(hashMap.get(str));
                }
                cJ.clear();
            }
        } else {
            ArrayList arrayList2 = new ArrayList(this.f8074ac);
            if (list != null && !list.isEmpty()) {
                arrayList2.addAll(list);
            }
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi2 = this.cJ.Qhi(i10, i11, arrayList2);
            if (Qhi2 != null && Qhi2.size() != 0) {
                HashMap hashMap2 = new HashMap();
                for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh4 : Qhi2) {
                    hashMap2.put(tgh4.ac(), tgh4);
                }
                arrayList2.size();
                if (arrayList2.size() != 0) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (hashMap2.get(str2) != null) {
                            hashMap2.remove(str2);
                        }
                    }
                }
                Qhi2.clear();
                for (String str3 : hashMap2.keySet()) {
                    Qhi2.add(hashMap2.get(str3));
                }
            }
            Qhi = Qhi2;
        }
        if (Qhi != null && !Qhi.isEmpty()) {
            for (com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh5 : Qhi) {
                this.f8074ac.offer(tgh5.ac());
            }
            return Qhi;
        }
        return new ArrayList();
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public synchronized boolean Qhi(int i10, boolean z10) {
        if (this.Qhi.Qhi(i10, z10)) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.lB(), 1);
            return true;
        } else if ((i10 == 1 || i10 == 2) && this.cJ.Qhi(i10, z10)) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.lG(), 1);
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(int i10, long j10) {
        this.cJ.Qhi(i10, j10);
        this.Qhi.Qhi(i10, j10);
    }
}
