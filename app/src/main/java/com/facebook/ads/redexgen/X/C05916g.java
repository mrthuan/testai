package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.6g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05916g {
    public static byte[] A02;
    public static String[] A03 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A04;
    public static volatile C05916g A05;
    public final C1313Zr A00;
    public final Map<String, C05886d> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C7j c7j, C05886d c05886d, String str) {
        Bitmap A01;
        String str2 = c05886d.A07;
        int i10 = c05886d.A03;
        int i11 = c05886d.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e10 = null;
        String A08 = A08(223, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(UnknownRecord.PHONETICPR_00EF, 22, 119);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i10, i11)) {
                        try {
                            A01 = AbstractC05956k.A01(inputStream, i10, i11);
                        } catch (IOException e11) {
                            e = e11;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e12) {
                            e = e12;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (IOException e13) {
                    e = e13;
                } catch (OutOfMemoryError e14) {
                    e = e14;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else if (A0C(i10, i11)) {
            try {
                A01 = A05(str2, i10, i11);
            } catch (IOException e15) {
                e10 = e15;
                A0B(e10);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        String th5 = e10 != null ? e10.toString() : null;
        if (A01 == null) {
            C05936i.A03(c7j, c05886d, str, C05936i.A03, th5, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            C05936i.A03(c7j, c05886d, str, C05936i.A02, th5, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        C05936i.A03(c7j, c05886d, str, C05936i.A01, th5, null, null);
        if (C0877Im.A0x(c7j)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{3, 4, 119, 41, Field.IMPORT, Field.USERADDRESS, 58, 25, Field.NUMCHARS, Field.HYPERLINK, 23, 13, 12, 8, 13, 12, Field.HYPERLINK, Field.NUMCHARS, 29, 11, 12, 17, 22, 25, 12, 17, 23, 22, Field.HYPERLINK, 80, 30, 17, 20, 29, Field.FILESIZE, 122, Field.ADDIN, 76, Field.DOCPROPERTY, Field.AUTOTEXTLIST, Field.NOTEREF, 24, Field.MERGESEQ, Field.ADDIN, Field.SECTIONPAGES, Field.ADDRESSBLOCK, 24, Field.ADDRESSBLOCK, 64, Field.HTMLCONTROL, Field.ADDRESSBLOCK, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, Field.MERGESEQ, 24, Field.DOCPROPERTY, Field.AUTOTEXTLIST, 64, 24, Field.MERGESEQ, Field.ADDIN, Field.SECTIONPAGES, Field.ADDRESSBLOCK, 24, Field.GREETINGLINE, Field.CONTROL, 74, 24, Field.MERGESEQ, 76, Field.CONTROL, 74, Field.AUTOTEXTLIST, Field.SHAPE, Field.ADDRESSBLOCK, 2, 24, 18, 48, Field.GOTOBUTTON, Field.SYMBOL, Field.AUTONUMOUT, 113, Field.AUTONUMOUT, Field.QUOTE, Field.QUOTE, Field.USERADDRESS, Field.QUOTE, Byte.MAX_VALUE, 113, 19, 56, Field.PAGEREF, 60, 48, 33, 113, 56, 34, 113, Field.BARCODE, 36, 61, 61, Byte.MAX_VALUE, 125, Field.LISTNUM, 82, Field.CONTROL, Field.GREETINGLINE, Field.SHAPE, Field.NUMWORDS, Field.AUTOTEXT, Field.ADVANCE, Field.NUMWORDS, Field.HYPERLINK, Field.ADVANCE, Field.MERGESEQ, Field.SECTIONPAGES, Field.NUMWORDS, Field.CONTROL, Field.ADVANCE, Field.HYPERLINK, Field.LISTNUM, Field.CONTROL, Field.NUMWORDS, 82, 86, Field.LISTNUM, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.NUMWORDS, 82, Field.DOCPROPERTY, Field.AUTOTEXT, Field.ADVANCE, Field.NUMWORDS, Field.HYPERLINK, Field.LISTNUM, Field.HYPERLINK, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.NUMWORDS, 19, 78, Field.TOA, Field.CONTROL, 6, Field.ASK, 29, 18, 17, 31, 22, Field.FORMDROPDOWN, 7, Field.NUMCHARS, Field.FORMDROPDOWN, 4, 1, 26, 7, 22, Field.FORMDROPDOWN, 17, 26, 7, 30, 18, 3, Field.FORMDROPDOWN, 7, Field.NUMCHARS, Field.FORMDROPDOWN, 21, 26, 31, 22, Field.FORMDROPDOWN, Field.HTMLCONTROL, 6, 1, 31, 78, Field.FORMTEXT, 125, 114, 113, Byte.MAX_VALUE, 118, Field.MACROBUTTON, 103, 124, Field.MACROBUTTON, 100, 97, 122, 103, 118, Field.MACROBUTTON, 113, 122, 103, 126, 114, 99, Field.MACROBUTTON, 103, 124, Field.MACROBUTTON, 124, 102, 103, 99, 102, 103, Field.MACROBUTTON, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, 61, Field.DATA, Field.DATA, Field.DATA, Field.DOCPROPERTY, Field.LISTNUM, Field.SHAPE, 86, 9, Field.NUMCHARS, Field.NUMCHARS, 82, Field.ADDRESSBLOCK, Field.HYPERLINK, Field.ADDIN, 14, Field.NUMWORDS, Field.NUMWORDS, Field.NUMWORDS, Field.DOCPROPERTY, Field.LISTNUM, 80, Field.FORMTEXT, Field.HTMLCONTROL, Field.ADDRESSBLOCK, 80, 107, Field.DOCPROPERTY, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.ADDIN, 64, Field.NUMWORDS, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, Field.EQ, Field.AUTONUMOUT, Field.EQ, 48, Field.DATA, Field.EQ};
    }

    static {
        A09();
        A04 = C05916g.class.getSimpleName();
    }

    public C05916g(C1313Zr c1313Zr) {
        this.A00 = c1313Zr;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C0877Im.A0G(this.A00)) {
                A0B(new Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e10) {
            A0B(e10);
            Log.e(A04, A08(ShapeTypes.PLAQUE_TABS, 39, 80), e10);
            return 0;
        } catch (FileNotFoundException e11) {
            Log.e(A04, A08(6, 29, 59) + file.getPath() + A08, e11);
            A0B(e11);
            return 0;
        } catch (IOException e12) {
            A0B(e12);
            Log.e(A04, A08(148, 36, 48) + str + A08, e12);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    private final Bitmap A01(C7j c7j, C05886d c05886d, int i10, int i11, String str) {
        if (C05936i.A06(c7j) && A08(266, 4, 37).equals(str)) {
            this.A01.put(c05886d.A07, c05886d);
        }
        String str2 = c05886d.A07;
        C05926h c05926h = new C05926h(c05886d.A05, c05886d.A06, A08(261, 5, 89), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            C05936i.A04(c7j, c05926h, false);
            String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A03[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A03[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(UnknownRecord.PHONETICPR_00EF, 22, 119);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i11, i10);
                }
            }
            return A02(c7j, c05886d, str);
        }
        C05936i.A04(c7j, c05926h, true);
        try {
            if (A0C(i11, i10)) {
                return AbstractC05956k.A02(file.getCanonicalPath(), i11, i10, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e10) {
            A0B(e10);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] A6W;
        InterfaceC1107Rp AER = S8.A00(this.A00).AER(str, new S4());
        if (AER == null || (A6W = AER.A6W()) == null) {
            return null;
        }
        int length = A6W.length;
        if (A03[4].charAt(22) != 'U') {
            A03[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
            return BitmapFactory.decodeByteArray(A6W, 0, length);
        }
        throw new RuntimeException();
    }

    private Bitmap A04(String str, int i10, int i11) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0C = A0C(i10, i11);
            String A08 = A08(232, 7, 112);
            if (A0C) {
                decodeStream = AbstractC05956k.A02(str.substring(A08.length()), i10, i11, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e10) {
            Log.e(A04, A08(105, 43, 120) + str + A08(0, 2, 105), e10);
        }
        if (C0877Im.A0x(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i10, int i11) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = AbstractC05956k.A01(inputStream, i10, i11);
        A0A(inputStream);
        return A01;
    }

    public static C05916g A06(C1313Zr c1313Zr) {
        if (A05 == null) {
            synchronized (C05916g.class) {
                if (A05 == null) {
                    A05 = new C05916g(c1313Zr);
                }
            }
        }
        return A05;
    }

    public static File A07(C7j c7j) {
        return c7j.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(Throwable th2) {
        String A08 = A08(261, 5, 89);
        if (th2 != null) {
            this.A00.A07().AA0(A08, C8E.A1f, new C8F(th2));
        } else {
            this.A00.A07().AA0(A08, C8E.A1f, new C8F(A08(77, 28, 18)));
        }
    }

    private boolean A0C(int i10, int i11) {
        return i10 > 0 && i11 > 0 && C0877Im.A1Q(this.A00);
    }

    public final Bitmap A0D(C05886d c05886d) {
        return A01(this.A00, c05886d, c05886d.A04, c05886d.A03, c05886d.A01);
    }

    public final Bitmap A0E(C7j c7j, String str, int i10, int i11, String str2) {
        C05886d c05886d = this.A01.get(str);
        return (!C05936i.A06(c7j) || c05886d == null) ? A01(c7j, new C05886d(str, i10, i11, A08(270, 7, 28), A08(270, 7, 28)), i11, i10, str2) : A01(c7j, c05886d, i11, i10, str2);
    }

    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
