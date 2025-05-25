package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.encoding.Encoding;

/* loaded from: classes2.dex */
public abstract class CFFEncoding extends Encoding {
    public void add(int i10, int i11, String str) {
        addCharacterEncoding(i10, str);
    }

    public void add(int i10, int i11) {
        addCharacterEncoding(i10, CFFStandardString.getName(i11));
    }
}
