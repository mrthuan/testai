package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Hh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0846Hh {
    public static byte[] A02;
    public static String[] A03 = {"r4Of0wVoQ7x8vSdw5k4cOwUy", "SKM8SxuU8FI4OrGYUrre", "mSRfdBodC53RqXobbh2wTfLqfyBx", "deMfggDHGm9MWnDWhK", "k8iQf9qcWVOKHK95vPBLm6lU2nxwg5zN", "JiFWpaVbUyZcE8LwR0m1MvC54Jb3gIYp", "GKunEG5yOJqaNbH3mPI7oznBCVpw", "jMnSVgsr3FTrj9LbEAIKMfI03N6v"};
    public final File A00;
    public final File A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Field.USERADDRESS, 106, 113, Field.USERADDRESS, 124, Byte.MAX_VALUE, 125, 117, 107, 110, Field.USERADDRESS, 120, 119, 114, 123, Field.USERADDRESS, Field.CONTROL, Field.NUMWORDS, 24, 18, 118, Field.INCLUDEPICTURE, Field.HYPERLINK, Field.LISTNUM, Field.GREETINGLINE, Field.ADVANCE, 113, Field.GREETINGLINE, Field.HTMLCONTROL, 82, 108, 64, Field.LISTNUM, Field.INCLUDEPICTURE, Field.MERGESEQ, Field.SECTION, 8, Field.HTMLCONTROL, 15, 76, Field.ADDRESSBLOCK, 74, 78, Field.HTMLCONTROL, 74, 15, 26, Field.AUTONUM, 44, Field.AUTONUMLGL, 61, Field.IMPORT, 126, Field.DDE, 121, 58, 43, 60, 56, Field.DDE, 60, 121, 61, 48, 43, 60, 58, Field.DDE, Field.AUTONUM, 43, 32, 121, Field.EQ, 29, 7, 30, 22, Field.NUMCHARS, Field.DOCPROPERTY, 6, 82, 0, 23, Field.NUMCHARS, 19, 31, 23, 82, 20, Field.NUMWORDS, 30, 23, 82};
    }

    static {
        A02();
    }

    public C0846Hh(File file) {
        this.A01 = file;
        this.A00 = new File(file.getPath() + A00(16, 4, ShapeTypes.VERTICAL_SCROLL));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    public final C0845Hg A03() throws IOException {
        if (this.A01.exists()) {
            if (!this.A00.exists()) {
                File file = this.A01;
                File file2 = this.A00;
                if (A03[5].charAt(1) != 'i') {
                    throw new RuntimeException();
                }
                A03[3] = "B6VpPQi7h5EoWnvRD6";
                if (!file.renameTo(file2)) {
                    Log.w(A00(20, 10, 49), A00(72, 21, 116) + this.A01 + A00(0, 16, 24) + this.A00);
                }
            } else {
                this.A01.delete();
            }
        }
        try {
            return new C0845Hg(this.A01);
        } catch (FileNotFoundException e10) {
            if (this.A01.getParentFile().mkdirs()) {
                try {
                    File parent = this.A01;
                    return new C0845Hg(parent);
                } catch (FileNotFoundException e11) {
                    throw new IOException(A00(30, 16, 41) + this.A01, e11);
                }
            }
            throw new IOException(A00(46, 26, 95) + this.A01, e10);
        }
    }

    public final InputStream A04() throws FileNotFoundException {
        A01();
        return new FileInputStream(this.A01);
    }

    public final void A05() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A06(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.A00.delete();
    }
}
