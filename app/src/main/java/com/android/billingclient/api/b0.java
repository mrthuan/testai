package com.android.billingclient.api;

import com.google.android.play.core.assetpacks.f1;
import com.google.android.play.core.assetpacks.g1;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public class b0 implements w0.d, f1 {

    /* renamed from: a  reason: collision with root package name */
    public int f6180a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6181b;

    public b0(f fVar, int i10) {
        this.f6181b = fVar;
        this.f6180a = i10;
    }

    @Override // com.google.android.play.core.assetpacks.f1
    public Object a() {
        ((g1) this.f6181b).a(this.f6180a);
        return null;
    }

    @Override // w0.d
    public Object b() {
        int i10 = this.f6180a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f6181b;
        Object obj2 = ((Object[]) obj)[i11];
        ((Object[]) obj)[i11] = null;
        this.f6180a = i10 - 1;
        return obj2;
    }

    public b0() {
        this.f6180a = 0;
        this.f6181b = new StringBuilder();
    }

    @Override // w0.d
    public boolean a(Object obj) {
        int i10;
        Object obj2;
        boolean z10;
        int i11 = 0;
        while (true) {
            i10 = this.f6180a;
            obj2 = this.f6181b;
            if (i11 >= i10) {
                z10 = false;
                break;
            } else if (((Object[]) obj2)[i11] == obj) {
                z10 = true;
                break;
            } else {
                i11++;
            }
        }
        if (!z10) {
            if (i10 < ((Object[]) obj2).length) {
                ((Object[]) obj2)[i10] = obj;
                this.f6180a = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public b0(int i10) {
        if (i10 > 0) {
            this.f6181b = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
