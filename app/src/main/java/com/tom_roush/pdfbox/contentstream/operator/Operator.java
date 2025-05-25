package com.tom_roush.pdfbox.contentstream.operator;

import a6.h;
import androidx.activity.r;
import com.tom_roush.pdfbox.cos.COSDictionary;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public final class Operator {
    private static final ConcurrentMap<String, Operator> operators = new ConcurrentHashMap();
    private byte[] imageData;
    private COSDictionary imageParameters;
    private final String theOperator;

    private Operator(String str) {
        this.theOperator = str;
        if (!str.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
            return;
        }
        throw new IllegalArgumentException(h.d("Operators are not allowed to start with / '", str, OperatorName.SHOW_TEXT_LINE));
    }

    public static Operator getOperator(String str) {
        if (!str.equals(OperatorName.BEGIN_INLINE_IMAGE_DATA) && !OperatorName.BEGIN_INLINE_IMAGE.equals(str)) {
            ConcurrentMap<String, Operator> concurrentMap = operators;
            Operator operator = concurrentMap.get(str);
            if (operator == null) {
                Operator putIfAbsent = concurrentMap.putIfAbsent(str, new Operator(str));
                if (putIfAbsent == null) {
                    return concurrentMap.get(str);
                }
                return putIfAbsent;
            }
            return operator;
        }
        return new Operator(str);
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public COSDictionary getImageParameters() {
        return this.imageParameters;
    }

    public String getName() {
        return this.theOperator;
    }

    public void setImageData(byte[] bArr) {
        this.imageData = bArr;
    }

    public void setImageParameters(COSDictionary cOSDictionary) {
        this.imageParameters = cOSDictionary;
    }

    public String toString() {
        return r.g(new StringBuilder("PDFOperator{"), this.theOperator, "}");
    }
}
