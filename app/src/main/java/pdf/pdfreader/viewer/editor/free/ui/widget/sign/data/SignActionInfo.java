package pdf.pdfreader.viewer.editor.free.ui.widget.sign.data;

import java.io.Serializable;
import kj.b;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* loaded from: classes3.dex */
public class SignActionInfo implements Serializable {
    private SignAction action;
    private int[] pageViewInt;
    private int pdfPageIndex;
    private float scale;
    private SignPathActionInfo signPathActionInfo;
    private b stampAnnotData;

    public SignActionInfo() {
    }

    public SignAction getAction() {
        return this.action;
    }

    public int[] getPageViewInt() {
        return this.pageViewInt;
    }

    public int getPdfPageIndex() {
        return this.pdfPageIndex;
    }

    public float getScale() {
        return this.scale;
    }

    public SignPathActionInfo getSignPathActionInfo() {
        return this.signPathActionInfo;
    }

    public b getStampAnnotData() {
        return this.stampAnnotData;
    }

    public void setAction(SignAction signAction) {
        this.action = signAction;
    }

    public void setPageViewInt(int[] iArr) {
        this.pageViewInt = iArr;
    }

    public void setPdfPageIndex(int i10) {
        this.pdfPageIndex = i10;
    }

    public void setScale(float f10) {
        this.scale = f10;
    }

    public void setSignPathActionInfo(SignPathActionInfo signPathActionInfo) {
        if (signPathActionInfo != null) {
            this.signPathActionInfo = signPathActionInfo.clone();
        }
    }

    public void setStampAnnotData(b bVar) {
        this.stampAnnotData = bVar;
    }

    public SignActionInfo(SignActionInfo signActionInfo) {
        this.action = signActionInfo.action;
        this.pdfPageIndex = signActionInfo.pdfPageIndex;
        this.pageViewInt = signActionInfo.pageViewInt;
        this.stampAnnotData = new b(signActionInfo.stampAnnotData);
        this.scale = signActionInfo.scale;
        SignPathActionInfo signPathActionInfo = signActionInfo.signPathActionInfo;
        if (signPathActionInfo != null) {
            this.signPathActionInfo = signPathActionInfo.clone();
        }
    }
}
