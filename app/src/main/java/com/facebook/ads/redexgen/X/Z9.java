package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Z9 implements InterfaceC0873Ii, InterfaceC0690Ao, InterfaceC0811Fw, InterfaceC0755De, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"s1XoKYuOWujOozdgD26BdexE0JndoY0p", "ug", "yyipXdVJL0NW5jruXnuLHtd7HNthnOQs", "Np", "T3S7xgCH4xR7Lhcdh7IaJmLB92LvoGO6", "Lv6Qm0KobCIJpmcapSGTsoPqXtQ8zU", "F4ppLo9DkT8dpVqKTMmIcH3FimXW4jNn", "MKgJM"};
    public final /* synthetic */ C0777Eb A00;

    public Z9(C0777Eb c0777Eb) {
        this.A00 = c0777Eb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Ao
    public final void ABE(String str, long j10, long j11) {
        Iterator it = C0777Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0690Ao) it.next()).ABE(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Ao
    public final void ABF(BH bh2) {
        Iterator it = C0777Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0690Ao) it.next()).ABF(bh2);
        }
        C0777Eb.A04(this.A00, null);
        C0777Eb.A06(this.A00, null);
        C0777Eb.A00(this.A00, 0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Ao
    public final void ABG(BH bh2) {
        C0777Eb.A06(this.A00, bh2);
        Iterator it = C0777Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0690Ao) it.next()).ABG(bh2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Ao
    public final void ABH(Format format) {
        C0777Eb.A04(this.A00, format);
        Iterator it = C0777Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0690Ao) it.next()).ABH(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Ao
    public final void ABI(int i10) {
        C0777Eb.A00(this.A00, i10);
        Iterator it = C0777Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0690Ao) it.next()).ABI(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0690Ao
    public final void ABJ(int i10, long j10, long j11) {
        Iterator it = C0777Eb.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                throw new RuntimeException();
            }
            A01[5] = "pWHwh8J2y";
            if (hasNext) {
                ((InterfaceC0690Ao) it.next()).ABJ(i10, j10, j11);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0811Fw
    public final void ABg(List<C0807Fs> list) {
        C0777Eb.A08(this.A00, list);
        Iterator it = C0777Eb.A09(this.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            A01[2] = "lmorwd809xRnhQYXqopS36rQVvvPOgfq";
            ((InterfaceC0811Fw) next).ABg(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void ABo(int i10, long j10) {
        Iterator it = C0777Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0873Ii) it.next()).ABo(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0755De
    public final void ACl(Metadata metadata) {
        Iterator it = C0777Eb.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0755De) it.next()).ACl(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void ADM(Surface surface) {
        if (C0777Eb.A01(this.A00) == surface) {
            Iterator it = C0777Eb.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C0777Eb.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((InterfaceC0873Ii) it2.next()).ADM(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void ADx(String str, long j10, long j11) {
        Iterator it = C0777Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC0873Ii interfaceC0873Ii = (InterfaceC0873Ii) it.next();
            String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "98uEWQJnNgSuENriuK2INOdUeiEIyWaZ";
            strArr2[4] = "eHkHjIDMEmUBDLT9VWPNpXXI3kSowk0p";
            interfaceC0873Ii.ADx(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void ADy(BH bh2) {
        Iterator it = C0777Eb.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                break;
            }
            A01[2] = "JrZfHdmFrRR6AyhIh3YYEfnATxgqdiz0";
            if (hasNext) {
                InterfaceC0873Ii interfaceC0873Ii = (InterfaceC0873Ii) it.next();
                if (A01[2].charAt(5) != 'd') {
                    break;
                }
                String[] strArr = A01;
                strArr[3] = "VQ";
                strArr[1] = "Nl";
                interfaceC0873Ii.ADy(bh2);
            } else {
                C0777Eb c0777Eb = this.A00;
                String[] strArr2 = A01;
                if (strArr2[6].charAt(15) != strArr2[4].charAt(15)) {
                    A01[0] = "lOLMdoznQQ3DqAD1wG39jRlc0poGBnju";
                    C0777Eb.A03(c0777Eb, null);
                    C0777Eb.A05(this.A00, null);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void ADz(BH bh2) {
        C0777Eb.A05(this.A00, bh2);
        Iterator it = C0777Eb.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[7] = "IZFKv";
            if (!hasNext) {
                return;
            }
            Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                A01[2] = "cfU7KdfDtZpXBm3qFW7t619pDkxhYS61";
                ((InterfaceC0873Ii) next).ADz(bh2);
            } else {
                A01[5] = "KzmuGXxm";
                ((InterfaceC0873Ii) next).ADz(bh2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void AE3(Format format) {
        C0777Eb.A03(this.A00, format);
        Iterator it = C0777Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0873Ii) it.next()).AE3(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Ii
    public final void AE8(int i10, int i11, int i12, float f10) {
        Iterator it = C0777Eb.A0C(this.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                throw new RuntimeException();
            }
            A01[5] = "XVq90yYfVTt0";
            ((IZ) next).AE8(i10, i11, i12, f10);
        }
        Iterator it2 = C0777Eb.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (A01[2].charAt(5) != 'd') {
                ((InterfaceC0873Ii) next2).AE8(i10, i11, i12, f10);
            } else {
                A01[0] = "EzBATBLX59597vwh6aXI5FCM0yhDVwG8";
                ((InterfaceC0873Ii) next2).AE8(i10, i11, i12, f10);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C0777Eb.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0777Eb.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0777Eb.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0777Eb.A0H(this.A00, null, false);
    }
}
