package com.android.billingclient.api;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6229a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6230b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i10, Object obj, Object obj2) {
        this.f6229a = i10;
        this.f6230b = obj;
        this.c = obj2;
    }

    private final void a() {
        synchronized (((d8.h) this.c).f16139b) {
            OnFailureListener onFailureListener = ((d8.h) this.c).c;
            if (onFailureListener != null) {
                Exception j10 = ((Task) this.f6230b).j();
                Preconditions.j(j10);
                onFailureListener.onFailure(j10);
            }
        }
    }

    private final void b() {
        com.google.android.play.core.assetpacks.a0 a0Var = (com.google.android.play.core.assetpacks.a0) this.f6230b;
        AssetPackState assetPackState = (AssetPackState) this.c;
        synchronized (a0Var) {
            Iterator it = new HashSet(a0Var.f29135d).iterator();
            while (it.hasNext()) {
                ((t9.a) it.next()).a(assetPackState);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0457, code lost:
        if (android.text.TextUtils.isEmpty(r1.f11699m) == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0478  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.e0.run():void");
    }

    public /* synthetic */ e0(Object obj, Object obj2, int i10) {
        this.f6229a = i10;
        this.c = obj;
        this.f6230b = obj2;
    }
}
