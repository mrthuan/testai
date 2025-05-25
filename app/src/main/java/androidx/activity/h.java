package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f1809b;
    public final /* synthetic */ ComponentActivity.b c;

    public h(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.c = bVar;
        this.f1808a = i10;
        this.f1809b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.f1808a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1809b));
    }
}
