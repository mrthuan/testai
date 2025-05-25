package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class E1 {
    public static byte[] A02;
    public static String[] A03 = {"bVxMbGWMA9jVqolFs2HsJgUnCU8MCanK", "OCmo2WCRSteO5ntkzBQCJXTiECLA8K2u", "6FY1eZNyDjZQrv8KxagfJj6lvFVpVQ54", "zrL5IKpuegwH8b9kbv5GAokwitjsOCQV", "dSxtxdluyuZ2vzWHskdughm6oHyQGkXe", "vqCArik978fx6oGYvzvdV3Nkzt", "3IzFa4dcZPuwN51Jo", "aZPQYxeTAZ4iEKfn1v1X1lDpWQYDsyvs"};
    public final C0846Hh A00;
    public final File A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{125, Field.FORMTEXT, Field.HTMLCONTROL, Field.ADDRESSBLOCK, Field.HYPERLINK, Field.HYPERLINK, Field.FORMCHECKBOX, Field.LISTNUM, Field.BIDIOUTLINE, 77, 76, 8, Field.TOA, Field.MERGESEQ, Field.BIDIOUTLINE, Field.SECTION, Field.FORMCHECKBOX, Field.FORMTEXT, 8, 78, Field.SECTION, Field.INCLUDETEXT, 77, 8, Field.GREETINGLINE, 77, Field.LISTNUM, Field.HTMLCONTROL, Field.SECTION, Field.FORMCHECKBOX, Field.FORMTEXT, 18, 8};
    }

    static {
        A01();
    }

    public E1(File file) {
        this.A01 = file;
        this.A00 = new C0846Hh(file);
    }

    public final void A02(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(this.A00.A03());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (DownloadAction downloadAction : downloadActionArr) {
                DownloadAction.A03(downloadAction, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            IK.A0X(null);
        } catch (Throwable th2) {
            IK.A0X(dataOutputStream);
            throw th2;
        }
    }

    public final DownloadAction[] A03(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.A01.exists()) {
            return new DownloadAction[0];
        }
        try {
            InputStream A04 = this.A00.A04();
            DataInputStream dataInputStream = new DataInputStream(A04);
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                int version = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[version];
                for (int i10 = 0; i10 < version; i10++) {
                    downloadActionArr[i10] = DownloadAction.A00(deserializerArr, dataInputStream);
                }
                IK.A0X(A04);
                if (A03[5].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[2] = "8ap1sevifaKfOHRAR0hSzB2Z0Rzpwosq";
                strArr[4] = "H4WTbGVyDanNwNDCQrC8WYgXSDH9x91J";
                return downloadActionArr;
            }
            throw new IOException(A00(0, 33, 72) + readInt);
        } catch (Throwable th2) {
            IK.A0X(null);
            throw th2;
        }
    }
}
