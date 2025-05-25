package wi;

import android.graphics.Point;
import androidx.appcompat.widget.i;
import java.io.FileInputStream;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.AffineTransform;

/* compiled from: EMFInputStream.java */
/* loaded from: classes3.dex */
public final class c extends yi.e {

    /* renamed from: k  reason: collision with root package name */
    public a f31230k;

    public c(FileInputStream fileInputStream) {
        super(fileInputStream, new i(0));
    }

    public final byte[] h(int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = readByte();
        }
        return bArr;
    }

    public final Color i() {
        Color color = new Color(readUnsignedByte(), readUnsignedByte(), readUnsignedByte());
        readByte();
        return color;
    }

    public final Point j() {
        return new Point(readInt(), readInt());
    }

    public final Point[] k(int i10) {
        Point[] pointArr = new Point[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            pointArr[i11] = j();
        }
        return pointArr;
    }

    public final Point[] l(int i10) {
        Point[] pointArr = new Point[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            pointArr[i11] = new Point(readShort(), readShort());
        }
        return pointArr;
    }

    public final Rectangle m() {
        int readInt = readInt();
        int readInt2 = readInt();
        return new Rectangle(readInt, readInt2, readInt() - readInt, readInt() - readInt2);
    }

    public final Dimension n() {
        return new Dimension(readInt(), readInt());
    }

    public final String o(int i10) {
        int i11 = i10 * 2;
        byte[] b10 = b(i11);
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                if (b10[i12] == 0 && b10[i12 + 1] == 0) {
                    i11 = i12;
                    break;
                }
                i12 += 2;
            } else {
                break;
            }
        }
        return new String(b10, 0, i11, CharEncoding.UTF_16LE);
    }

    public final AffineTransform p() {
        return new AffineTransform(readFloat(), readFloat(), readFloat(), readFloat(), readFloat(), readFloat());
    }
}
