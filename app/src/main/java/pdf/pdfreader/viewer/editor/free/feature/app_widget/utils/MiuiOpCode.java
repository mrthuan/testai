// Auto-fixed: added missing class declaration
public class MiuiOpCode {
package pdf.pdfreader.viewer.editor.free.feature.app_widget.utils;

import lib.zj.office.fc.hpsf.Constants;
import nm.a;

/* compiled from: AppOpsExt.kt */
/* loaded from: classes3.dex */
public enum MiuiOpCode implements a {
    OP_INSTALL_SHORTCUT(Constants.CP_MAC_UKRAINE),
    OP_POPPING_UI_IN_BACKGROUND(Constants.CP_MAC_THAI),
    OP_NFC(10016),
    OP_BLUETOOTH(Constants.CP_MAC_CHINESE_TRADITIONAL);
    
    private final int value;

    MiuiOpCode(int i10) {
        this.value = i10;
    }

    @Override // nm.a
    public int getValue() {
        return this.value;
    }
}

}
