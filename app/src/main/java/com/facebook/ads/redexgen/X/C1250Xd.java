package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1250Xd extends DownloadAction {
    public static byte[] A01;
    public static final DownloadAction.Deserializer A02;
    public final String A00;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{4, 6, 3, -5, 6, -7, 7, 7, -3, 10, -7};
    }

    static {
        A06();
        A02 = new C1251Xe(A05(0, 11, 96), 0);
    }

    public C1250Xd(Uri uri, boolean z10, byte[] bArr, String str) {
        super(A05(0, 11, 96), 0, uri, z10, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    /* renamed from: A02 */
    public final C1249Xc A07(EQ eq) {
        return new C1249Xc(this.A01, this.A00, eq);
    }

    private String A04() {
        return this.A00 != null ? this.A00 : HV.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean customCacheKeySet = this.A00 != null;
        dataOutputStream.writeBoolean(customCacheKeySet);
        if (customCacheKeySet) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof C1250Xd) && A04().equals(((C1250Xd) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return IK.A0g(this.A00, ((C1250Xd) obj).A00);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i10 = result * 31;
        int result2 = this.A00 != null ? this.A00.hashCode() : 0;
        return i10 + result2;
    }
}
