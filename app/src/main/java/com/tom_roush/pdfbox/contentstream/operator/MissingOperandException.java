package com.tom_roush.pdfbox.contentstream.operator;

import com.tom_roush.pdfbox.cos.COSBase;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class MissingOperandException extends IOException {
    public MissingOperandException(Operator operator, List<COSBase> list) {
        super("Operator " + operator.getName() + " has too few operands: " + list);
    }
}
