package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: assets/audience_network.dex */
public final class HX {
    public static byte[] A08;
    public static String[] A09 = {"AHIWOTBqLsFh8yVD4eT", "RfXzku3q5WmG2dwMr9aGv1PO2Tu643QP", "gYjXpcqZdKU867vKm780EzJOh9fh4VMi", "b7mehy0psXOTQB1qmbSMVFvExNtg3f5i", "lZucwVR1KNE0YgyHfCu", "0xZP4ePzZZOv82loBTQ9GtJoppQQAkyQ", "cNsoVrvmf9xfmYCq", "sOhhdyOKaHYqXI9"};
    public IB A00;
    public boolean A01;
    public final SparseArray<String> A02;
    public final C0846Hh A03;
    public final HashMap<String, HW> A04;
    public final Cipher A05;
    public final SecretKeySpec A06;
    public final boolean A07;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-64, -60, -46, -19, -15, -1, -37, -17, -18, -17, -37, -4, -9, -17, -1, -31, -4, -19, -16, -16, -11, -6, -13, -69, -68, -50, -52, -50, -45, -48, -49, -54, -50, -38, -39, -33, -48, -39, -33, -54, -44, -39, -49, -48, -29, -103, -48, -29, -44};
        if (A09[7].length() == 9) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[3] = "Z5XQoI7gQuOqaokLvwGa1tSSGUTJY2q1";
        strArr[5] = "gxgDzLehiYOoOLS33ZU8tF3tX3vsG1ch";
        A08 = bArr;
    }

    static {
        A05();
    }

    public HX(File file, byte[] bArr, boolean z10) {
        this.A07 = z10;
        if (bArr != null) {
            AbstractC0844Hf.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new SecretKeySpec(bArr, A02(0, 3, 55));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            AbstractC0844Hf.A04(!z10);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A03 = new C0846Hh(new File(file, A02(25, 24, 35)));
    }

    public static int A00(SparseArray<String> idToKey) {
        int id2;
        int size = idToKey.size();
        if (size == 0) {
            id2 = 0;
        } else {
            int size2 = size - 1;
            id2 = idToKey.keyAt(size2) + 1;
        }
        if (id2 < 0) {
            id2 = 0;
            while (id2 < size) {
                int size3 = idToKey.keyAt(id2);
                if (id2 != size3) {
                    break;
                }
                id2++;
            }
        }
        return id2;
    }

    private HW A01(String str) {
        int id2 = A00(this.A02);
        HW cachedContent = new HW(id2, str);
        A06(cachedContent);
        this.A01 = true;
        return cachedContent;
    }

    public static Cipher A03() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i10 = IK.A02;
        String A02 = A02(3, 20, 100);
        if (i10 == 18) {
            try {
                return Cipher.getInstance(A02, A02(23, 2, 49));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(A02);
    }

    private void A04() throws HN {
        try {
            try {
                OutputStream outputStream = this.A03.A03();
                if (this.A00 == null) {
                    this.A00 = new IB(outputStream);
                } else {
                    this.A00.A00(outputStream);
                }
                DataOutputStream output = new DataOutputStream(this.A00);
                DataOutputStream dataOutputStream = output;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        DataOutputStream output2 = new DataOutputStream(new CipherOutputStream(this.A00, this.A05));
                        dataOutputStream = output2;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int i10 = 0;
                for (HW hw : this.A04.values()) {
                    hw.A0A(dataOutputStream);
                    i10 += hw.A03(2);
                }
                dataOutputStream.writeInt(i10);
                this.A03.A06(dataOutputStream);
                IK.A0X(null);
            } catch (IOException e11) {
                throw new HN(e11);
            }
        } catch (Throwable th2) {
            IK.A0X(null);
            throw th2;
        }
    }

    private void A06(HW hw) {
        this.A04.put(hw.A03, hw);
        this.A02.put(hw.A02, hw.A03);
    }

    private boolean A07() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A03.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int hashCode = dataInputStream.readInt();
            if (hashCode < 0 || hashCode > 2) {
                IK.A0X(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A05 == null) {
                    IK.A0X(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A05.init(2, this.A06, new IvParameterSpec(bArr));
                    DataInputStream input = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A05));
                    dataInputStream = input;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            } else if (this.A07) {
                this.A01 = true;
            }
            int i10 = dataInputStream.readInt();
            int flags = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                HW A00 = HW.A00(hashCode, dataInputStream);
                A06(A00);
                flags += A00.A03(hashCode);
                String[] strArr = A09;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new RuntimeException();
                }
                A09[7] = "0O666kd2GaR80yql0z2RR";
            }
            int readInt = dataInputStream.readInt();
            boolean z10 = dataInputStream.read() == -1;
            if (readInt != flags || !z10) {
                IK.A0X(dataInputStream);
                return false;
            }
            IK.A0X(dataInputStream);
            return true;
        } catch (IOException unused) {
            if (0 != 0) {
                IK.A0X(null);
            }
            return false;
        } catch (Throwable th2) {
            if (0 != 0) {
                IK.A0X(null);
            }
            throw th2;
        }
    }

    public final int A08(String str) {
        return A0A(str).A02;
    }

    public final HW A09(String str) {
        return this.A04.get(str);
    }

    public final HW A0A(String str) {
        HW cachedContent = this.A04.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final HZ A0B(String str) {
        HW cachedContent = A09(str);
        return cachedContent != null ? cachedContent.A05() : C1233Wm.A04;
    }

    public final String A0C(int i10) {
        return this.A02.get(i10);
    }

    public final Collection<HW> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        AbstractC0844Hf.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        String[] strArr = new String[this.A04.size()];
        this.A04.keySet().toArray(strArr);
        for (String str : strArr) {
            A0H(str);
        }
    }

    public final void A0G() throws HN {
        if (!this.A01) {
            return;
        }
        A04();
        String[] strArr = A09;
        if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[3] = "OJwnUNlvbPORry11yuYiVhFxi1f6FTd3";
        strArr2[5] = "di8S5pvaeiOMrEAjbzdNHFtXF5Gpf0YH";
        this.A01 = false;
    }

    public final void A0H(String str) {
        HW hw = this.A04.get(str);
        if (hw != null && hw.A0C() && !hw.A0D()) {
            this.A04.remove(str);
            this.A02.remove(hw.A02);
            this.A01 = true;
        }
    }

    public final void A0I(String str, C0840Hb c0840Hb) {
        HW cachedContent = A0A(str);
        if (cachedContent.A0F(c0840Hb)) {
            this.A01 = true;
        }
    }
}
