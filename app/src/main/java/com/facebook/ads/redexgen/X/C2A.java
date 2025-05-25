package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2A extends Handler {
    public static byte[] A08;
    public static String[] A09 = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public Messenger A00;
    public LZ A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final C1313Zr A06;
    public final KY A07;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A08 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, Byte.MIN_VALUE, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, 12, -3, -18, -16, -8, -18, -12, -14, 12, -10, -5, 0, 1, -18, -7, -7, -14, -15, 12, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public C2A(C1313Zr c1313Zr) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.29
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Handler handler;
                KY ky;
                C1313Zr c1313Zr2;
                Messenger messenger;
                handler = C2A.this.A04;
                ky = C2A.this.A07;
                handler.removeCallbacks(ky);
                C2A.this.A00 = new Messenger(iBinder);
                c1313Zr2 = C2A.this.A06;
                if (AbstractC0879Ip.A07(c1313Zr2)) {
                    C2A c2a = C2A.this;
                    messenger = C2A.this.A00;
                    c2a.A07(messenger);
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                C2A.this.A09();
            }
        };
        this.A06 = c1313Zr;
        this.A05 = new Messenger(this);
        this.A07 = new C1408bR(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Messenger messenger) {
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = this.A05;
        obtain.setData(C2J.A00(this.A06));
        try {
            messenger.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A06.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(String str, LZ lz, int i10) {
        if (this.A02) {
            this.A01 = lz;
            Message obtain = Message.obtain((Handler) null, i10);
            obtain.replyTo = this.A05;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(A05(88, 15, 88), str);
                obtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(obtain);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public final void A0B(boolean z10) {
        this.A02 = AnonymousClass28.A04(this.A06, z10, this.A03);
        if (this.A02) {
            Handler handler = this.A04;
            KY ky = this.A07;
            if (A09[6].charAt(31) != 'q') {
                throw new RuntimeException();
            }
            A09[2] = "62SHD49IwhaYJMd1y";
            handler.postDelayed(ky, AbstractC0879Ip.A01(this.A06));
            return;
        }
        AbstractC06308f.A04(this.A06);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                AnonymousClass28.A02(this.A06, message);
            } else if (message.what == 20 || message.what == 40 || message.what == 30) {
                if (message.what == 20) {
                    AbstractC0879Ip.A06(this.A06);
                }
                String str = A05(0, 33, 15) + message.what;
                AbstractC06308f.A04(this.A06);
            } else if (message.what == 4) {
                Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z10 = data.getBoolean(A05(33, 30, 0), false);
                    String A05 = A05(88, 15, 88);
                    if (z10) {
                        this.A01.ACu(data.getString(A05));
                    } else if (data.getBoolean(A05(63, 25, 116), false)) {
                        this.A01.ACv(data.getString(A05));
                    }
                }
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
