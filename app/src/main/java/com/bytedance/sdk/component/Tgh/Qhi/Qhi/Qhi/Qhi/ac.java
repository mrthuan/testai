package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DBInsertMemRepo.java */
/* loaded from: classes.dex */
public abstract class ac {
    private final Context Qhi;
    protected final List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ = new ArrayList();

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8065ac = false;
    private final Runnable CJ = new Runnable() { // from class: com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ac.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (ac.this) {
                if (ac.this.cJ.isEmpty()) {
                    ac.this.f8065ac = false;
                    return;
                }
                ArrayList arrayList = new ArrayList(ac.this.cJ);
                ac.this.cJ.clear();
                ac.this.f8065ac = false;
                ac.this.CJ(arrayList);
            }
        }
    };

    public ac(Context context) {
        this.Qhi = context;
    }

    public void CJ(List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.ac.Qhi(fl(), cJ(), list);
    }

    public void ac(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> it = this.cJ.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh next = it.next();
                    if (next != null) {
                        String ac2 = next.ac();
                        if (!TextUtils.isEmpty(ac2) && list.contains(ac2)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                cJ();
                th2.getMessage();
            }
        }
    }

    public abstract String cJ();

    public Context fl() {
        return this.Qhi;
    }

    private void Qhi() {
        if (this.f8065ac) {
            return;
        }
        com.bytedance.sdk.component.Tgh.Qhi.ROR.Qhi.Qhi().postDelayed(this.CJ, com.bytedance.sdk.component.Tgh.Qhi.ROR.Qhi.cJ());
        this.f8065ac = true;
    }

    public synchronized void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh) {
        if (tgh.ROR() != null && !TextUtils.isEmpty(tgh.ac())) {
            this.cJ.add(tgh);
            Qhi();
        }
    }
}
