package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.ads.internal.util.client.zzm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class VideoController {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10053a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public zzdq f10054b;
    public VideoLifecycleCallbacks c;

    public final void a(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        synchronized (this.f10053a) {
            this.c = videoLifecycleCallbacks;
            zzdq zzdqVar = this.f10054b;
            if (zzdqVar == null) {
                return;
            }
            try {
                zzdqVar.zzm(new zzfj(videoLifecycleCallbacks));
            } catch (RemoteException unused) {
                zzm.g(6);
            }
        }
    }

    public final void b(zzdq zzdqVar) {
        synchronized (this.f10053a) {
            this.f10054b = zzdqVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.c;
            if (videoLifecycleCallbacks != null) {
                a(videoLifecycleCallbacks);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }

        public void onVideoMute(boolean z10) {
        }
    }
}
