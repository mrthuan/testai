package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.hssf.usermodel.IClientAnchor;

/* loaded from: classes3.dex */
public interface CreationHelper {
    IClientAnchor createClientAnchor();

    DataFormat createDataFormat();

    FormulaEvaluator createFormulaEvaluator();

    IHyperlink createHyperlink(int i10);

    RichTextString createRichTextString(String str);
}
