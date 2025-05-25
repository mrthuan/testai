package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class RW {
    public static RW A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public EL A00;
    public HP A01;
    public File A02;
    public boolean A03;
    public final C1313Zr A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<RU> A05 = new SparseArray<>();
    public final Runnable A08 = new RT(this);
    public final EE A07 = new C0948Lm(this);

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{11, 105, 82, Field.SHAPE, 78, Field.HYPERLINK, 17, 11, Field.IMPORT, 117, 110, 99, 114, 100, Field.IMPORT, 31, Field.AUTONUMOUT, 44, Field.AUTONUMLGL, Field.IMPORT, Field.AUTONUMOUT, 58, Field.BARCODE, Field.USERADDRESS, Field.BARCODE, 117, 123, 8, Field.GLOSSARY, 58, Field.GLOSSARY, Field.USERADDRESS, 97, 123, Field.FORMTEXT, 113, 113, 108, 113, Field.DDE, Field.QUOTE, 80, 119, 98, 119, 102, Field.SYMBOL, Field.QUOTE, Field.DOCPROPERTY, 96, 114, 106, Field.NOTEREF, 77, Field.FORMCHECKBOX, Field.GREETINGLINE, 4, Field.NOTEREF, 74, Field.ADDRESSBLOCK, 64, Field.FORMTEXT, Field.FORMCHECKBOX, Field.LISTNUM, 60, Field.SYMBOL, Field.MACROBUTTON, 42, 112, Field.SYMBOL, Field.GOTOBUTTON, 42, Field.MACROBUTTON, Field.EQ, Field.GOTOBUTTON, 60, Field.SYMBOL, Field.DDEAUTO, 26, 31, 8, Field.AUTOTEXTLIST, Field.HTMLCONTROL, Field.AUTOTEXTLIST, 82, Field.SHAPE};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C1250Xd.A02};
    }

    public RW(C1313Zr c1313Zr, EL el2) {
        this.A06 = c1313Zr;
        if (el2 != null) {
            this.A00 = el2;
            el2.A0R(this.A07);
        }
        A01().A0Q();
    }

    private synchronized EL A01() {
        if (this.A00 == null) {
            this.A00 = new EL(new EQ(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 44)), A0B);
            this.A00.A0R(this.A07);
        }
        return this.A00;
    }

    private AnonymousClass41 A02() {
        return new AnonymousClass41(A07(78, 3, 126), null);
    }

    private final synchronized HP A03() {
        if (this.A01 == null) {
            this.A01 = new C1232Wl(new File(A06(), A07(64, 14, 88)), new CY(C0877Im.A0R(this.A06)));
        }
        return this.A01;
    }

    public static C1235Wo A04(X4 x4, HP hp2) {
        return new C1235Wo(hp2, x4, new X0(), null, 2, null);
    }

    public static synchronized RW A05(C1313Zr c1313Zr) {
        RW rw;
        synchronized (RW.class) {
            if (A09 == null) {
                A09 = new RW(c1313Zr, null);
            }
            rw = A09;
        }
        return rw;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static String A08(C1313Zr c1313Zr, Uri uri) {
        try {
            if (!C0877Im.A1m(c1313Zr)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            c1313Zr.A07().AA0(A07(81, 5, 63), C8E.A0u, new C8F(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        EK[] A0T;
        for (EK ek2 : A01().A0T()) {
            int taskId = ek2.A02;
            RU ru = this.A05.get(taskId);
            if (ru != null) {
                int i10 = ek2.A01;
                if (i10 == 2 || ek2.A03 > ru.A00) {
                    String str = A07(15, 19, 94) + i10 + A07(0, 8, 46) + ek2.A03;
                    ru.A01.ABm(ru.A02);
                    this.A05.remove(taskId);
                } else if (i10 == 4 || i10 == 3) {
                    String str2 = A07(34, 14, 6) + i10;
                    ru.A01.ABu(ek2.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 4) + taskId + A07(8, 7, 18) + ek2.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final C1235Wo A0F(Context context) {
        return A04(new X4(context, (HL<? super InterfaceC0838Gz>) null, A02()), A03());
    }

    public final void A0G(Uri uri, RV rv, long j10) {
        String A08 = A08(this.A06, uri);
        if (A08 == null) {
            A08 = uri.toString();
        }
        boolean A0H = A0H(A08);
        this.A05.put(A01().A0P(new C1250Xd(uri, false, null, A08)), new RU(rv, j10, A0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A6e(str, 0L, 1L) > 0;
    }
}
