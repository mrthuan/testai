package lib.zj.office.fc.hwpf.model;

import androidx.activity.f;
import lib.zj.office.fc.hwpf.model.BytePropertyNode;

@Deprecated
/* loaded from: classes3.dex */
public abstract class BytePropertyNode<T extends BytePropertyNode<T>> extends PropertyNode<T> {
    private final int endBytes;
    private final int startBytes;

    public BytePropertyNode(int i10, int i11, CharIndexTranslator charIndexTranslator, Object obj) {
        super(charIndexTranslator.getCharIndex(i10), charIndexTranslator.getCharIndex(i11, charIndexTranslator.getCharIndex(i10)), obj);
        if (i10 <= i11) {
            this.startBytes = i10;
            this.endBytes = i11;
            return;
        }
        throw new IllegalArgumentException(f.k("fcStart (", i10, ") > fcEnd (", i11, ")"));
    }

    @Deprecated
    public int getEndBytes() {
        return this.endBytes;
    }

    @Deprecated
    public int getStartBytes() {
        return this.startBytes;
    }

    public BytePropertyNode(int i10, int i11, Object obj) {
        super(i10, i11, obj);
        if (i10 <= i11) {
            this.startBytes = -1;
            this.endBytes = -1;
            return;
        }
        throw new IllegalArgumentException(f.k("charStart (", i10, ") > charEnd (", i11, ")"));
    }
}
