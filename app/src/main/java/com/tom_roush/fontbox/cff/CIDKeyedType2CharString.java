package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.type1.Type1CharStringReader;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class CIDKeyedType2CharString extends Type2CharString {
    private final int cid;

    public CIDKeyedType2CharString(Type1CharStringReader type1CharStringReader, String str, int i10, int i11, List<Object> list, int i12, int i13) {
        super(type1CharStringReader, str, String.format(Locale.US, "%04x", Integer.valueOf(i10)), i11, list, i12, i13);
        this.cid = i10;
    }

    public int getCID() {
        return this.cid;
    }
}
