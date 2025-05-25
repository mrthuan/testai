package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: a  reason: collision with root package name */
    public androidx.activity.result.c f6172a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.activity.result.c f6173b;
    public ResultReceiver c;

    /* renamed from: d  reason: collision with root package name */
    public ResultReceiver f6174d;

    @Override // androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6172a = registerForActivityResult(new j.e(), new a0(this, 0));
        this.f6173b = registerForActivityResult(new j.e(), new g3.b(this));
        if (bundle == null) {
            zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                androidx.activity.result.c cVar = this.f6172a;
                kotlin.jvm.internal.g.e(pendingIntent, "pendingIntent");
                IntentSender intentSender = pendingIntent.getIntentSender();
                kotlin.jvm.internal.g.d(intentSender, "pendingIntent.intentSender");
                cVar.a(new androidx.activity.result.h(intentSender, null, 0, 0));
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.f6174d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                androidx.activity.result.c cVar2 = this.f6173b;
                kotlin.jvm.internal.g.e(pendingIntent2, "pendingIntent");
                IntentSender intentSender2 = pendingIntent2.getIntentSender();
                kotlin.jvm.internal.g.d(intentSender2, "pendingIntent.intentSender");
                cVar2.a(new androidx.activity.result.h(intentSender2, null, 0, 0));
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f6174d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    @Override // androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f6174d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
