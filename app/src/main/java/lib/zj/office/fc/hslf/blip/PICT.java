package lib.zj.office.fc.hslf.blip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.hslf.blip.Metafile;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public final class PICT extends Metafile {
    private byte[] read(byte[] bArr, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Metafile.Header header = new Metafile.Header();
        header.read(bArr, i10);
        byteArrayInputStream.skip(header.getSize() + i10);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read = inflaterInputStream.read(bArr2);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                inflaterInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public byte[] getData() {
        byte[] read;
        byte[] rawData = getRawData();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(new byte[512]);
            try {
                read = read(rawData, 16);
            } catch (IOException unused) {
                read = read(rawData, 32);
            }
            byteArrayOutputStream.write(read);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new HSLFException(e10);
        }
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getSignature() {
        return 21552;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getType() {
        return 4;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public void setData(byte[] bArr) {
        byte[] compress = compress(bArr, 512, bArr.length - 512);
        Metafile.Header header = new Metafile.Header();
        header.wmfsize = bArr.length - 512;
        Rectangle rectangle = new Rectangle(0, 0, 200, 200);
        header.bounds = rectangle;
        header.size = new Dimension(rectangle.width * 12700, rectangle.height * 12700);
        header.zipsize = compress.length;
        byte[] checksum = PictureData.getChecksum(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(checksum);
        byteArrayOutputStream.write(new byte[16]);
        header.write(byteArrayOutputStream);
        byteArrayOutputStream.write(compress);
        setRawData(byteArrayOutputStream.toByteArray());
    }
}
