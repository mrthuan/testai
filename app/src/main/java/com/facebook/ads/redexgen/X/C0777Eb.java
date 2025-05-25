package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.tom_roush.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Eb */
/* loaded from: assets/audience_network.dex */
public final class C0777Eb implements ZB {
    public static byte[] A0O;
    public static String[] A0P = {"XWeSpGD", "4qgR8lijDNBVXz9BioKUh69RZRfb7E2", "Q4SMfBcJ0bt0", PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE, "TfY1BMlFFTNL7vzfskwyUKT4ej", "mKGGB3e4ANI8fD2ERhdb4BtSA2E0ESmz", "CjFdQ0AURNTGZtxre29PnmyrB2gjoGci", "x"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public AY A08;
    public BH A09;
    public BH A0A;
    public Ev A0B;
    public List<C0807Fs> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final ZB A0F;
    public final Z9 A0G;
    public final Z7 A0H;
    public final CopyOnWriteArraySet<InterfaceC0690Ao> A0I;
    public final CopyOnWriteArraySet<InterfaceC0755De> A0J;
    public final CopyOnWriteArraySet<InterfaceC0811Fw> A0K;
    public final CopyOnWriteArraySet<InterfaceC0873Ii> A0L;
    public final CopyOnWriteArraySet<IZ> A0M;
    public final ZA[] A0N;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{-79, -57, -53, -50, -54, -61, -93, -42, -51, -82, -54, -65, -41, -61, -48, -93, -59, -62, -74, -79, -77, -75, -92, -75, -56, -60, -59, -62, -75, -100, -71, -61, -60, -75, -66, -75, -62, 112, -79, -68, -62, -75, -79, -76, -55, 112, -59, -66, -61, -75, -60, 112, -65, -62, 112, -62, -75, -64, -68, -79, -77, -75, -76, 126, -120, -117, -117, 115, -112, -102, -101, -116, -107, -116, -103};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0777Eb(AH ah2, AbstractC0827Go abstractC0827Go, InterfaceC06729w interfaceC06729w, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh) {
        this(ah2, abstractC0827Go, interfaceC06729w, interfaceC0707Bh, new AN());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0777Eb(AH ah2, AbstractC0827Go abstractC0827Go, InterfaceC06729w interfaceC06729w, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, AN an2) {
        this(ah2, abstractC0827Go, interfaceC06729w, interfaceC0707Bh, an2, InterfaceC0847Hi.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0777Eb(AH ah2, AbstractC0827Go abstractC0827Go, InterfaceC06729w interfaceC06729w, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, AN an2, InterfaceC0847Hi interfaceC0847Hi) {
        this.A0G = new Z9(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A0N = ah2.A57(this.A0E, this.A0G, this.A0G, this.A0G, this.A0G, interfaceC0707Bh);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = AY.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, abstractC0827Go, interfaceC06729w, interfaceC0847Hi);
        this.A0H = an2.A00(this.A0F, interfaceC0847Hi);
        A3m(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (0 != 0) {
            throw new NullPointerException(A07(64, 11, 6));
        }
    }

    private final C0779Ed A02(ZA[] zaArr, AbstractC0827Go abstractC0827Go, InterfaceC06729w interfaceC06729w, InterfaceC0847Hi interfaceC0847Hi) {
        return new C0779Ed(zaArr, abstractC0827Go, interfaceC06729w, interfaceC0847Hi);
    }

    private void A0E() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 61), A07(15, 49, 47));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    public void A0G(Surface surface, boolean z10) {
        ZA[] zaArr;
        ArrayList<AD> arrayList = new ArrayList();
        for (ZA za2 : this.A0N) {
            if (za2.A8a() == 2) {
                arrayList.add(this.A0F.A51(za2).A06(1).A07(surface).A05());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                for (AD ad2 : arrayList) {
                    ad2.A0C();
                }
            } catch (InterruptedException unused) {
                Thread currentThread = Thread.currentThread();
                if (A0P[6].charAt(9) != 'N') {
                    throw new RuntimeException();
                }
                A0P[0] = "72REcLj";
                currentThread.interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z10;
    }

    private final void A0I(InterfaceC0755De interfaceC0755De) {
        this.A0J.add(interfaceC0755De);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AH2(false);
    }

    public final void A0N(float f10) {
        ZA[] zaArr;
        this.A00 = f10;
        for (ZA za2 : this.A0N) {
            String[] strArr = A0P;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[4] = "DgH7fRCeCljpIo3I4J1ewSbeY9";
            strArr2[1] = "bAFJiNVMQ89hFktOZXBfzPUbCDSZU9u";
            if (za2.A8a() == 1) {
                this.A0F.A51(za2).A06(2).A07(Float.valueOf(f10)).A05();
            }
        }
    }

    public final void A0O(Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(Ev ev) {
        AEY(ev, true, true);
    }

    public final void A0Q(IZ iz) {
        this.A0M.add(iz);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void A3m(A5 a52) {
        this.A0F.A3m(a52);
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final AD A51(AC ac2) {
        return this.A0F.A51(ac2);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A6Z() {
        return this.A0F.A6Z();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A6a() {
        return this.A0F.A6a();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A6w() {
        return this.A0F.A6w();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A6y() {
        return this.A0F.A6y();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A6z() {
        return this.A0F.A6z();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A71() {
        return this.A0F.A71();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final AM A73() {
        return this.A0F.A73();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A74() {
        return this.A0F.A74();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A7E() {
        return this.A0F.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final boolean A84() {
        return this.A0F.A84();
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final void AEY(Ev ev, boolean z10, boolean z11) {
        if (this.A0B != ev) {
            if (this.A0B != null) {
                this.A0B.AFa(this.A0H);
                this.A0H.A09();
            }
            ev.A3k(this.A0E, this.A0H);
            this.A0B = ev;
        }
        this.A0F.AEY(ev, z10, z11);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AEy() {
        this.A0F.AEy();
        A0E();
        if (this.A03 != null) {
            if (this.A0D) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AFa(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AG9(long j10) {
        this.A0H.A08();
        this.A0F.AG9(j10);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AGA() {
        this.A0H.A08();
        this.A0F.AGA();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AGZ(boolean z10) {
        this.A0F.AGZ(z10);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AH2(boolean z10) {
        this.A0F.AH2(z10);
        if (this.A0B != null) {
            this.A0B.AFa(this.A0H);
            this.A0B = null;
            this.A0H.A09();
        }
        this.A0C = Collections.emptyList();
    }
}
