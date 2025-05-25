package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.inmobi.media.w6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1852w6 extends ContentObserver implements InterfaceC1667i6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15580a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f15581b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1878y6 f15582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852w6(C1878y6 c1878y6, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        kotlin.jvm.internal.g.e(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.f15582d = c1878y6;
        this.f15580a = mJsCallbackNamespace;
        this.f15581b = context;
        this.c = -1;
    }

    public static final void a(C1852w6 this$0, C1878y6 this$1, boolean z10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(this$1, "this$1");
        Context context = this$0.f15581b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume != this$0.c) {
                        this$0.c = streamVolume;
                        A4 a42 = this$1.f15679b;
                        if (a42 != null) {
                            ((B4) a42).a("MraidMediaProcessor", "volume change detected - " + z10);
                        }
                        String str = this$0.f15580a;
                        A4 a43 = this$1.f15679b;
                        if (a43 != null) {
                            ((B4) a43).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
                        }
                        S9 s92 = this$1.f15678a;
                        if (s92 != null) {
                            s92.a(str, "fireDeviceVolumeChangeEvent(" + streamVolume + ");");
                        }
                    }
                } catch (Exception e10) {
                    A4 a44 = this$1.f15679b;
                    if (a44 != null) {
                        ((B4) a44).a("MraidMediaProcessor", "Unexpected error in volume listener", e10);
                    }
                }
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC1667i6
    public final void b() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        d10.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).execute(new qb.b1(this, 1, this.f15582d, z10));
    }

    @Override // com.inmobi.media.InterfaceC1667i6
    public final void a() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        d10.getContentResolver().unregisterContentObserver(this);
    }
}
