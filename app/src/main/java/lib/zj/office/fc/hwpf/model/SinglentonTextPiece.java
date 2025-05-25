package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public class SinglentonTextPiece extends TextPiece {
    public SinglentonTextPiece(StringBuilder sb2) {
        super(0, sb2.length(), sb2.toString().getBytes(CharEncoding.UTF_16LE), new PieceDescriptor(new byte[8], 0), 0);
    }

    @Override // lib.zj.office.fc.hwpf.model.TextPiece
    public int bytesLength() {
        return getStringBuilder().length() * 2;
    }

    @Override // lib.zj.office.fc.hwpf.model.TextPiece
    public int characterLength() {
        return getStringBuilder().length();
    }

    @Override // lib.zj.office.fc.hwpf.model.TextPiece
    public int getCP() {
        return 0;
    }

    @Override // lib.zj.office.fc.hwpf.model.PropertyNode
    public int getEnd() {
        return characterLength();
    }

    @Override // lib.zj.office.fc.hwpf.model.PropertyNode
    public int getStart() {
        return 0;
    }

    @Override // lib.zj.office.fc.hwpf.model.TextPiece
    public String toString() {
        return "SinglentonTextPiece (" + characterLength() + " chars)";
    }
}
