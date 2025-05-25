package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.inmobi.media.v6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1839v6 extends BroadcastReceiver implements InterfaceC1667i6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15515a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1878y6 f15516b;

    public C1839v6(C1878y6 c1878y6, String jsCallbackNamespace) {
        kotlin.jvm.internal.g.e(jsCallbackNamespace, "jsCallbackNamespace");
        this.f15516b = c1878y6;
        this.f15515a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.InterfaceC1667i6
    public final void a() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        d10.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC1667i6
    public final void b() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        AbstractC1579c2.a(d10, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(intent, "intent");
        if (kotlin.jvm.internal.g.a("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            A4 a42 = this.f15516b.f15679b;
            if (a42 != null) {
                ((B4) a42).a("MraidMediaProcessor", b.a.c("Ringer mode action changed: ", intExtra));
            }
            C1878y6 c1878y6 = this.f15516b;
            String str = this.f15515a;
            if (2 != intExtra) {
                z10 = true;
            } else {
                z10 = false;
            }
            A4 a43 = c1878y6.f15679b;
            if (a43 != null) {
                ((B4) a43).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
            }
            S9 s92 = c1878y6.f15678a;
            if (s92 != null) {
                s92.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
            }
        }
    }
}
