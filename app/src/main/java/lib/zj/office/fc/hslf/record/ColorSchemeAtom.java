package lib.zj.office.fc.hslf.record;

import a6.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ColorSchemeAtom extends RecordAtom {
    private static long _type = 2032;
    private byte[] _header;
    private int accentAndFollowingHyperlinkColourRGB;
    private int accentAndHyperlinkColourRGB;
    private int accentColourRGB;
    private int backgroundColourRGB;
    private int fillsColourRGB;
    private int shadowsColourRGB;
    private int textAndLinesColourRGB;
    private int titleTextColourRGB;

    public ColorSchemeAtom(byte[] bArr, int i10, int i11) {
        if (i11 < 40 && bArr.length - i10 < 40) {
            throw new RuntimeException("Not enough data to form a ColorSchemeAtom (always 40 bytes long) - found " + (bArr.length - i10));
        }
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i10 + 8;
        this.backgroundColourRGB = LittleEndian.getInt(bArr, i12 + 0);
        this.textAndLinesColourRGB = LittleEndian.getInt(bArr, i12 + 4);
        this.shadowsColourRGB = LittleEndian.getInt(bArr, i12 + 8);
        this.titleTextColourRGB = LittleEndian.getInt(bArr, i12 + 12);
        this.fillsColourRGB = LittleEndian.getInt(bArr, i12 + 16);
        this.accentColourRGB = LittleEndian.getInt(bArr, i12 + 20);
        this.accentAndHyperlinkColourRGB = LittleEndian.getInt(bArr, i12 + 24);
        this.accentAndFollowingHyperlinkColourRGB = LittleEndian.getInt(bArr, i12 + 28);
    }

    public static int joinRGB(byte b10, byte b11, byte b12) {
        return joinRGB(new byte[]{b10, b11, b12});
    }

    public static byte[] splitRGB(int i10) {
        byte[] bArr = new byte[3];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Record.writeLittleEndian(i10, byteArrayOutputStream);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 0, 3);
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public int getAccentAndFollowingHyperlinkColourRGB() {
        return this.accentAndFollowingHyperlinkColourRGB;
    }

    public int getAccentAndHyperlinkColourRGB() {
        return this.accentAndHyperlinkColourRGB;
    }

    public int getAccentColourRGB() {
        return this.accentColourRGB;
    }

    public int getBackgroundColourRGB() {
        return this.backgroundColourRGB;
    }

    public int getColor(int i10) {
        return new int[]{this.backgroundColourRGB, this.textAndLinesColourRGB, this.shadowsColourRGB, this.titleTextColourRGB, this.fillsColourRGB, this.accentColourRGB, this.accentAndHyperlinkColourRGB, this.accentAndFollowingHyperlinkColourRGB}[i10];
    }

    public int getFillsColourRGB() {
        return this.fillsColourRGB;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public int getShadowsColourRGB() {
        return this.shadowsColourRGB;
    }

    public int getTextAndLinesColourRGB() {
        return this.textAndLinesColourRGB;
    }

    public int getTitleTextColourRGB() {
        return this.titleTextColourRGB;
    }

    public void setAccentAndFollowingHyperlinkColourRGB(int i10) {
        this.accentAndFollowingHyperlinkColourRGB = i10;
    }

    public void setAccentAndHyperlinkColourRGB(int i10) {
        this.accentAndHyperlinkColourRGB = i10;
    }

    public void setAccentColourRGB(int i10) {
        this.accentColourRGB = i10;
    }

    public void setBackgroundColourRGB(int i10) {
        this.backgroundColourRGB = i10;
    }

    public void setFillsColourRGB(int i10) {
        this.fillsColourRGB = i10;
    }

    public void setShadowsColourRGB(int i10) {
        this.shadowsColourRGB = i10;
    }

    public void setTextAndLinesColourRGB(int i10) {
        this.textAndLinesColourRGB = i10;
    }

    public void setTitleTextColourRGB(int i10) {
        this.titleTextColourRGB = i10;
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        Record.writeLittleEndian(this.backgroundColourRGB, outputStream);
        Record.writeLittleEndian(this.textAndLinesColourRGB, outputStream);
        Record.writeLittleEndian(this.shadowsColourRGB, outputStream);
        Record.writeLittleEndian(this.titleTextColourRGB, outputStream);
        Record.writeLittleEndian(this.fillsColourRGB, outputStream);
        Record.writeLittleEndian(this.accentColourRGB, outputStream);
        Record.writeLittleEndian(this.accentAndHyperlinkColourRGB, outputStream);
        Record.writeLittleEndian(this.accentAndFollowingHyperlinkColourRGB, outputStream);
    }

    public static int joinRGB(byte[] bArr) {
        if (bArr.length == 3) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 3);
            bArr2[3] = 0;
            return LittleEndian.getInt(bArr2, 0);
        }
        throw new RuntimeException(h.g(new StringBuilder("joinRGB accepts a byte array of 3 values, but got one of "), bArr.length, " values!"));
    }

    public ColorSchemeAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 16);
        LittleEndian.putUShort(this._header, 2, (int) _type);
        LittleEndian.putInt(this._header, 4, 32);
        this.backgroundColourRGB = 16777215;
        this.textAndLinesColourRGB = 0;
        this.shadowsColourRGB = 8421504;
        this.titleTextColourRGB = 0;
        this.fillsColourRGB = 10079232;
        this.accentColourRGB = 13382451;
        this.accentAndHyperlinkColourRGB = 16764108;
        this.accentAndFollowingHyperlinkColourRGB = 11711154;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
