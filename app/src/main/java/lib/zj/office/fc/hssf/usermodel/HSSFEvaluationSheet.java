package lib.zj.office.fc.hssf.usermodel;

import di.a;
import di.b;
import di.c;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationSheet;

/* loaded from: classes3.dex */
class HSSFEvaluationSheet implements EvaluationSheet {
    private c _hs;

    public HSSFEvaluationSheet(c cVar) {
        this._hs = cVar;
    }

    public c getASheet() {
        return this._hs;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationSheet
    public EvaluationCell getCell(int i10, int i11) {
        a aVar;
        b bVar = (b) this._hs.g(i10);
        if (bVar == null || (aVar = (a) bVar.e(i11, true)) == null) {
            return null;
        }
        return new HSSFEvaluationCell(aVar, this);
    }

    public void setASheet(c cVar) {
        this._hs = cVar;
    }
}
