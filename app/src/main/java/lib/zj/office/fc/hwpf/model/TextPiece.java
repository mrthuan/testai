package lib.zj.office.fc.hwpf.model;

import a6.h;
import androidx.activity.f;
import androidx.appcompat.view.menu.d;
import b.a;
import java.io.UnsupportedEncodingException;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public class TextPiece extends PropertyNode<TextPiece> {
    private PieceDescriptor _pd;
    private boolean _usesUnicode;

    public TextPiece(int i10, int i11, byte[] bArr, PieceDescriptor pieceDescriptor, int i12) {
        this(i10, i11, bArr, 0, bArr.length, pieceDescriptor);
    }

    private static StringBuilder buildInitSB(byte[] bArr, int i10, int i11, PieceDescriptor pieceDescriptor) {
        String str;
        try {
            if (pieceDescriptor.isUnicode()) {
                str = new String(bArr, i10, i11, CharEncoding.UTF_16LE);
            } else {
                str = new String(bArr, i10, i11, "Cp1252");
            }
            return new StringBuilder(str);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("Your Java is broken! It doesn't know about basic, required character encodings!");
        }
    }

    @Override // lib.zj.office.fc.hwpf.model.PropertyNode
    @Deprecated
    public void adjustForDelete(int i10, int i11) {
        int start = getStart();
        int end = getEnd();
        int i12 = i10 + i11;
        if (i10 <= end && i12 >= start) {
            ((StringBuilder) this._buf).delete(Math.max(start, i10) - start, Math.min(end, i12) - start);
        }
        super.adjustForDelete(i10, i11);
    }

    public int bytesLength() {
        int i10;
        int end = getEnd() - getStart();
        if (this._usesUnicode) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return end * i10;
    }

    @Deprecated
    public int characterLength() {
        return getEnd() - getStart();
    }

    @Override // lib.zj.office.fc.hwpf.model.PropertyNode
    public boolean equals(Object obj) {
        if (!limitsAreEqual(obj)) {
            return false;
        }
        TextPiece textPiece = (TextPiece) obj;
        if (!getStringBuilder().toString().equals(textPiece.getStringBuilder().toString()) || textPiece._usesUnicode != this._usesUnicode || !this._pd.equals(textPiece._pd)) {
            return false;
        }
        return true;
    }

    public int getCP() {
        return getStart();
    }

    public PieceDescriptor getPieceDescriptor() {
        return this._pd;
    }

    public byte[] getRawBytes() {
        String str;
        try {
            String charSequence = ((CharSequence) this._buf).toString();
            if (this._usesUnicode) {
                str = CharEncoding.UTF_16LE;
            } else {
                str = "Cp1252";
            }
            return charSequence.getBytes(str);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("Your Java is broken! It doesn't know about basic, required character encodings!");
        }
    }

    @Deprecated
    public StringBuffer getStringBuffer() {
        return new StringBuffer(getStringBuilder());
    }

    public StringBuilder getStringBuilder() {
        return (StringBuilder) this._buf;
    }

    public boolean isUnicode() {
        return this._usesUnicode;
    }

    @Deprecated
    public String substring(int i10, int i11) {
        StringBuilder sb2 = (StringBuilder) this._buf;
        if (i10 >= 0) {
            if (i11 <= sb2.length()) {
                if (i11 >= i10) {
                    return sb2.substring(i10, i11);
                }
                throw new StringIndexOutOfBoundsException(f.k("Asked for text from ", i10, " to ", i11, ", which has an end before the start!"));
            }
            StringBuilder e10 = d.e("Index ", i11, " out of range 0 -> ");
            e10.append(sb2.length());
            throw new StringIndexOutOfBoundsException(e10.toString());
        }
        throw new StringIndexOutOfBoundsException(a.c("Can't request a substring before 0 - asked for ", i10));
    }

    public String toString() {
        return "TextPiece from " + getStart() + " to " + getEnd() + " (" + getPieceDescriptor() + ")";
    }

    public TextPiece(int i10, int i11, byte[] bArr, int i12, int i13, PieceDescriptor pieceDescriptor) {
        super(i10, i11, buildInitSB(bArr, i12, i13, pieceDescriptor));
        this._usesUnicode = pieceDescriptor.isUnicode();
        this._pd = pieceDescriptor;
        int length = ((CharSequence) this._buf).length();
        if (i11 - i10 != length) {
            throw new IllegalStateException(h.g(a0.d.f("Told we're for characters ", i10, " -> ", i11, ", but actually covers "), length, " characters!"));
        }
        if (i11 < i10) {
            throw new IllegalStateException(a0.d.b("Told we're of negative size! start=", i10, " end=", i11));
        }
    }
}
