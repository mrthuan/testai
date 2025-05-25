package com.bytedance.sdk.openadsdk.WAv;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: VolumeChangeObserver.java */
/* loaded from: classes.dex */
public class hm {
    private final AudioManager Qhi;
    private int cJ = -1;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8514ac = false;

    public hm(Context context) {
        this.Qhi = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int Qhi() {
        return this.cJ;
    }

    public boolean cJ() {
        if (!this.f8514ac) {
            return false;
        }
        this.f8514ac = false;
        return true;
    }

    public void Qhi(int i10) {
        this.cJ = i10;
    }

    public void Qhi(boolean z10) {
        Qhi(z10, false);
    }

    public void Qhi(boolean z10, boolean z11) {
        if (this.Qhi == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int ROR = DeviceUtils.ROR();
            if (ROR != 0) {
                this.cJ = ROR;
            } else if (!z11) {
                return;
            }
            Qhi(3, 0, 0);
            this.f8514ac = true;
            return;
        }
        int i11 = this.cJ;
        if (i11 == 0) {
            i11 = DeviceUtils.hm() / 15;
        } else {
            if (i11 == -1) {
                if (!z11) {
                    return;
                }
                i11 = DeviceUtils.hm() / 15;
            }
            this.cJ = -1;
            Qhi(3, i11, i10);
            this.f8514ac = true;
        }
        i10 = 1;
        this.cJ = -1;
        Qhi(3, i11, i10);
        this.f8514ac = true;
    }

    private void Qhi(int i10, int i11, int i12) {
        try {
            this.Qhi.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
