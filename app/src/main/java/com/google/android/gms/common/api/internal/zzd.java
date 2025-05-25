package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzd extends Fragment implements LifecycleFragment {

    /* renamed from: b0  reason: collision with root package name */
    public static final WeakHashMap f11158b0 = new WeakHashMap();
    public final Map Y = Collections.synchronizedMap(new y.b());
    public int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public Bundle f11159a0;

    @Override // androidx.fragment.app.Fragment
    public final void I(int i10, int i11, Intent intent) {
        super.I(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.Y.values()) {
            lifecycleCallback.d(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        Bundle bundle2;
        super.M(bundle);
        this.Z = 1;
        this.f11159a0 = bundle;
        for (Map.Entry entry : this.Y.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.e(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        this.F = true;
        this.Z = 5;
        for (LifecycleCallback lifecycleCallback : this.Y.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W() {
        this.F = true;
        this.Z = 3;
        for (LifecycleCallback lifecycleCallback : this.Y.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        for (Map.Entry entry : this.Y.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.F = true;
        this.Z = 2;
        for (LifecycleCallback lifecycleCallback : this.Y.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Z() {
        this.F = true;
        this.Z = 4;
        for (LifecycleCallback lifecycleCallback : this.Y.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void e(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.Y;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.Z > 0) {
                new zzi(Looper.getMainLooper()).post(new r0(0, this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a6.h.d("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final LifecycleCallback h(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.Y.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.n(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.Y.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
