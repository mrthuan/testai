package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class IQ extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"fjb62vMryiJBq6nlv0XecN4Miby9R", "URoeDihEfhk6EaAX", "MuB6m1Bx59DgjR9J", "2MJ6dS3EV8t7lzjHOstp9BZeWuWbqqlU", "ewPhRFK9mfGcTpXOBIuRZRib", "zGQ6fmAkazLgXk", "ErVdPKTj7", "wcOr5xxV0KUOSKDMt9ZYsxWBIWNUj"};
    public Handler A00;
    public RunnableC0854Hp A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
            if (A06[4].length() != 24) {
                throw new RuntimeException();
            }
            A06[3] = "h25Y0rjbMuR2ypWA7lRpstXE2gsMGFZh";
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-55, -6, -14, -14, -2, -40, -6, -9, -21, -26, -24, -22, -111, -84, -76, -73, -80, -81, 107, -65, -70, 107, -76, -71, -76, -65, -76, -84, -73, -76, -59, -80, 107, -81, -64, -72, -72, -60, 107, -66, -64, -67, -79, -84, -82, -80, -93, -66, -58, -55, -62, -63, 125, -47, -52, 125, -49, -62, -55, -62, -66, -48, -62, 125, -63, -46, -54, -54, -42, 125, -48, -46, -49, -61, -66, -64, -62, -88, -71, -79, -79, -67, -105, -71, -74, -86, -91, -89, -87};
    }

    static {
        A02();
    }

    public IQ() {
        super(A00(77, 12, 30));
    }

    private void A01() {
        AbstractC0844Hf.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i10) {
        AbstractC0844Hf.A01(this.A01);
        this.A01.A09(i10);
        this.A02 = new DummySurface(this, this.A01.A07(), i10 != 0);
    }

    public final DummySurface A04(int i10) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC0854Hp(this.A00);
        boolean z10 = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i10, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) AbstractC0844Hf.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        AbstractC0844Hf.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e10) {
                        Log.e(A00(0, 12, 95), A00(12, 34, 37), e10);
                        this.A03 = e10;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e11) {
                        Log.e(A00(0, 12, 95), A00(12, 34, 37), e11);
                        this.A04 = e11;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
