package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f11409a;

    public SupportFragmentWrapper(Fragment fragment) {
        this.f11409a = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void B0(boolean z10) {
        this.f11409a.m0(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void g(boolean z10) {
        this.f11409a.l0(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void l0(int i10, Intent intent) {
        this.f11409a.o0(intent, i10, null);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void y(Intent intent) {
        this.f11409a.n0(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.f11409a.G();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.f11409a.f3690w;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        Fragment fragment = this.f11409a;
        fragment.getClass();
        FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode.c(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment);
        if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.e(a10, fragment.getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.b(a10, getTargetFragmentRequestCodeUsageViolation);
        }
        return fragment.f3677j;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzd() {
        return this.f11409a.f3674g;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        Fragment fragment = this.f11409a.f3689v;
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzf() {
        Fragment z10 = this.f11409a.z(true);
        if (z10 != null) {
            return new SupportFragmentWrapper(z10);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzg() {
        return new ObjectWrapper(this.f11409a.i());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzh() {
        return new ObjectWrapper(this.f11409a.v());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzi() {
        return new ObjectWrapper(this.f11409a.H);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzj() {
        return this.f11409a.f3692y;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.L0(iObjectWrapper);
        Preconditions.j(view);
        Fragment fragment = this.f11409a;
        fragment.getClass();
        view.setOnCreateContextMenuListener(fragment);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z10) {
        this.f11409a.k0(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z10) {
        Fragment fragment = this.f11409a;
        fragment.getClass();
        FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode.c(setRetainInstanceUsageViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment);
        if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.e(a10, fragment.getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.b(a10, setRetainInstanceUsageViolation);
        }
        fragment.B = z10;
        g0 g0Var = fragment.f3686s;
        if (g0Var != null) {
            if (z10) {
                g0Var.L.d(fragment);
                return;
            } else {
                g0Var.L.f(fragment);
                return;
            }
        }
        fragment.C = true;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.L0(iObjectWrapper);
        Preconditions.j(view);
        this.f11409a.getClass();
        view.setOnCreateContextMenuListener(null);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        Fragment fragment = this.f11409a;
        fragment.getClass();
        FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode.c(getRetainInstanceUsageViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment);
        if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.e(a10, fragment.getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.b(a10, getRetainInstanceUsageViolation);
        }
        return fragment.B;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.f11409a.J;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.f11409a.D();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.f11409a.A;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.f11409a.E();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.f11409a.f3682o;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.f11409a.f3680m;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        if (this.f11409a.f3669a >= 7) {
            return true;
        }
        return false;
    }
}
