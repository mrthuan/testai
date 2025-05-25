package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class Z4 implements InterfaceC0699Ax {
    public static byte[] A01;
    public final /* synthetic */ Z3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 44, -97, -45, -62, -57, -51, -78, -48, -65, -63, -55, -90, -60, -53, -52, -49, -58, -53, -60, 125, -58, -54, -51, -52, -48, -48, -58, -65, -55, -42, 125, -55, -66, -49, -60, -62, 125, -66, -46, -63, -58, -52, 125, -55, -66, -47, -62, -53, -64, -42, -105, 125, -92, -63, -58, -61, -70, -64, -58, -60, 113, -78, -58, -75, -70, -64, 113, -59, -70, -66, -74, -60, -59, -78, -66, -63, 113, 121, -73, -61, -78, -66, -74, 113, -63, -64, -60, -70, -59, -70, -64, -65, 113, -66, -70, -60, -66, -78, -59, -76, -71, 122, -117, 113, 118, -109, -104, -107, -116, -110, -104, -106, Field.INCLUDEPICTURE, -124, -104, -121, -116, -110, Field.INCLUDEPICTURE, -105, -116, -112, -120, -106, -105, -124, -112, -109, Field.INCLUDEPICTURE, Field.MERGESEQ, -106, -100, -106, -105, -120, -112, Field.INCLUDEPICTURE, -122, -113, -110, -122, -114, Field.INCLUDEPICTURE, -112, -116, -106, -112, -124, -105, -122, -117, 76, Field.ADDRESSBLOCK, Field.INCLUDEPICTURE};
    }

    public Z4(Z3 z32) {
        this.A00 = z32;
    }

    public /* synthetic */ Z4(Z3 z32, B0 b02) {
        this(z32);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0699Ax
    public final void ACM(long j10) {
        Log.w(A00(2, 10, 85), A00(12, 41, 84) + j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0699Ax
    public final void ADB(long j10, long j11, long j12, long j13) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(53, 52, 72)).append(j10);
        String A00 = A00(0, 2, 3);
        StringBuilder append2 = append.append(A00).append(j11).append(A00).append(j12).append(A00).append(j13).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb2 = append3.append(A04).toString();
        if (!Z3.A0q) {
            String message = A00(2, 10, 85);
            Log.w(message, sb2);
            return;
        }
        throw new B3(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0699Ax
    public final void ADk(long j10, long j11, long j12, long j13) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(105, 50, 26)).append(j10);
        String A00 = A00(0, 2, 3);
        StringBuilder append2 = append.append(A00).append(j11).append(A00).append(j12).append(A00).append(j13).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb2 = append3.append(A04).toString();
        if (!Z3.A0q) {
            String message = A00(2, 10, 85);
            Log.w(message, sb2);
            return;
        }
        throw new B3(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0699Ax
    public final void ADt(int i10, long j10) {
        InterfaceC0693Ar interfaceC0693Ar;
        long j11;
        InterfaceC0693Ar interfaceC0693Ar2;
        interfaceC0693Ar = this.A00.A0R;
        if (interfaceC0693Ar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j11 = this.A00.A0E;
            long j12 = elapsedRealtime - j11;
            interfaceC0693Ar2 = this.A00.A0R;
            interfaceC0693Ar2.ADu(i10, j10, j12);
        }
    }
}
