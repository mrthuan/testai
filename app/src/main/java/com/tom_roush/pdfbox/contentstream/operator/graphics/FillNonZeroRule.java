package com.tom_roush.pdfbox.contentstream.operator.graphics;

import android.graphics.Path;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.cos.COSBase;
import java.util.List;

/* loaded from: classes2.dex */
public class FillNonZeroRule extends GraphicsOperatorProcessor {
    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public String getName() {
        return "f";
    }

    @Override // com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor
    public final void process(Operator operator, List<COSBase> list) {
        ((GraphicsOperatorProcessor) this).context.fillPath(Path.FillType.WINDING);
    }
}
