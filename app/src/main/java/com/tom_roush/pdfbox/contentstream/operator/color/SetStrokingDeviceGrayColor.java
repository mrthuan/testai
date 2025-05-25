package com.tom_roush.pdfbox.contentstream.operator.color;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import java.util.List;

/* loaded from: classes2.dex */
public class SetStrokingDeviceGrayColor extends SetStrokingColor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetStrokingColor, com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return OperatorName.STROKING_COLOR_GRAY;
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.color.SetColor, com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public void process(Operator operator, List<COSBase> list) {
        this.context.getGraphicsState().setStrokingColorSpace(this.context.getResources().getColorSpace(COSName.DEVICEGRAY));
        super.process(operator, list);
    }
}
