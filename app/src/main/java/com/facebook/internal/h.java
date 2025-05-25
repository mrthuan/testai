package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.appevents.l;
import com.facebook.internal.g;

/* compiled from: InstallReferrerUtil.kt */
/* loaded from: classes.dex */
public final class h implements InstallReferrerStateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f9790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g.a f9791b;

    public h(InstallReferrerClient installReferrerClient, l.a.C0141a c0141a) {
        this.f9790a = installReferrerClient;
        this.f9791b = c0141a;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (k6.a.b(this)) {
            return;
        }
        InstallReferrerClient installReferrerClient = this.f9790a;
        try {
            if (i10 != 0) {
                if (i10 == 2) {
                    g.a();
                }
            } else {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    kotlin.jvm.internal.g.d(installReferrer, "{\n                      …rer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (kotlin.text.k.O(installReferrer2, "fb", false) || kotlin.text.k.O(installReferrer2, "facebook", false))) {
                        this.f9791b.a(installReferrer2);
                    }
                    g.a();
                } catch (RemoteException unused) {
                    return;
                }
            }
            try {
                installReferrerClient.endConnection();
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
