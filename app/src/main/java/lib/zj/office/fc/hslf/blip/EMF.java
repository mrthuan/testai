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
public final class EMF extends Metafile {
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
        return 15680;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public int getType() {
        return 2;
    }

    @Override // lib.zj.office.fc.hslf.usermodel.PictureData
    public void setData(byte[] bArr) {
        byte[] compress = compress(bArr, 0, bArr.length);
        Metafile.Header header = new Metafile.Header();
        header.wmfsize = bArr.length;
        Rectangle rectangle = new Rectangle(0, 0, 200, 200);
        header.bounds = rectangle;
        header.size = new Dimension(rectangle.width * 12700, rectangle.height * 12700);
        header.zipsize = compress.length;
        byte[] checksum = PictureData.getChecksum(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(checksum);
        header.write(byteArrayOutputStream);
        byteArrayOutputStream.write(compress);
        setRawData(byteArrayOutputStream.toByteArray());
    }
}
