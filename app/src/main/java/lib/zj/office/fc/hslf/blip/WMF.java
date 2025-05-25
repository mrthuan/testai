package lib.zj.office.fc.hslf.blip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.hslf.blip.Metafile;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public final class WMF extends Metafile {

    /* loaded from: classes3.dex */
    public class AldusHeader {
        public static final int APMHEADER_KEY = -1698247209;
        public int bottom;
        public int checksum;
        public int handle;
        public int inch = 72;
        public int left;
        public int reserved;
        public int right;
        public int top;

        public AldusHeader() {
        }

        public int getChecksum() {
            return (((((-43247) ^ this.left) ^ this.top) ^ this.right) ^ this.bottom) ^ this.inch;
        }

        public int getSize() {
            return 22;
        }

        public void read(byte[] bArr, int i10) {
            int i11 = LittleEndian.getInt(bArr, i10);
            int i12 = i10 + 4;
            if (i11 == -1698247209) {
                this.handle = LittleEndian.getUShort(bArr, i12);
                int i13 = i12 + 2;
                this.left = LittleEndian.getUShort(bArr, i13);
                int i14 = i13 + 2;
                this.top = LittleEndian.getUShort(bArr, i14);
                int i15 = i14 + 2;
                this.right = LittleEndian.getUShort(bArr, i15);
                int i16 = i15 + 2;
                this.bottom = LittleEndian.getUShort(bArr, i16);
                int i17 = i16 + 2;
                this.inch = LittleEndian.getUShort(bArr, i17);
                int i18 = i17 + 2;
                this.reserved = LittleEndian.getInt(bArr, i18);
                this.checksum = LittleEndian.getShort(bArr, i18 + 4);
                getChecksum();
                return;
            }
            throw new HSLFException("Not a valid WMF file");
        }

        public void write(OutputStream outputStream) {
            byte[] bArr = new byte[22];
            LittleEndian.putInt(bArr, 0, APMHEADER_KEY);
            LittleEndian.putUShort(bArr, 4, 0);
            LittleEndian.putUShort(bArr, 6, this.left);
            LittleEndian.putUShort(bArr, 8, this.top);
            LittleEndian.putUShort(bArr, 10, this.right);
            LittleEndian.putUShort(bArr, 12, this.bottom);
            LittleEndian.putUShort(bArr, 14, this.inch);
            LittleEndian.putInt(bArr, 16, 0);
            int checksum = getChecksum();
            this.checksum = checksum;
            LittleEndian.putUShort(bArr, 20, checksum);
            outputStream.write(bArr);
        }
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public byte[] getData() {
        try {
            byte[] rawData = getRawData();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(rawData);
            byteArrayInputStream.skip(8L);
            Metafile.Header header = new Metafile.Header();
            header.read(rawData, 16);
            byteArrayInputStream.skip(header.getSize() + 16);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inflaterInputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inflaterInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            throw new HSLFException(e10);
        }
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getSignature() {
        return 8544;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getType() {
        return 3;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public void setData(byte[] bArr) {
        AldusHeader aldusHeader = new AldusHeader();
        aldusHeader.read(bArr, 0);
        int size = aldusHeader.getSize() + 0;
        byte[] compress = compress(bArr, size, bArr.length - size);
        Metafile.Header header = new Metafile.Header();
        header.wmfsize = bArr.length - aldusHeader.getSize();
        int i10 = aldusHeader.left;
        int i11 = aldusHeader.top;
        Rectangle rectangle = new Rectangle((short) i10, (short) i11, ((short) aldusHeader.right) - ((short) i10), ((short) aldusHeader.bottom) - ((short) i11));
        header.bounds = rectangle;
        int i12 = 1219200 / aldusHeader.inch;
        header.size = new Dimension(rectangle.width * i12, rectangle.height * i12);
        header.zipsize = compress.length;
        byte[] checksum = PictureData.getChecksum(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(checksum);
        header.write(byteArrayOutputStream);
        byteArrayOutputStream.write(compress);
        setRawData(byteArrayOutputStream.toByteArray());
    }
}
