package com.bytedance.sdk.openadsdk.component.Tgh;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: TTAppOpenAdTopLayoutHelper.java */
/* loaded from: classes.dex */
public class cJ implements Handler.Callback {
    private boolean ROR;

    /* renamed from: ac  reason: collision with root package name */
    private Qhi f8761ac;
    private final com.bytedance.sdk.openadsdk.component.Sf.Qhi cJ;
    private Handler Qhi = new Handler(Looper.myLooper(), this);
    private int CJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    private int f8762fl = 5;
    private int Tgh = 0;

    public cJ(com.bytedance.sdk.openadsdk.component.Sf.Qhi qhi) {
        this.cJ = qhi;
    }

    public void CJ() {
        Handler handler = this.Qhi;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void Qhi(int i10) {
        this.CJ = i10;
        int i11 = this.f8762fl - i10;
        this.cJ.Qhi(i11);
        if (i10 <= 0) {
            Qhi qhi = this.f8761ac;
            if (qhi != null && !this.ROR) {
                qhi.cJ();
                this.ROR = true;
            }
            i10 = 0;
        }
        boolean z10 = i11 >= this.Tgh;
        Qhi qhi2 = this.f8761ac;
        if (qhi2 != null) {
            qhi2.Qhi(i10, i11, z10);
        }
    }

    public void ac() {
        if (this.Qhi != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.CJ;
            this.Qhi.sendMessage(obtain);
        }
    }

    public void cJ(int i10) {
        this.Tgh = i10;
    }

    public void fl() {
        this.Qhi.removeCallbacksAndMessages(null);
        this.Qhi = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.Qhi != null) {
            int i10 = message.arg1;
            Qhi(i10);
            if (i10 > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i10 - 1;
                this.Qhi.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    public void cJ() {
        Handler handler = this.Qhi;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.f8762fl, 0));
        }
    }

    public void Qhi(float f10) {
        int i10 = (int) f10;
        this.f8762fl = i10;
        if (i10 <= 0) {
            this.f8762fl = 5;
        }
    }

    public void Qhi(Qhi qhi) {
        this.f8761ac = qhi;
    }

    public int Qhi() {
        return this.Tgh;
    }
}
