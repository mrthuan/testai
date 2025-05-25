package lib.zj.office.fc.hslf.blip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public abstract class Metafile extends PictureData {

    /* loaded from: classes3.dex */
    public static class Header {
        public Rectangle bounds;
        public int compression;
        public int filter = 254;
        public Dimension size;
        public int wmfsize;
        public int zipsize;

        public int getSize() {
            return 34;
        }

        public void read(byte[] bArr, int i10) {
            this.wmfsize = LittleEndian.getInt(bArr, i10);
            int i11 = i10 + 4;
            int i12 = LittleEndian.getInt(bArr, i11);
            int i13 = i11 + 4;
            int i14 = LittleEndian.getInt(bArr, i13);
            int i15 = i13 + 4;
            int i16 = LittleEndian.getInt(bArr, i15);
            int i17 = i15 + 4;
            int i18 = LittleEndian.getInt(bArr, i17);
            int i19 = i17 + 4;
            this.bounds = new Rectangle(i12, i14, i16 - i12, i18 - i14);
            int i20 = LittleEndian.getInt(bArr, i19);
            int i21 = i19 + 4;
            int i22 = LittleEndian.getInt(bArr, i21);
            int i23 = i21 + 4;
            this.size = new Dimension(i20, i22);
            this.zipsize = LittleEndian.getInt(bArr, i23);
            int i24 = i23 + 4;
            this.compression = LittleEndian.getUnsignedByte(bArr, i24);
            this.filter = LittleEndian.getUnsignedByte(bArr, i24 + 1);
        }

        public void write(OutputStream outputStream) {
            byte[] bArr = new byte[34];
            LittleEndian.putInt(bArr, 0, this.wmfsize);
            LittleEndian.putInt(bArr, 4, this.bounds.f20688x);
            LittleEndian.putInt(bArr, 8, this.bounds.f20689y);
            Rectangle rectangle = this.bounds;
            LittleEndian.putInt(bArr, 12, rectangle.f20688x + rectangle.width);
            Rectangle rectangle2 = this.bounds;
            LittleEndian.putInt(bArr, 16, rectangle2.f20689y + rectangle2.height);
            LittleEndian.putInt(bArr, 20, this.size.width);
            LittleEndian.putInt(bArr, 24, this.size.height);
            LittleEndian.putInt(bArr, 28, this.zipsize);
            bArr[32] = 0;
            bArr[33] = (byte) this.filter;
            outputStream.write(bArr);
        }
    }

    public byte[] compress(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(bArr, i10, i11);
        deflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public void writeByte_WMFAndEMF(FileOutputStream fileOutputStream) {
        try {
            byte[] rawData = getRawData();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(rawData);
            byteArrayInputStream.skip(8L);
            Header header = new Header();
            header.read(rawData, 16);
            byteArrayInputStream.skip(header.getSize() + 16);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inflaterInputStream.read(bArr);
                if (read >= 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    inflaterInputStream.close();
                    return;
                }
            }
        } catch (IOException e10) {
            throw new HSLFException(e10);
        }
    }
}
