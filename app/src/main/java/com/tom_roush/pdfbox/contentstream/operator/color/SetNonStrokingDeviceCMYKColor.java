package com.tom_roush.pdfbox.contentstream.operator.color;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.List;

/* loaded from: classes2.dex */
public class SetNonStrokingDeviceCMYKColor extends SetNonStrokingColor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetNonStrokingColor, com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.NON_STROKING_CMYK;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor, com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        this.context.getGraphicsState().setNonStrokingColorSpace(this.context.getResources().getColorSpace(COSName.DEVICECMYK));
        super.process(operator, list);
    }
}
