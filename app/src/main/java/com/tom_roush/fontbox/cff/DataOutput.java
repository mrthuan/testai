package com.tom_roush.fontbox.cff;

import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public class DataOutput {
    private ByteArrayOutputStream outputBuffer;
    private String outputEncoding;

    public DataOutput() {
        this(CharEncoding.ISO_8859_1);
    }

    public byte[] getBytes() {
        return this.outputBuffer.toByteArray();
    }

    public void print(String str) {
        write(str.getBytes(this.outputEncoding));
    }

    public void println(String str) {
        write(str.getBytes(this.outputEncoding));
        write(10);
    }

    public void write(int i10) {
        this.outputBuffer.write(i10);
    }

    public DataOutput(String str) {
        this.outputBuffer = new ByteArrayOutputStream();
        this.outputEncoding = str;
    }

    public void write(byte[] bArr) {
        this.outputBuffer.write(bArr, 0, bArr.length);
    }

    public void println() {
        write(10);
    }

    public void write(byte[] bArr, int i10, int i11) {
        this.outputBuffer.write(bArr, i10, i11);
    }
}
