package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f11150b;
    public final AtomicReference c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.gms.internal.base.zau f11151d;

    /* renamed from: e  reason: collision with root package name */
    public final GoogleApiAvailability f11152e;

    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.c = new AtomicReference(null);
        this.f11151d = new com.google.android.gms.internal.base.zau(Looper.getMainLooper());
        this.f11152e = googleApiAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.c;
        l0 l0Var = (l0) atomicReference.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int d10 = this.f11152e.d(b());
                if (d10 == 0) {
                    m();
                    return;
                } else if (l0Var != null) {
                    if (l0Var.f11017b.f10876b == 18 && d10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            m();
            return;
        } else if (i11 == 0) {
            if (l0Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                ConnectionResult connectionResult = new ConnectionResult(1, i12, null, l0Var.f11017b.toString());
                atomicReference.set(null);
                k(connectionResult, l0Var.f11016a);
                return;
            }
            return;
        }
        if (l0Var != null) {
            atomicReference.set(null);
            k(l0Var.f11017b, l0Var.f11016a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        l0 l0Var;
        if (bundle != null) {
            AtomicReference atomicReference = this.c;
            if (bundle.getBoolean("resolving_error", false)) {
                l0Var = new l0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                l0Var = null;
            }
            atomicReference.set(l0Var);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h(Bundle bundle) {
        l0 l0Var = (l0) this.c.get();
        if (l0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", l0Var.f11016a);
        ConnectionResult connectionResult = l0Var.f11017b;
        bundle.putInt("failed_status", connectionResult.f10876b);
        bundle.putParcelable("failed_resolution", connectionResult.c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.f11150b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        this.f11150b = false;
    }

    public abstract void k(ConnectionResult connectionResult, int i10);

    public abstract void l();

    public final void m() {
        this.c.set(null);
        l();
    }

    public final void n(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        boolean z10;
        l0 l0Var = new l0(connectionResult, i10);
        do {
            atomicReference = this.c;
            while (true) {
                if (atomicReference.compareAndSet(null, l0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.f11151d.post(new n0(this, l0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10;
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.c;
        l0 l0Var = (l0) atomicReference.get();
        if (l0Var == null) {
            i10 = -1;
        } else {
            i10 = l0Var.f11016a;
        }
        atomicReference.set(null);
        k(connectionResult, i10);
    }
}
