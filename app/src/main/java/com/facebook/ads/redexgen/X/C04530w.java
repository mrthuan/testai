package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04530w {
    public static C04530w A08;
    public static byte[] A09;
    public static final String A0A;
    public boolean A01;
    public final C7j A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final C04520v A02 = new C04520v();
    public String A00 = null;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A09 = new byte[]{Field.SECTION, 64, 82, Field.SYMBOL, 44, Field.HTMLCONTROL, Field.GREETINGLINE, Field.TOA, 121, Field.HTMLCONTROL, 74, 74, Field.FORMDROPDOWN, Field.ADVANCE, Field.ADDRESSBLOCK, 115, Field.ADVANCE, Field.BIDIOUTLINE, Field.DOCPROPERTY, 20, 78, Field.SECTIONPAGES, 78, Field.NOTEREF, 74, Field.HTMLCONTROL, Field.HTMLCONTROL, 78, Field.AUTOTEXT, 106, Field.AUTOTEXT, Field.HYPERLINK, 5, Field.SHAPE, Field.FORMDROPDOWN, Field.SHAPE, Field.SECTIONPAGES, 86, Field.SECTION, Field.DOCPROPERTY, Field.ADDIN, Field.SECTION, 74, Field.FORMCHECKBOX, Field.ADDRESSBLOCK, 123, Field.FORMCHECKBOX, Field.FILESIZE, Field.ADVANCE, Field.ADVANCE, 77, 74, Field.INCLUDEPICTURE};
    }

    static {
        A09();
        A0A = C04530w.class.getSimpleName();
    }

    public C04530w(C7j c7j, boolean z10, Executor executor, String str) {
        this.A03 = c7j.A01();
        this.A04 = str;
        this.A07 = executor;
        if (z10) {
            A0A();
        }
    }

    public static synchronized C04530w A01(C7j c7j) {
        C04530w c04530w;
        synchronized (C04530w.class) {
            if (A08 == null) {
                A08 = new C04530w(c7j, true, M8.A06, A03(0, 0, 18));
            }
            c04530w = A08;
        }
        return c04530w;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 18);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = A03(0, 5, 12);
                    A03 = new String(data, fileContent);
                }
            }
        } catch (FileNotFoundException e10) {
            this.A03.A07().AA0(A03(36, 17, 60), C8E.A17, new C8F(e10));
        } catch (IOException e11) {
            this.A03.A07().AA0(A03(36, 17, 60), C8E.A19, new C8F(e11));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 60);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 51)));
            this.A02.A0A(A04(A03(5, 18, 34)));
        } catch (C8F e10) {
            A0M();
            this.A03.A07().AA0(A03, C8E.A18, e10);
        } catch (JSONException e11) {
            A0M();
            this.A03.A07().AA0(A03, C8E.A1A, new C8F(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C1488cj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(C1S c1s, String str, boolean z10) {
        c1s.A07(z10);
        if (c1s.A08() || c1s.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 51), str.getBytes());
        A0H(A03(5, 18, 34), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                FileOutputStream fout = new FileOutputStream(file);
                fout.write(bArr);
                fout.close();
            }
        } catch (FileNotFoundException e10) {
            this.A03.A07().AA0(A03(36, 17, 60), C8E.A17, new C8F(e10));
        } catch (IOException e11) {
            this.A03.A07().AA0(A03(36, 17, 60), C8E.A19, new C8F(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z10 = false;
        try {
            synchronized (this.A02) {
                z10 = this.A02.A05().get(str) instanceof C1S;
            }
        } catch (JSONException e10) {
            this.A03.A07().AA0(A03(36, 17, 60), C8E.A1A, new C8F(e10));
        }
        return z10;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C1485cg(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 34));
        A0F(this.A04 + A03(23, 13, 51));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new C1486ch(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        this.A01 = C0877Im.A18(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new C1487ci(this, jSONObject));
    }
}
