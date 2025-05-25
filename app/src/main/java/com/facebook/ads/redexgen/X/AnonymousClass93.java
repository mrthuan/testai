package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.93  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass93 implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"t11y9BgCyC0qQkG3mYUymtEDmEyKV4hc", "7ce9erzyyNrxlxET0sEMje4IREmhCp4i", "4ENs57XqgWmyHBJWN23MJhXXMCaaLz6e", "dr2xNsWDGhc5qlQtklfNqpJl8", "q35Tkz9qNjTEzRlngCIyL7KdK6wO30wH", "vPiuZupP6WnF44bZrTOwEQFi3wuHod3P", "O8XwwgRKslyLqfo5O4ZQvZ7SdPHYsu5Q", ""};
    public AnonymousClass94 A00;
    public boolean A01;
    public final RandomAccessFile A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{26, 76, Field.TOA, 74, Field.FORMTEXT, Field.TOA, 29, 64, Field.INCLUDEPICTURE, 60, -9, 64, 74, -9, 56, Field.INCLUDEPICTURE, Field.TOA, 60, 56, 59, 80, -9, 58, Field.INCLUDEPICTURE, Field.FORMTEXT, 74, 60, 59, Field.FILLIN, 76, Field.ADVANCE, Field.BARCODE, 74, Field.FORMCHECKBOX, Field.SECTIONPAGES, -2, 78, 77, Field.ADDIN, Field.FORMCHECKBOX, 82, Field.FORMCHECKBOX, 77, 76, 24, -2, 6, 3, Field.SECTIONPAGES, 10, 3, Field.SECTIONPAGES, 7, 32, Field.PAGEREF, 33};
    }

    static {
        A02();
    }

    public AnonymousClass93(File file) throws IOException {
        this.A02 = new RandomAccessFile(file, A00(53, 3, 59));
        if (this.A02.length() != 8) {
            this.A02.setLength(8L);
            this.A00 = new AnonymousClass94(0, 0);
            A01();
            return;
        }
        int readInt = this.A02.readInt();
        int index = this.A02.readInt();
        if (readInt < 0 || index < 0) {
            readInt = 0;
            index = 0;
        }
        this.A00 = new AnonymousClass94(readInt, index);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final AnonymousClass94 A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(0, 28, 100));
    }

    public final void A04(AnonymousClass94 anonymousClass94) throws IOException {
        if (!this.A01) {
            int A02 = anonymousClass94.A02();
            String[] strArr = A04;
            if (strArr[6].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            A04[2] = "wZJ8kWRxyYeI3b89D2ZfjwX8MEoFWOZU";
            if (A02 >= 0 && anonymousClass94.A03() >= 0) {
                this.A00 = anonymousClass94;
                A01();
                return;
            }
            throw new IOException(String.format(Locale.US, A00(28, 25, 107), Integer.valueOf(anonymousClass94.A02()), Integer.valueOf(anonymousClass94.A03())));
        }
        throw new IOException(A00(0, 28, 100));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}
