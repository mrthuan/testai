package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f11022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zap f11023b;

    public n0(zap zapVar, l0 l0Var) {
        this.f11023b = zapVar;
        this.f11022a = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f11023b.f11150b) {
            return;
        }
        ConnectionResult connectionResult = this.f11022a.f11017b;
        if (connectionResult.d()) {
            zap zapVar = this.f11023b;
            LifecycleFragment lifecycleFragment = zapVar.f10955a;
            Activity b10 = zapVar.b();
            PendingIntent pendingIntent = connectionResult.c;
            Preconditions.j(pendingIntent);
            int i10 = this.f11022a.f11016a;
            int i11 = GoogleApiActivity.f10904b;
            Intent intent = new Intent(b10, GoogleApiActivity.class);
            intent.putExtra("pending_intent", pendingIntent);
            intent.putExtra("failing_client_id", i10);
            intent.putExtra("notify_manager", false);
            lifecycleFragment.startActivityForResult(intent, 1);
            return;
        }
        zap zapVar2 = this.f11023b;
        if (zapVar2.f11152e.b(zapVar2.b(), connectionResult.f10876b, null) != null) {
            zap zapVar3 = this.f11023b;
            zapVar3.f11152e.j(zapVar3.b(), zapVar3.f10955a, connectionResult.f10876b, this.f11023b);
        } else if (connectionResult.f10876b == 18) {
            zap zapVar4 = this.f11023b;
            GoogleApiAvailability googleApiAvailability = zapVar4.f11152e;
            Activity b11 = zapVar4.b();
            googleApiAvailability.getClass();
            ProgressBar progressBar = new ProgressBar(b11, null, 16842874);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(b11);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.zac.b(b11, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            GoogleApiAvailability.h(b11, create, "GooglePlayServicesUpdatingDialog", zapVar4);
            zap zapVar5 = this.f11023b;
            Context applicationContext = zapVar5.b().getApplicationContext();
            m0 m0Var = new m0(this, create);
            zapVar5.f11152e.getClass();
            GoogleApiAvailability.g(applicationContext, m0Var);
        } else {
            zap zapVar6 = this.f11023b;
            int i12 = this.f11022a.f11016a;
            zapVar6.c.set(null);
            zapVar6.k(connectionResult, i12);
        }
    }
}
