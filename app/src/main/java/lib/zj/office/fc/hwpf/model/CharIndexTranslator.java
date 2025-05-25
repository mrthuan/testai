package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public interface CharIndexTranslator {
    int getByteIndex(int i10);

    int getCharIndex(int i10);

    int getCharIndex(int i10, int i11);

    boolean isIndexInTable(int i10);

    int lookIndexBackward(int i10);

    int lookIndexForward(int i10);
}
