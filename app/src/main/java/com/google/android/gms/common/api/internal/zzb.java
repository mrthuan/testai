package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzb extends Fragment implements LifecycleFragment {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f11155d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f11156a = Collections.synchronizedMap(new y.b());

    /* renamed from: b  reason: collision with root package name */
    public int f11157b = 0;
    public Bundle c;

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f11156a.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void e(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f11156a;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f11157b > 0) {
                new zzi(Looper.getMainLooper()).post(new q0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a6.h.d("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final LifecycleCallback h(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f11156a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity i() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f11156a.values()) {
            lifecycleCallback.d(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f11157b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.f11156a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.e(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f11157b = 5;
        for (LifecycleCallback lifecycleCallback : this.f11156a.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f11157b = 3;
        for (LifecycleCallback lifecycleCallback : this.f11156a.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f11156a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).h(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f11157b = 2;
        for (LifecycleCallback lifecycleCallback : this.f11156a.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f11157b = 4;
        for (LifecycleCallback lifecycleCallback : this.f11156a.values()) {
            lifecycleCallback.j();
        }
    }
}
